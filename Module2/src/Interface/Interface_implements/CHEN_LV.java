package Interface.Interface_implements;

public class CHEN_LV extends a implements SportMan,Law {
    private String name;

    public String getName() {
        return name;
    }

    public CHEN_LV(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void compete() {
        System.out.println(name + " is competing");
    }

    @Override
    public void rule() {
        System.out.println(name + " must obey rules");
    }
}
