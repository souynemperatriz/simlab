package ni.gob.minsa.sistema.hibernate.bussines;

// Generated 08-07-2012 11:27:23 AM by Hibernate Tools 3.4.0.CR1

/**
 * DetParam generated by hbm2java
 */
public class DetParam implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7757969028049753881L;
	private DetParamId id;
	private String descItem;
	private int nroOrde;

	public DetParam() {
	}

	public DetParam(DetParamId id, String descItem, int nroOrde) {
		this.id = id;
		this.descItem = descItem;
		this.nroOrde = nroOrde;
	}

	public DetParamId getId() {
		return this.id;
	}

	public void setId(DetParamId id) {
		this.id = id;
	}

	public String getDescItem() {
		return this.descItem;
	}

	public void setDescItem(String descItem) {
		this.descItem = descItem;
	}

	public int getNroOrde() {
		return this.nroOrde;
	}

	public void setNroOrde(int nroOrde) {
		this.nroOrde = nroOrde;
	}
}
