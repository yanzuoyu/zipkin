package com.zipkin.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * All rights Reserved, Designed By
 * Copyright:    Copyright(C) 2015-2017
 * Company
 *
 * @author 严作宇
 * @version 1.0
 * @date 18/12/17 下午6:22
 * @Description  密码认证
 */
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // For example: Use only Http Basic and not form login.
        http.authorizeRequests()
            .anyRequest().authenticated()
            .and()
            .httpBasic();
    }
}
