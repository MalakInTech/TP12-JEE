package ma.ens.security.spring_jwt_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.ens.security.spring_jwt_api.entities.*;
import ma.ens.security.spring_jwt_api.repositories.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringJwtApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepo,
						   RoleRepository roleRepo,
						   PasswordEncoder encoder) {
		return args -> {
			// Créer les rôles
			Role adminRole = new Role(null, "ADMIN");
			Role userRole  = new Role(null, "USER");
			roleRepo.save(adminRole);
			roleRepo.save(userRole);

			// Créer les utilisateurs
			User admin = new User(null, "admin", encoder.encode("1234"), true, java.util.List.of(adminRole));
			User user  = new User(null, "user",  encoder.encode("1234"), true, java.util.List.of(userRole));
			userRepo.save(admin);
			userRepo.save(user);
		};
	}
}
