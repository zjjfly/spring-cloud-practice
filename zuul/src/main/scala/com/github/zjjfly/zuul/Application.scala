package com.github.zjjfly.zuul

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author zjjfly
 */
@SpringBootApplication
class Application

object Application extends App {
  SpringApplication.run(classOf[Application], args: _*)
}
