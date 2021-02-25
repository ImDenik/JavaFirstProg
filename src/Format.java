import java.util.Hashtable;

public class Format {
    public static String go(String result, Integer RORA){
        if(RORA == 1)
            return result;
        int intResult = Integer.parseInt(result);
        Hashtable<Integer, String> rimSymbols = new Hashtable<>();
        rimSymbols.put(1, "I");
        rimSymbols.put(2 ,"II");
        rimSymbols.put(3, "III");
        rimSymbols.put(4, "IV");
        rimSymbols.put(5, "V");
        rimSymbols.put(6, "VI");
        rimSymbols.put(7, "VII");
        rimSymbols.put(8, "VIII");
        rimSymbols.put(9, "IX");
        rimSymbols.put(10, "X");
        rimSymbols.put(20, "XX");
        rimSymbols.put(30, "XXX");
        rimSymbols.put(40, "XL");
        rimSymbols.put(50, "L");
        rimSymbols.put(60, "LX");
        rimSymbols.put(70, "LXX");
        rimSymbols.put(80, "LXXX");
        rimSymbols.put(90, "XC");
        rimSymbols.put(100, "C");

        int resultInt = Integer.parseInt(result);
        if(rimSymbols.get(resultInt) != null)
            //Если находи целое число из словаря то сразу возвращаем его
           return rimSymbols.get(resultInt);
        else
            //Если его нет в словаре строим его по часятям
            return rimSymbols.get(Integer.parseInt(result.charAt(0) + "0")) + rimSymbols.get(Integer.parseInt(result.charAt(1)+""));




    }
}
