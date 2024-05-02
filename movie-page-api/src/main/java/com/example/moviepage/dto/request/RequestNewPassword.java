package com.example.moviepage.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestNewPassword {
    String loginId;
    String nowPassword;
    String changePassword;
    String changePasswordCheck;
}
