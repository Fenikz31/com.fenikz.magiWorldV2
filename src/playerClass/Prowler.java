package playerClass;

/**
 * The type Prowler.
 */
public class Prowler extends Player{

    /**
     * Instantiates a new Prowler.
     *
     * @param level       the level
     * @param force        the force
     * @param intelligence the intelligence
     * @param agility      the agility
     * @param name          the name
     */
    public Prowler(int level, int force, int intelligence, int agility, String name) {
        super(level, force, intelligence, agility, name);

        System.out.println("Ninja !!! je suis un rôdeur de niveau " + level +
                " avec " + this.getVitality() + " de vitalité \n");
    }

    /**
     *damages equal player's agility if it's a prowler
     *
     * @param opponent self explanatory
     */
    public void basicAttack(Player opponent){
        opponent.setVitality(opponent.vitality - this.getAgility());
        System.out.println(this.getName() + " utilise Tir à l'Arc et inflige " + this.getAgility() + " dommages." +
                "\n" + opponent.getName() + " perd " + this.getAgility() + " points de vie");
    }

    /**
     *Prowler : get his level divided by 2 in agility.
     *
     * @param opponent - self explanatory
     */
    public void specialAttack(Player opponent) {
        int bonus = this.getLevel()/2;
        this.setAgility(this.getAgility() + bonus);
        System.out.println(this.getName() + " gagne " + bonus +" agilité ");

    }


    /**
     * Set agility
     *
     * @param agility self explanatory
     */
    private  void setAgility(int agility){
        super.agility = agility;
    }
}
