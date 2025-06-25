package Advance_topic;

interface Animal {
    void category();

    void name();

}

public class interfacePro implements Animal {
    public void category() {
        System.out.println("Aquatic Animal");
    }

    public void name() {
        System.out.println("Fish");
    }

    public static void main(String[] args) {
        interfacePro obj = new interfacePro();
        obj.category();
        obj.name();
    }

}
