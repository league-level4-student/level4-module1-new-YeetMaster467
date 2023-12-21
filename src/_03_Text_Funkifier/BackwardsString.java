package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;
    private StringBuilder s;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	
    	s = new StringBuilder(unfunkifiedText);
        return s.reverse().toString();

    }
}
