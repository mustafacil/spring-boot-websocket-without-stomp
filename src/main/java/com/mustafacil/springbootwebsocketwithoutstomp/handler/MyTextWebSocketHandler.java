package com.mustafacil.springbootwebsocketwithoutstomp.handler;

import com.mustafacil.springbootwebsocketwithoutstomp.model.SingletonSessionList;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.List;

public class MyTextWebSocketHandler extends TextWebSocketHandler {

    private final List<WebSocketSession> sessions = SingletonSessionList.getInstance();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessions.add(session);

        super.afterConnectionEstablished(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessions.remove(session);
        super.afterConnectionClosed(session, status);
    }

}
