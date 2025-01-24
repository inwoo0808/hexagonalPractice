package com.practice.hexagonal.user.adapter.in;

import com.practice.hexagonal.user.adapter.in.dto.UserRequestDto;
import com.practice.hexagonal.user.application.domain.HexagonalUser;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyUserController {
    @PutMapping("/modify/{id}")
    public Boolean modify(@PathVariable("id")HexagonalUser hexagonalUser, @RequestBody UserRequestDto userRequestDto){

        return true;
    }
}
