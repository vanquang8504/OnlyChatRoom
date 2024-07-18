package com.example.zchat.Controller;

import com.example.zchat.model.TinNhanChat;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

    @MessageMapping("/chat")
    @SendTo("/topic/public")
    public TinNhanChat guiTinNhan(
            TinNhanChat tinNhanChat
    ) {
        return tinNhanChat;
    }

    @MessageMapping("/login")
    @SendTo("/topic/public")
    public TinNhanChat themNguoiDung(
            TinNhanChat tinNhanChat,
            SimpMessageHeaderAccessor headerAccessor
    ) {
        return tinNhanChat;
    }
}
