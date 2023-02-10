package com.example.webapp;

import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @author Oksiuta Andrii
 * 06.02.2023
 * 11:48
 */
@RequestMapping("/app")
@Controller
@Slf4j
public class WelcomeController {

  @GetMapping("welcome")
  public String welcome(Model model) {
    log.info("Welcome page");
    model.addAttribute("currentYear", LocalDate.now().getYear());
    return "demo/welcome";
  }

  @GetMapping("info")
  public String getInfo(Model model) {
    log.info("Info page");
    model.addAttribute("currentTime", System.currentTimeMillis());
    model.addAttribute("currentYear", LocalDate.now().getYear());
    return "demo/info";
  }
}
