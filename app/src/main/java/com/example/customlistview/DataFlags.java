package com.example.customlistview;

public class DataFlags {

    private int flagID;
    private int nameID;
    private int abbreviationID;
    private int mainID;

    public DataFlags (int _flagID, int _nameID, int _abbreviationID, int _mainID){
        flagID = _flagID;
        nameID = _nameID;
        abbreviationID = _abbreviationID;
        mainID = _mainID;
    }

    public int getFlagID(){
        return flagID;
    }

    public int getNameID(){
        return nameID;
    }

    public int getAbbreviationID() {
        return abbreviationID;
    }

    public int getMainID() {
        return mainID;
    }
}