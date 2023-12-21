package _03_Text_Funkifier;

import java.util.Random;

public class RemoveVowelsString implements TextFunkifier {

	private String unfunkifiedText;
	private StringBuilder s;
	private Random r = new Random();
	
	public RemoveVowelsString (String unfunkifiedText) {
		this.unfunkifiedText = unfunkifiedText;
	}
	
	
	@Override
	public String funkifyText() {
		
		unfunkifiedText = unfunkifiedText.toLowerCase();
		s = new StringBuilder(unfunkifiedText);
		
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
				case 'a':
					s.deleteCharAt(i);
					break;
				case 'e':
					s.deleteCharAt(i);
					break;
				case 'i':
					s.deleteCharAt(i);
					break;
				case 'o':
					s.deleteCharAt(i);
					break;
				case 'u':
					s.deleteCharAt(i);
					break;
				case 'y':
					if (r.nextBoolean()) {
						s.deleteCharAt(i);
					}
					break;
			}
		}
		
		return s.toString();
	}

}
