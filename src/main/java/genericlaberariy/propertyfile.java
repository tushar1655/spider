package genericlaberariy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {
public String getpropertydata(String key) throws IOException
{
	
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(AutoConstnt.propertyfilepath);
	p.load(fis);
	return p.getProperty(key);
	}
	
	
}
