package com.spring.bootcloud.websocket

import org.springframework.web.socket.CloseStatus
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler

class WebSocketHandler(webSocketService: WebSocketService): TextWebSocketHandler(){

    var webSocketService = webSocketService

    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        var message = this.webSocketService.getMessage(message.payload)
        session.sendMessage(TextMessage(message))
    }

    override fun afterConnectionEstablished(session: WebSocketSession) {
        println("Connection Established")
    }

    override fun handleTransportError(session: WebSocketSession, exception: Throwable) {
        println("TransportError")
        session.close(CloseStatus.SERVER_ERROR)
    }
}