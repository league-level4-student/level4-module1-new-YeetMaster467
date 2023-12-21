package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	public abstract void doMedicine();
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void assignPatient (Patient p) {
		if (patients.size() != 3) {
			patients.add(p);
		}
	}
}
