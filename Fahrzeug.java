public abstract class Fahrzeug {
    protected String nummernschild;

    public Fahrzeug(String nummernschild) {
        this.nummernschild = nummernschild;
    }

    public String getNummernschild() {
        return nummernschild;
    }

    public abstract String getTyp(); // Polymorphie

    @Override
    public String toString() {
        return getTyp() + " mit Kennzeichen: " + nummernschild;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fahrzeug other) {
            return this.nummernschild.equalsIgnoreCase(other.nummernschild);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return nummernschild.toLowerCase().hashCode();
    }
}
