package _22_Bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserEntityLombok {
    private int userId;
    private String userName;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
}
