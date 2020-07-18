package com.edureka.travelcompany;



import java.util.Optional;
import java.util.stream.Stream;

import com.edureka.travelcompany.entities.Hotel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@SpringBootApplication
public class TravelcompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelcompanyApplication.class, args);
	}



	/*@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> Stream.of("hotel1,city1,desc1,1", "hotel2,city2,desc2,2").map(u -> u.split(",")).forEach(
			t -> userRepository.save(new Hotel(t[0], t[1], t[2],Integer.getInteger(t[3]))));
	}*/
}

