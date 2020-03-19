package com.rednavis.shared.dto.book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookPage {

  private int page;
  private int size;

  //TODO LAV - Update page request.
  //For more info see - https://stackoverflow.com/questions/25008472/pagination-in-spring-data-jpa-limit-and-offset
}
