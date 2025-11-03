package _25_LayerdArchitecture.service;

import _25_LayerdArchitecture.dto.SigninReqDto;
import _25_LayerdArchitecture.dto.SignupReqDto;
import _25_LayerdArchitecture.entity.User;
import _25_LayerdArchitecture.repository.UserList;

public class UserService {
    private UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }

    // 로그인 로직
    public User signin(SigninReqDto signinReqDto) {
        User foundUser = userList.findByUsername(signinReqDto.getUsername());
        if (foundUser == null) {
            // username을 가진 회원 없음
            return null;
        }
        if (!foundUser.getPassword().equals(signinReqDto.getPassword())) {
            // 비밀번호가 일치하지 않음
            return null;
        }
        return foundUser;
    }

    // username 중복 검사 메소드
    public boolean isDuplicatedUsername(String username) {
        return userList.findByUsername(username) != null;
    }   // findByUsername(username) => null 이면 중복이 없다는 뜻
        // true면 중복 있다 / false면 중복 없다 => (널이랑 널이랑 같지않냐?) => false = 중복 없다

    // 회원가입
    public void signup(SignupReqDto signupReqDto) {
        // 1. signupReqDto -> user (entity)
        User user = signupReqDto.toEntity();
        // 2. userId 생성
        user.setUserId(userList.generateUserId());
        // 3. users 배열에 추가(DB에 추가)
        userList.add(user);
    }

    // 회원정보 전체 출력
    public void printAllUserList() {
        System.out.println("[[ 회원정보 전체 조회]]");
        for (User user : userList.getAllUser()) {
            System.out.println(user);
        }
    }
}
