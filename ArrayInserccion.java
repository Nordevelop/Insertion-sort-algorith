package misClases;

import java.util.Arrays;

import java.util.*;


public class ArrayInserccion {
	          /*array y variable de control encapsulados con acceso denegado en la clase Main()
		  * Author Nordevelop
		  */
	
		private long[] a;   
		private int nElementos;  

		public  ArrayInserccion(int max){  //clase constructor
		   a = new long[max]; 
		   nElementos = 0;
		}
	        /*
		* Metodos
		*/

		public void agregar(long valor){ // metodo para agregar elementos dentro  del array
		   a[nElementos] = valor;  
		   nElementos++;         
		}//fin metodo agregar()

		public void mostrar(){  // mostrar contenido del Array en pantalla
		
		  for(int j=0; j<nElementos; j++){  //for each
		      System.out.print(a[j] + " ");     
		      System.out.println(" ");
		  }	
		}//fin metodo mostrar()
		
		public void inserccionSort(){
		  int entrada, salida;
		  for(salida=1; salida<nElementos; salida++){
		     long aux = a[salida];     
		     entrada = salida;        
		     while(entrada>0 && a[entrada-1] >= aux){
			  a[entrada] = a[entrada-1];    
	     	          --entrada;            
		     }//end while
		a[entrada] = aux;       
		} // fin for salida
		} // fin metodo inserccionSort()
		
		} // Fin clase ArrayInserccion

