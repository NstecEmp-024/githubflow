package com.example.githubflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
  @GetMapping("/order")
  public String hello() {
    return "order feature!";
  }
}