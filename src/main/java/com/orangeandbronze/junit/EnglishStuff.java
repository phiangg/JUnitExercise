package com.orangeandbronze.junit;

import java.util.*;

class EnglishStuff {
	
	/** Reverses the order of words in a phrase, **/
	String backwardizePerWord(String str) {
		StringTokenizer st = new StringTokenizer(str);
		String[] tokens = new String[st.countTokens()];

		for (int i = tokens.length - 1; i > -1; --i) {
			tokens[i] = st.nextToken();
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tokens.length; ++i) {
			sb.append(tokens[i]);
			if (i != tokens.length - 1) {
				sb.append(' ');
			}
		}
		
		return sb.toString();
	}
	
	/** Reverses a String. **/
	String backwardizePerChar(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
