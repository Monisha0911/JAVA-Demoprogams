package day7;

import java.util.Objects;

public class EmployeeEmail 
{
	private int id;
	private String email;
	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEmail other = (EmployeeEmail) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "EmployeeEmail [id=" + id + ", email=" + email + "]";
	}
}
