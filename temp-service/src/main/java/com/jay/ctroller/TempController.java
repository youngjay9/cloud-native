package com.jay.ctroller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class TempController {

  @RequestMapping(value = "/getPath", produces = "application/json")
  public String getURLValue(HttpServletRequest request) {
    String test = request.getRequestURI();
    return test;
  }

  @RequestMapping(value = "/invokeCategoryService", produces = "application/json")
  public String invokeCategoryService(HttpServletRequest request) {

    RestTemplate restTemplate = new RestTemplate();

    String result = restTemplate
        .getForObject(
            "http://category-service.tipc.svc.cluster.local/category/getCategory",
            String.class);

    return result;
  }
}
