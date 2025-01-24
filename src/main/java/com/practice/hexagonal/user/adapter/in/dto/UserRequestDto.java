package com.practice.hexagonal.user.adapter.in.dto;

import com.practice.hexagonal.user.application.domain.HexagonalUser;
import lombok.Data;

@Data
public class UserRequestDto {
    private String username;
    private String password;
    private String role;
    private String email;

    public HexagonalUser toEntity(){
        return HexagonalUser
                .builder()
                .username(username)
                .password(password)
                .role(role)
                .email(email)
                .build();
    }

    public HexagonalUser from(HexagonalUser user){
        return user;
    }
}
