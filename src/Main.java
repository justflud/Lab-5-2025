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

        // Проверка equals()
        System.out.println("Equals: " + arrayFunction1.equals(arrayFunction2));

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

        // Создание объектов LinkedListTabulatedFunction
        double[] values2 = {1, 2, 3, 4, 5};
        LinkedListTabulatedFunction linkedListFunction1 = new LinkedListTabulatedFunction(0, 4, values2);
        LinkedListTabulatedFunction linkedListFunction2 = new LinkedListTabulatedFunction(0, 4, values2.clone());

        // Проверка toString()
        System.out.println("LinkedListTabulatedFunction 1: " + linkedListFunction1.toString());
        System.out.println("LinkedListTabulatedFunction 2: " + linkedListFunction2.toString());

        // Проверка equals()
        System.out.println("Equals: " + linkedListFunction1.equals(linkedListFunction2));

        // Проверка hashCode()
        System.out.println("HashCode 1: " + linkedListFunction1.hashCode());
        System.out.println("HashCode 2: " + linkedListFunction2.hashCode());

        // Проверка clone()
        LinkedListTabulatedFunction linkedListFunctionClone = (LinkedListTabulatedFunction) linkedListFunction1.clone();
        System.out.println("Clone: " + linkedListFunctionClone.toString());

        // Изменение оригинала и проверка, что клон не изменился
        linkedListFunction1.setPointY(0, 10);
        System.out.println("После изменения: ");
        System.out.println("Original: " + linkedListFunction1.toString());
        System.out.println("Clone: " + linkedListFunctionClone.toString());
    }

}