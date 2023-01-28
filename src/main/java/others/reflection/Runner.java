package others.reflection;

import java.lang.reflect.*;

/*
    Java Reflection

    Gives you access to the objects at class level
    You can do whatever with objects at runtime
    Absolutely too much
    But it should allow to test private methods, which in turns allows to keep things more private
    and not disclose them only to make things testable

    Also, cannot be optimized by JVM
 */

public class Runner {

    public static void main(String[] args) {

        Class reflectClass = UFOEnemyShip.class;

        String className = reflectClass.getName();

        System.out.println("name of reflectClass is: " + className);

        int classModifier = reflectClass.getModifiers();

        System.out.println("Modifier is: " + classModifier + ". Is it public? " + Modifier.isPublic(classModifier));

        Class[] interfaces = reflectClass.getInterfaces();

        System.out.println("Superclass is: " + reflectClass.getSuperclass().getName() + "\n");

        for (Method method : reflectClass.getMethods()) {

            // check out the API's to Class, Field, Method, Modifier, Parameter...
            System.out.println("Method name: " + method);

            for (Class parameterType : method.getParameterTypes()) {
                System.out.println("Parameter types are: " + parameterType);
            }

            for (Parameter parameter : method.getParameters()) {
                System.out.println("Parameters are: " + parameter);
            }
        }
        System.out.println("");

        Constructor constructor;

        Object constructor2 = null;

        try {
            constructor = reflectClass.getConstructor(new Class[]{EnemyShipFactory.class});

            constructor2 = reflectClass.getConstructor(int.class, String.class).newInstance(42, "life as we know it");

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        for (Class paramType : constructor.getParameterTypes()) {

        }

        UFOEnemyShip ufoEnemyShip;

        EnemyShipFactory shipFactory = null;

        try {
            ufoEnemyShip = (UFOEnemyShip) constructor.newInstance(shipFactory);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        ufoEnemyShip.setName("R2-D2.2");

        System.out.println("Ship name: " + ufoEnemyShip.getName() + "\n");

        Field privateField;
        Method privateMethod;
        Method privateMethodWithArgs;

        UFOEnemyShip privateEnemyShip = new UFOEnemyShip(shipFactory);

        try {
            privateField = UFOEnemyShip.class.getDeclaredField("idCode");
            privateField.setAccessible(true);

            String privateFieldValue = (String) privateField.get(privateEnemyShip);

            System.out.println("Value of private field '" + privateField.getName() + "' is: " + privateFieldValue);

            privateMethod = UFOEnemyShip.class.getDeclaredMethod("getPrivate", null);
            privateMethod.setAccessible(true);

            String privateMethodValue = (String) privateMethod.invoke(privateEnemyShip, null);

            System.out.println("Value from invoking private method '" + privateMethod.getName() + "' is: " + privateMethodValue);

            Class[] paramTypes = new Class[]{Integer.TYPE, String.class};
            Object[] arguments = new Object[]{new Integer(42), new String("meaning of life")};

            privateMethodWithArgs = UFOEnemyShip.class.getDeclaredMethod("getMorePrivate", paramTypes);
            privateMethodWithArgs.setAccessible(true);

            String privateMethodWithArgsValue = (String) privateMethodWithArgs.invoke(privateEnemyShip, arguments);

            System.out.println("Value from invoking private method '" + privateMethodWithArgs.getName() + "' with arguments, is: " + privateMethodWithArgsValue);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
