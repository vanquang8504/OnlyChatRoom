package com.example.zchat.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TinNhanChat {
    private MessageType type;
    private String content;
    private String sender;
}
