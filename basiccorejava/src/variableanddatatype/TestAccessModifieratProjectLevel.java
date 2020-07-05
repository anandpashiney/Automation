package variableanddatatype;

import Function.AcessModifiers;

public class TestAccessModifieratProjectLevel extends AcessModifiers {

	public static void main(String[] args) {


		AcessModifiers obj = new AcessModifiers();
		obj.publicFunction();
	
		TestAccessModifieratProjectLevel obj2 = new TestAccessModifieratProjectLevel();
		obj2.protectedFunction();
	}

}
