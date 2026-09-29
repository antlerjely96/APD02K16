package CreationalPattern.Builder;

//Builder: khai báo các phương thức để xây dựng product
public interface ComputerBuilder {
    public void buildCpu();
    public void buildRam();
    public void buildStorage();
    public void buildGpu();
    public void buildScreen();
    Computer getResult();
}
