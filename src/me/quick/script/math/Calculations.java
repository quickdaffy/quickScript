package me.quick.script.math;

import me.quick.script.util.ParsingUtil;

public class Calculations {

    public double parseMath(String input) {
        if(input.startsWith("sqrt")) {
            System.out.println(ParsingUtil.getInBetweenParenthesis(input));
            return this.sqrt(ParsingUtil.getInBetweenParenthesis(input));
        }

        return 0;
    }

    public static double solve(String math) {
        if(math.contains("+")) {
            String[] toAdd = math.split("\\+");
            double number1 = Double.parseDouble(toAdd[0].replaceAll("\\s", ""));
            double number2 = Double.parseDouble(toAdd[1].replaceAll("\\s", ""));
            return number1 + number2;
        } else if(math.contains("*")) {
            String[] toAdd = math.split("\\*");
            double number1 = Double.parseDouble(toAdd[0].replaceAll("\\s", ""));
            double number2 = Double.parseDouble(toAdd[1].replaceAll("\\s", ""));
            return number1 * number2;
        } else if(math.contains("-")) {
            String[] toAdd = math.split("\\-");
            double number1 = Double.parseDouble(toAdd[0].replaceAll("\\s", ""));
            double number2 = Double.parseDouble(toAdd[1].replaceAll("\\s", ""));
            return number1 - number2;
        } else if(math.contains("/")) {
            String[] toAdd = math.split("\\/");
            double number1 = Double.parseDouble(toAdd[0].replaceAll("\\s", ""));
            double number2 = Double.parseDouble(toAdd[1].replaceAll("\\s", ""));
            return number1 / number2;
        }

        return 0;
    }

    public static double sqrt(String toSolve) {
        double toSqrt = Double.parseDouble(toSolve);
        return Math.sqrt(toSqrt);
    }

}
