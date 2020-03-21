package com.epam.JUNIT1;


import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

public class delete2AsTest {

	
	/*
	 * Remove ‘A’ if it is present in first 2 characters of the string.
	 * if ‘A’ is present after 2 characters, it should not be 
	 * removed.
	 *
	 * To-Do List: 
	 * a. "ABCD"--> "BCD"	==> Successful  
	 * b. "AACD"--> "CD"	==> Successful
	 * c. "BACD"--> "BCD"	==> Successful
	 * d. "BBAA"--> "BBAA"	==> Successful
	 * e. "AABAA"-->"BAA"	==> Successful
	 * f. "AA"--> "" 		==> Successful
	 * g. "A"--> ""  		==> Successful
	 
	 */ 
	delete2As removeAs; 
		@BeforeEach
		void init() {
			removeAs=new delete2As();
		}
		@Test
		void testa() {
			assertEquals("BCD",removeAs.removeAs("ABCD"));
		}
		@Test
		void testb() {
			assertEquals("CD",removeAs.removeAs("AACD"));
		}
		@Test
		void testc() {
			assertEquals("BCD",removeAs.removeAs("BACD"));
		}
		@Test
		void testd() {
			assertEquals("BBAA",removeAs.removeAs("BBAA"));
		}
		@Test
		void teste() {
			assertEquals("BAA",removeAs.removeAs("AABAA"));
		}
		@Test
		void testf() {
			assertEquals("",removeAs.removeAs("AA"));
		}
		@Test
		void testg() {
			assertEquals("",removeAs.removeAs("A"));
		}
		
	}

