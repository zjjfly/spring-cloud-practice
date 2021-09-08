package com.github.zjjfly.eurekaserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
  * @author zjjfly
  */
@SpringBootApplication
@EnableEurekaServer
class Application

object Application extends App {
  SpringApplication.run(classOf[Application], args: _*)
}
