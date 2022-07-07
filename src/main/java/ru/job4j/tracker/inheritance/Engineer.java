package ru.job4j.tracker.inheritance;

public class Engineer extends  Profession {
        private  int expirience;

        public Engineer(int expirience, boolean degree) {
            super(degree);
            this.expirience = expirience;
        }
}
