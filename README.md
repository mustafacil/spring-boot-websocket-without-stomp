### Websocket Without Stomp

This project is for creating web socket without Stomp Messaging Protocol.

### Usage

All of websocket sessions are added to `SingletonSessionList`.

You need to connect `ws://localhost:8080/web-socket` as a client.

You can send messages to all clients by using `sendMessageToAllClients` method in `SocketUtil` class.