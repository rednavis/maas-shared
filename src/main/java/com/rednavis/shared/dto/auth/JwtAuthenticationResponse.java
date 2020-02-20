package com.rednavis.shared.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtAuthenticationResponse {
  @JsonProperty("tokenType")
  private static final String TOKEN_TYPE = "Bearer";
  private String accessToken;
}
