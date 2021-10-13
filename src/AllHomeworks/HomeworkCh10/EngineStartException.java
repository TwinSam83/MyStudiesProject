package AllHomeworks.HomeworkCh10;

public class EngineStartException extends Exception {
    private final String message;

    public EngineStartException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EngineStartException { " +
                "message= " + message +
                " }";
    }
}
