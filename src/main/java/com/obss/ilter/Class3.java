package com.obss.ilter;

public class Class3 {

	public void wrapException() throws CustomException {

		try {
			Class2 class2 = new Class2();
			class2.getException();
		} catch (Exception ce) {
			throw new CustomException("another ex is created as resp to first ex", ce);

		}

	}

}
