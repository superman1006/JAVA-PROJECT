package OOP.practice_ShopCar;

public class Goods {
    private int id;//编号
    private String name;//名称
    private double price;//价格
    private int buynumber;//购买数量
    // 无参数构造器
    public Goods() {
    }
    // 有参数构造器
    public Goods(int id, String name, double price, int buynumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.buynumber = buynumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBuynumber() {
        return buynumber;
    }

    public void setBuynumber(int buynumber) {
        this.buynumber = buynumber;
    }
}
