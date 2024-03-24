package org.adrian.com.calculatorConundrum;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            switch (operation) {
                case "+" -> {
                    return "%s + %s = %s".formatted(operand1, operand2, operand1 + operand2);
                }
                case "*" -> {
                    return "%s * %s = %s".formatted(operand1, operand2, operand1 * operand2);
                }
                case "/" -> {
                    if (operand2 == 0) {
                        throw new ArithmeticException();
                    }
                    return "%s / %s = %s".formatted(operand1, operand2, operand1 / operand2);
                }
                case "" ->
                    throw new IllegalArgumentException("Operation cannot be empty");
                default ->
                        throw new IllegalOperationException("Operation '%s' does not exist".formatted(operation));
            }
        } catch (IllegalOperationException e) {
            throw new IllegalOperationException(e.getMessage(), e);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Operation cannot be null");
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
