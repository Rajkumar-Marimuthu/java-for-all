package com.rojatech.java15;

/**
 * This class demonstrates the multi-line string feature introduced in Java 15.
 *
 * @since 1.15
 * Text Blocks, a multi-line string literal that avoids the need for most escape sequences,
 * automatically formats the string in a predictable way,
 * and gives the developer control over the format when desired.
 */
public class MultiLineStringDemo {

    public static void main(String[] args) {
        String html = """
                <html>
                    <body>
                        <p>Hello, World</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }
}
