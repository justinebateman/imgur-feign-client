package io.github.justinebateman.imgur.service;

import feign.Headers;

import io.github.justinebateman.imgur.configuration.ImgurConfiguration;
import io.github.justinebateman.imgur.domain.ImgurImageResponse;
import io.github.justinebateman.imgur.domain.ImgurResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;

@FeignClient(name = "imgur", configuration = ImgurConfiguration.class, url = "${imgur.apiendpoint}")
public interface ImgurClient
{
    @PostMapping(value = "3/account/me/settings", consumes = {APPLICATION_FORM_URLENCODED_VALUE})
    ResponseEntity getAccountSettings();

    @PostMapping(value = "3/image", consumes = {"multipart/form-data"})
    ResponseEntity<ImgurResponse<ImgurImageResponse>> uploadImage(@RequestBody Map<String, ?> formParams);


}
