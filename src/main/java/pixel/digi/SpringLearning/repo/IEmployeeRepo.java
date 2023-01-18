package pixel.digi.SpringLearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pixel.digi.SpringLearning.models.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
    
}
