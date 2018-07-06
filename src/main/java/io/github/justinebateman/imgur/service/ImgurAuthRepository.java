package io.github.justinebateman.imgur.service;


import feign.FeignException;
import io.github.justinebateman.imgur.configuration.ConfigProperties;
import io.github.justinebateman.imgur.domain.AccessTokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.util.MultiValueMap;

@Repository
public class ImgurAuthRepository
{
    private ImgurAuthClient imgurAuthClient;

    @Autowired
    ImgurAuthRepository(ImgurAuthClient imgurAuthClient)
    {
        this.imgurAuthClient = imgurAuthClient;
    }

    @Value("${imgur.clientId}")
    String clientId;
    @Value("${imgur.clientSecret}")
    String clientSecret;

    public ResponseEntity<AccessTokenResponse> generateAccessToken()
    {
        ConfigProperties configProperties = new ConfigProperties();
        String refreshToken = configProperties.imgurRefreshToken;
        try
        {
            ResponseEntity<AccessTokenResponse> responseEntity = imgurAuthClient.generateAccessToken(refreshToken, clientId, clientSecret, "refresh_token");
            AccessTokenResponse accessTokenResponse = responseEntity.getBody();
            configProperties.writeValue(configProperties.keyImgurAccessToken, accessTokenResponse.getAccess_token());
            configProperties.writeValue(configProperties.keyImgurRefreshToken, accessTokenResponse.getRefresh_token());

            return responseEntity;
        }
        catch (FeignException ex)
        {
            return new ResponseEntity<>(ex.getMessage(), (MultiValueMap) null, HttpStatus.valueOf(ex.status()));
        }

    }
}
