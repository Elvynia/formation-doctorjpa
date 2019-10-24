package fr.elvynia.formation.doctor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.elvynia.formation.doctor.entity.Consultation;

@Repository
public interface ConsultationRepository
		extends JpaRepository<Consultation, Integer> {

}
