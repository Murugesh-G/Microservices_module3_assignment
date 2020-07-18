package com.edureka.travelcompany.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edureka.travelcompany.entities.Hotel;

@Repository
public interface UserRepository extends JpaRepository<Hotel, Long> {

	Optional<Hotel> findByName(String name);

}