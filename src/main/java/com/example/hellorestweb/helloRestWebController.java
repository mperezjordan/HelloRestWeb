package com.example.hellorestweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloRestWebController {

    @GetMapping("/hello")
      public String hello() {
          return "Hello Wonderful people, enjoy life";
      }

      @GetMapping("/")
      public String helloworld() {
         return "Hello World, Have awesome time";
      }
}
