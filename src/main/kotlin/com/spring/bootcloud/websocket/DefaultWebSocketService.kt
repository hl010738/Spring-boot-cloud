package com.spring.bootcloud.websocket

class DefaultWebSocketService(format: String): WebSocketService{

    private var format: String = ""

   init {
       if(null != format){
           this.format = format
       } else {
           this.format = "%s"
       }
   }

    override fun getMessage(message: String): String {
        return String.format(this.format, message)
    }
}