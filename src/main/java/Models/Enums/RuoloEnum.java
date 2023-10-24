package Models.Enums;

public enum RuoloEnum {
    EMPLOYEE("employee"),
    CUSTOMER("customer"),
    ADMIN("admin");

    private final String roleName;

    RuoloEnum(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    // Metodo per ottenere un enum da una stringa
    public static RuoloEnum fromString(String roleName) {
        if (roleName != null) {
            for (RuoloEnum ruolo : RuoloEnum.values()) {
                if (roleName.equalsIgnoreCase(ruolo.roleName)) {
                    return ruolo;
                }
            }
        }
        throw new IllegalArgumentException("RuoloEnum non valido: " + roleName);
    }
}
