package com.rest.webservice.restfulwebservices;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Muhammad.Asim on 3/5/2018.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("username").password("{noop}password").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.DELETE).hasRole("USER")
                .antMatchers(HttpMethod.GET).hasAnyRole("USER")
                .antMatchers(HttpMethod.POST).hasAnyRole("USER")
                .antMatchers(HttpMethod.PUT).hasAnyRole("USER")
                .and()
                .requiresChannel()
                .antMatchers("/").requiresSecure()
                .and()
                .csrf().disable();
        http.headers().frameOptions().sameOrigin();
    }
}
