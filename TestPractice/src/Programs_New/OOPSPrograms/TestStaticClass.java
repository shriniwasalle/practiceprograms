package OOPSPrograms;

import OOPSPrograms.Test.NestedStaticClass;

class Test {

	private static String name = "Shriniwas";
	String surName = "Alle";

	public static class NestedStaticClass {

		// Can access only static members of outer class
		public void printMessage() {
			System.out.println("I'm in Inner Static class " + name);
		}
	}

	public static class InnerClass {

		// Can access static members and non-static members of outer class
		public void display() {
			System.out.println("I'm in Inner Static class");
		}
	}

}

public class TestStaticClass {

	public static void main(String[] args) {
		NestedStaticClass stObj = new NestedStaticClass();
		stObj.printMessage();

		Test.InnerClass inObj = new Test.InnerClass();
		inObj.display();

	}
}
