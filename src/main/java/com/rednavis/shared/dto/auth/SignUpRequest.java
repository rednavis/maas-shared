package com.rednavis.shared.dto.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {

  private String firstName;
  private String lastName;
  private String email;
  private String password;
}
