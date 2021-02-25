public class Sign {
    public static String go(String enter){
        if(enter.contains("+"))
            return "+";
        if(enter.contains("-"))
            return "-";
        if(enter.contains("/"))
            return "/";
        if(enter.contains("*"))
            return "*";
        //Если знак не определен выводим сообщение возвращаем null
        System.out.println("Ошибка: отсутствует один из знаков  + - * /");
        return null;
    }
}
