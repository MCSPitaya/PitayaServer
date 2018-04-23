package ch.pitaya.pitaya.payload;

import ch.pitaya.pitaya.security.UserPrincipal;

public class UserSummary {
	private Long id;
	private String username;
	private String name;
	private String email;

	public UserSummary(Long id, String username, String name, String email) {
		this.id = id;
		this.username = username;
		this.name = name;
		this.email = email;
	}

	public UserSummary(UserPrincipal principal) {
		this.id = principal.getId();
		this.username = principal.getUsername();
		this.name = principal.getName();
		this.email = principal.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
