package SpringSocket;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public class WebSocketHandler extends TextWebSocketHandler {
    private static final ConcurrentHashMap<String, WebSocketSession> CLIENTS = new ConcurrentHashMap<String, WebSocketSession>();

    public void afterConnectionEstablished(WebSocketSession session) throws Exception{
        CLIENTS.put(session.getId(), session);
    } // Client가 WebSocket에 접근하면 동작, 접속한 세션의 값이 저장

    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception{
        CLIENTS.remove(session.getId());
    } // 접속이 끊어진 사용자가 발생하면 동작

    protected void handlerTextMessage(WebSocketSession session, TextMessage message) throws Exception{
        String id = session.getId();  //메시지를 보낸 아이디
        CLIENTS.entrySet().forEach( arg->{
            if(!arg.getKey().equals(id)) {  //같은 아이디가 아니면 메시지를 전달합니다.
                try {
                    arg.getValue().sendMessage(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    } // 사용자의 메시지를 받게되면 동작
}
