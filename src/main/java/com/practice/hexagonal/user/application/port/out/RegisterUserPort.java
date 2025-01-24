package com.practice.hexagonal.user.application.port.out;

import com.practice.hexagonal.user.application.domain.HexagonalUser;

public interface RegisterUserPort {
    long save(HexagonalUser hexagonalUser);
}
