class GameCharacter {
    protected String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String attack() {
        return name + " attacks!";
    }
}

class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return name + " Sword attack";
    }
}

class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    public String attack() {
        if (arrowCount > 0) {
            arrowCount--;
            return name + " shoots an arrow! Remaining arrows: " + arrowCount;
        } else {
            return name + " has no arrows left!";
        }
    }
}

class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    public String attack() {
        if (mana >= 10) {
            mana -= 10;
            return name + " spell the magic Remaining mana: " + mana;
        } else {
            return name + " does not have enough mana!";
        }
    }
}
public class GameChracter {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior("Thor");
        characters[1] = new Archer("Aarwoman", 5);
        characters[2] = new Mage("Superball", 10);

        for (int i = 0; i < 3; i++) {
            System.out.println(characters[i].attack());
        }

        System.out.println(characters[1].attack());
        System.out.println(characters[1].attack());
        System.out.println(characters[1].attack());
        System.out.println(characters[1].attack());

        System.out.println(characters[2].attack());
        System.out.println(characters[2].attack());
        System.out.println(characters[2].attack());
    }
}
