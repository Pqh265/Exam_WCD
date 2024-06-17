package org.aptech.t2208e.config;

import lombok.Getter;
import lombok.Setter;
import org.aptech.t2208e.annotation.ConfigurationProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.Properties;

@Getter
@Setter
@ConfigurationProperties(path = "./src/main/resources/T2208e.properties")
public class DatasourceProperties {
    public static void main(String[] args) {
        Class<?> clazz = DatasourceProperties.class;
        ConfigurationProperties config = clazz.getAnnotation(ConfigurationProperties.class);
        System.err.println(config.path());
    }
//    public static void main(String[] args) {
//        Properties properties  = new Properties();
//
//        try (InputStream inputStream
//                     =  new FileInputStream("./src/main/resources/T2208e.properties");){
//        properties.load(inputStream);
//        System.err.println(inputStream);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    private String username;
    private  String password;
    // tính chất đóng gói
}
