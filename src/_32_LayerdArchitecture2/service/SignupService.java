package _32_LayerdArchitecture2.service;

import _32_LayerdArchitecture2.dto.SignupReqDto;
import _32_LayerdArchitecture2.entity.User;
import _32_LayerdArchitecture2.repository.UserRepository;
import _32_LayerdArchitecture2.repository.UserRepositoryImpl2;

public class SignupService {
    private static SignupService instance;
    private UserRepository userRepository;

    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SignupService getInstance() {
        if (instance == null) {
            instance = new SignupService(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User fondUser = userRepository.findByUsername(username);
        if (fondUser == null) {
            return true;
        }
        return false;
    }

    // 패스워드 유효성 체크 (널값 빈값 체크)
    public boolean isValidPassword(String password) {
        return password != null && !password.isBlank();
    }

    // 패스워드 확인
    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (password == null || confirmPassword == null) {
            return false;
        }
        return password.equals(confirmPassword);
    }

    public void signup(SignupReqDto signupReqDto) {
        userRepository.insert(signupReqDto.toEntity());
    }


}
