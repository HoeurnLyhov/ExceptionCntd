import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionHanding 
{
	public static void openFile(String path)throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(path);
		System.out.println("Success...");
	}
	public static void calOpenFile() throws FileNotFoundException
	{
		openFile("D:\\Mr.vikness\\3.txt");
	}
	public static void main(String[] args) 
	{
		/*try
		{
		openFile(("D:\\Mr.vikness"));
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("Exception occurred");
		}*/
		
		try {
			calOpenFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//SQLException e
		}
	}

}
