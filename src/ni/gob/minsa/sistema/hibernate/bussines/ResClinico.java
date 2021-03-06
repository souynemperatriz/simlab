package ni.gob.minsa.sistema.hibernate.bussines;

// Generated Dec 19, 2012 12:05:15 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ResClinico generated by hbm2java
 */
public class ResClinico implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7617192960549791172L;
	private int codigoNino;
	private Date fis;
	private Byte edad;
	private String sexo;
	private String resultadoFinal;

	public ResClinico() {
	}

	public ResClinico(int codigoNino, Date fis, String resultadoFinal) {
		this.codigoNino = codigoNino;
		this.fis = fis;
		this.resultadoFinal = resultadoFinal;
	}

	public ResClinico(int codigoNino, Date fis, Byte edad, String sexo,
			String resultadoFinal) {
		this.codigoNino = codigoNino;
		this.fis = fis;
		this.edad = edad;
		this.sexo = sexo;
		this.resultadoFinal = resultadoFinal;
	}

	public int getcodigoNino() {
		return this.codigoNino;
	}

	public void setcodigoNino(int codigoNino) {
		this.codigoNino = codigoNino;
	}

	public Date getFis() {
		return this.fis;
	}

	public void setFis(Date fis) {
		this.fis = fis;
	}

	public Byte getEdad() {
		return this.edad;
	}

	public void setEdad(Byte edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getResultadoFinal() {
		return this.resultadoFinal;
	}

	public void setResultadoFinal(String resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}

}
