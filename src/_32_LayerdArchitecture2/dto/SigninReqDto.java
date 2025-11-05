package _32_LayerdArchitecture2.dto;

import _32_LayerdArchitecture2.entity.User;
import _32_LayerdArchitecture2.util.PasswordEncoder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SigninReqDto {
    private String username;
    private String password;
}
