package com.ws;

public class Main {
	public static void main(String[] args) {

		container.init();

		new App().run();

		container.close();
	}
}