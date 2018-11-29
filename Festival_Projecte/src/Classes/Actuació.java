package Classes;

public class Actuació {
	private int durada;
	private boolean usLlumsiSo;
	
	/**
	 * Constructor
	 */
	public Actuació(int durada, boolean usLlumsiSo) {
		this.durada = durada;
		this.usLlumsiSo = usLlumsiSo;
	}

	public int getDurada() {
		return durada;
	}

	public boolean isUsLlumsiSo() {
		return usLlumsiSo;
	}
	
	/**
	 * Per simular que hi ha una actuació
	 */
	public void Actua() {
		System.out.println("Hi ha una actuació en directe");
	}

}
