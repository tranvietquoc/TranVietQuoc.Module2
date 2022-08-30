package ss15_iotextfile;

import java.io.*;

public class ControllData {
    static final String FILE_LIST =  "product.txt";

    public ControllData() {
    }

    public Product search(String name) throws IOException {
        BufferedReader dataFile = new BufferedReader(new FileReader(FILE_LIST));
        String line = null;
        while ((line = dataFile.readLine()) != null){
            String[] dataString = line.split(",");
            if (dataString.length > 0 && dataString[1].equals(name)){
                dataFile.close();
                return new Product(dataString);
            }
        }
        return null;
    }

    public void save(Product product) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter(FILE_LIST, true));
        output.write(product.toString() + "\n");
        output.close();
    }

    public void show() throws IOException {
        BufferedReader dataFile = new BufferedReader(new FileReader(FILE_LIST));
        String line = null;
        while ((line = dataFile.readLine()) != null){
            if (line.length() > 1){
                String[] dataString = line.split(",");
                Product product = new Product(dataString);
                product.show();
            }
        }
    }
}
