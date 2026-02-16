package OOP_skole.module3.opgave2_med_subclass_og_superclass;

class Wheel {
    private final String position; // "front" or "rear"
    private boolean mounted = true;
    public Wheel(String position) {
        this.position = position;
    }
    public void remove() {
        if (!mounted) {
            System.out.println(position + " wheel is already off.");
        } 
        else {
            mounted = false;
            System.out.println(position + " wheel off.");
        }
    }
    public void mount() {
        if (mounted) {
            System.out.println(position + " wheel is already mounted.");
    } else {
        mounted = true;
        System.out.println(position + " wheel mounted.");
    }
    }
}