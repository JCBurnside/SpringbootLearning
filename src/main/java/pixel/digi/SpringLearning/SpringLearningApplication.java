package pixel.digi.SpringLearning;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import pixel.digi.SpringLearning.models.Employee;
import pixel.digi.SpringLearning.repo.IEmployeeRepo;

@SpringBootApplication
public class SpringLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearningApplication.class, args);
	}
}
