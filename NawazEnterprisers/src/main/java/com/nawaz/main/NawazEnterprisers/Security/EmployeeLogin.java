package com.nawaz.main.NawazEnterprisers.Security;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeLogin {

	@NotNull
	@Size(min = 2, message = "please provide your user name")
private	String username ;
	@NotNull
	@Size(min = 2, message = "please provide your password")
private String password;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



	
	
	
	
	
	
}
