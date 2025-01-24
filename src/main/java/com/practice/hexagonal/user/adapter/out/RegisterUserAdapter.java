package com.practice.hexagonal.user.adapter.out;

import com.practice.hexagonal.infrastructure.repository.HexagonalUserRepository;
import com.practice.hexagonal.user.application.domain.HexagonalUser;
import com.practice.hexagonal.user.application.port.out.RegisterUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RegisterUserAdapter implements RegisterUserPort {
    private final HexagonalUserRepository hexagonalUserRepository;

    @Override
    public long save(HexagonalUser hexagonalUser) {
        return hexagonalUserRepository.save(hexagonalUser).getId();
    }
}
