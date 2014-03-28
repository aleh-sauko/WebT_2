package by.epam.lw02.controller;

/**
 * Created by aleh on 08.03.14.
 */
public class NoBuilderException extends Exception {
    @Override
    public String toString() {
        return "ERROR : No builder found.";
    }
}
