package helpers;

public enum RedioButtons {
    YES("Yes"),
    NO("No");

    private final String value;

    RedioButtons(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}