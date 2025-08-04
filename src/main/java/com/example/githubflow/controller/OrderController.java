package com.example.githubflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
  @GetMapping("/order")
  public String hello() {
    System.out.println("OrderController.hello() called");
    // Simulating a delay to mimic processing time
    return "order feature!";
  }
}