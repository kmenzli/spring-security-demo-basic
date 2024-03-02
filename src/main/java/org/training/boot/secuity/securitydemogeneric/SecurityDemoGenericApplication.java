package org.training.boot.secuity.securitydemogeneric;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.training.boot.secuity.securitydemogeneric.entity.Role;
import org.training.boot.secuity.securitydemogeneric.repository.RoleRepository;

@SpringBootApplication
public class SecurityDemoGenericApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoGenericApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(RoleRepository roleRepo) {
		return (args) -> {
			Role role=new Role();
			role.setName("ROLE_ADMIN");
			roleRepo.save(role);
		};
	}

}
