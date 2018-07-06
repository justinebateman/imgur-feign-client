package io.github.justinebateman.imgur.service;

import io.github.justinebateman.imgur.domain.AccessTokenResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@FeignClient(name = "imgurauth", url = "${imgur.apiendpoint}/oauth2/token")
public interface ImgurAuthClient
{

    @PostMapping(value = "", consumes = {APPLICATION_JSON_UTF8_VALUE})
    ResponseEntity<AccessTokenResponse> generateAccessToken(@RequestParam("refresh_token") String refresh_token, @RequestParam("client_id") String client_id, @RequestParam("client_secret") String client_secret, @RequestParam("grant_type") String grant_type);


}
