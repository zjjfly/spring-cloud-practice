package com.github.zjjfly.nc

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.openfeign.{EnableFeignClients, FeignClient}
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RequestMethod}

/**
 * @author zjjfly[https://github.com/zjjfly] on 2021/1/25
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class NacosConsumerApplication {

  import org.springframework.cloud.client.loadbalancer.LoadBalanced
  import org.springframework.context.annotation.Bean
  import org.springframework.web.client.RestTemplate

  @LoadBalanced
  @Bean def restTemplate = new RestTemplate
}

object NacosConsumerApplication extends App {
  SpringApplication.run(classOf[NacosConsumerApplication], args: _*)
}

import org.springframework.web.bind.annotation.{PathVariable, RestController}

@FeignClient(name = "nacos-provider")
trait TestService {
  @RequestMapping(value = Array("/echo/{str}"), method = Array(RequestMethod.GET))
  def echo(@PathVariable str: String): String;
}

@RestController
@RefreshScope class TestController(testService: TestService) {

  @GetMapping(Array("/echo/{str}")) def echo(@PathVariable str: String): String = testService.echo(str)
}

@RestController
@RequestMapping(Array("/config"))
@RefreshScope class ConfigController {
  @Value("${useLocalCache:false}") private val useLocalCache = false

  @GetMapping(Array("/get")) def get: Boolean = useLocalCache
}
