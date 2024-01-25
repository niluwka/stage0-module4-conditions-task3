package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String s = Character.toString(character);
        String vowelsRussian = "aeiouy";
        String consonantEng = "qwrtplkjhgfdszxcvbnm";
        if (vowelsRussian.indexOf(Character.toLowerCase(s.charAt(0))) != -1) {
            System.out.println("Vowel");
        } else if (consonantEng.indexOf(Character.toLowerCase(s.charAt(0))) != -1) {
            System.out.println("Consonant");
        }else {
            System.out.println("wrong alphabet!");
        }

//        boolean test = character.matches("^(?i:[aeiouy]).*");
//        boolean test2 = character.matches("^(?i:[a-zA-Z]).*");
//        if (test) {
//            System.out.println("Vowel");
//        }else if (!test2)
//        { System.out.println("wrong alphabet!");}
//        else if ( Pattern.matches("[a-zA-Z]", character)){
//            System.out.println("Consonant");
//        }
    }
}
