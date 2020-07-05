package array;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Sneha";
		String name2 = "Puja";
		String name3 = "Aklesh";

		String[] Std = new String[10];
		Std[0] = "Sneha";
		Std[1] = "Itishri";
		Std[2] = "Pratik";
		Std[3] = "Anand";
		Std[4] = "Aklesh";
		Std[5] = "Puja";
		Std[6] = "Bilwa";
		Std[7] = "Prachi";
		Std[8] = "Dhara";
		Std[9] = "Neetu";

		// System.out.println(Std[5]);
		// System.out.println(Std[7]);
		// System.out.println(Std[8]);
		System.out.println(Std.length);

		for (int i = 0; i < Std.length; i++) {

			System.out.println(Std[i]);

		}

	}

}
