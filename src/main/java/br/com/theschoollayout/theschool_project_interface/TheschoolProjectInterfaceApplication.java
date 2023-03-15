package br.com.theschoollayout.theschool_project_interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TheschoolProjectInterfaceApplication implements CommandLineRunner{

	@Autowired
	private StartIntarface startIntarface;

	public static void main(String[] args) {
		SpringApplication.run(TheschoolProjectInterfaceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		startIntarface.loop();
		System.exit(0);
	}

}
