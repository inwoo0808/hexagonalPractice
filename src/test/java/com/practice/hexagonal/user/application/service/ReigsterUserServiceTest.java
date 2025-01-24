package com.practice.hexagonal.user.application.service;

import com.practice.hexagonal.user.application.domain.HexagonalUser;
import com.practice.hexagonal.user.application.port.out.RegisterUserPort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ReigsterUserServiceTest {
    @Mock
    RegisterUserPort registerUserPort;

    @Test
    @DisplayName("Hexagonal User Entity가 정상적으로 등록된다.")
    public void registerUser() {
        //given
        HexagonalUser user = HexagonalUser.builder()
                .username("inwoo")
                .email("inwoo@gmail.com")
                .password("pwd1234")
                .role("ROLE_USER")
                .build();

        //when
        RegisterUserService registerUserService = new RegisterUserService(registerUserPort);
        //given
        given(registerUserPort.save(user)).willReturn(1L);
        //then
        assertEquals(1L, registerUserService.register(user));
    }
}
