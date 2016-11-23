public class Main {
    public static void main(String[] args) {
        Warrior Jack = new Barbarian("Джек Мартинес");
        Warrior Carl = new Archer("Карл Доритос");
        Warrior Jimmy = new Mage("Джимми Парирос");
        Warrior Sandy = new Archer("Сэнди Фахитос");
        Warrior Harry = new Mage("Гарри Поттеринос");
        Warrior Frank = new Barbarian("Фрэнк Потейтос");
        Squad squad1 = new Squad("Team Secret", new Warrior[]{Jack,Carl,Jimmy});
        Squad squad2 = new Squad("Team Awesome", new Warrior[]{Sandy,Harry,Frank});
//        Battle battle = new Battle(squad1, squad2);
        Squad clone = squad1.clone();
        for (int i = 0; i < 3; i++) {
            squad1.getRandomWarrior().takeDamage(100500);
        }
        System.out.print("В первом отряде все погибли");
        if(clone.hasAliveWarriors()) {
            System.out.println(", но клон это не затронуло");
        }else {
            System.out.println(", и бойцы клонированного отряда, видимо, совершили самоубийство");
        }
    }
}
