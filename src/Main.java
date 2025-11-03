import functions.*;
import functions.basic.*;
import functions.meta.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws InappropriateFunctionPointException {

        // Создание объектов ArrayTabulatedFunction
        double[] values1 = {1, 2, 3, 4, 5};
        ArrayTabulatedFunction arrayFunction1 = new ArrayTabulatedFunction(0, 4, values1);
        ArrayTabulatedFunction arrayFunction2 = new ArrayTabulatedFunction(0, 4, values1.clone());

        // Проверка toString()
        System.out.println("ArrayTabulatedFunction 1: " + arrayFunction1.toString());
        System.out.println("ArrayTabulatedFunction 2: " + arrayFunction2.toString());

        System.out.println("Equals (одинаковые точки): " + arrayFunction1.equals(arrayFunction2));
        System.out.println("Equals (сам с собой): " + arrayFunction1.equals(arrayFunction1));

        // Проверка hashCode()
        System.out.println("HashCode 1: " + arrayFunction1.hashCode());
        System.out.println("HashCode 2: " + arrayFunction2.hashCode());

        // Проверка clone()
        ArrayTabulatedFunction arrayFunctionClone = (ArrayTabulatedFunction) arrayFunction1.clone();
        System.out.println("Clone: " + arrayFunctionClone.toString());

        // Изменение оригинала и проверка, что клон не изменился
        arrayFunction1.setPointY(0, 10);
        System.out.println("После изменения: ");
        System.out.println("Original: " + arrayFunction1.toString());
        System.out.println("Clone: " + arrayFunctionClone.toString());
        System.out.println("HashCode Original после изменения: " + arrayFunction1.hashCode());
        System.out.println("HashCode Clone: " + arrayFunctionClone.hashCode());
        System.out.println("Equals (original и clone после изменения): " + arrayFunction1.equals(arrayFunctionClone));

        // Создание объектов LinkedListTabulatedFunction
        double[] values2 = {1, 2, 3, 4, 5};
        LinkedListTabulatedFunction linkedListFunction1 = new LinkedListTabulatedFunction(0, 4, values2);
        LinkedListTabulatedFunction linkedListFunction2 = new LinkedListTabulatedFunction(0, 4, values2.clone());

        // Проверка toString()
        System.out.println("LinkedListTabulatedFunction 1: " + linkedListFunction1.toString());
        System.out.println("LinkedListTabulatedFunction 2: " + linkedListFunction2.toString());

        // Проверка equals()
        System.out.println("Equals (одинаковые точки): " + linkedListFunction1.equals(linkedListFunction2));
        System.out.println("Equals (с самим собой): " + linkedListFunction1.equals(linkedListFunction1));

        // Проверка hashCode()
        System.out.println("HashCode 1: " + linkedListFunction1.hashCode());
        System.out.println("HashCode 2: " + linkedListFunction2.hashCode());

        // Проверка clone()
        LinkedListTabulatedFunction linkedListFunctionClone = (LinkedListTabulatedFunction) linkedListFunction1.clone();
        System.out.println("Clone: " + linkedListFunctionClone.toString());


        linkedListFunction1.setPointY(0, 10);
        System.out.println("После изменения:");
        System.out.println("Original: " + linkedListFunction1);
        System.out.println("Clone: " + linkedListFunctionClone);
        System.out.println("HashCode Original после изменения: " + linkedListFunction1.hashCode());
        System.out.println("HashCode Clone: " + linkedListFunctionClone.hashCode());
        System.out.println("Equals original и clone после изменения: " + linkedListFunction1.equals(linkedListFunctionClone));

        // Изменение оригинала и проверка, что клон не изменился
        ArrayTabulatedFunction arraySameAsList = new ArrayTabulatedFunction(0, 4, values2);
        System.out.println("Array и LinkedList (одинаковые точки): " + arraySameAsList.equals(linkedListFunction2));

        // --- Different data comparison ---
        double[] values3 = {2, 4, 6, 8, 10};
        ArrayTabulatedFunction arrayDifferent = new ArrayTabulatedFunction(0, 4, values3);
        System.out.println("Array (изначальные точки) vs Array (другие точки): " + arrayFunction2.equals(arrayDifferent));
    }
}