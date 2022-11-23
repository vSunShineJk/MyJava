package MySelfStudying.concepts_OOP.polymorphism.dota;

import MySelfStudying.concepts_OOP.polymorphism.dota.heroes.*;

public class Game {
    public static void main(String[] args) {

        DarkTeam darkTeam = new DarkTeam(new Axe(), new Luna(), new ShadowBlade(), new Luna(), new Riki());

        LightTeam lightTeam = new LightTeam(new Pudge(), new Riki(), new Thor(), new Loki(), new ShadowBlade());

        Map map = new Map(darkTeam, lightTeam);
    }
}
