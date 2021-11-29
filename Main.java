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
		arr.agregar(778);
		arr.agregar(377);
		arr.agregar(77);
		arr.agregar(287);
		arr.agregar(324);
		arr.agregar(99);
		arr.agregar(44);
		arr.agregar(55);
		arr.agregar(22);
		arr.agregar(88);
		arr.agregar(11);
		arr.agregar(00);
		arr.agregar(66);
		arr.agregar(33);
		arr.agregar(5);
		arr.agregar(8);
		arr.agregar(27);
		arr.agregar(37);
		arr.agregar(117);
		arr.agregar(271);
		arr.agregar(217);
		arr.agregar(2);
		arr.agregar(39);
		arr.agregar(1);// insert N cantidad de elementos dentro del Array
		System.out.println("Array Original");
		arr.mostrar();  // mostrar en pantalla el array desordenado
		arr.inserccionSort();  // ordena el array con el algoritmo de Inserccion
		System.out.println("Array ordenado por el metodo de Insercción");
		arr.mostrar();    // muestra en pantalla el Array ordenado
		
	}

}
