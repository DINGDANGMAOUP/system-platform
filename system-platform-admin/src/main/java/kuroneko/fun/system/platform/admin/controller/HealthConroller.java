package kuroneko.fun.system.platform.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthConroller {

  @RequestMapping("/")
  public String health(){
    return "health";
  }
}
