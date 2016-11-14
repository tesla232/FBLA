import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Employee {
	public Employee(String name, String startTime, String endTime) throws IOException{
		File file = new File("C:/data.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			FileWriter fr = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fr);
			bw.write("Constant");
			bw.close();
			
		}
	}
}
