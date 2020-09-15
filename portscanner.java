// a simple java code for scanning website for open ports
//author: krisna pranav
// portscanner

import java.net.*;
class portscanner{
	public static void main(String arg[]){
		Socket s;

		for(int i=1;i<65536;i++){
			try{
				s=new Socket(arg[0], i);
				System.out.println("The Port " +i + " Is Open");
			}catch(Exception e){

			}
		}
	}
}