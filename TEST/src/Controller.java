import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

import kh.model.vo.Book1;

public class Controller {
	
	public void fileSave(String fileName) {
		
		Book1 book = new Book1("자바를 잡아라", 30000);
		File file = new File(fileName);
		
		try (FileOutputStream fos = new FileOutputStream(file)) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(book);
				oos.close();
				fos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead(String fileName) {
		
		try (FileInputStream fis = new FileInputStream(fileName)) {
			fis.read();	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
