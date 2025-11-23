package com.rojatech.ch01;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        Arrays.stream(Student.class.getDeclaredMethods())
                .map(Method::getName)
                .sorted(Comparator.comparing(s -> s.toLowerCase(Locale.ENGLISH)))
                .forEach(System.out::println);

    }
}
