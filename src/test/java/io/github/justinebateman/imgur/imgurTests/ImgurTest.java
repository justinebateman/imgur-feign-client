package io.github.justinebateman.imgur.imgurTests;

import io.github.justinebateman.imgur.domain.ImgurImageResponse;
import io.github.justinebateman.imgur.domain.ImgurResponse;
import io.github.justinebateman.imgur.service.ImgurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.io.File;

@SpringBootTest
public class ImgurTest extends AbstractTestNGSpringContextTests
{
    @Autowired
    ImgurRepository imgurRepository;

    String imgurAlbumHash = "qu0Ldom";

    @Test
    public void imgurFileUpload()
    {
        File fileToUpload = new File("C:\\elephant.jpg");
        ResponseEntity<ImgurResponse<ImgurImageResponse>> responseEntity = imgurRepository.uploadImage(fileToUpload, imgurAlbumHash);
        System.out.println(responseEntity.getBody().getData().getLink());
    }

}
