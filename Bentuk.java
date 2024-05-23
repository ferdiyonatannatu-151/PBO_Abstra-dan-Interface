package latihan_1;

	public abstract class Bentuk {
	    protected double PHI = 3.14;
	    protected int jari2;

	    // Constructor
	    public Bentuk(int jari2) {
	        this.jari2 = jari2;
	    }

	    // Abstract method
	    public abstract double luas();

	    // Getter for jari2
	    public int getJari2() {
	        return jari2;
	    }

	    // Setter for jari2
	    public void setJari2(int jari2) {
	        this.jari2 = jari2;
	    }
	}

