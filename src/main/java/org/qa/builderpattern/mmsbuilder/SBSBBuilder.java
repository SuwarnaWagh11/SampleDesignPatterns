package org.qa.builderpattern.mmsbuilder;

import org.qa.builderpattern.mmskwds.SBSBKeywords;

import java.time.LocalDate;

public class SBSBBuilder {

    public SBSBKeywords sbsb = new SBSBKeywords();

    public SBSBBuilder addSBSBId(String sbsbid){
        sbsb.setSbsbId(sbsbid);
        return this;
    }

    public SBSBBuilder addSBSBLastName(String sbsblastname){
        sbsb.setSbsbLastName(sbsblastname);
        return this;
    }

    public SBSBBuilder addSBSBFirstName(String sbsbfirstname){
        sbsb.setSbsbFirstName(sbsbfirstname);
        return this;
    }

    public SBSBBuilder addSBSBDOB(String sbsbdob){
        sbsb.setSbsbDOB(sbsbdob);
        return this;
    }

    public SBSBKeywords build(){
        return sbsb;
    }
}
