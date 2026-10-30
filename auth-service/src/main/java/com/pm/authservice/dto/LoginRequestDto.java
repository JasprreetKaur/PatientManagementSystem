package com.pm.authservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDto {
    @NotBlank(message = "email is required.")
    @Email(message = "email should be a valid email address.")
    private String email;

    @NotBlank(message = "password is required")
    private String password;


}
