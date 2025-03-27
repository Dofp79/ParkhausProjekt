public class FahrzeugFactory {

    public static Fahrzeug erzeugeFahrzeug(String typ, String nummernschild) {
        switch (typ.toLowerCase()) {
            case "auto":
                return new Auto(nummernschild);
            case "motorrad":
                return new Motorrad(nummernschild);
            default:
                throw new IllegalArgumentException("Unbekannter Fahrzeugtyp: " + typ);
        }
    }
}
