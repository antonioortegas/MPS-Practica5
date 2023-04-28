package org.mps.boundedqueue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayBoundedQueueTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("test")
    public void test(){
        assertThat(5).isEqualTo(5);
        assertThat(5).isNotEqualTo(4);
    }
}