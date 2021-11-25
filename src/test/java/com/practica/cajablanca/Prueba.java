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
	
	/*@Test
	public void mayorLongitudCP1() throws EmptyCollectionException{
		editor1.leerFichero("mayorLongitudCP1.txt");
		String result = editor1.mayorLongitud();
		assertNull("mayorLongitudCP1: Debe devolver Null", result);
	}*/
	/*@Test
	public void mayorLongitudCP4() throws EmptyCollectionException{
		editor1.leerFichero("mayorLongitudCP4.txt");
		String result = editor1.mayorLongitud();
		assertEquals("a", result);
	}*/
	/*@Test
	public void mayorLongitudCP5() throws EmptyCollectionException{
		editor1.leerFichero("mayorLongitudCP5.txt");
		String result = editor1.mayorLongitud();
		assertEquals("b", result);
	}*/
	@Test
	public void mayorLongitudCP6() throws EmptyCollectionException{
		editor1.leerFichero("mayorLongitudCP6.txt");
		String result = editor1.mayorLongitud();
		assertEquals("aa", result);
	}

}
