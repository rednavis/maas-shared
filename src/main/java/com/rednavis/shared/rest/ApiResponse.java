package com.rednavis.shared.rest;

import com.rednavis.shared.http.HttpStatusCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {

  private boolean success;
  private HttpStatusCode httpStatusCode;
  private T payloads;

  public static <T> ApiResponse<T> createSuccessResponse(T payloads) {
    return new ApiResponse<>(true, HttpStatusCode.OK, payloads);
  }

  public static <T> ApiResponse<T> createErrorResponse(HttpStatusCode httpStatusCode, T payloads) {
    return new ApiResponse<>(false, httpStatusCode, payloads);
  }
}
