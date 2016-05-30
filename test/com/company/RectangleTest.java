package com.company;

import static org.junit.Assert.*;
import java.awt.*;
/**
 * Created by rvaidya on 30/05/16.
 */
public class RectangleTest {

    @org.junit.Test
    public void CalculateAreaTest() throws Exception {
        assertThat(new Rectangle(2,3),6);

    }
}