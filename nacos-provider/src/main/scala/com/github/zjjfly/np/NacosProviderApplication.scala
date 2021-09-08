package com.github.zjjfly.np

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * @author zjjfly[https://github.com/zjjfly] on 2021/1/25
 */

@SpringBootApplication
@EnableDiscoveryClient
class NacosProviderApplication

object NacosProviderApplication extends App {
  SpringApplication.run(classOf[NacosProviderApplication], args: _*)
}
