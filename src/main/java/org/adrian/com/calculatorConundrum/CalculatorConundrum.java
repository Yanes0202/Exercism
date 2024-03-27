package org.adrian.com.calculatorConundrum;

import java.util.function.BiFunction;
import java.util.Objects;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        Operation op = Operation.fromSymbol(operation);
        return op.apply(operand1, operand2);
    }
}

enum Operation {
    ADD("+", Integer::sum),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> {
        if (b == 0) {
            throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
        }
        return a / b;
    });

    private final String symbol;
    private final BiFunction<Integer, Integer, Integer> function;

    Operation(String symbol, BiFunction<Integer, Integer, Integer> function) {
        this.symbol = symbol;
        this.function = function;
    }

    public static Operation fromSymbol(String symbol) {
        if (Objects.isNull(symbol))
            throw new IllegalArgumentException("Operation cannot be null");
        if (symbol.isBlank())
            throw new IllegalArgumentException("Operation cannot be empty");

        for (Operation op : values()) {
            if (op.symbol.equals(symbol)) {
                return op;
            }
        }
        throw new IllegalOperationException("Operation '" + symbol + "' does not exist");
    }

    public String apply(int operand1, int operand2) {
        return String.format("%s %s %s = %d", operand1, symbol, operand2, function.apply(operand1, operand2));
    }
}