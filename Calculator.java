import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class Calculator {

    public static String convertResult(int num) {

        String[] romeDigit = {null, "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        if (num <= 10) {
            String result = romeDigit[num];
            return result;
        } else if (num <= 100) {
            if (num/10 == 1) {
                if (num%10 == 0) {
                    String result = "X";
                    return result;
                } else {
                    String result = "X" + romeDigit[num % 10];
                    return result;
                }
            } else if (num/10 == 2) {
                if (num%10 == 0) {
                    String result = "XX";
                    return result;
                } else {
                    String result = "XX" + romeDigit[num % 10];
                    return result;
                }
            } else if (num/10 == 3) {
                if (num%10 == 0) {
                    String result = "XXX";
                    return result;
                } else {
                    String result = "XXX" + romeDigit[num % 10];
                    return result;
                }
            } else if (num/10 == 4) {
                if (num%10 == 0) {
                    String result = "XL";
                    return result;
                } else {
                    String result = "XL" + romeDigit[num % 10];
                    return result;
                }
            } else if (num/10 == 5) {
                if (num%10 == 0) {
                    String result = "L";
                    return result;
                } else {
                    String result = "L" + romeDigit[num % 10];
                    return result;
                }
            } else if (num/10 == 6) {
                if (num%10 == 0) {
                    String result = "LX";
                    return result;
                } else {
                    String result = "LX" + romeDigit[num % 10];
                    return result;
                }
            } else if (num/10 == 7) {
                if (num%10 == 0) {
                    String result = "LXX";
                    return result;
                } else {
                    String result = "LXX" + romeDigit[num % 10];
                    return result;
                }
            } else if (num/10 == 8) {
                if (num%10 == 0) {
                    String result = "LXXX";
                    return result;
                } else {
                    String result = "LXXX" + romeDigit[num % 10];
                    return result;
                }
            } else if (num/10 == 9) {
                if (num%10 == 0) {
                    String result = "XC";
                    return result;
                } else {
                    String result = "XC" + romeDigit[num % 10];
                    return result;
                }
            } else if (num/10 == 10) {
                if (num%10 == 0) {
                    String result = "C";
                    return result;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Введите математическое выражение в одну строку, через пробел.  \n Поддерживаемый диапазон значений: \n Арабские цифры: от 0 до 10 \n Римские цифры: от I до X \n Поддерживаемые операции: \n 1. Сложение (+); \n 2. Вычитание (-); \n 3. Умножение (*); \n 4. Деление (/).  ");

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        boolean flag = true;

        String[] romeDigit = {null, "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabDigit = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        while (flag) {
            String[] expression = bufferedReader.readLine().trim().split(" ", 3);

            if (expression.length == 3) {
                if (Arrays.asList(arabDigit).contains(expression[0]) & Arrays.asList(arabDigit).contains(expression[2])) {
                    if ((expression[1].trim().equals("+"))) {
                        int result = (Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]));
                        System.out.println("Результат от сложения составляет: " + result);
                    } else if (expression[1].equals("-")) {
                        int result = (Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]));
                        System.out.println("Результат от разности составляет: " + result);
                    } else if (expression[1].equals("/")) {
                        int result = (Integer.parseInt(expression[0]) / Integer.parseInt(expression[2]));
                        System.out.println("Результат от произведения составляет: " + result);
                    } else if (expression[1].equals("*")) {
                        int result = (Integer.parseInt(expression[0]) * Integer.parseInt(expression[2]));
                        System.out.println("Результат от деления составляет: " + result);
                    } else {
                        System.out.println("Данная математическая операция неподдерживается. Разрешенные операции: \n 1. Сложение (+); \n 2. Вычитание (-); \n 3. Умножение (*); \n 4. Деление (/).   ");
                    }
                } else if (Arrays.asList(romeDigit).contains(expression[0]) & Arrays.asList(romeDigit).contains(expression[2])) {
                    if ((expression[1].equals("+"))) {
                        int result = Arrays.asList(romeDigit).indexOf(expression[0]) + Arrays.asList(romeDigit).indexOf(expression[2]);
                        System.out.println("Результат от сложения составляет: " + convertResult(result));
                    } else if ((expression[1].equals("-"))) {
                        int result = Arrays.asList(romeDigit).indexOf(expression[0]) - Arrays.asList(romeDigit).indexOf(expression[2]);
                        System.out.println("Результат от разности составляет: " + convertResult(result));
                    } else if ((expression[1].equals("*"))) {
                        int result = Arrays.asList(romeDigit).indexOf(expression[0]) * Arrays.asList(romeDigit).indexOf(expression[2]);
                        System.out.println("Результат от произведения составляет: " + convertResult(result));
                    } else if ((expression[1].equals("/"))) {
                        int result = Arrays.asList(romeDigit).indexOf(expression[0]) / Arrays.asList(romeDigit).indexOf(expression[2]);
                            if (result >0) {
                                System.out.println("Результат от деления составляет: " + convertResult(result));
                            } else {
                                System.out.println("невозможно отобразить ответ в данной системе счисления");
                            }

                    } else {
                        System.out.println("Данная математическая операция неподдерживается. Разрешенные операции: \n 1. Сложение (+); \n 2. Вычитание (-); \n 3. Умножение (*); \n 4. Деление (/).   ");
                    }
                } else if ((Arrays.asList(romeDigit).contains(expression[0]) & Arrays.asList(arabDigit).contains(expression[2])) | (Arrays.asList(arabDigit).contains(expression[0]) & Arrays.asList(romeDigit).contains(expression[2]))){
                    System.out.println("Нельзя проводить операции над элементами разных систем счисления");
                } else {
                    System.out.println("Введеные значения находятся вне допустимого диапазона");
                }

            } else {
                System.out.println("Выражение введено некоректно. Необходимо ввести выражение в одну строку с использованием пробела между цифрами и арифметическим знаком. \n 5 + 5 - верно; 5+5, 5+ 5, 5 +5 - некорректно");
            }
            System.out.println("Желаете ли произвести ещё один расчет? (Да/Нет)");
            String answer = bufferedReader.readLine().toLowerCase();
            if (answer.equals("да") | answer.equals("yes")) {
                flag = true;
            } else if (answer.equals("нет") | answer.equals("no")){
                flag = false;
            } else {
                System.out.println("Для продолжения просим вводить только да/нет");
            }
        }



    }


}

