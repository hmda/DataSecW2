package Content;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InOu {
	
	 public static void main(String[] args) {
	        // TODO code application logic here
	        String contentNameFile = getContentFileName(); // Lấy tên file kết quả.
	        Filter filter = new Filter();
	        filter.readWriteFile("000001.json", contentNameFile);   // Lọc nội dung trong thẻ "content".
	    }
	 private static String getContentFileName() {
			String fileName;
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			Date date = new Date(); // Lấy thời gian hệ thống.
			String stringDate = dateFormat.format(date);
			fileName = "000001.content." + stringDate + ".txt";
			return fileName;
		    }

	}
