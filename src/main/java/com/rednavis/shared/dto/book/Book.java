package com.rednavis.shared.dto.book;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Data
@FieldNameConstants
public class Book {

  private String id;
  private String title;
  private String author;
  private int pageCount;
  private String isbn;
  private int publishYear;
  private BookStatus status;
}
