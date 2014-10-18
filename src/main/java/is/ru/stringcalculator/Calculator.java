package is.ru.stringcalculator;
//hfirsta commit
public class Calculator {

		public static int add(String text){
		if(text.equals("")){ return 0;}
		else{
		return splittastreng(text);
		}}

		private static int splittastreng(String text){
		String[] strengur;
		String gunni = text;
		if(gunni.contains("//")){
			String skipta = Character.toString(gunni.charAt(2));
			gunni = gunni.replace(skipta, ",").trim();
			gunni = gunni.replace("/", ",").trim();
			gunni = gunni.replace(",", " ").trim();
			gunni = gunni.replace(" ", ",").trim();
		}

		gunni = gunni.replace("\n", ",");
		strengur = gunni.split(",");
	
		int summa = 0;
		for(int i = 0; i < strengur.length; i++){
			summa += Integer.parseInt(strengur[i].trim());
		}
		return summa;
	}
}
