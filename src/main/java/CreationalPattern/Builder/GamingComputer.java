package CreationalPattern.Builder;

//Concrete Builder: Triển khai thực tế của Builder
public class GamingComputer implements ComputerBuilder{

    private Computer computer = new Computer();
    @Override
    public void buildCpu() {
        computer.setCpu("i9");
    }

    @Override
    public void buildRam() {
        computer.setRam("32GB");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("SSD 512GB");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("RTX 5080");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("17 inch, 4K");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
