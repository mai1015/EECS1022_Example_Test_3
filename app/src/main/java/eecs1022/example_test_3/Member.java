package eecs1022.example_test_3;

class Member {
    static int MEMBER_ID = 1;
    static final String MEMBER_PRE = "mem";
    static final int MAX_ORDER = 100;
    String id;
    double balance;
    Order[] orders = new Order[MAX_ORDER];
    int pos = 0;

    Member() {
        id = MEMBER_PRE + MEMBER_ID;
        MEMBER_ID++;
        this.balance = 0.0;
    }

    public Member(double balance) {
        id = MEMBER_PRE + MEMBER_ID;
        MEMBER_ID++;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Order[] getOrders() {
        Order[] o = new Order[pos];
        for (int i = 0; i < pos; i++) {
            o[i] = orders[i];
        }
        return o;
    }

    public double getAmountToPay() {
        double amount = 0.0;
        for (int i = 0; i < pos; i++) {
            if (!orders[i].product.isEmpty())
                amount += orders[i].price * orders[i].quantity;
        }
        return amount;
    }

    public boolean pay() {
        double amount = getAmountToPay();
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        orders = new Order[MAX_ORDER];
        pos = 0;
        return true;
    }

    public void deposit(double v) {
        this.balance += v;
    }

    public void addOrder(Order order) {
        this.orders[pos] = order;
        pos++;
    }

    public void addOrder(String product, double price, int quantity) {
        this.addOrder(new Order(product, price, quantity));
    }
}
