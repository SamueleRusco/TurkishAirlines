package Models.Enums;

public enum Alimentazione {
    AC("AC"),
    DC("DC"),
    NO_ALIMENTAZIONE("NoAlimentazione");

    private final String label;

    Alimentazione(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static Alimentazione fromLabel(String label) {
        for (Alimentazione alimentazione : Alimentazione.values()) {
            if (alimentazione.label.equalsIgnoreCase(label)) {
                return alimentazione;
            }
        }
        throw new IllegalArgumentException("Alimentazione non valida: " + label);
    }
}