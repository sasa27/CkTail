package main.modelGen;
import java.io.FileInputStream;
import java.util.Properties;
 
class ReadIni {
	/**
	 * read the user.ini file.
	 */
	
  public static String read() {
    ReadIni ini = new ReadIni();
    return ini.command();
    }
 
  public String command() {
    try{
    	String s;
    	Properties p = new Properties();
    	p.load(new FileInputStream("user.ini"));
    	s = p.getProperty("dotCommand");

      return s;
    }
    catch (Exception e) {
      System.out.println(e);
      }
	return null;
    }
}