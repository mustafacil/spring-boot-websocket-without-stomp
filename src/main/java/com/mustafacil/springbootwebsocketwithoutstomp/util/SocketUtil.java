package com.mustafacil.springbootwebsocketwithoutstomp.util;

import com.mustafacil.springbootwebsocketwithoutstomp.model.SingletonSessionList;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;

public class SocketUtil {

    public static void sendMessageToAllClients(String message){

        WebSocketSession socketSessions[] = SingletonSessionList.getInstance().toArray(new WebSocketSession[0]);
        for(WebSocketSession socketSession: socketSessions){
            try {
                socketSession.sendMessage(new TextMessage(message));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
