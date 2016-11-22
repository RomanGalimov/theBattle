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
        Battle battle = new Battle(squad1, squad2);

    }
}
