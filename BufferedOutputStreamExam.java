package IOExam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExam {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("E:/iotest/별.jpg");
		bis = new BufferedInputStream(fis);
		//FileOutputStream 사용
		fos = new FileOutputStream("E:/iotest/별.jpg");	
		start = System.currentTimeMillis();
		while((data=bis.read())!=-1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용하지 않았을 때 : "+(end-start)+"ms");
		
		
		fis = new FileInputStream("E:/iotest/별.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("E:/iotest/별.jpg");
		//BufferedOutputStream 사용
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data=bis.read())!=-1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close();
		fos.close();
		bos.close();
		fos.close();
		System.out.println("사용했을 떄 : "+(end-start)+"ms");
	}

}
