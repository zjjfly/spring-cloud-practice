package com.github.zjjfly.config

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

/**
  * @author zjjfly
  */
@SpringBootApplication
@EnableConfigServer
class Application

object Application extends App {
  SpringApplication.run(classOf[Application], args: _*)
}
