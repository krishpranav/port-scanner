//a simple java tool for scanning ports on a website
//tool name: port-scanner
//language used: java
//tool author: krishpranav

//imports

public static void main(String arg[]){
	s=new Socket;
	
	for(int i=1;i<65536;i++){
		try{
			s=new Socket(arg[0], i);
			System.out.println("The Port " +i + "Is Open")
		}catch (Exception e){

		}
	}
}
