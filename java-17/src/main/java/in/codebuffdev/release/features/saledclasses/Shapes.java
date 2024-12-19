package in.codebuffdev.release.features.saledclasses;

public abstract sealed class Shapes permits Circle, Rectangle {
    // Circle and Rectangle classes will be able to extend Shapes class
}
