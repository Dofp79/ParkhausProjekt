public class Motorrad extends Fahrzeug {
    public Motorrad(String nummernschild) {
        super(nummernschild);
    }

    @Override
    public String getTyp() {
        return "Motorrad";
    }
}
