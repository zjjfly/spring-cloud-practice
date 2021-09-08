package com.github.zjjfly.common.log

import org.slf4j
import org.slf4j.LoggerFactory

/**
 * @author zjjfly
 */
trait Logger {
   val logger: slf4j.Logger = LoggerFactory.getLogger(this.getClass)
}
