package io;

import java.util.HashMap;
import java.util.Random;

public class SecretCode {
	HashMap<String, Integer> keyMap = new HashMap<>();

	void addKey(String user) {
		if (!containsUser(user)) {
			Integer key = new Random().nextInt();
			keyMap.put(user, key);
		}
	}

	boolean containsUser(String user) {
		return keyMap.containsKey(user);
	}

	public Integer encode(String user, Integer code) {
		Integer key = null;
		if (!containsUser(user)) {
			addKey(user);
		}
		key = keyMap.get(user);
		return code ^ key;
	}

	public Integer decode(String user, Integer code) {
		return encode(user, code);
	}

	public static void main(String[] args) {
		SecretCode coder = new SecretCode();
		Integer code = 23334;
		Integer encode = coder.encode("John", code);
		System.out.println(encode);
		Integer decode = coder.encode("John", encode);
		System.out.println(decode);
		
	}
}
