package com.jay.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class CatagoryController {

  @RequestMapping(value = "/getCategory", produces = "application/json")
  public String getCategory(HttpServletRequest request) {

    return "Category Something ...";
  }

  @RequestMapping(value = "/invokeTempService", produces = "application/json")
  public String invokeTempService(HttpServletRequest request) {

    RestTemplate restTemplate = new RestTemplate();

    String result = restTemplate.getForObject("http://temp-service.study-ingress.svc.cluster.local/temp-api/getPath", String.class);

    return result;
  }
}
