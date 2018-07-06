package io.github.justinebateman.imgur.configuration;


import feign.Logger;
import feign.Request;
import feign.RequestInterceptor;
import feign.Retryer;
import feign.form.FormEncoder;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.feign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;

public class ImgurConfiguration
{
    @Bean
    public RequestInterceptor requestInterceptor()
    {
        return requestTemplate ->
        {
            ConfigProperties configProperties = new ConfigProperties();
            requestTemplate.header("Authorization", "Bearer " + configProperties.readValue(configProperties.keyImgurAccessToken));
        };
    }

    @Bean
    public Retryer retryer()
    {
        return new FeignRetryer();
    }

    // used to handle expired access tokens
    @Bean
    public ImgurErrorDecoder errorDecoder()
    {
        return new ImgurErrorDecoder();
    }

    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options requestOptions()
    {
        return new Request.Options(20000, 20000);
    }

    @Autowired
    private ObjectFactory<HttpMessageConverters> messageConverters;

    @Bean
    FormEncoder feignFormEncoder()
    {
        return new FormEncoder(new SpringEncoder(this.messageConverters));
    }


}
