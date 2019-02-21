package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	
	StringHelper helper=new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2positions() {

	
	
	//AACD => CD ACD =>CD CDEF => CDEF  CDAA =>CDAA
	//Validate it;
	assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	//expected, actual
	  
	}
	@Test
	public void testTruncateAInFirst2Positions() {
		
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	
	

}
