package Models.Enums;

public enum TipoVideo {
    VIDEO_TIPO1("VideoTipo1"),
    VIDEO_TIPO2("VideoTipo2"),
    NO_VIDEO("NoVideo");

    private final String label;

    TipoVideo(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static TipoVideo fromLabel(String label) {
        for (TipoVideo tipoVideo : TipoVideo.values()) {
            if (tipoVideo.label.equalsIgnoreCase(label)) {
                return tipoVideo;
            }
        }
        throw new IllegalArgumentException("TipoVideo non valido: " + label);
    }
}
