import com.bocek.api.CsvReader;
import com.bocek.api.Reader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AddressConverter addressConverter = new AddressConverter();
        String file = "C:\\Users\\TUGAY\\Desktop\\Dependency_Injection_Java\\Abstraction\\io-api\\files\\test.csv";
        Reader<String , AddressDto> csvReader = new CsvReader(file, addressConverter);
 while (csvReader.hasNext()){

     System.out.println(csvReader.next().toString());
 }
    }
}
