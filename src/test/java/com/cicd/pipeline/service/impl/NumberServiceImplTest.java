package com.cicd.pipeline.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NumberServiceImplTest {

  @InjectMocks private NumberServiceImpl numberService;

  @Test
  void given_2_as_input_checkIfPrimeNumber_should_return_true() {

    final int number = 2;
    boolean actualResult = numberService.checkIfPrimeNumber(number);

    assertThat(actualResult, equalTo(true));
  }
}
