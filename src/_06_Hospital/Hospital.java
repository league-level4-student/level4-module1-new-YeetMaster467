package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public void addPatient(Patient patient) {
		unassignedPatients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		return unassignedPatients;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void assignPatientsToDoctors() {
		for (int i = 0; i < doctors.size(); i++) {
			while (!unassignedPatients.isEmpty()) {
				try {
					doctors.get(i).assignPatient(unassignedPatients.get(0));
					unassignedPatients.remove(0);
				} catch (DoctorFullException e) {
					break;
				}
			}
		}
	}
}
