package com.example.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.models.Volunteer;
// Interface for VolunteerRepository
@Repository
public interface volunteerRepository extends JpaRepository<Volunteer, Long> {
    
}
