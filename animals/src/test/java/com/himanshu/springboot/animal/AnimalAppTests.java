package com.himanshu.springboot.animal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnimalAppTests {

  @Autowired private Animal lion;
  @Autowired private Animal tiger;

  @Test
  void contextLoads() {
    assertNotNull(lion);
    assertNotNull(tiger);
  }
}
