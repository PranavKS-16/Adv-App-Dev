package corprate.mugil;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import corprate.mugil.dto.request.RegisterRequest;
import corprate.mugil.enumerated.Role;
import corprate.mugil.service.UserService;

@SpringBootApplication
public class MugilApplication {

	public static void main(String[] args) {
		SpringApplication.run(MugilApplication.class, args);
	}


	// @Bean
	// public CommandLineRunner commandLineRunner(UserService userService)
	// {
	// 	return args->{
	// 		var user=RegisterRequest.builder()
	// 		.name("Admin")
	// 		.email("admin@gmail.com")
	// 		.role(Role.USER)
	// 		.password("Admin@123")
	// 		.build();
	// 		userService.register(user);
	// 	};
	// }

}
