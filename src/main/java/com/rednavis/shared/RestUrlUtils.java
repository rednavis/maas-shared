package com.rednavis.shared;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RestUrlUtils {

  public static final String AUTH_URL = "/api/auth";
  public static final String AUTH_URL_PATTERN = AUTH_URL + "/**";
  public static final String AUTH_URL_CURRENTUSER = "/currentUser";
  public static final String AUTH_URL_SIGNIN = "/signin";
  public static final String AUTH_URL_SIGNUP = "/signup";
  public static final String AUTH_URL_TEST_POST = "/testPost";
  public static final String AUTH_URL_TEST_GET = "/testGet";

  public static final String USER_URL = "/api/users";
  public static final String USER_URL_PATTERN = USER_URL + "/**";
  public static final String USER_URL_USER = "/user";
  public static final String USER_URL_ADMIN = "/admin";
}
