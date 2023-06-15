package e1_onetomany_hibernatee1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import e1_onetomany_hibernatee1.dto.School;
import e1_onetomany_hibernatee1.dto.Student;

public class StudentCrud {

	public EntityManager getmanager() {

//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("radha");
//			EntityManager manager = factory.createEntityManager();
//			return manager;
		return Persistence.createEntityManagerFactory("radha").createEntityManager();
	}

	public void saveStudent(Student student, int id) {
		EntityManager manager = getmanager();
		School school = manager.find(School.class, id);
		EntityTransaction transaction = manager.getTransaction();

		if (school != null) {
			transaction.begin();
			student.setSchool(school);
            manager.persist(student);

			List<Student> list = new ArrayList<Student>();
			list.add(student);
			list.addAll(school.getStudents());
			school.setStudents(list);
			manager.merge(school);
			transaction.commit();
		} else
			System.out.println("school is not present to save the student");

	}

	public void updateStudent(int id, Student student) {
		EntityManager manager = getmanager();
		EntityTransaction transaction = manager.getTransaction();

		Student s = manager.find(Student.class, id);
		if (s != null) {

//				student.setId(id);
//				transaction.begin();
//				manager.merge(student);
//				transaction.commit();

			s.setName(student.getName());
			s.setPhone(student.getPhone());
			s.setBloodgroup(student.getBloodgroup());
			s.setAddress(student.getAddress());
			transaction.begin();
			manager.merge(s);
			transaction.commit();

		} else
			System.out.println("id is not exist");

	}
	
	public void getStudentByID(int id) {
		EntityManager manager=getmanager();
		Student student=manager.find(Student.class, id);
		System.out.println(student);
	}
	
	
	public void deleteStudent(int id) {
		EntityManager manager=getmanager();
		EntityTransaction transaction=manager.getTransaction();
		Student s=manager.find(Student.class, id);
		if(s!=null) {
			transaction.begin();
			manager.remove(s);
			transaction.commit();
		}
		else
			System.out.println("id is not exist to delete");
		
		
	}
	
	
	
	

}
