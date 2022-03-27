package riffrain.pln;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "riffrain.pln")
public class PlnApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlnApplication.class, args);
	}

}
