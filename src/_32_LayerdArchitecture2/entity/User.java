package _32_LayerdArchitecture2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
    private Integer userId;
    private String username;
    private String password;
}
