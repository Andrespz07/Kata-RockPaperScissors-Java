package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import javax.swing.tree.ExpandVetoException;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void test_is_a_rock() {
        Rock rock = new Rock();
        assertTrue(true instanceof Rock);
        assertTrue(expected: "Rock", rock.getClass());
    }
}
