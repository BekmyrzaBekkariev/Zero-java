package Lesson27;
import java.io.*;
public class Test1 {
	public  static void main(String[] args) throws Exception {
		// До этогоо нам нужен файл куда мы будем ссылатся
		File f = new File ("\"D:\\1-java\\Project\\Zero\\src\\Lesson27\\lesson27.txt\"");
		FileInputStream fis = new FileInputStream(f); // Внутренний поток
		fis.read(); // Читаем
		FileOutputStream fos = new FileOutputStream(f); // Внешний поток
		fos.write(100);
	}
}
