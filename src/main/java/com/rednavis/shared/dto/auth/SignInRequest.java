package com.rednavis.shared.dto.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignInRequest {

  private String email;
  private String password;
}
