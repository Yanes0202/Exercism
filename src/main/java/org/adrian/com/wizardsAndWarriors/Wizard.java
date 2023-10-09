package org.adrian.com.wizardsAndWarriors;

class Wizard extends Fighter {
    boolean prepareSpell = false;
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !prepareSpell;
    }
    @Override
    int damagePoints(Fighter fighter) {
        if (prepareSpell) {
            prepareSpell = false;
            return 12;
        } else {
            return 3;
        }
    }
    void prepareSpell() {
        prepareSpell = true;
    }
}
