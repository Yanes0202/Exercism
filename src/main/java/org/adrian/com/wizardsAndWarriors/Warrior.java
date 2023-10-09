package org.adrian.com.wizardsAndWarriors;

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
    @Override
    int damagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}
