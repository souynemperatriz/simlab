package ni.gob.minsa.sistema.hibernate.bussines;

// Generated Jan 4, 2013 1:13:11 PM by Hibernate Tools 3.4.0.CR1

/**
 * AlicCaja generated by hbm2java
 */
public class AlicCaja implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7015371665995202157L;
	private String alicPerm;
	private String estudio;
	private int tempAlm;
	private String separar;
	private String freezerAlm;

	public AlicCaja() {
	}

	public AlicCaja(String alicPerm, String estudio, int tempAlm, String separar, String freezerAlm) {
		this.alicPerm = alicPerm;
		this.estudio = estudio;
		this.tempAlm = tempAlm;
		this.separar = separar;
		this.freezerAlm = freezerAlm;
	}
	
	public String getFreezerAlm() {
		return freezerAlm;
	}

	public void setFreezerAlm(String freezerAlm) {
		this.freezerAlm = freezerAlm;
	}

	public String getSeparar() {
		return separar;
	}

	public void setSeparar(String separar) {
		this.separar = separar;
	}

	public String getAlicPerm() {
		return this.alicPerm;
	}

	public void setAlicPerm(String alicPerm) {
		this.alicPerm = alicPerm;
	}

	public String getEstudio() {
		return this.estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public int getTempAlm() {
		return this.tempAlm;
	}

	public void setTempAlm(int tempAlm) {
		this.tempAlm = tempAlm;
	}

}
