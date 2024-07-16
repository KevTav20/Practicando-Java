package com.cybersquad.practica.variables;

public class Main {
    public static void main(String[] args) {
        //Datos primitivos

        //byte: Representa un entero de 8 bits
        byte exampleByte = 127;
        System.out.println("Byte: " + exampleByte);

        //short: Representa un entero de 16 bits
        short exampleShort = 32767;
        System.out.println("Short: " + exampleShort);

        //int: Representa un entero de 32 bits
        int exampleInt = 2147483647;
        System.out.println("Int: " + exampleInt);

        //long: Representa un entero de 64 bits
        long exampleLong = 9223372036854775807L;
        System.out.println("Long: " + exampleLong);

        //float: Representa un número de punto flotante de 32 bits
        float exampleFloat = 3.4028235E38f;
        System.out.println("Float: " + exampleFloat);

        //double: Representa un número de punto flotante de 64 bits
        double exampleDouble = 1.7976931348623157E308;
        System.out.println("Double: " + exampleDouble);

        //char: Representa un carácter Unicode de 16 bits
        char exampleChar = 'A';
        System.out.println("Char: " + exampleChar);

        //boolean: Representa un valor booleano verdadero o falso
        boolean exampleBoolean = true;
        System.out.println("Boolean: " + exampleBoolean);

        //Datos de referencia

        //String: Representa una secuencia de caracteres
        String exampleString = "Hello, World!";
        System.out.println("String: " + exampleString);

        //Datos de referencia (Clases)
        //Representan un objeto en la memoria
        class ExampleClass {
            int atrribute;

            ExampleClass(int atrribute) {
                this.atrribute = atrribute;
            }
        }

        ExampleClass exampleClass = new ExampleClass(10);
        System.out.println("Class: " + exampleClass.atrribute);

        //Datos de referencia (Arrays)
        //Representan una colección de elementos de un tipo de datos
        int[] exampleArray = {1, 2, 3, 4, 5};
        System.out.println("Array: " + exampleArray[0]);

        //Datos de referencia (Enum)
        //Representan un conjunto de constantes
        enum ExampleEnum {
            EXAMPLE1, EXAMPLE2, EXAMPLE3
        }

        ExampleEnum exampleEnum = ExampleEnum.EXAMPLE1;
        System.out.println("Enum: " + exampleEnum);

        //Datos de referencia (Interfaz)
        //Representan un conjunto de métodos abstractos
        interface ExampleInterface {
            void exampleMethod();
        }

        class ExampleClassInterface implements ExampleInterface {
            public void exampleMethod() {
                System.out.println("Interface");
            }
        }

        ExampleInterface exampleInterface = new ExampleClassInterface();
        exampleInterface.exampleMethod();
    }
}
