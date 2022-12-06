package com.wipro.test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.wipro.task.DailyTasks;

public class TestStringConcat {
	public class Demo1Test {
		
		 DailyTasks demo1 = new DailyTasks();
		
		@Test
		public void testStringConcat() {
			assertEquals("tomcat", demo1.doStringConcat("tom", "cat"));
		}
	
	}
}
