package e1_onetomany_hibernatee1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import e1_onetomany_hibernatee1.dto.School;
import e1_onetomany_hibernatee1.dto.Student;

public class SchoolCrud {
	
	
	public EntityManager getmanager() {
		
//	EntityManagerFactory factory = Persistence.createEntityManagerFactory("radha");
//		EntityManager manager = factory.createEntityManager();
//		return manager;
		return Persistence.createEntityManagerFactory("radha").createEntityManager();
	}
	
	
	           
	public void saveSchool(School school) {
		EntityManager manager=getmanager();
		EntityTransaction transaction=manager.getTransaction();
		List<Student>list=school.getStudents();
		transaction.begin();
		manager.persist(school);

		for (Student student : list) {
			
			student.setSchool(school);
			manager.merge(student);
		}
		
		
		transaction.commit();
		
		
	}
	
	
	public void updateSchool(int id, String name) {
		EntityManager manager=getmanager();
		EntityTransaction transaction=manager.getTransaction();
		School school = manager.find(School.class, id);
		if(school!=null) {
			
			System.out.println(school.getName());      
			school.setName(name);
			System.out.println(school.getName());
			
			transaction.begin();
			manager.merge(school);
			transaction.commit();
			
	
		}
		else
			System.out.println("id is not exist to update");
		
	}
	
	
	
	public void getSchoolByID(int id) {
		EntityManager manager=getmanager();
		School s=manager.find(School.class, id);
		System.out.println(s);
	}



	public void deleteSchool(int i) {
		EntityManager manager=getmanager();
		EntityTransaction  t=manager.getTransaction();
	School school=	manager.find(School.class, i);
	if(school!=null) {
		t.begin();
		manager.remove(school);
		t.commit();
	}
	}
	
	
	
	
	
	
	

}
