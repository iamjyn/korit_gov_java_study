package _32_LayerdArchitecture2.service;

import _32_LayerdArchitecture2.dto.SigninReqDto;
import _32_LayerdArchitecture2.entity.User;
import _32_LayerdArchitecture2.repository.UserRepository;
import _32_LayerdArchitecture2.repository.UserRepositoryImpl2;
import _32_LayerdArchitecture2.util.PasswordEncoder;

public class SigninServiceImpl implements SigninService{
    // 싱글톤으로 만들것
    private static SigninServiceImpl instance;
    private UserRepository userRepository;

    private SigninServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SigninServiceImpl getInstance() {
        if (instance == null) {
            instance = new SigninServiceImpl(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    // sign in(void)
    // 로그인을 시도한 사용자 이름 확인 userRepository에서
    // 해당 사용자 이름을 가진 User객체가 있는지 확인
    // 객체가 null 이면 함수 탈출 (사용자 정보를 다시 확인하세요.)

    // 비밀번호 일치 확인
    // 비밀번호가 일치하지 않으면 함수 탈출 (사용자 정보를 다시 확인하세요.)

    // 로그인 성공 -> 로그인 성공한 User 객체 toString 으로 출력

    @Override
    public void signin(SigninReqDto signinReqDto) {
        User fondUser = userRepository.findByUsername(signinReqDto.getUsername());
        if (fondUser == null) {
            System.out.println("사용자 정보를 다시 확인하세요.");
            return;
        }
        if (!PasswordEncoder.match(signinReqDto.getPassword(), fondUser.getPassword())) {
            System.out.println("사용자 정보를 다시 확인하세요.");
            return;
        }
        System.out.println("로그인 성공");
        System.out.println(fondUser);
    }

    // isEmpty(boolean)
    // username, password null 이거나 공백이 아닌지 확인 용도
    @Override
    public boolean isEmpty(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        return false;
//        return str != null && !str.isBlank();
    }
}
