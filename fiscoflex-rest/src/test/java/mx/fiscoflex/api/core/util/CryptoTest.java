package mx.fiscoflex.api.core.util;

import mx.fiscoflex.util.Crypto;

public class CryptoTest {

	public static void main(String arg[]) {
		
		String passwordHash = Crypto.hmac("admin");
		System.out.println(passwordHash);
	}
}
