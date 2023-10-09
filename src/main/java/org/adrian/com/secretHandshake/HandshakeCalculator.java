package org.adrian.com.secretHandshake;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class HandshakeCalculator {
    List<Signal> calculateHandshake(int number) {
        List<Signal> signalList = new ArrayList<>();
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(number));
        if (binary.length() < 5) {
            while (binary.length() != 5) {
                binary.insert(0, "0");
            }
        }

        String[] splited = binary.toString().split("");
        String[] reversed = new String[splited.length];
        for (int i = 0; i < splited.length; i++) {
            reversed[i] = splited[splited.length - 1 - i];
        }
        if (reversed[0].equals("1")) {
            signalList.add(Signal.WINK);
        }
        if (reversed[1].equals("1")) {
            signalList.add(Signal.DOUBLE_BLINK);
        }
        if (reversed[2].equals("1")) {
            signalList.add(Signal.CLOSE_YOUR_EYES);
        }
        if (reversed[3].equals("1")) {
            signalList.add(Signal.JUMP);
        }
        if (reversed[4].equals("1")) {
            Collections.reverse(signalList);
        }

        return signalList;
    }
}
