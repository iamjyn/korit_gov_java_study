package _25_LayerdArchitecture.entity;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class Todo {
    private int todoId;
    private String contents;
    private User user;
    private LocalDateTime createDt;
}

// 지금은 DB를 사용하지 못하므로 user_id 대신에 user 객체를 사용
// DB 사용시에는 user_id로 SQL 문법(JOIN)을 통해 해당 id가 작성한 콘텐츠를 뽑아냄
