package fr.elvynia.formation.doctor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.elvynia.formation.doctor.entity.Doctor;

@Repository
public interface DoctorRepository
		extends JpaRepository<Doctor, Integer> {

}
