package com.practice.hexagonal.infrastructure.repository;

import com.practice.hexagonal.user.application.domain.HexagonalUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HexagonalUserRepository extends JpaRepository<HexagonalUser, Long> {
}
