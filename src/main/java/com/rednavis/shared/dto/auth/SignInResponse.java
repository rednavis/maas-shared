package com.rednavis.shared.dto.auth;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignInResponse {

  @Builder.Default
  private String tokenType = "Bearer";
  private String accessToken;
}
