package eecs1022.example_test_3;

class Order {
	String product;
	double price;
    int quantity;

    Order() {

    }

    Order(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    String getProduct() {
        return product;
    }

    void setProduct(String product) {
        this.product = product;
    }

    double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
