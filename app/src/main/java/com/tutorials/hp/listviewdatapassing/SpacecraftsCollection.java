package com.tutorials.hp.listviewdatapassing;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Oclemy on 22/3/2017 for ProgrammingWizards Channel and http://www.camposha.info.
 * CLAS IMPLEMENTS SERIALIZABLE
 */
public class SpacecraftsCollection implements Serializable {

    private ArrayList<String> spacecrafts;

    public ArrayList<String> getSpacecrafts() {
        return spacecrafts;
    }

    public void setSpacecrafts(ArrayList<String> spacecrafts) {
        this.spacecrafts = spacecrafts;
    }
}
