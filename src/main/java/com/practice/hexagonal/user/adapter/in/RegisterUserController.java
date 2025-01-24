package com.practice.hexagonal.user.adapter.in;

import com.practice.hexagonal.user.adapter.in.dto.UserRequestDto;
import com.practice.hexagonal.user.application.port.in.RegisterUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterUserController {
    private final RegisterUserUseCase registerUserUseCase;
    @PostMapping("/register")
    public long register(@RequestBody UserRequestDto userRequestDto) {
        return registerUserUseCase.register(userRequestDto.toEntity());
    }
}
