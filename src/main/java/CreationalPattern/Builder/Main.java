package CreationalPattern.Builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingComputerBuilder = new GamingComputer();
        Director director = new Director(gamingComputerBuilder);
        director.buildComputer();
        Computer gamingComputer = gamingComputerBuilder.getResult();
    }
}
