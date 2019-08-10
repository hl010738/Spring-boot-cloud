package com.spring.bootcloud.websocket

interface WebSocketService{
    fun getMessage(message: String): String
}