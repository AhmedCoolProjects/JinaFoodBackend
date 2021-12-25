package me.ahmedbargady.jinafood.model;

public interface Person {

	public Employee get(String id);

	public Person[] getAll();

	public Person add(Person person);

	public String delete(String id);

}
