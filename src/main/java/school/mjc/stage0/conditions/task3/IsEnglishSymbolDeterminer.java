package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String str = Character.toString(symbol);


        if (str == "ENG") {
System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}
