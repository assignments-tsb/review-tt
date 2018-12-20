package com.toptal.javareview.techinterview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalancerTest {

    @Test
    void shouldBalance() {
        Balancer balancer = new Balancer();

        int minSteps = balancer.balance("++-+", 1);

        assertEquals(1, minSteps);
    }

    @Test
    void shouldBeGreaterThanN() {
        Balancer balancer = new Balancer();

        balancer.balance("+++-++-++--+-++++-+--++-++-+-++++-+++--", 12); // 1
        balancer.balance("+++-++-++--+-++++-+--++-++-+-++++-+++--", 13); // 2
        balancer.balance("+++-++-++--+-++++-+--++-++-+-++++-+++--", 14); // -1
        balancer.balance("+++---", 3); // 3
        balancer.balance("+++-+---", 3); // 3
        balancer.balance("----+-", -2); // 4
    }

    @Test
    void shouldReturnNeg1WhenUnAchievable() {
        Balancer balancer = new Balancer();

        int minSteps = balancer.balance("-----", 1);

        assertEquals(-1, minSteps);
    }
}
