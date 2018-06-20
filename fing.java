import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class FileClass 
{
	public static void main(String args[])
		{
try{
 		File f1 = new File("C:\\Users\\Pankaj\\Desktop\\assignment8\\abc.txt");
		File f2 = new File("C:\\Users\\Pankaj\\Desktop\\assignment8\\xyz.txt");

     if(f1.exists()==false)
   {
    System.out.println("Can't Copy Source File Not Exists");
    System.exit(0);
   }
   if(f2.exists()==true)
   {
    System.out.println("Can't Copy Destination File Exists");
    System.exit(0);
   }
    FileInputStream fis=new FileInputStream(f1);
   FileOutputStream fos=new FileOutputStream(f2);
    int x;
   while((x=fis.read())!=-1) {
    fos.write(x);
   }
   
   System.out.println("Contents of file '"+f1+"' are copied in '"+f2+"' successful...");
   fis.close();
   fos.close();
  }
  catch(Exception ee) { 
   System.out.println(ee);
  }
 }
 
}