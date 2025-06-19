package com.gorae.gorae_interaction.kafka.producer.leaderboard.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class cancelEvent {
    //    사용자(userId)가 질문(commentId)를 좋아요 취소(action)한다.
    public static final String TOPIC = "cancel";
//  action: "좋아요 취소"
    private String action;
    private Long userId;
    private Long commentId;
}
