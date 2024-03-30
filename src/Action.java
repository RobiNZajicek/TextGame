class Action {
        /**
         * Represents an action or ability in a game.
         */
            private String name;
            private int damageModifier;
            private int defenseModifier;
            private int evasionModifier;

            /**
             * Constructs an Action object with the specified parameters.
             *
             * @param name            the name of the action
             * @param damageModifier  the damage modifier of the action
             * @param defenseModifier the defense modifier of the action
             * @param evasionModifier the evasion modifier of the action
             */
            public Action(String name, int damageModifier, int defenseModifier, int evasionModifier) {
                this.name = name;
                this.damageModifier = damageModifier;
                this.defenseModifier = defenseModifier;
                this.evasionModifier = evasionModifier;
            }

            /**
             * Sets the name of the action.
             *
             * @param name the name of the action
             */
            public void setName(String name) {
                this.name = name;
            }

            /**
             * Sets the damage modifier of the action.
             *
             * @param damageModifier the damage modifier of the action
             */
            public void setDamageModifier(int damageModifier) {
                this.damageModifier = damageModifier;
            }

            /**
             * Sets the defense modifier of the action.
             *
             * @param defenseModifier the defense modifier of the action
             */
            public void setDefenseModifier(int defenseModifier) {
                this.defenseModifier = defenseModifier;
            }

            /**
             * Sets the evasion modifier of the action.
             *
             * @param evasionModifier the evasion modifier of the action
             */
            public void setEvasionModifier(int evasionModifier) {
                this.evasionModifier = evasionModifier;
            }

            /**
             * Returns the name of the action.
             *
             * @return the name of the action
             */
            public String getName() {
                return name;
            }

            /**
             * Returns the damage modifier of the action.
             *
             * @return the damage modifier of the action
             */
            public int getDamageModifier() {
                return damageModifier;
            }

            /**
             * Returns the defense modifier of the action.
             *
             * @return the defense modifier of the action
             */
            public int getDefenseModifier() {
                return defenseModifier;
            }

            /**
             * Returns the evasion modifier of the action.
             *
             * @return the evasion modifier of the action
             */
            public int getEvasionModifier() {
                return evasionModifier;
            }

            /**
             * Returns the dodge chance of the action.
             *
             * @return the dodge chance of the action
             */
            public int getDodgeChance() {
                return 2;
            }
        }
