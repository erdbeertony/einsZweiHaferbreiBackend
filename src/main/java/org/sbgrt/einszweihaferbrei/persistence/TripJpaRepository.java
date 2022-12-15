package org.sbgrt.einszweihaferbrei.persistence;


import org.sbgrt.einszweihaferbrei.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripJpaRepository extends JpaRepository<Trip, String> {
}
