package com.rednavis.shared.security;

import com.rednavis.shared.dto.user.RoleEnum;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrentUser {

  private String id;
  private Set<RoleEnum> roles;
  private String firstName;
  private String lastName;
  private String email;
}