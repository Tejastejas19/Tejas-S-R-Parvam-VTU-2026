package ass_01_04_2026;

@FunctionalInterface
interface CustomStringLength {
	int str_len(String str);
}

public class Custom_String_Length {
	public static void main(String[] args) {

		CustomStringLength csl = str -> str.length();

		String text = "Hello tejas";

		int length = csl.str_len(text);

		System.out.println("String: " + text);
		System.out.println("Length of string: " + length);
	}

}
