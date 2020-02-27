package com.rednavis.shared.rest.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInResponse {

  @Builder.Default
  private String tokenType = "Bearer";
  private String accessToken;
}