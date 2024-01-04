package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	public void doMedicine() {
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}
	
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void assignPatient (Patient p) throws DoctorFullException {
		if (patients.size() >= 3) {
			throw new DoctorFullException();
		} else {
			patients.add(p);
		}
	}
	
	public ArrayList<Patient> getPatients () {
		return patients;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
	
	public boolean performsSurgery() {
		return false;
	}
	
}
