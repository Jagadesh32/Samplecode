package org.samplecode; //Java Basic Program or Demo code

public class JavaCourse { // Class --- Method --- Object
	// Method Name
	private void javaclass() {
		System.out.println("I can't understand Java");

	}

	private void seleniumclass() {
		System.out.println("I need to learn Selenium");

	}

	private void printingName() {
		String name = "Jagadesh";
		System.out.println(name);

	}

	// Main Method
	public static void main(String[] args) {

		// classname objectrefname = new classname(); -- object creation syntax
		JavaCourse javaCourse = new JavaCourse();
		// objectrefname.methodname(); -- methodcall syntax

		javaCourse.javaclass();
		javaCourse.seleniumclass();
		javaCourse.printingName();

		System.out.println("Cheking purpose");
	}

}
