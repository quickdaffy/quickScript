package me.quick.script.basic;

import me.quick.script.math.Calculations;
import me.quick.script.util.ParsingUtil;

public class BasicOperators {

    public void tryBuildInMethod(String input) {
        if(input.startsWith("print")) {
            if(ParsingUtil.getInBetweenParenthesis(input) != null) {
                if (ParsingUtil.getInBetweenParenthesis(input).startsWith("'") && ParsingUtil.getInBetweenParenthesis(input).endsWith("'")) {
                    print(ParsingUtil.getInBetweenQuotes(ParsingUtil.getInBetweenParenthesis(input)));
                } else if (ParsingUtil.getInBetweenParenthesis(input).startsWith("math:")) {
                    print(ParsingUtil.getInBetweenParenthesis(input));
                } else {
                    print(Calculations.solve(ParsingUtil.getInBetweenParenthesis(input)) + "");
                }
            } else {
                print(input);
            }
        }
    }

    private void print(String input) {
        System.out.println(input);
    }

}
