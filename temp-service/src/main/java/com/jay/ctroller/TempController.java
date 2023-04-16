package com.jay.ctroller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TempController {

  @RequestMapping(value = "/getPath", produces = "application/json")
  public String getURLValue(HttpServletRequest request) {
    String test = request.getRequestURI();
    return test;
  }
}
