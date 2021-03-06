package pa.project.backend.client.api.dto;

public class Client {

	private String name;
	private String lastName;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}
}
