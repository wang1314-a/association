package com.feng.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by rf on 2019/4/26.
 */

@Configuration  //证明这是一个配置类
@PropertySource(value = {"classpath:fileUpload.properties"}, ignoreResourceNotFound = true)
public class FileUploadConf {
    @Value("${file.uploadPath}")
    private String FileUploadPath;
    @Value("${file.imgPath}")
private String imageFilePath;
    public String getFileUploadPath() {
        return FileUploadPath;
    }

    public String getImageFilePath() {
        return imageFilePath;
    }
}
