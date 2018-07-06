package io.github.justinebateman.imgur.configuration;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ConfigProperties
{
    String propertyFilePath = "./src/main/resources/Config.properties";

    public String imgurAccessToken = "";
    public String imgurRefreshToken = "";

    public String keyImgurAccessToken = "imgurAccessToken";
    public String keyImgurRefreshToken = "imgurRefreshToken";

    public ConfigProperties()
    {
        String imgurAccessToken = readValue(keyImgurAccessToken);
        String imgurRefreshToken = readValue(keyImgurRefreshToken);

        if (StringUtils.isNotEmpty(imgurAccessToken))
            this.imgurAccessToken = imgurAccessToken;
        if (StringUtils.isNotEmpty(imgurRefreshToken))
            this.imgurRefreshToken = imgurRefreshToken;
    }

    public Properties loadProperties()
    {
        Properties prop = new Properties();
        try
        {
            FileInputStream fileInput = new FileInputStream(propertyFilePath);
            prop.load(fileInput);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return prop;
    }

    public String readValue(String key)
    {
        String value;
        try
        {
            value = loadProperties().getProperty(key);
        }
        catch (Exception ex)
        {
            value = "";
        }
        return value;
    }

    public String writeValue(String key, String value)
    {
        Properties prop = loadProperties();
        prop.setProperty(key, value);
        try
        {
            prop.store(new FileOutputStream(propertyFilePath), null);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return readValue(key);
    }

    //@Test
    public void readvalueTest()
    {
        System.out.println(readValue("projectId"));
    }
}
