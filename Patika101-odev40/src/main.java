public class main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Conor",10,120,100, 30);
        Fighter f2 = new Fighter("Rey",20,85,85, 35);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
