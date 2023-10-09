package org.adrian.com.wizardsAndWarriors;

abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }
    abstract int damagePoints(Fighter fighter);
}
