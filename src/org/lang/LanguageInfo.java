package org.lang;

public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("TAMIL");
	}
	private void englishLanguage() {
		System.out.println("ENGLISH");
	}
	private void hindiLanguage() {
		System.out.println("HINDI");
	}
	public static void main (String[]args) {
		LanguageInfo lang=new LanguageInfo();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
		lang.southindia();
		lang.northindia();
	}

}
