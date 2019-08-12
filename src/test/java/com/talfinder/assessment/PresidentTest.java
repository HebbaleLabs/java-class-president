package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class PresidentTest {
    int studentsno;
    int songlength;
    int expected;

    public PresidentTest(int studentsno, int songlength, int expected) {
        this.studentsno = studentsno;
        this.songlength = songlength;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {5, 2, 3},
                {10, 3, 4},
                {2, 345, 2},
                {1, 44, 1},
                {50, 100, 36},
                {30, 7, 23},
                {100000, 4656788, 53757}});

    }

    @Test
    public void selectPresident() {
        Assert.assertEquals("input:No. of students: " + studentsno + " Song Length:" + songlength, expected, President.selectPresident(studentsno, songlength));
    }

}