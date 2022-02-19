package tractive.mapper;

public class ProductOutput {

    private Integer version;
    private int quantity;
    private String edition;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public ProductOutput(Integer version, int quantity, String edition) {
        this.version = version;
        this.quantity = quantity;
        this.edition = edition;
    }

    public ProductOutput() {
        this.quantity = 1;
    }

    public void incrementQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return "{\"version\":" + this.version + (this.edition != null ? ",\"edition\":" + this.edition : "")
                + ",\"quantity\":" + this.quantity + "}";

    }

}
