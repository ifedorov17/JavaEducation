public class Divider {

	public static Integer division(Integer a, Integer b) {

		if (b == null) {
			throw new MyUncheckedException();
		}

		/*if (b == 0) {
			throw new MyCheckedException();
		}*/

		return a/b;
	}

}
