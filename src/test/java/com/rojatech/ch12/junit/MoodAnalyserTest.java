package com.rojatech.ch12.junit;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    @Test
    void testMoodAnalyser() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is good message.");
        MatcherAssert.assertThat(mood, CoreMatchers.is("GOOD"));
    }

    @Test
    void testHappyMoods() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is happy message.");
        MatcherAssert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}