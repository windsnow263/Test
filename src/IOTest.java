import java.io.*;

public class IOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream inStr = null;
		try
		{
			inStr = new ObjectInputStream(new FileInputStream("HelloWorld"));
			Integer i = (Integer)inStr.readObject();
		}catch(IOException ex){
			ex.printStackTrace();
		}catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		finally{
			try
			{
				inStr.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
			
		}
	}

}
