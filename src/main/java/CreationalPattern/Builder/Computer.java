package CreationalPattern.Builder;

//Product: đối tượng phức tạp cần được khởi tạo
public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String screen;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
}
