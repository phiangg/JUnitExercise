package com.orangeandbronze.junit;

import java.io.*;

class WorkWithFile {
	
	private final String filename;
	
	WorkWithFile(String filename) {
		this.filename = filename;
	}
	
	String readFromFile() throws IOException {
		StringWriter sw = new StringWriter();
		try (Reader r = new BufferedReader(new FileReader(filename))) {
			for (int i = r.read(); i > -1; i = r.read()) {
				sw.write(i);
			}
		}
		return sw.toString();
	}
	
	void writeToFile(String str) throws IOException {
		try (Writer w = new BufferedWriter(new FileWriter(filename, true))) {
			w.write(str);
			w.flush();
		}
	}

}
