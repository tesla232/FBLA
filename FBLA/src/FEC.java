import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FEC {
	FileWriter fr;
	BufferedWriter bw;
	File file;
	public FEC() throws IOException{
		file = new File("C:/data.txt");
		fr = new FileWriter(file.getAbsoluteFile(),true);
		bw = new BufferedWriter(fr);
	}
	public void Write(Employee em) throws IOException{
		
		if(file.exists())
			file.createNewFile();
		bw.write(em.toString()+"\n");
		bw.close();
	}
}
