package others.interpreter;

import java.lang.reflect.*;

import javax.swing.*;

/*
    Interpreter
    - Convert representation of data
    - Rare
    - Great together with Java Reflection

    COULDNT MAKE IT WORK ANS ALSO DONT WANT TO
    - also nothing much to learn here i guess
 */

public class Runner {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        String questionAsked = JOptionPane.showInputDialog(frame, "What do you want to ask?");

        ConversionContext question = new ConversionContext(questionAsked);

        String fromConversion = question.getFromConversion();

        String toConversion = question.getToConversion();

        Double quantity = question.getQuantity();

        try {
            System.out.println(fromConversion);

            Class tempClass = Class.forName(fromConversion);

            Constructor con = tempClass.getConstructor();

            Object convertFrom = (Expression) con.newInstance();

            Class[] methodParams = new Class[]{Double.TYPE};

            Method conversionMethod = tempClass.getDeclaredMethod(toConversion, methodParams);

            Object params = new Object[]{new Double(quantity)};

            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

            String answerToQuestion = question.getConversionResponse() + toQuantity + " " + toConversion;

            JOptionPane.showInputDialog(null, answerToQuestion);

            frame.dispose();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}