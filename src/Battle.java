class Battle {

    private DataHelper dataHelper;

    Battle(Squad squad1, Squad squad2) {
        dataHelper = new DataHelper();
        System.out.println(dataHelper.getFormattedStartDate());
        startBattle(squad1, squad2);
        if (squad1.hasAliveWarriors()) {
            System.out.println("Победил отряд " + squad1.getName());
        } else {
            System.out.println("Победил отряд " + squad2.getName());
        }
        System.out.println(dataHelper.getFormattedDiff());
    }

    private void startBattle(Squad squad1, Squad squad2) {
        while (squad1.hasAliveWarriors() && squad2.hasAliveWarriors()) {
            Warrior attackedWarrior = squad2.getRandomWarrior();
            Warrior attackingWarrior = squad1.getRandomWarrior();
            attackedWarrior.takeDamage(attackingWarrior.attack());
            System.out.println(attackingWarrior.toString() + " атаковал и нанес " + attackingWarrior.attack() + " урона " + attackedWarrior);
            if (!attackedWarrior.isAlive()) {
                System.out.println(attackedWarrior.toString() + " погиб");
            }
            dataHelper.skipTime();
            if (squad2.hasAliveWarriors()) {
                attackedWarrior = squad1.getRandomWarrior();
                attackingWarrior = squad2.getRandomWarrior();
                attackedWarrior.takeDamage(attackingWarrior.attack());
                System.out.println(attackingWarrior.toString() + " атаковал и нанес " + attackingWarrior.attack() + " урона " + attackedWarrior);
                if (!attackedWarrior.isAlive()) {
                    System.out.println(attackedWarrior.toString() + " погиб");
                }
                dataHelper.skipTime();
            }
        }
    }
}
