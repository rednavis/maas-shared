package com.rednavis.shared.dto.user;

import java.util.Set;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private Set<RoleEnum> roles;
}
