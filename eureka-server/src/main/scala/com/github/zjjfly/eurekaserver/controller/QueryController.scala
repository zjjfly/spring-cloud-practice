package com.github.zjjfly.eurekaserver.controller

import com.github.zjjfly.common.log.Logger
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

/**
  * @author zjjfly
  */
@RestController
@RequestMapping(path = Array("/query"))
class QueryController(val eurekaClientConfigBean: EurekaClientConfigBean) extends Logger{
  @GetMapping(path = Array("/eureka-server"))
  def eurekaServerUrl(): Object = {
    eurekaClientConfigBean.getServiceUrl
  }
}
