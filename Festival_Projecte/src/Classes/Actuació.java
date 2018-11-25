package Classes;

public class Actuació {
	private int durada;
	private boolean usLlumsiSo;
	
	

	public int getDurada() {
		return durada;
	}



	public void setDurada(int durada) {
		this.durada = durada;
	}



	public boolean isUsLlumsiSo() {
		return usLlumsiSo;
	}



	public void setUsLlumsiSo(boolean usLlumsiSo) {
		this.usLlumsiSo = usLlumsiSo;
	}



	public void Actua() {
		System.out.println("Hi ha una actuació en directe");
	}

}
