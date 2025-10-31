package _25_LayerdArchitecture.dto;

import _25_LayerdArchitecture.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SignupReqDto {
    private String username;
    private String password;
    private String name;

    public User toEntity() {
        return User.builder()
                .userId(0)
                .username(username)
                .password(password)
                .name(name)
                .build();
    }

}

// 보통의 Dto는 요청(Req)과 응답(Rep)을 구분함
