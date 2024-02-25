package com.rojatech.javachallenges.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringWithoutRepeatTest {

    @ParameterizedTest
    @CsvSource({
           "'ABCDEFGABEF', 7",
            "'GEEKSFORGEEKS', 7",
            "'BBBB', 1",
            "'ABCDCDEFG',5",
            "'XUYTWDTAYUITERaSD',10",
            "'', 0"
    })
    void findLongestSubstringTest(String input, int expected){
        // when
        int result = LongestSubStringWithoutRepeat.findLongestSubstring(input);
        Assertions.assertEquals(expected, result);

    }
}