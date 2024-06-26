package com.example.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// writing and then reading operation
		new App().writingIntoFile();

		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\CandidateDir\\CandidateSelected.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}

	}

	void writingIntoFile() {
		File directory = new File("D:\\CandidateDir");
		directory.mkdirs();
		System.out.println("directory created");
		File file = new File("D:\\CandidateDir\\CandidateSelected.txt");
		try {
			file.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			System.out.println("error occured, while creating the file");
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			bw.write("One");
			bw.newLine();
			bw.write("Two");
			bw.newLine();
			bw.write("Three");
			bw.newLine();
			bw.write("Four");
			System.out.println("Wrting onto the file completed");
			bw.close();
		} catch (IOException e) {
			System.out.println("error occured, while creating writing onto file");
		}

	}
}
