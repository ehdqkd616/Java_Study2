package com.kh.run;

import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;
import com.kh.variable.D_Cast;
import com.kh.variable.E_PrintMethod;
import com.kh.variable.F_KeyboardInput;

public class Run {

	public static void main(String[] args) {
		//com.kh.variable.B_Constant bc = new com.kh.variable.B_Constant();
		B_Constant bc = new B_Constant();
//		bc.finalConstant();
		
		C_Overflow co = new C_Overflow();
//		co.overflow();
		
		D_Cast dc = new D_Cast();
//		dc.rule1();
//		dc.rule2();
	
		E_PrintMethod ep = new E_PrintMethod();
//		ep.printlnMethod();
//		ep.printMethod();

		F_KeyboardInput fk = new F_KeyboardInput();
//		fk.inputScanner1();
//		fk.inputScanner2();
		
	}
}
