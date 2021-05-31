package com.spring.bootcloud.filter

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

class Filter2: Filter {
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {

        println("Filter invoked")

        chain?.doFilter(request, response)
    }
}
