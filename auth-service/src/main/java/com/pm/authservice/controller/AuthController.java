package com.pm.authservice.controller;

import com.pm.authservice.dto.LoginRequestDto;
import com.pm.authservice.dto.LoginResponseDto;
import com.pm.authservice.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AuthController {

    private AuthService authService;

    @Operation(summary = "generate token on user login")
    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestDto) {
        Optional<String> tokenOptional = authService.authenticate(loginRequestDto);
        return tokenOptional.map(s -> ResponseEntity.ok(new LoginResponseDto(s)))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());

    }

}
