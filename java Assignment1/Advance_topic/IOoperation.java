package Advance_topic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;

public class IOoperation {
	public static void main(String[] args) {

		File f = new File(
				"C:/Users/VSMPRS/OneDrive/Desktop/NT Training/AssessmentRepo/java Assignment1/Advance_topic/File.txt");

		try (FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr)) {
			String s = "";
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
