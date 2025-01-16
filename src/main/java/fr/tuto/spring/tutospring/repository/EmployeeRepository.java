package fr.tuto.spring.tutospring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.tuto.spring.tutospring.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}