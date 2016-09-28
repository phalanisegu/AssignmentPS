package com.assignment.mani.test;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import com.assignment.mani.*;
public class FooTest {

	private Calculator cal;
	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
	}

	
	@Test
	public void testMain() throws Exception {
		Map<String, Order> o = new LinkedHashMap<String, Order>();

		Order c = new Order();


		c.add(new OrderLine(new Item("book", (float) 12.49), 1));
		o.put("Order 1", c);

		// Reuse cart for an other order
		//c.clear();
		
		Order c1 = new Order();

		c1.add(new OrderLine(new Item("imported bottle of perfume", (float) 47.50), 1));

		o.put("Order 2", c1);

		// Reuse cart for an other order
		//c.clear();
		Order c2 = new Order();

		c2.add(new OrderLine(new Item("Imported bottle of perfume", (float) 27.99), 1));
		c2.add(new OrderLine(new Item("bottle of perfume", (float) 18.99), 1));

		o.put("Order 3", c2);

		double grandTotal = cal.calculate(o);
		assertEquals("106.97","106.97");
		//assert
		//System.out.println("grandtotal:"+grandTotal);

	}

}
