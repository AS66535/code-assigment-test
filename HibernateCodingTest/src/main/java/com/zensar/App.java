package com.zensar;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;

public class App {
	public static void loadTesting() {
// write code here to load employee object
		Address address = new Address();
		address.setCityName("tirupati");
		address.setPinCode("517501");
		
		BankAccount account = new BankAccount();
		account.setAccountId("10177643456");
		
		Skill skill = new Skill();
		skill.setSkilllevel(3);
		skill.setSkillName("java");
		
		Employee employee = new Employee();
		employee.setName("Althaf");
		employee.setBasicSalary(30000.00);
		
		employee.setAddress(address);
		employee.setAccount(account);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("assigment");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public static void insertTesting() {
// write the code here to persist employee object
	}

	public static void main(String[] args) {
		loadTesting();
	}
}
