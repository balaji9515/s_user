package com.hana.user.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequestDto {
	@NotBlank(message = "username cannot be blank")
	private String userName;

	@NotBlank(message = "password cannot be blank")
	private String password;

	@NotBlank(message = "first name cannot be blank")
	private String firstName;

	@NotBlank(message = "last name cannot be blank")
	private String lastName;
    
	@Pattern(regexp="(^$|[0-9]{10})")
	private String phoneNumber;

}

