package br.com.codenation;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StatisticUtil {

	public static int average(int[] elements) {
		int sum = 0;
		for (int el : elements) {
			sum += el;
		}
		return (sum / elements.length);
	}

	public static int mode(int[] elements) {
		Map<Integer, Integer> valores = new HashMap<>();
		int qtModa = 0;
		int moda = 0;
		for (int el : elements) {
			int qt = 0;
			if (valores.containsKey(el)) {
				qt = valores.get(el);
			}
			qt++;
			valores.put(el, qt);
			moda = qt > qtModa ? el : moda;
			qtModa = qt > qtModa ? qt : qtModa;
		}
		return moda;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
		int mediana;
		int length = elements.length;
		int metadeArray = 0;
		metadeArray = length / 2;
		if (length % 2 == 0) {
			mediana = (elements[metadeArray - 1] + elements[metadeArray]) / 2;
		} else {
			mediana = elements[metadeArray];
		}
		return mediana;
	}
}