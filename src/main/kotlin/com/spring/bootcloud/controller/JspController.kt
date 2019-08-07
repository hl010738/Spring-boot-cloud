package com.spring.bootcloud.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import java.lang.RuntimeException
import java.util.*

@Controller
class JspController {

    @GetMapping("/jsp")
    fun jsp(model: MutableMap<String, Any>): String{

        model["date"] = Date()
        model["message"] = "Kotlin"

        return "result"
    }

    @RequestMapping("/jspError")
    fun jspError(model: MutableMap<String, Any>){
        throw RuntimeException("jspError")
    }
}