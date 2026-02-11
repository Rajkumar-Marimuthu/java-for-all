package com.rojatech.hackerrank;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Q001aTagExtractContentsTest {

    @Test
    void testSimpleTag() {
        String input = "<h1>Nayeem loves counseling</h1>";
        List<String> result = Q001aTag.extractContents(input);
        assertEquals(1, result.size());
        assertEquals("Nayeem loves counseling", result.get(0));
    }

    @Test
    void testNestedTagsExtractInnerContent() {
        String input = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        List<String> result = Q001aTag.extractContents(input);
        assertEquals(2, result.size());
        assertEquals("Sanjay has no watch", result.get(0));
        assertEquals("So wait for a while", result.get(1));
    }

    @Test
    void testCaseSensitiveTagMismatch() {
        String input = "<Amee>safat codes like a ninja</amee>";
        List<String> result = Q001aTag.extractContents(input);
        assertEquals(1, result.size());
        assertEquals("None", result.get(0));
    }

    @Test
    void testTagWithAttributes() {
        String input = "<SA premium>Imtiaz has a secret crush</SA premium>";
        List<String> result = Q001aTag.extractContents(input);
        assertEquals(1, result.size());
        assertEquals("Imtiaz has a secret crush", result.get(0));
    }

    @Test
    void testEmptyContent() {
        String input = "<h1></h1>";
        List<String> result = Q001aTag.extractContents(input);
        assertEquals(1, result.size());
        assertEquals("None", result.get(0));
    }

    @Test
    void testMultipleSiblingTags() {
        String input = "<p>first</p><p>second</p><p>third</p>";
        List<String> result = Q001aTag.extractContents(input);
        assertEquals(3, result.size());
        assertEquals("first", result.get(0));
        assertEquals("second", result.get(1));
        assertEquals("third", result.get(2));
    }

    @Test
    void testDeeplyNestedTags() {
        String input = "<a><b><c>deep content</c></b></a>";
        List<String> result = Q001aTag.extractContents(input);
        assertEquals(1, result.size());
        assertEquals("deep content", result.get(0));
    }

    @Test
    void testNoValidTags() {
        String input = "plain text without tags";
        List<String> result = Q001aTag.extractContents(input);
        assertEquals(1, result.size());
        assertEquals("None", result.get(0));
    }
}

