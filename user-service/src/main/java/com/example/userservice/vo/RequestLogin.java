package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {
    @NotNull(message = "이메일은 공백일 수 없습니다")
    @Size(min = 2, message = "이메일이 너무 짧습니다")
    @Email
    private String email;

    @NotNull(message = "패스워드는 공백일 수 없습니다")
    @Size(min = 8, message = "비밀번호가 너무 짧습니다")
    private String password;
}
