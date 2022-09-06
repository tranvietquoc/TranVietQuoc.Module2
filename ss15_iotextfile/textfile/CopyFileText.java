package ss15_iotextfile.textfile;

import java.io.*;

public class CopyFileText {
    public String readFile(String filePath) {
        String stringFile = "";
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                stringFile = stringFile.concat(line + "\n");
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại.");
        }
        return stringFile;
    }

    public void writerFile(String filePath, String str) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        String stringResult = copyFileText.readFile("file.txt");
        copyFileText.writerFile("CopyFileTxt.txt", stringResult);
    }
}
