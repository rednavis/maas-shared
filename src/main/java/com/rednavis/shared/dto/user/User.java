package com.rednavis.shared.dto.user;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private Set<RoleEnum> roles;
}
