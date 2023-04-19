import java.io.IOException;

public class Entry {

	public static void main(String[] args) throws IOException {

//		int a = 100;
//		int b = 10;
//		int c = 4;
//		Math m = new Math();
//		m.add(a, b);
//		m.sub(a, b);
//		m.multiply(a, b);
//		m.divide(a, b);
//		m.square(c);
//		m.cube(c);

		System.out.println("Enter 1st number");
		byte b[] = new byte[255];

		int length = System.in.read(b);
		System.out.println(length);
		byte bt[] = new byte[length - 1];
		System.arraycopy(b, 0, bt, 0, length - 1);
		String s = new String(bt);
		System.out.println("String " + s.length());
		int i = Integer.parseInt(s);
		System.out.println(i);
	}

}
