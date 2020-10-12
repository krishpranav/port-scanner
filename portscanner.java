//a simple java tool for scanning open ports on a website
//tool author: krishpranav
//tool name: portscanner

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
