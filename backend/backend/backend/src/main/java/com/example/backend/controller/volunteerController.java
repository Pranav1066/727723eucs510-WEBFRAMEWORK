package com.example.backend.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend.models.Volunteer;
import com.example.backend.repository.volunteerRepository;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
public class volunteerController {

    @Autowired
    private volunteerRepository volunteerRepository;

    @GetMapping("/get")
    public List<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    @PostMapping("/post")
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }

    @GetMapping("/{id}")
    public Volunteer getVolunteerById(@PathVariable Long id) {
        return volunteerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Volunteer not found with id: " + id));
    }

    @PutMapping("update/{id}")
    public Volunteer updateVolunteer(@PathVariable Long id, @RequestBody Volunteer volunteerDetails) {
        Volunteer volunteer = volunteerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Volunteer not found with id: " + id));

        volunteer.setName(volunteerDetails.getName());
        volunteer.setEmail(volunteerDetails.getEmail());
        volunteer.setPhone(volunteerDetails.getPhone());
        volunteer.setAddress(volunteerDetails.getAddress());

        return volunteerRepository.save(volunteer);
    }

    @DeleteMapping("delete/{id}")
    public void deleteVolunteer(@PathVariable Long id) {
        volunteerRepository.deleteById(id);
    }
}
// package com.example.volunteerregistration.service;

// import com.example.backend.models.Volunteer;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class VolunteerService {

//     @Autowired
//     private VolunteerRepository volunteerRepository;

//     public List<Volunteer> getAllVolunteers() {
//         return volunteerRepository.findAll();
//     }

//     public Volunteer getVolunteerById(Long id) {
//         return volunteerRepository.findById(id)
//                 .orElseThrow(() -> new RuntimeException("Volunteer not found with id: " + id));
//     }

//     public Volunteer createVolunteer(Volunteer volunteer) {
//         return volunteerRepository.save(volunteer);
//     }

//     public Volunteer updateVolunteer(Long id, Volunteer volunteerDetails) {
//         Volunteer volunteer = volunteerRepository.findById(id)
//                 .orElseThrow(() -> new RuntimeException("Volunteer not found with id: " + id));

//         volunteer.setName(volunteerDetails.getName());
//         volunteer.setEmail(volunteerDetails.getEmail());
//         volunteer.setPhone(volunteerDetails.getPhone());
//         volunteer.setAddress(volunteerDetails.getAddress());

//         return volunteerRepository.save(volunteer);
//     }

//     public void deleteVolunteer(Long id) {
//         volunteerRepository.deleteById(id);
//     }

//     // Interface for VolunteerRepository
//     @Repository
//     public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
//     }
// }