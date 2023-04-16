package com.jay.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class CatagoryController {

  @RequestMapping(value = "/getCategory", produces = "application/json")
  public String getCategory(HttpServletRequest request) {

    return "Category Something ...";
  }
}
