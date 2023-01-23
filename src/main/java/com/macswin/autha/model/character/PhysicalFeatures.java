package com.macswin.autha.model.character;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PhysicalFeatures {

    private final IntegerProperty physicalFeaturesID = new SimpleIntegerProperty(this, "Character ID", 0);
    private final StringProperty height = new SimpleStringProperty(this, "height", "");
    private final StringProperty weight = new SimpleStringProperty(this, "weight", "");
    private final StringProperty build = new SimpleStringProperty(this, "build", "");
    private final StringProperty hairColor = new SimpleStringProperty(this, "hairColor", "");
    private final StringProperty hairLength = new SimpleStringProperty(this, "hairLength", "");
    private final StringProperty eyeColor = new SimpleStringProperty(this, "eyeColor", "");
    private final StringProperty complexion = new SimpleStringProperty(this, "complexion", "");
    private final StringProperty faceShape = new SimpleStringProperty(this, "faceShape", "");
    private final StringProperty voiceType = new SimpleStringProperty(this, "voiceType", "");
}
