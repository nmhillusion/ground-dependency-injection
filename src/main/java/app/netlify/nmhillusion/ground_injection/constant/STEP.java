package app.netlify.nmhillusion.ground_injection.constant;

public enum STEP {
    ADD_PROPERTIES(1),
    SCAN_CLASSES(2),
    POPULATION(3),
    INJECTION(4);

    final int value;

    STEP(int value) {
        this.value = value;
    }
}
