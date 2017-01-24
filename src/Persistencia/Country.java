package Persistencia;


public class Country {
	private String name;
    private String codeAlpha2;
    private String codeAlpha3;
    private State[] state;
    
    
    
    

	public State[] getState() {
		return state;
	}

	public void setState(State[] state) {
		this.state = state;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeAlpha2() {
        return codeAlpha2;
    }

    public void setCodeAlpha2(String codeAlpha2) {
        this.codeAlpha2 = codeAlpha2;
    }

    public String getCodeAlpha3() {
        return codeAlpha3;
    }

    public void setCodeAlpha3(String codeAlpha3) {
        this.codeAlpha3 = codeAlpha3;
    }

    public Country() {
    }

    public Country(String name, String codeAlpha2, String codeAlpha3, State[] state) {
        this.name = name;
        this.codeAlpha2 = codeAlpha2;
        this.codeAlpha3 = codeAlpha3;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Country: " + "\nName: " + name + "\nCode alpha2: " + codeAlpha2 + "\nCode Alpha3: " + codeAlpha3+"\n";
    }
    
    
    
}
