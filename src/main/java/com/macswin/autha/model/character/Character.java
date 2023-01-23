package com.macswin.autha.model.character;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Character {

    private final IntegerProperty characterID = new SimpleIntegerProperty(this, "Character ID", 0);
    private final StringProperty name = new SimpleStringProperty(this, "name", "");
    private final StringProperty alias = new SimpleStringProperty(this, "alias", "");
    private final StringProperty age = new SimpleStringProperty(this, "age", "0");
    private final StringProperty gender = new SimpleStringProperty(this, "age", "0");

    private CharacterType characterType;

}
