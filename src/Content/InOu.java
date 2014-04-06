package Content;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.io.FilenameFilter;


public class InOu {

	 public static void main(String[] args) {
	        // TODO code application logic here
		 File[] paths = readInputFolder();
		 for(File path:paths)
         {
	       Filter filter = new Filter();
	       filter.readContent(path);   // Lọc nội dung trong thẻ "content".
	       filter.parseAndWriteContent();	// Xử lý và lưu kết quả.
         }
	    }
	 
	 private static File[] readInputFolder() {
		 File f = null;
		 File[] paths = null;
		 try{      
	         // create new file
	         f = new File("input");
	         
	         // create new filename filter
	         FilenameFilter fileNameFilter = new FilenameFilter() {
	   
	            @Override
	            public boolean accept(File dir, String name) {
	               if(name.lastIndexOf('.')>0)
	               {
	                  // get last index for '.' char
	                  int lastIndex = name.lastIndexOf('.');
	                  
	                  // get extension
	                  String str = name.substring(lastIndex);
	                  
	                  // match path name extension
	                  if(str.equals(".json"))
	                  {
	                     return true;
	                  }
	               }
	               return false;
	            }
	         };
	         // returns pathnames for files and directory
	         paths = f.listFiles(fileNameFilter);
	      }catch(Exception e){
	         // if any error occurs
	         e.printStackTrace();
	      }
		 return paths;
	   }
	}
