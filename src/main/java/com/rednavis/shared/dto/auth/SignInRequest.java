package com.rednavis.shared.dto.auth;

import lombok.Data;

@Data
public class SignInRequest {

  private String email;
  private String password;
}
