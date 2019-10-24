package fr.elvynia.formation.doctor;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.elvynia.formation.doctor.entity.Consultation;
import fr.elvynia.formation.doctor.entity.Doctor;
import fr.elvynia.formation.doctor.entity.Patient;
import fr.elvynia.formation.doctor.persistence.ConsultationRepository;
import fr.elvynia.formation.doctor.persistence.DoctorRepository;
import fr.elvynia.formation.doctor.persistence.PatientRepository;

@SpringBootTest
class DoctorApplicationTests {
	
	@Autowired
	private ConsultationRepository consultRepo;
	
	@Autowired
	private DoctorRepository doctorRepo;
	
	@Autowired
	private PatientRepository patientRepo;

	@Test
	void contextLoads() {
		// Création du patient avec ses informations.
		Patient patient = new Patient();
		patient.setName("Jérémy Masson");
		patient.setSerialNumber("0000123456789");
		patient = this.patientRepo.save(patient);
		

		// Création du docteur avec ses informations.
		Doctor doctor = new Doctor();
		doctor.setName("The Doctor");
		doctor.setSerialNumber("0123456789");
		doctor.setSpecialty("Supernatural and extraterrestrial issues");
		doctor = this.doctorRepo.save(doctor);
		

		// Création de la consultation avec ses informations et relations.
		Consultation consult = new Consultation();
		consult.setDateTime(LocalDateTime.now());
		consult.setNumber(1);
		consult.setReason("J'ai mal partout au secours docteur !");
		consult.setDoctor(doctor);
		consult.setPatient(patient);
		this.consultRepo.save(consult);
	}

}
