package me.ahmedbargady.jinafood.model;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee extends Person {
	private double salary;
	private LocalDate birthday;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Employee(String first_name, String last_name, String email, String phone, String title, Gender gender,
			double salary, LocalDate birthday) {
		super(first_name, last_name, email, phone, title, gender);
		this.salary = salary;
		this.birthday = birthday;
	}

}
