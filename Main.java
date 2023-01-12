// Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
// boolean isGood (T item);
// Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
// Создайте следующие детские классы:
// • IsEven — ему дают целое число, он одобряет его, если оно чётное
// • IsPositive — ему дают целое число, он одобряет его, если оно положительное
// • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
// • BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил

// Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
// Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
// Продемонстрируйте, что это работает.

package HW4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Object> listOfIntegers = new ArrayList(
                Arrays.asList(1, -2, 4, 22, -44, 0, -5, 5, -55, 112));
        List<Object> listOfStrings = new ArrayList(
                Arrays.asList("Mom", "Dad", "Mother", "America", "Africa"));

        IsEven isEven = new IsEven();
        IsPositive isPositive = new IsPositive();
        BeginsWithA beginsWithA = new BeginsWithA();
        BeginsWith beginsWith = new BeginsWith("M");
        filter(listOfIntegers, isEven);
        filter(listOfIntegers, isPositive);
        filter(listOfStrings, beginsWithA);
        filter(listOfStrings, beginsWith);

    }

    public static <T> Iterable<T> filter(Iterable<T> collection, IsGood<T> approver) {
        List<T> newCollection = new ArrayList<>();
        for (T item : collection) {
            if (item instanceof Integer) {

                if (approver.isGood(item)) {
                    newCollection.add(item);
                }
            }

            if (item instanceof String) {

                if (approver.isGood(item)) {
                    newCollection.add(item);
                }
            }

        }
        System.out.println(newCollection);
        return newCollection;
    }
}
