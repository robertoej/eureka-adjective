package robert.o.eurekaadjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaSubjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSubjectApplication.class, args);
	}
}
