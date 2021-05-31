package com.spring.bootcloud.servlet

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


//使用Servlet 3.0+ 的注解，配合 @ServletComponentScan
// 配置servlet
// 这种方式仅在内置的容器中有效
@WebServlet("/servlet1")
class Servlet1: HttpServlet() {

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("Servlet1 invoked")
    }
}
