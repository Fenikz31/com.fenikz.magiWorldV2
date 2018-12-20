package playerClass;

public abstract class Player {

        private int level;
        int vitality;
        private int force;
        private int intelligence;
        int agility;

        private String name;

        /**
         * @param level - player's level
         * @param force - player's strength
         * @param intelligence - player's intelligence
         * @param agility - player's agility
         * @param name - player's name
         */
        Player(int level, int force, int intelligence, int agility, String name) {
            this.level = level;
            this.vitality = level*5;
            this.force = force;
            this.intelligence = intelligence;
            this.agility = agility;
            this.name = name;
        }

        /**
         * Basic attack : damages equal:
         *  - player's strength if it's a warrior
         *  - player's intelligence if it's a mage
         *  - player's agility if it's a prowler
         *
         * @param opponent self explanatory
         */
        public abstract void basicAttack(Player opponent);

        /**
         *Warrior : inflicts 2 times his strength, but loses half of his life
         *Mage : heals up to 2 times intelligence
         *Rodeur : get his level by 2 in agility.
         *
         * @param opponent self explanatory
         */
        public abstract void specialAttack(Player opponent);

        /**
         *
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @return player's lvl
         */
        int getLevel() {
            return level;
        }

        /**
         *
         * @return player's vitality
         */
        public int getVitality() {
            return vitality;
        }

        /**
         * Gets force.
         *
         * @return strenghth
         */
        int getForce() {
            return force;
        }


        /**
         * Gets intelligence.
         *
         * @return intelligence
         */
        int getIntelligence() {
            return intelligence;
        }

        /**
         * Gets agility.
         *
         * @return agilty
         */
        int getAgility() {
            return agility;
        }


        /**
         * Sets vitality.
         *
         * @param vitality  - player's vitality
         */
        void setVitality(int vitality) {
            this.vitality = vitality;
        }
}