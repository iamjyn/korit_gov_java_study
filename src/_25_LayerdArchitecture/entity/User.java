package _25_LayerdArchitecture.entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
// ToString 은 디버깅 확인용으로 만듦

public class User {
    private int userId;
    private String username;
    private String password;
    private String name;
}
