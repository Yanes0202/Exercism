package org.adrian.com.playYourCards;

import java.util.Objects;

public class Blackjack {
    public int parseCard(String card) {
        return switch (card) {
            case "ace" -> 11;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            case "ten" -> 10;
            case "jack" -> 10;
            case "queen" -> 10;
            case "king" -> 10;
            default -> 9;
        };
    }
    public boolean isBlackjack(String card1, String card2) {
        if (Objects.equals(card1, "ace") && Objects.equals(card2, "ace")) {
            return false;
        } else return parseCard(card1) + parseCard(card2) == 21;
    }
    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) {
            return "P";
        } else if (dealerScore != 10 && dealerScore != 11) {
            return "W";
        } else
            return "S";
    }
    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore == 11) {
            return "H";
        } else if (12 <= handScore && dealerScore >= 7) {
            return "H";
        } else if (12 <= handScore) {
            return "S";
        } else {
            return "H";
        }
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
