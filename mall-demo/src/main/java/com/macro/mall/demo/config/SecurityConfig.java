package com.macro.mall.demo.config;

import com.macro.mall.demo.bo.AdminUserDetails;
import com.macro.mall.mapper.UmsAdminMapper;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsAdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * Spring Security configuration
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()//Configure permissions
//                .antMatchers("/").access("hasRole('TEST')")//This path requires the TEST role
                .antMatchers("/").authenticated()//This path requires login authentication
//                .antMatchers("/brand/list").hasAuthority("TEST")//This path requires TEST permission
                .antMatchers("/**").permitAll()
                .and()//Enable http-based authentication
                .httpBasic()
                .realmName("/")
                .and()//Configure login page
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error=true")
                .and()//Configure exit path
                .logout()
                .logoutSuccessUrl("/")
//                .and()//Remember password function
//                .rememberMe()
//                .tokenValiditySeconds(60*60*24)
//                .key("rememberMeKey")
                .and()//Turn off cross-domain forgery
                .csrf()
                .disable()
                .headers()//Remove X-Frame-Options
                .frameOptions()
                .disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public UserDetailsService userDetailsService() {
        //Get login user information
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                UmsAdminExample example = new UmsAdminExample();
                example.createCriteria().andUsernameEqualTo(username);
                List<UmsAdmin> umsAdminList = umsAdminMapper.selectByExample(example);
                if (umsAdminList != null && umsAdminList.size() > 0) {
                    return new AdminUserDetails(umsAdminList.get(0));
                }
                throw new UsernameNotFoundException("Wrong Username or Password");
            }
        };
    }
}
