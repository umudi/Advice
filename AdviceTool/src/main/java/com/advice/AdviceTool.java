package com.advice;

public class AdviceTool {

	private static final String[][] array = {
			{ "Ahmeti dinle.", "Veliyi dinle.", "Walter White' ı dinle." },
			{ "Salihi dinle.", "Kemali dinle.", "Beni dinle." } };

	public static void main(String[] args) {
		int i = (int) (Math.random() * 2);
		int j = (int) (Math.random() * 3);

		String val = array[i][j];

		System.out.println("Advice:\"" + val + "\"");
	}
}
