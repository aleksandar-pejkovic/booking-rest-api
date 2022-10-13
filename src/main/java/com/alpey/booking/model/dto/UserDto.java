package com.alpey.booking.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

	private String username;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String city;
	private String phone;

}
