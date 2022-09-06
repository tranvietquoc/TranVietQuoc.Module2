package ss15_iotextfile.binaryfile;

public class Main {
    public static void main(String[] args) {
        FuntionProduct functionProduct = new FuntionProduct();

        functionProduct.creatObject();

    String path = "E:\\Codegym\\Module 2\\Java\\Module2\\src\\ss15_iotextfile\\binaryfile\\example.txt";
        functionProduct.writeToFile(functionProduct.containsObject, path);

        functionProduct.readFromFile(path);

        functionProduct.displayProduct();

    Product searchById = functionProduct.searchProduct(3);

        System.out.println(searchById.toString());
}
}

