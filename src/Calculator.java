public class Calculator {
    public static String go(String First, String Second, String sign){
        //Передаем данный в RimOrArab который валидирует их на арабские или римские цифры
        var answer = RimOrArab.go(new String[]{First,Second });

        int first = answer[0];
        int second = answer[1];
        String result = new String();
        //В зависимости от знака соответственная операция
        switch(sign){
            case "+":
                result = String.valueOf(first + second);
                break;
            case "-":
                result = String.valueOf(first - second);
                break;
            case "/":
                result = String.valueOf(first / second);
                break;
            case "*":
                result = String.valueOf(first * second);
                break;
        };
        //Возвращая ответ проверям необходи ли конверт ответа в римские цифры
        return Format.go(result, answer[2]);
    }
}
