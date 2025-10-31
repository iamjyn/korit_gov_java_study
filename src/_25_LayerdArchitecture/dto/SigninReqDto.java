package _25_LayerdArchitecture.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SigninReqDto {
    private String username;
    private String password;
}

// 추후 프로젝트 시 고려사항
// 무엇으로 로그인할지? (아이디,패스워드) or (이메일) => 운영을 생각
// 일반 회원의 아이디로 로그인시 등록한 이메일과
// 로그인(연동)용 이메일을 어떻게 통합할지도 생각