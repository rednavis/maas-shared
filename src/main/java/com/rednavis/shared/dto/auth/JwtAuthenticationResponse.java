package com.rednavis.shared.dto.auth;

import lombok.Getter;

@Getter
public class JwtAuthenticationResponse {

  private static final String TOKEN_TYPE = "Bearer";

  private String tokenType;
  private String accessToken;

  public JwtAuthenticationResponse(String accessToken) {
    tokenType = TOKEN_TYPE;
    this.accessToken = accessToken;
  }
}
