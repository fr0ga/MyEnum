/**
 * Created with IntelliJ IDEA.
 * User: Andrey Solovev
 * Date: 16.11.13
 * Time: 19:02
 * To change this template use File | Settings | File Templates.
 */

import java.lang.reflect.*;


public class MyEnum {
    public static void main(String[] args) throws NoSuchFieldException {

        System.out.println("Характеристика перечисления Planet: ");
        System.out.println();

        System.out.println("________Модификаторы:________");
        int modifiers = Planet.class.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(modifiers)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.println("final");
        }
        if (Modifier.isStatic(modifiers)) {
            System.out.println("static");
        }

        System.out.println("________Константы:________");
        for (Planet p : Planet.class.getEnumConstants()) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("________Поля:________ ");
        Field[] fields = Planet.class.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println("Имя: " + field.getName());
            System.out.println("Тип: " + fieldType.getName());
            System.out.println();
        }

        System.out.println("________Конструкторы:________ ");
        Constructor[] constructors = Planet.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Имя: " + constructor.getName());
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("________Методы:________ ");
        Method[] methods = Planet.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Имя: " + method.getName());
            System.out.println("Возвращаемый тип: " + method.getReturnType().getName());

            Class[] paramTypes = method.getParameterTypes();
            System.out.print("Типы параметров: ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
            System.out.println();
        }

    }
}
