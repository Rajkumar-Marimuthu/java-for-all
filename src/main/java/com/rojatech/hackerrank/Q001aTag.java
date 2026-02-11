package com.rojatech.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q001aTag {

    public static class Tag {
        private Map<String, String> attributes;
        private List<Tag> children;

        public Tag(String name, String content) {
        }

    }

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         scanner.nextLine(); // consume the newline after the integer

         for (int i = 0; i < n; i++) {
             String line = scanner.nextLine();
             List<String> contents = extractContents(line);
             contents.forEach(System.out::println);
         }

         scanner.close();
     }

    public static List<String> extractContents(String line) {
        List<String> contents = new ArrayList<>();
        int index = 0;

        while (index < line.length()) {
             int tagStart = line.indexOf('<', index);
             if (tagStart == -1) {
                 break; // No more tags
             }

             int tagEnd = line.indexOf('>', tagStart);
             if (tagEnd == -1) {
                 break; // Malformed tag
             }

             String tagName = line.substring(tagStart + 1, tagEnd);
             String closingTag = "</" + tagName + ">";

             int closingTagIndex = line.indexOf(closingTag, tagEnd);
             if (closingTagIndex == -1) {
                 index = tagEnd + 1; // Move past the current tag and continue searching
                 continue; // No closing tag found for this opening tag
             }

             String content = line.substring(tagEnd + 1, closingTagIndex);

             if (!content.isEmpty()) {
                 // Check if the content has any child tags
                 System.out.println("Extracted content: '" + content + "' from tag: '" + tagName + "'");
                 if (content.contains("<")) {
                     // Content has child tags - recursively extract them as separate valid content
                     List<String> childContents = extractContents(content);
                     // Only add non-"None" results from recursion
                     for (String childContent : childContents) {
                         if (!childContent.equals("None")) {
                             contents.add(childContent);
                         }
                     }
                 } else {
                     // Pure text content - add it directly
                     contents.add(content);
                 }
             }

             index = closingTagIndex + closingTag.length(); // Move past the closing tag and continue searching
        }

        if (contents.isEmpty()) {
            contents.add("None"); // If no valid content was found, add "None"
        }
        return contents;
    }



}
