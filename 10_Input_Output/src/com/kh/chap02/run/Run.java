package com.kh.chap02.run;

import com.kh.chap02.model.dao.FileByteDao;

public class Run {

	public static void main(String[] args) {
		
		// FileByteDao fdd = new FileByteDao();
		//fdd.outputToFile();
		
		FileByteDao fbd = new FileByteDao();
		fbd.inputFromFile();

	}

}
