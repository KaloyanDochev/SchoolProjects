package OOP;

public class MyInteger {
	private int integer;

	MyInteger(int integer) {
		this.integer = integer;
	}

	boolean isEven() {
		if (integer % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	boolean isOdd() {
		if (integer % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	boolean isPrime() {
		for (int i = 2; i < integer / 2; i++) {
			if (integer % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isPrime(int value) {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(MyInteger value) {
		if (value.integer % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isOdd(MyInteger value) {
		if (value.integer % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isPrime(MyInteger value) {
		for (int i = 2; i < value.integer / 2; i++) {
			if (value.integer % i == 0) {
				return false;
			}
		}
		return true;
	}

	static int parseInt(String str) {
		int a;
		a = Integer.parseInt(str);
		return a;
	}
}
