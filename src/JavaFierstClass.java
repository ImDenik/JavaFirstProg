import java.util.Scanner;

public class JavaFierstClass {
    public static void main(String[] args){
        System.out.println("Калькулятор\nПравила: одновременно можно вводит только арабские или римские числа\nИспользовать числа от 1 до 10 и арефметические знаки + - * /");
        try {
            while (true) {
                System.out.println("Введите значения:");
                //Получение данных
                String enter = new Scanner(System.in).nextLine();
                //Получаем занк + - / *
                var sign = Sign.go(enter);
                //Если знак не определен, возвращаемся к началу
                if (sign == null) continue;
                //Разбиваем с помощью полученного знака на массив
                String[] enterArr = enter.split("[" + sign + "]");
                //Левое число
                String First = enterArr[0].trim();
                //Правое число
                String Second = enterArr[1].trim();
                //Подсчитываем
                String result = Calculator.go(First, Second, sign);
                System.out.println("Ответ: " + result);

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
