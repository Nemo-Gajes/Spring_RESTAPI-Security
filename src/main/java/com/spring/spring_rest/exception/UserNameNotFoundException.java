package com.spring.spring_rest.exception;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserNameNotFoundException extends UsernameNotFoundException {
  public UserNameNotFoundException(String message) {
    super(message);
  }
}