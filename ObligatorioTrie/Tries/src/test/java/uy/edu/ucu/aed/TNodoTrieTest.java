/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uy.edu.ucu.aed;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juana
 */
public class TNodoTrieTest {

    public TNodoTrieTest() {
    }

    @Test
    public void testLPMwordNotInTrie() {
        TArbolTrie trie = new TArbolTrie();

        String[] palabrasclave = { "are", "area", "base", "cat", "ju", "juan", "jujix", "cater", "children",
                "basement",
                "areas", "jean" };
        for (String p : palabrasclave) {
            trie.insertar(p);
        }

        String expected = null;
        String result = trie.raiz.LPM("papa");
        assertEquals(expected, result);
    }

    @Test
    public void testLPMwordInTrie() {
        TArbolTrie trie = new TArbolTrie();

        String[] palabrasclave = { "are", "area", "base", "cat", "ju", "juan", "jujix", "cater", "children",
                "basement",
                "areas", "jean" };
        for (String p : palabrasclave) {
            trie.insertar(p);
        }

        String expected = "areas";
        String result = trie.raiz.LPM("ar");
        assertEquals(expected, result);
    }

    @Test
    public void testLPM() {
        TArbolTrie trie = new TArbolTrie();

        String[] palabrasclave = { "are", "area", "base", "cat", "ju", "juan", "jujix", "cater", "children",
                "basement",
                "areas", "jean" };
        for (String p : palabrasclave) {
            trie.insertar(p);
        }

        String expected = null;
        String result = trie.raiz.LPM("arbo");
        assertEquals(expected, result);
    }

    @Test
    public void testInsertar() {
        System.out.println("insertar");
        String unaPalabra = "";
        TNodoTrie instance = new TNodoTrie();
        instance.insertar(unaPalabra);
    }

    /**
     * Test of imprimir method, of class TNodoTrie.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        TNodoTrie instance = new TNodoTrie();
        instance.imprimir();
    }

    /**
     * Test of buscar method, of class TNodoTrie.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String s = "";
        TNodoTrie instance = new TNodoTrie();
        int expResult = -1;
        int result = instance.buscar(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of predecir method, of class TNodoTrie.
     */
    @Test
    public void testPredecir() {
        System.out.println("predecir");
        String prefijo = "";
        List<String> palabras = null;
        TNodoTrie instance = new TNodoTrie();
        instance.predecir(prefijo, palabras);
    }

}
