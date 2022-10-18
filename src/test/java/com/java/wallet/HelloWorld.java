package com.java.wallet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
public class HelloWorld {
    @Test
    public void testHelloWorld() {
       assertEquals(1, 1);
    }
}
