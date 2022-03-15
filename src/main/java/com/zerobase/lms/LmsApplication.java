package com.zerobase.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LmsApplication {
//변경된 내용
    public static void main(String[] args) {
        SpringApplication.run(LmsApplication.class, args);
    }
    
    
    @Bean
    public ErrorPageFilter errorPageFilter() {
       return new ErrorPageFilter();
    }

    @Bean
    public FilterRegistrationBean disableSpringBootErrorFilter(ErrorPageFilter filter) {
       FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
       filterRegistrationBean.setFilter(filter);
       filterRegistrationBean.setEnabled(false);
       return filterRegistrationBean;
    }
 }






