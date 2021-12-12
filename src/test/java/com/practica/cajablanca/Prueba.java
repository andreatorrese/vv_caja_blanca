package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

import junit.framework.Assert;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


class Prueba {
	private SingleLinkedListImpl<String> miLista;
	private Editor editor1;
	@BeforeEach
	public void setUp() {
		this.miLista = new SingleLinkedListImpl<String>("A","B","C");
		this.editor1 = new Editor();
	}
	
	@Test
	public void mayorLongitudCP1() throws EmptyCollectionException{
		editor1.leerFichero("mayorLongitudCP1.txt");
		String result = editor1.mayorLongitud();
		assertNull("mayorLongitudCP1: Debe devolver Null", result);
	}
	@Test
	public void mayorLongitudCP4() throws EmptyCollectionException{
		editor1.leerFichero("mayorLongitudCP4.txt");
		String result = editor1.mayorLongitud();
		assertEquals("a", result);
	}
	@Test
	public void mayorLongitudCP5() throws EmptyCollectionException{
		editor1.leerFichero("mayorLongitudCP5.txt");
		String result = editor1.mayorLongitud();
		assertEquals("b", result);
	}
	@Test
	public void mayorLongitudCP6() throws EmptyCollectionException{
		editor1.leerFichero("mayorLongitudCP6.txt");
		String result = editor1.mayorLongitud();
		assertEquals("aa", result);
	}
	
	
	
	@DisplayName("indexOf")
    @ParameterizedTest(name = "{index} =>elem={0}, esperado={1}")
    @CsvSource(value = {
            "A:     1",
            "B:     2", 
            "C:     3",
            "Z:     -1",
            "@:     -1",
            "m:     -1",
            "L:     -1",
            }, delimiter = ':')
    void test_csv4(String s, int salida) {
        if(s.equals("A") || s.equals("B") || s.equals("C")){
            assertEquals(this.miLista.indexOf(s), salida);
        }
        else {
            assertThrows(IllegalArgumentException.class, () -> {
                  Integer.valueOf(s);
        });
    }
    }


    @DisplayName("isEmptyLleno")
    @Test //unitario con A
    public void isEmpty_lleno() {
        boolean prueba_lleno=false;

        assertEquals(prueba_lleno, this.miLista.isEmpty());
    }
    @DisplayName("isEmptyVacio")
    @Test //unitario con A
    public void isEmpty_vacio() {
        boolean prueba_vacio=true;

      //  assertEquals(prueba_vacio, this.miListaVacia.isEmpty());
    }
	
	
	
	
	@Test
	public void sustituirPalabraCP1() {
		editor1.leerFichero("sustituirPalabraCP1.txt");
		editor1.sustituirPalabra("x", "y");
		System.out.println(editor1.size());
		try {
			editor1.getLinea(1);
			fail("El editor deberia estar vacio");
			
		}  catch (EmptyCollectionException e) {
			
			
		}
		
		
		
	}
	
	@Test
	public void sustituirPalabraCP3() {
		Editor aux = new Editor();
		aux.leerFichero("sustituirPalabraCP3.txt");
		editor1.leerFichero("sustituirPalabraCP3.txt");
		editor1.sustituirPalabra("x", "y");
		try {
			assertEquals(aux.getLinea(1).getAtPos(1), editor1.getLinea(1).getAtPos(1));
		} catch (IllegalArgumentException e) {
			
		} catch (EmptyCollectionException e) {
			
		}
	}
	
	@Test
	public void sustituirPalabraCP4() {
		editor1.leerFichero("sustituirPalabraCP4.txt");
		editor1.sustituirPalabra("x", "y");
		try {
			assertEquals("y", editor1.getLinea(1).getAtPos(1));
		} catch (IllegalArgumentException e) {
			
		} catch (EmptyCollectionException e) {
			
		}
	}
	
	
	 @Test
	    public void numPalabrasCP1(){
	        Editor editor = new Editor();
	        int inicio = 0, fin = 1;
	        String palabra = "aa";
	        try{
	            editor.numPalabras(inicio,fin,palabra);
	        }catch (Exception e){
	            System.out.println("numPalabrasCP2: " + e.getMessage());
	        }
	    }

	    @Test
	    public void numPalabrasCP2(){
	        Editor editor = new Editor();
	        int inicio = 1, fin = 3;
	        String palabra = "aa";
	        try{
	            editor.numPalabras(inicio,fin,palabra);
	        }catch (Exception e){
	            System.out.println("numPalabrasCP2: " + e.getMessage());
	        }
	    }

	    @Test
	    public void numPalabrasCP3(){
	        Editor editor = new Editor();
	        editor.leerFichero("fichero1.txt");
	        // En este caso el fichero está vacío
	        int inicio = 1, fin = 0;
	        String palabra = "aa";
	        assertEquals(0,editor.numPalabras(inicio,fin,palabra));
	    }



	    @Test
	    public void numPalabrasCP4(){
	        Editor editor = new Editor();
	        editor.leerFichero("fichero2.txt");
	        int inicio = 1, fin = 1;
	        String palabra = "aa";
	        assertEquals(0,editor.numPalabras(inicio,fin,palabra));
	    }



	    @Test
	    public void numPalabrasCP5(){
	        Editor editor = new Editor();
	        editor.leerFichero("fichero3.txt");
	        int inicio = 1, fin = 2;
	        String palabra = "aa";
	        assertEquals(0,editor.numPalabras(inicio,fin,palabra));
	    }



	    @Test
	    public void numPalabrasCP6(){
	        Editor editor = new Editor();
	        editor.leerFichero("fichero4.txt");
	        int inicio = 1, fin = 2;
	        String palabra = "aa";
	        assertEquals(0,editor.numPalabras(inicio,fin,palabra));
	    }




	    @Test
	    public void numPalabrasCP7(){
	        Editor editor = new Editor();
	        editor.leerFichero("fichero5.txt");
	        int inicio = 1, fin = 2;
	        String palabra = "aa";
	        assertEquals(1,editor.numPalabras(inicio,fin,palabra));
	        // La primera palabra de la primera línea del fichero es la misma palabra
	        // que la que le pasamos por el parámetro, por lo que ahora espero que mi
	        // salida sea 1.
	    }

}
