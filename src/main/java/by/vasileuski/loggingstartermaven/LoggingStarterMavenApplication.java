package by.vasileuski.loggingstartermaven;

public class LoggingStarterMavenApplication {

    public static void println(final String message) {
        System.out.println("Вызвано из библиотеки maven: " + message);
    }

}
