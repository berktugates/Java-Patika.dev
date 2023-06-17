
public class BoxingMatch {
    public static void main(String[] args) {
        // added fighter objects and method
        Fighter f1 = new Fighter("Antony Jashua",55,220,95);
        Fighter f2 = new Fighter("Mike Tyson",60,190,103);
        f1.fighterInfo();
        f2.fighterInfo();

        // added match object

        Match match = new Match(f1,f2,90,105);
        match.run();

    }
}