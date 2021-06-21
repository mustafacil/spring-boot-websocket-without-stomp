package com.mustafacil.springbootwebsocketwithoutstomp.model;

import org.springframework.web.socket.WebSocketSession;

import java.util.LinkedList;
import java.util.List;


public class SingletonSessionList {

    private static List<WebSocketSession> sessions = new LinkedList<>();

    private SingletonSessionList(){

    }

    public static List<WebSocketSession> getInstance(){
        return sessions;
    }
}
