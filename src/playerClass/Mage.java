package playerClass;

/**
 * The type Mage.
 */
public class Mage extends Player {

    /**
     * Instantiates a new Mage.
     *
     * @param level       the level
     * @param force        the force
     * @param intelligence the intelligence
     * @param agility      the agility
     * @param name          the name
     */
    public Mage(int level, int force, int intelligence, int agility, String name) {
        super(level, force, intelligence, agility, name);
        System.out.println("Abracadabra !!! je suis un Mage de niveau " + level +
                " avec " + this.getVitality() + " de vitalité \n");

    }

    /**
     * damages equal player's intelligence if it's a mage
     *
     * @param opponent self explanatory
     */
    public void basicAttack(Player opponent){
        opponent.setVitality(opponent.vitality - this.getIntelligence());
        System.out.println(this.getName() + " utilise Boule de Feu et inflige " + this.getIntelligence() + " dommages." +
                "\n" + opponent.getName() + " perd " + this.getIntelligence() + " points de vie");
    }


    /**
     * Mage : heal up to 2 times intelligence
     *
     * @param opponent self explanatory
     */
    public void specialAttack(Player opponent) {
        int heal = 0;
        if(this.getVitality() < (this.getLevel()*5)) {
            for (int i = 0; i < (this.getIntelligence() * 2) || this.getVitality() < (this.getLevel() * 5); i++) {
                this.vitality++;
                heal++;
            }
            System.out.println(this.getName() + " utilise Soin et gagne " + heal + " points de vie");
        }
        else{
            System.out.println(this.getName() + " a sa vie au maximum");
        }

    }
}