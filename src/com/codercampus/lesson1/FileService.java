package com.codercampus.lesson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileService {

	String stanardFileName = "data.txt";
	
	String readline (File file) throws IOException;
	
	void writeLine(File file, String line) throws IOException;
}
