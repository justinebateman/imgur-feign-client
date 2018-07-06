package io.github.justinebateman;

import io.github.justinebateman.imgur.configuration.ImgurConfiguration;
import io.github.justinebateman.imgur.configuration.ImgurErrorDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableFeignClients
@EnableDiscoveryClient
@ComponentScan(basePackages = {"io.github.justinebateman"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {ImgurConfiguration.class, ImgurErrorDecoder.class}))

public class ImgurFeignClientApplication
{
    public static void main(String[] args) { SpringApplication.run(ImgurFeignClientApplication.class, args);}
}
