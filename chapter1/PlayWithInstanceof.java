public class PlayWithInstanceof{
	public static void main(String... args) {
		// obj instanceof same_type
		Object obj = new Object();
		System.out.println(obj instanceof Object);

		// obj instanceof parent_type
		String str = new String("");
		System.out.println(str instanceof String);
	}
}