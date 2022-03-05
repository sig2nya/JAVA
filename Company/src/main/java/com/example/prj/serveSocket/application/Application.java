package com.example.prj.serveSocket.application;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotaion.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@enableConfigurationProperties({
        FileStorageProperties.class
})

public class Application extends SpringBootServletInitializer {
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(ServeSocketApplication.class);
    }

    @Bean
    public HttpSessionListener httpSessionListener(){
        return new SessionListener();
    }

    public static void main(String[] args){
        SpringApplication.run(ServeSocketApplication.class, args);
    }

    public class SessionListener implements HttpSessionListener{
        public void sessionCreated(HttpSessionEvent se){
            se.getSession().setMaxInactiveInterval(60 * 60 * 8);
        }

        public void sessionDestroyed(HttpSessionEvent se){

        }
    }
}
