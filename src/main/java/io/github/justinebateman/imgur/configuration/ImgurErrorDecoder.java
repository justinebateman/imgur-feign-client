package io.github.justinebateman.imgur.configuration;


import feign.Response;
import feign.codec.ErrorDecoder;

import io.github.justinebateman.imgur.service.ImgurAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import static feign.FeignException.errorStatus;

public class ImgurErrorDecoder implements ErrorDecoder
{
    @Autowired
    ImgurAuthRepository imgurAuthRepository;

    @Override
    public Exception decode(String methodKey, Response response)
    {
        // if our access token has expired request a new one
        if (HttpStatus.UNAUTHORIZED.value() == response.status() || HttpStatus.FORBIDDEN.value() == response.status())
        {
            imgurAuthRepository.generateAccessToken();
        }
        return errorStatus(methodKey, response);
    }
}