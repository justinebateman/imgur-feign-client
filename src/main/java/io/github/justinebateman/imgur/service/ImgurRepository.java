package io.github.justinebateman.imgur.service;

import feign.FeignException;
import io.github.justinebateman.imgur.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.util.MultiValueMap;

import java.io.File;
import java.util.HashMap;

@Repository
public class ImgurRepository
{
    private ImgurClient imgurClient;

    @Autowired
    ImgurRepository(ImgurClient imgurClient)
    {
        this.imgurClient = imgurClient;
    }

    public ResponseEntity getAccountSettings()
    {
        try
        {
            ResponseEntity responseEntity = imgurClient.getAccountSettings();
            return responseEntity;
        }
        catch (FeignException ex)
        {
            return new ResponseEntity<>(ex.getMessage(), (MultiValueMap) null, HttpStatus.valueOf(ex.status()));
        }
    }

    public ResponseEntity uploadImage(File image, String album)
    {
        try
        {
            String encodedFile = Util.encodeFileToBase64Binary(image);
            HashMap hashMap = new HashMap();
            hashMap.put("image", encodedFile);
            hashMap.put("album", album);
            ResponseEntity responseEntity = imgurClient.uploadImage(hashMap);
            return responseEntity;
        }
        catch (FeignException ex)
        {
            return new ResponseEntity<>(ex.getMessage(), (MultiValueMap) null, HttpStatus.valueOf(ex.status()));
        }
    }

    public ResponseEntity uploadImage(File image)
    {
        try
        {
            String encodedFile = Util.encodeFileToBase64Binary(image);
            HashMap hashMap = new HashMap();
            hashMap.put("image", encodedFile);
            ResponseEntity responseEntity = imgurClient.uploadImage(hashMap);
            return responseEntity;
        }
        catch (FeignException ex)
        {
            return new ResponseEntity<>(ex.getMessage(), (MultiValueMap) null, HttpStatus.valueOf(ex.status()));
        }
    }

    public ResponseEntity uploadImage(HashMap hashMap)
    {
        try
        {
            ResponseEntity responseEntity = imgurClient.uploadImage(hashMap);
            return responseEntity;
        }
        catch (FeignException ex)
        {
            return new ResponseEntity<>(ex.getMessage(), (MultiValueMap) null, HttpStatus.valueOf(ex.status()));
        }
    }

    public ResponseEntity uploadImage(String base64Encodedimage, String album)
    {
        try
        {
            HashMap hashMap = new HashMap();
            hashMap.put("image", base64Encodedimage);
            hashMap.put("album", album);
            ResponseEntity responseEntity = imgurClient.uploadImage(hashMap);
            return responseEntity;
        }
        catch (FeignException ex)
        {
            return new ResponseEntity<>(ex.getMessage(), (MultiValueMap) null, HttpStatus.valueOf(ex.status()));
        }
    }

    public ResponseEntity uploadImage(File image, String album, String title, String description, String name, String type)
    {
        try
        {
            String encodedFile = Util.encodeFileToBase64Binary(image);
            HashMap hashMap = new HashMap();
            hashMap.put("image", encodedFile);
            hashMap.put("album", album);
            hashMap.put("title", title);
            hashMap.put("description", description);
            hashMap.put("name", name);
            hashMap.put("type", type);
            ResponseEntity responseEntity = imgurClient.uploadImage(hashMap);
            return responseEntity;
        }
        catch (FeignException ex)
        {
            return new ResponseEntity<>(ex.getMessage(), (MultiValueMap) null, HttpStatus.valueOf(ex.status()));
        }
    }
}
