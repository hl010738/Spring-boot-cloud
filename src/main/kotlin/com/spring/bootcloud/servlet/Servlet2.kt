package com.spring.bootcloud.servlet

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


//使用RegistrationBean
// 配置servlet
class Servlet2: HttpServlet() {

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("Servlet2 invoked")
    }
}
