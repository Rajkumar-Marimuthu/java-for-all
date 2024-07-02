package com.rojatech.ch09.others;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Customer {
	private int id;
	private String name;
	private Date birthday;
}