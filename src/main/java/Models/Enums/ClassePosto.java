package Models.Enums;

public enum ClassePosto {
    FIRST_CLASS("FirstClass"),
    BUSINESS_CLASS("BusinessClass"),
    ECONOMY_CLASS("EconomyClass");

    private final String label;

    ClassePosto(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static ClassePosto fromLabel(String label) {
        for (ClassePosto classe : ClassePosto.values()) {
            if (classe.label.equalsIgnoreCase(label)) {
                return classe;
            }
        }
        throw new IllegalArgumentException("Classe non valida: " + label);
    }
}