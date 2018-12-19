package com.discoverClient.demo.DiscoveryMSDemp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mshaik on 12/19/18.
 */
@RestController
@RequestMapping("${microservice.contextpath}")
@Slf4j
public class TestController {



  @RequestMapping(method = RequestMethod.GET)
  public String getResponse() {
    return "Success";
  }

}
