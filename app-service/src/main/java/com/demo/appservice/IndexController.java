package com.demo.appservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class IndexController {

  private static final Logger log = LoggerFactory.getLogger(IndexController.class);

  @GetMapping("/index")
  public String howdy(Principal principal) {
    String username = principal.getName();
    JwtAuthenticationToken token = (JwtAuthenticationToken) principal;
    log.info("claims: " + token.getTokenAttributes());
    return "Hello, " + username;
  }
}
