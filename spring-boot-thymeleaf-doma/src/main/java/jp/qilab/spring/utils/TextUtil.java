package jp.qilab.spring.utils;

import java.util.Arrays;
import java.util.List;

public class TextUtil {

	public static List<String> splitByNewLine(String text) {
		return Arrays.asList(text.split("\\n"));
	}
}
