package com.practice.hexagonal.user.application.service;

import com.practice.hexagonal.user.application.domain.HexagonalUser;
import com.practice.hexagonal.user.application.port.in.RegisterUserUseCase;
import com.practice.hexagonal.user.application.port.out.RegisterUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterUserService implements RegisterUserUseCase {
    private final RegisterUserPort registerUserPort;

    @Override
    public long register(HexagonalUser hexagonalUser) {
        return registerUserPort.save(hexagonalUser);
    }
}
