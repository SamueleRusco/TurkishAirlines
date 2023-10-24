package Models.Enums;

public enum TipoSeduta {
    STANDARD("Standard"),
    RECLINABILE("Reclinabile"),
    CABINA("Cabina");

    private final String label;

    TipoSeduta(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static TipoSeduta fromLabel(String label) {
        for (TipoSeduta tipoSeduta : TipoSeduta.values()) {
            if (tipoSeduta.label.equalsIgnoreCase(label)) {
                return tipoSeduta;
            }
        }
        throw new IllegalArgumentException("TipoSeduta non valido: " + label);
    }
}
