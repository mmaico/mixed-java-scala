package org.michaelahlers;

public class JHelloWorld {
	public void printMessage() {
		System.out.println("Hello from Java!");
	}

	public static void main(final String... arguments) {
		new JHelloWorld().printMessage();
		new SHelloWorld().printMessage();
	}
	
}
