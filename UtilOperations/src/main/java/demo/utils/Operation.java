package demo.utils;

@FunctionalInterface
public interface Operation {

    void doIt();

    default void handleThrowable(Throwable t){
        // throwable handling...
    }

}