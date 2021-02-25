import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;

public class RimOrArab {

    public static int[] go(String[] enterArr){
        int first = 0,second = 0;

        //Булевы переменные для валидации однвременно вводимых цифр (римские или арабские)
        boolean[] rimValid = new boolean[]{false, false};
        boolean[] arabValid = new boolean[]{false, false};
        String[] arabSymbols = new String[]{"1","2","3","4","5","6","7","8","9","10"};
        Dictionary<String, Integer> rimSymbols = new Hashtable<>();
        rimSymbols.put("I",1);
        rimSymbols.put("II",2);
        rimSymbols.put("III",3);
        rimSymbols.put("IV",4);
        rimSymbols.put("V",5);
        rimSymbols.put("VI",6);
        rimSymbols.put("VII",7);
        rimSymbols.put("VIII",8);
        rimSymbols.put("IX",9);
        rimSymbols.put("X",10);

       try {
           //Валидация первого числа
           if (rimSymbols.get(enterArr[0]) != null) {
               rimValid[0] = true;
               first = rimSymbols.get(enterArr[0]);
           } else if (Arrays.asList(arabSymbols).contains(enterArr[0])) {
               arabValid[0] = true;
               first = Integer.parseInt(enterArr[0]);
           } else throw new Exception("Ошибка: первый символ не корръектный");

           //Валидация второго числа
           if (rimSymbols.get(enterArr[1]) != null) {
               rimValid[1] = true;
               second = rimSymbols.get(enterArr[1]);
           } else if (Arrays.asList(arabSymbols).contains(enterArr[1])) {
               arabValid[1] = true;
               second = Integer.parseInt(enterArr[1]);
           } else throw new Exception("Ошибка: второй символ не крръектный");

           //Валидируем значение чтобы были одинокового формата
           if((rimValid[0] != rimValid[1]) || (arabValid[0] != arabValid[1]))
               throw new Exception("Ошибка: не верный формат, одновременно должны быть либо арабские либо римские числа");
       }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
       }

      //Проверяем что у нас на выходе арабские цифры или римские
      int R = (rimValid[0] && rimValid[1]) == true ? 0 : 1;

      //Эту белебирду (new int[]{first, second, R}) я сделал потому что не смог разобраться с кортежами в java, в c# с ними все очень ясно
      return new int[]{first, second, R};
    }

}
