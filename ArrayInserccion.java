package misClases;

import java.util.*;


public class ArrayInserccion {
	
		private long[] a;     /*array encapsulado con acceso denegado en la clase Main()
				       * Author Nordevelop
				       */
		private int nElementos;  

		public  ArrayInserccion(int max)  
		{
		   a = new long[max]; 
		   nElementos = 0; // array vacio
		}

		public void agregar(long valor)  // metodo para agregar elementos dentro  del array
		{
		a[nElementos] = valor;  
		nElementos++;         
		}

		public void mostrar()  // mostrar contenido del Array en pantalla
		{
		for(int j=0; j<nElementos; j++)
		 // for each ,
		   System.out.print(a[j] + " ");     
		   System.out.println(" ");
		}
		
		public void inserccionSort()
		{
		int entrada, salida;
		for(salida=1; salida<nElementos; salida++)   
		{
		   long aux = a[salida];     
		   entrada = salida;        
		   while(entrada>0 && a[entrada-1] >= aux) // 
		   	{
		      a[entrada] = a[entrada-1];    
	     	  --entrada;            
		}
		a[entrada] = aux;       
		} // fin for
		} // fin metodo inserccionSort()
		
		} // Fin clase ArrayInserccion

