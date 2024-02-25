package com.rojatech.javachallenges.list;

import lombok.Data;

import java.util.Date;

public record Customer(int id, String name, Date birthday) {
}