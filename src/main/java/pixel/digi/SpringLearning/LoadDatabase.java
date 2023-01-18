package pixel.digi.SpringLearning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pixel.digi.SpringLearning.models.Employee;
import pixel.digi.SpringLearning.repo.IEmployeeRepo;

@Configuration
public class LoadDatabase {
    @Bean
	CommandLineRunner initDatabase(IEmployeeRepo repo) {
		return args -> {
			System.out.println("Preloading " + repo.save(new Employee("Bliblo Banggins", "burglar")));
			System.out.println("Preloading " + repo.save(new Employee("Frodo Baggins", "thief")));
		};
	}
}
