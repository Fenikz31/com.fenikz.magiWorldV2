package playerClass;

public class Warrior extends Player{

    public Warrior(int level, int force, int intelligence, int agility, String name) {
        super(level, force, intelligence, agility, name);
        System.out.println("Groaw !!! je suis un Guerrier de level " + level +
                " avec " + this.getVitality() + " de vitalité \n");

    }

    public void basicAttack(Player opponent){
        opponent.setVitality(opponent.vitality - this.getForce());
        System.out.println(this.getName() + " utilise Coup d'Épée et inflige " + this.getForce() + " de dommages. " +
                "\n" + opponent.getName() + " perd " + this.getForce() + " points de vie");
    }


    public void specialAttack(Player opponent) {
        opponent.setVitality(opponent.vitality - (this.getForce()*2));
        this.setVitality(this.vitality - (this.getForce()/2));
        System.out.println(this.getName() + " utilise Coup de rage et inflige " + (this.getForce()*2) + " dommages." +
                "\n" + opponent.getName() + " perd " + (this.getForce()*2) + " points de vie" +
                "\n" + this.getName() + " perd " + (this.getForce()/2) + " points de vie");

    }
}