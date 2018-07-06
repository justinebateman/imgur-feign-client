# imgur-feign-client

This repo uses [Spring Feign](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html) to make requests to the Imgur API.

It uses v3 of the Imgur API. The full documentation for this API can be found [here](https://apidocs.imgur.com/)

This is a basic version at the minute and there is plenty that could be improved so feel free to submit ideas or to fork it.
## Imgur configuration


Follow Imgur's API documentation to create an account and get a clientId, clientSecret, access token and refresh token
[https://apidocs.imgur.com/#authorization-and-oauth](https://apidocs.imgur.com/#authorization-and-oauth)

Add a Config.properties file in /src/main/resources/Config.properties in your project, with the following structure

```
imgurAccessToken=CHANGEME
imgurRefreshToken=CHANGEME
```

Add the following your application.yml file

```
imgur:
  apiendpoint: https://api.imgur.com
  clientId: CHANGEME
  clientSecret: CHANGEME
```

To enable image uploading add this dependency to your project

```
<dependency>
    <groupId>io.github.openfeign.form</groupId>
    <artifactId>feign-form</artifactId>
    <version>3.3.0</version>
</dependency>
```

To add detailed logging for TestRail add the following to your application.yml file

```
logging.level.io.github.justinebateman.imgur.service: DEBUG
```

Here's an example of how to upload an image and get the share link

```
public void imgurFileUpload()
{
    File fileToUpload = new File("C:\\elephant.jpg");
    ResponseEntity<ImgurResponse<ImgurImageResponse>> responseEntity = imgurRepository.uploadImage(fileToUpload);
    System.out.println(responseEntity.getBody().getData().getLink());
}
```