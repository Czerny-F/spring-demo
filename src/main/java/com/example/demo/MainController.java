package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping(value = "/")
  public Map<String, Object> index() {
    var res = new HashMap<String, Object>();
    res.put("hello", "world");
    return res;
  }

  @PostMapping(value = "/")
  public Map<String, Object> post() {
    var res = new HashMap<String, Object>();
    res.put("result", "ok");
    return res;
  }
}
