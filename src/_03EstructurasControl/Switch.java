package _03EstructurasControl;

public class Switch{

	public static void main(String args[]){
		int a = 10;
		//definiciones correctas
		switch(a){}
		switch(a){
			case 20: 
		}
		switch(a){
			case 10: System.out.println("correcto");
		}

		int suma = 0;
		switch(1){
			case 1: suma++; 
			case 2: suma++;break; 
			case 3: suma++; 
			default: suma++; 
		}
		System.out.println("suma: "+suma);

	}
}