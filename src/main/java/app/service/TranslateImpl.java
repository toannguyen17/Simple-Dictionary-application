package app.service;

import java.util.HashMap;
import java.util.Map;

public class TranslateImpl implements Translate {
	private static Map<String, String> map;
	static {
		map = new HashMap<>();
		map.put("hello",  "Xin chào");
		map.put("Ocean",  "Đại dương");
		map.put("Simple", "Đơn giản");
		map.put("July",   "Tháng 7");
	}

	@Override
	public String trans(String text) {
		String trans = map.get(text);
		if (trans != null)
			return trans;
		return null;
	}
}
