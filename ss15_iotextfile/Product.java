package ss15_iotextfile;

public class Product {
    private boolean isSave;
    private String code;
    private String name;
    private Integer price;
    private String desc;

//    public Product(){
//        isSave = false;
//        code   = null;
//        name   = null;
//        price  = null;
//        desc   = null;
//    }

    public Product(String[] lineData){
        isSave = true;
        code   = lineData[0];
        name   = lineData[1];
        price  = Integer.parseInt(lineData[2]);
        desc   = lineData[3];
    }

    public Product(String code, String name, Integer price, String desc) {
        isSave     = false;
        this.code  = code;
        this.name  = name;
        this.price = price;
        this.desc  = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean save(){
        if (isSave) return false;

        isSave = true;
        return isSave;
    }

    @Override
    public String toString() {
        return code + "," + name + "," + price + "," + desc;
    }

    public void show() {
        System.out.println("Code: " + code +
                ", Name: " + name +
                ", Price: " + price +
                ", Description: " + desc);
    }
}
