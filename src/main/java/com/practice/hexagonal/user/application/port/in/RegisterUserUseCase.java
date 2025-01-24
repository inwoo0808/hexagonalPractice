package com.practice.hexagonal.user.application.port.in;

import com.practice.hexagonal.user.application.domain.HexagonalUser;

public interface RegisterUserUseCase {
    long register(HexagonalUser hexagonalUser);
}
