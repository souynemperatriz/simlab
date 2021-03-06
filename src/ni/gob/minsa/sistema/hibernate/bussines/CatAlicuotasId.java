package ni.gob.minsa.sistema.hibernate.bussines;

// Generated Nov 3, 2012 1:14:49 PM by Hibernate Tools 3.4.0.CR1

/**
 * CatAlicuotasId generated by hbm2java
 */
public class CatAlicuotasId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6730478549770464742L;
	private String tipoAlicuota;
	private String estudioPert;

	public CatAlicuotasId() {
	}

	public CatAlicuotasId(String tipoAlicuota, String estudioPert) {
		this.tipoAlicuota = tipoAlicuota;
		this.estudioPert = estudioPert;
	}

	public String getTipoAlicuota() {
		return this.tipoAlicuota;
	}

	public void setTipoAlicuota(String tipoAlicuota) {
		this.tipoAlicuota = tipoAlicuota;
	}

	public String getEstudioPert() {
		return this.estudioPert;
	}

	public void setEstudioPert(String estudioPert) {
		this.estudioPert = estudioPert;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CatAlicuotasId))
			return false;
		CatAlicuotasId castOther = (CatAlicuotasId) other;

		return ((this.getTipoAlicuota() == castOther.getTipoAlicuota()) || (this
				.getTipoAlicuota() != null
				&& castOther.getTipoAlicuota() != null && this
				.getTipoAlicuota().equals(castOther.getTipoAlicuota())))
				&& ((this.getEstudioPert() == castOther.getEstudioPert()) || (this
						.getEstudioPert() != null
						&& castOther.getEstudioPert() != null && this
						.getEstudioPert().equals(castOther.getEstudioPert())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTipoAlicuota() == null ? 0 : this.getTipoAlicuota()
						.hashCode());
		result = 37
				* result
				+ (getEstudioPert() == null ? 0 : this.getEstudioPert()
						.hashCode());
		return result;
	}

}
