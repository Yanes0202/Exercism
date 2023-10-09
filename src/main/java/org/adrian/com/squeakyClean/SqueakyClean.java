package org.adrian.com.squeakyClean;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean isCamelCase = false;
        for (int i = 0;i < identifier.length();i++) {
            char a = identifier.charAt(i);
            if (isCamelCase && Character.isLetter(a)) {
                a = Character.toUpperCase(a);
                result.append(a);
                isCamelCase = false;
                continue;
            }
            if (Character.isISOControl(a)) {
                result.append("CTRL");
            } else if (Character.isWhitespace(a)) {
                result.append('_');
            } else if (a == '-') {
                isCamelCase = true;
            } else if (Character.isLetter(a) && !isAsciiCharacter(a)) {
                result.append(a);
            }
        }
        return  result.toString();
    }
    static boolean isAsciiCharacter(char c) {
        if (Character.isUpperCase(c)) {
            return false;
        } else {
            return (c >= 0x0391 && c <= 0x03A9) || (c >= 0x03B1 && c <= 0x03C9);
        }
    }
}
