package Lesen18;

public class Main {
    public static void main(String[] args) {
        RazrabEmploe r1= new RazrabEmploe("Vasa",24);
        RazrabEmploe r2=new RazrabEmploe("Dema",23);

        TestEmploe t1=new TestEmploe("Kyza",45);
        TestEmploe t2=new TestEmploe("Misha",16);

        Team<RazrabEmploe>razrabEmploeTeam=new Team<>();
        Team<RazrabEmploe> razrabEmploeTeam1=new Team<>();

        Team<TestEmploe>testEmploeTeam=new Team<>("Test Zevs");
        Team<TestEmploe>testEmploeTeam1=new Team<>("Test Apolon");


        razrabEmploeTeam.addEmploe(r1);
        razrabEmploeTeam.addEmploe(r2);

        testEmploeTeam.addEmploe(t1);
        testEmploeTeam.addEmploe(t2);

        Game.printWinner(testEmploeTeam,testEmploeTeam1);
        Game.printWinner(razrabEmploeTeam,razrabEmploeTeam1);



    }
}
