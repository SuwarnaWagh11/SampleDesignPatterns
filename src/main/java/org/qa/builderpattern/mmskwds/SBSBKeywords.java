package org.qa.builderpattern.mmskwds;

import org.qa.builderpattern.mmsbuilder.SBSBBuilder;

import java.time.LocalDate;

public class SBSBKeywords {

    private String sbsbId;
    private String sbsbFirstName;
    private String sbsbLastName;
    private String sbsbDOB;

    public void setSbsbId(String sbsbId) {
        this.sbsbId = sbsbId;
    }

    public void setSbsbFirstName(String sbsbFirstName) {
        this.sbsbFirstName = sbsbFirstName;
    }

    public void setSbsbLastName(String sbsbLastName) {
        this.sbsbLastName = sbsbLastName;
    }

    public void setSbsbDOB(String sbsbDOB) {
        this.sbsbDOB = sbsbDOB;
    }

    public static SBSBBuilder builder(){
        return new SBSBBuilder();
    }

    @Override
    public String toString() {
        return "@pSBSB_ID="+ '\"' + sbsbId + '\"' +
                ",@pSBSB_FIRST_NAME="+ '\"' + sbsbFirstName + '\"' +
                ",@pSBSB_LAST_NAME="+ '\"' + sbsbLastName + '\"' +
                ",@pSBSB_DOB=" +'\"'+ sbsbDOB +'\"';
    }

    public String getSbsbId() {
        return sbsbId;
    }

    public String getSbsbFirstName() {
        return sbsbFirstName;
    }

    public String getSbsbLastName() {
        return sbsbLastName;
    }

    public String getSbsbDOB() {
        return sbsbDOB;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SBSBKeywords)) {
            return false;
        }

        SBSBKeywords that = (SBSBKeywords) other;

        // Custom equality check here.
        return this.sbsbId.equals(that.sbsbId)
                && this.sbsbFirstName.equals(that.sbsbFirstName)
                && this.sbsbLastName.equals(that.sbsbLastName)
                && this.sbsbDOB.equals(that.sbsbDOB);
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 31 + this.sbsbId.hashCode();
        hashCode = hashCode * 31 + this.sbsbFirstName.hashCode();
        hashCode = hashCode * 31 + this.sbsbLastName.hashCode();
        hashCode = hashCode * 31 + this.sbsbDOB.hashCode();
        return hashCode;
    }
}
