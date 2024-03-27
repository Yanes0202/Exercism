package org.adrian.com.wizardsAndWarriors2;

public class GameMaster {

    public String describe(Character character) {
        return "You're a level %s with %s hit points.".formatted(character.getLevel() + " " + character.getCharacterClass(), character.getHitPoints());
    }

    public String describe(Destination destination) {
        return "You've arrived at %s, which has %s inhabitants.".formatted(destination.getName(), destination.getInhabitants());
    }

    public String describe(TravelMethod travelMethod) {
        if (travelMethod.equals(TravelMethod.HORSEBACK))
            return "You're traveling to your destination on horseback.";
        if (travelMethod.equals(TravelMethod.WALKING))
            return "You're traveling to your destination by walking.";
        else
            return null;
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
}
