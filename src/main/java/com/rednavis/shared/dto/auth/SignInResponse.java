package com.rednavis.shared.dto.auth;

import lombok.Data;

@Data
public class SignInResponse {

  private String tokenType = "Bearer";
  private String accessToken;
}
