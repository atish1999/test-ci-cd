package com.cicd.pipeline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration(
    exclude = {
      MongoAutoConfiguration.class,
    })
class PipelineApplicationTests {

  @Test
  void contextLoads() {}
}
