package tractive.mapper;

public class ProductInfo {

	private Integer version;
	private String edition;

	public ProductInfo() {
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public ProductInfo(Integer version, String edition) {
		this.version = version;
		this.edition = edition;
	}

	public ProductInfo(Integer version) {
		this.version = version;
	}

	



}
