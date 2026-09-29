package CreationalPattern.Builder;

//Director: điều khiển quá trình xây dựng đối tượng
public class Director {
    public ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public void buildComputer(){
        computerBuilder.buildCpu();
        computerBuilder.buildRam();
        computerBuilder.buildStorage();
        computerBuilder.buildGpu();
        computerBuilder.buildScreen();
    }
}
