package com.rednavis.shared.rest;

import com.rednavis.shared.http.HttpStatusCode;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {

  private Boolean success;
  private HttpStatusCode httpStatusCode;
  private T payloads;

  public static <T> ApiResponse<T> createSuccessResponse(T payloads) {
    return new ApiResponse<>(true, HttpStatusCode.OK, payloads);
  }

  public static <T> ApiResponse<T> createErrorResponse(HttpStatusCode httpStatusCode, T payloads) {
    return new ApiResponse<>(false, httpStatusCode, payloads);
  }
}
