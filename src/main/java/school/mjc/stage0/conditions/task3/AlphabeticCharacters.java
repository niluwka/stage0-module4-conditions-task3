package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        boolean test = character.matches("^(?i:[aeiouy]).*");
        boolean test2 = character.matches("^(?i:[a-zA-Z]).*");
        if (test) {
            System.out.println("Vowel");
        }else if (!test2)
        { System.out.println("wrong alphabet!");}
        else {
            System.out.println("Consonant");
        }
    }
}
