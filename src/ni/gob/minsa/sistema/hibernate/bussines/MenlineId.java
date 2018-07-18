package ni.gob.minsa.sistema.hibernate.bussines;

// Generated 08-07-2012 11:27:23 AM by Hibernate Tools 3.4.0.CR1

/**
 * MenlineId generated by hbm2java
 */
public class MenlineId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9004136557750556619L;
	private String codMen;
	private int nordenMen;
	private String tranMenl;

	public MenlineId() {
	}

	public MenlineId(String codMen, int nordenMen, String tranMenl) {
		this.codMen = codMen;
		this.nordenMen = nordenMen;
		this.tranMenl = tranMenl;
	}

	public String getCodMen() {
		return this.codMen;
	}

	public void setCodMen(String codMen) {
		this.codMen = codMen;
	}

	public int getNordenMen() {
		return this.nordenMen;
	}

	public void setNordenMen(int nordenMen) {
		this.nordenMen = nordenMen;
	}

	public String getTranMenl() {
		return this.tranMenl;
	}

	public void setTranMenl(String tranMenl) {
		this.tranMenl = tranMenl;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MenlineId))
			return false;
		MenlineId castOther = (MenlineId) other;

		return ((this.getCodMen() == castOther.getCodMen()) || (this
				.getCodMen() != null && castOther.getCodMen() != null && this
				.getCodMen().equals(castOther.getCodMen())))
				&& (this.getNordenMen() == castOther.getNordenMen())
				&& ((this.getTranMenl() == castOther.getTranMenl()) || (this
						.getTranMenl() != null
						&& castOther.getTranMenl() != null && this
						.getTranMenl().equals(castOther.getTranMenl())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodMen() == null ? 0 : this.getCodMen().hashCode());
		result = 37 * result + this.getNordenMen();
		result = 37 * result
				+ (getTranMenl() == null ? 0 : this.getTranMenl().hashCode());
		return result;
	}

}