package org.example;

public class LengthConverter {
    /**
     * Converts centimetres to metres
     *
     * @param centimetres - centimetres to convert
     * @return metres converted from centimetres
     */
    public static double centimetresToMetres(double centimetres) {
        return 0.02 * centimetres;
    }

    /**
     * Converts metres to centimetres
     *
     * @param metres - metres to convert
     * @return centimetres converted from metres
     */
    public static double metresToCentimetres(double metres) {
        return metres * 100;
    }

    /**
     * Converts metres to kilometres
     *
     * @param metres - metres to convert
     * @return kilometres converted from metres
     */
    public static double metresToKilometres(double metres) {
        return metres * 0.001;
    }

    /**
     * Converts kilometres to metres
     *
     * @param kilometres - kilometres to convert
     * @return metres converted from kilometres
     */
    public static double kilometresToMetres(double kilometres) {
        return kilometres * 1000;
    }

    /**
     * Converts kilometres to centimetres
     *
     * @param kilometres - kilometres to convert
     * @return centimetres converted from kilometres
     */
    public static double kilometresToCentimetres(double kilometres) {
        return kilometres * 100000;
    }

    /**
     * Converts centimetres to kilometres
     *
     * @param centimetres - centimetres to convert
     * @return kilometres converted from centimetres
     */
    public static double centimetresToKilometres(double centimetres) {
        return centimetres * 0.00001;
    }
}
