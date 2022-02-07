package me.quick.script.math;

import me.quick.script.util.ParsingUtil;

public class Calculations {

    public double parseMath(String input) {
        if(input.startsWith("sqrt")) {
            System.out.println(ParsingUtil.getInBetweenParenthesis(input));
            return this.sqrt(ParsingUtil.getInBetweenParenthesis(input));
        }
        else if(input.startsWith("cos")) {
            System.out.println(ParsingUtil.getInBetweenParenthesis(input));
            return this.cos(ParsingUtil.getInBetweenParenthesis(input));
        }
        else if(input.startsWith("sin")) {
            System.out.println(ParsingUtil.getInBetweenParenthesis(input));
            return this.sin(ParsingUtil.getInBetweenParenthesis(input));
        }
        else if(input.startsWith("tan")) {
            System.out.println(ParsingUtil.getInBetweenParenthesis(input));
            return this.tan(ParsingUtil.getInBetweenParenthesis(input));
        }
        else if(input.startsWith("acos")) {
            System.out.println(ParsingUtil.getInBetweenParenthesis(input));
            return this.acos(ParsingUtil.getInBetweenParenthesis(input));
        }
        else if(input.startsWith("asin")) {
            System.out.println(ParsingUtil.getInBetweenParenthesis(input));
            return this.asin(ParsingUtil.getInBetweenParenthesis(input));
        }
        else if(input.startsWith("atan")) {
            System.out.println(ParsingUtil.getInBetweenParenthesis(input));
            return this.atan(ParsingUtil.getInBetweenParenthesis(input));
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

    public static double cos(String toSolve) {
        double toCos = Double.parseDouble(toSolve);
        return Math.cos(toCos);
    }

    public static double sin(String toSolve) {
        double toSin = Double.parseDouble(toSolve);
        return Math.sin(toSin);
    }

    public static double tan(String toSolve) {
        double toTan = Double.parseDouble(toSolve);
        return Math.tan(toTan);
    }

    public static double acos(String toSolve) {
        double toCos = Double.parseDouble(toSolve);
        return Math.asin(toCos);
    }

    public static double asin(String toSolve) {
        double toSin = Double.parseDouble(toSolve);
        return Math.asin(toSin);
    }

    public static double atan(String toSolve) {
        double toTan = Double.parseDouble(toSolve);
        return Math.atan(toTan);
    }
}
