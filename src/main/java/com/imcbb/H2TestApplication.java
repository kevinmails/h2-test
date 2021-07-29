package com.imcbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author kevin
 *
 * h2 demo test
 */

//@EnableAsync
@SpringBootApplication
public class H2TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2TestApplication.class, args);
	}

}
