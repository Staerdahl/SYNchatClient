/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Acquaintance.IProfile;
import Acquaintance.Nationality;
import javafx.scene.image.Image; //Might not be a correct import...



/**
 *
 */
public class Profile implements IProfile{
    
    String firstName;
    String lastName;
    Nationality nationality;
    Image picture; //Watch out for the datatype!
    String profileText;

    public Profile(String firstName, String lastName, Nationality nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public void setProfileText(String profileText) {
        this.profileText = profileText;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public String getProfileText() {
        return profileText;
    }
    
}
