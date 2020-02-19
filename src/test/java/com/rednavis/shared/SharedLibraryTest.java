package com.rednavis.shared;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SharedLibraryTest {

  @Test
  void testGetVersion() {
    SharedLibrary classUnderTest = new SharedLibrary();
    assertEquals(classUnderTest.getVersion(), "master-branch");
  }
}
