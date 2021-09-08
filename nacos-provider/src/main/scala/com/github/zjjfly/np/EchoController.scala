package com.github.zjjfly.np

import org.springframework.web.bind.annotation.RestController

/**
 * @author zjjfly[https://github.com/zjjfly] on 2021/1/25
 */
@RestController
class EchoController {

  import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod}

  @RequestMapping(value = Array("/echo/{string}"),
                  method = Array(RequestMethod
                                   .GET)) def echo(@PathVariable string: String): String = "Hello Nacos Discovery " + string
}
