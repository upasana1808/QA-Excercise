package domain;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutput {
	public void copy(String inFile, String outFile) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("x.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("y.txt");) {
            int numberOfBytesRead;
            byte[] bytesArray = new byte[128];
            while ((numberOfBytesRead = fileInputStream.read(bytesArray)) != -1) {
                fileOutputStream.write(bytesArray, 0, numberOfBytesRead);
            }
        }
    }

}
