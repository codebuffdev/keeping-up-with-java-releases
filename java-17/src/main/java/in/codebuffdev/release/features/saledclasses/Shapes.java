package in.codebuffdev.release.features.saledclasses;

/**
 * sealed class
 * java-15 : as preview feature
 * java-17 : as standard feature
 */

public abstract sealed class Shapes permits Circle, Rectangle {
    // Circle and Rectangle classes will be able to extend Shapes class
}
