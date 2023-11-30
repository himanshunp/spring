package com.himanshu.springboot.birds;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BirdsAppTests {

  @Autowired private Bird kingfisher;
  @Autowired private Bird flamingo;

  @Test
  void contextLoads() {
    assertNotNull(kingfisher);
    assertNotNull(flamingo);
  }
}
