package ni.gob.minsa.sistema.hibernate.bussines;

// Generated Nov 15, 2012 1:54:56 PM by Hibernate Tools 3.4.0.CR1

/**
 * RackId generated by hbm2java
 */
public class RackId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2083836662355035512L;
	private String codRack;
	private int rcodFreezer;

	public RackId() {
	}

	public RackId(String codRack, int rcodFreezer) {
		this.codRack = codRack;
		this.rcodFreezer = rcodFreezer;
	}

	public String getCodRack() {
		return this.codRack;
	}

	public void setCodRack(String codRack) {
		this.codRack = codRack;
	}

	public int getRcodFreezer() {
		return this.rcodFreezer;
	}

	public void setRcodFreezer(int rcodFreezer) {
		this.rcodFreezer = rcodFreezer;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RackId))
			return false;
		RackId castOther = (RackId) other;

		return ((this.getCodRack() == castOther.getCodRack()) || (this
				.getCodRack() != null && castOther.getCodRack() != null && this
				.getCodRack().equals(castOther.getCodRack())))
				&& (this.getRcodFreezer() == castOther.getRcodFreezer());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodRack() == null ? 0 : this.getCodRack().hashCode());
		result = 37 * result + this.getRcodFreezer();
		return result;
	}

}
