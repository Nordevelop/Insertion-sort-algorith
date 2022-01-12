package misClases;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*@Author Nordevelop
		 * Algoritmo de ordenamiento metodo de Inserccion.
		 */
		int maxSize = 100;
		 // array size
		ArrayInserccion arr;
		 // reference to array
		arr = new ArrayInserccion(maxSize); // declaracion del  array 	
		arr.agregar(10);
		arr.agregar(5);
		arr.agregar(14);
		arr.agregar(3);
		arr.agregar(24);
		arr.agregar(2);
		arr.agregar(13);
		arr.agregar(7);
		arr.agregar(20);
		arr.agregar(16);
		arr.agregar(11);
		arr.agregar(19);
		arr.agregar(4);
		arr.agregar(15);
		arr.agregar(18);
		arr.agregar(8);
		arr.agregar(22);
		arr.agregar(17);
		arr.agregar(6);
		arr.agregar(21);
		arr.agregar(23);
		arr.agregar(12);
		arr.agregar(9);
		arr.agregar(1);// insert N cantidad de elementos dentro del Array
		System.out.println("Array Original");
		arr.mostrar();  // mostrar en pantalla el array desordenado
		arr.inserccionSort();  // ordena el array con el algoritmo de Inserccion
		System.out.println("Array ordenado por el metodo de Insercción");
		arr.mostrar();    // muestra en pantalla el Array ordenado
		
	}

}
