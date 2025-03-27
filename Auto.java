public class Auto extends Fahrzeug {
    public Auto(String nummernschild) {
        super(nummernschild);
    }

    @Override
    public String getTyp() {
        return "Auto";
    }
}
