//package com.xproce.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class UserSecurityConfig {
//
//    @Bean
//
//    public InMemoryUserDetailsManager userDetailsService() {
//        /*Approach 1 where we use withDefaultPasswordEncoder() method while creating the user details*/
//        UserDetails admin = User.withUsername("admin")
//                .password("12345")
//                .authorities("admin")
//                .build();
//
//        UserDetails user = User.withUsername("user").password("12345") .authorities("read") .build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }
//    @Bean
//   public PasswordEncoder passwordEncoder() { return NoOpPasswordEncoder.getInstance(); }
//
//}
