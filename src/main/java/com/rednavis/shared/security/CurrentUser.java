package com.rednavis.shared.security;

import com.rednavis.shared.dto.user.RoleEnum;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class CurrentUser {

  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private Set<RoleEnum> roles;
}