// Generated by prefgen.py - Do not edit by hand!

package org.sufficientlysecure.ical;

import android.content.SharedPreferences;

public class Settings {
    public static final String PREF_DEFAULT_REMINDERS = "default_reminders";
    public static final String PREF_DUPLICATE_HANDLING = "duplicate_handling";
    public static final String PREF_ICAL4J_COMPATIBILITY_NOTES = "ical4j.compatibility.notes";
    public static final String PREF_ICAL4J_COMPATIBILITY_OUTLOOK = "ical4j.compatibility.outlook";
    public static final String PREF_ICAL4J_COMPATIBILITY_VCARD = "ical4j.compatibility.vcard";
    public static final String PREF_ICAL4J_PARSING_RELAXED = "ical4j.parsing.relaxed";
    public static final String PREF_ICAL4J_UNFOLDING_RELAXED = "ical4j.unfolding.relaxed";
    public static final String PREF_ICAL4J_VALIDATION_RELAXED = "ical4j.validation.relaxed";
    public static final String PREF_IMPORT_REMINDERS = "import_reminders";
    public static final String PREF_KEEP_UIDS = "keep_uids";
    public static final String PREF_LASTEXPORTFILE = "lastExportFile";
    public static final String PREF_LASTURL = "lastUrl";
    public static final String PREF_LASTURLPASSWORD = "lastUrlPassword";
    public static final String PREF_LASTURLUSERNAME = "lastUrlUsername";
    public static final String PREF_SAVE_PASSWORDS = "save_passwords";
    public static final String PREF_UIDPID = "uidPid";
    public enum DuplicateHandlingEnum {
        DUP_REPLACE,
        DUP_IGNORE,
        DUP_DONT_CHECK,
    }
    private SharedPreferences mPreferences;

    public Settings(SharedPreferences preferences) {
        mPreferences = preferences;
    }

    public SharedPreferences getPreferences() {
        return mPreferences;
    }

    public int getInt(String key, int def) {
        return mPreferences.getInt(key, def);
    }

    public void putInt(String key, int value) {
        mPreferences.edit().putInt(key, value).commit();
    }

    public boolean getBoolean(String key, boolean def) {
        return mPreferences.getBoolean(key, def);
    }

    public boolean getBoolean(String key) { return getBoolean(key, false); }

    public void putBoolean(String key, boolean value) {
        mPreferences.edit().putBoolean(key, value).commit();
    }

    public String getString(String key, String def) {
        return mPreferences.getString(key, def);
    }

    public String getString(String key) { return getString(key, ""); }

    public void putString(String key, String value) {
        mPreferences.edit().putString(key, value).commit();
    }

    private int getEnumInt(String key, int def) {
        return Integer.parseInt(getString(key, String.valueOf(def)));
    }

    private void putEnumInt(String key, int value) {
        putString(key, String.valueOf(value));
    }

    public boolean getSavePasswords() {
        return getBoolean(PREF_SAVE_PASSWORDS, false);
    }

    public void setSavePasswords(boolean value) {
        putBoolean(PREF_SAVE_PASSWORDS, value);
    }

    public DuplicateHandlingEnum getDuplicateHandling() {
        return DuplicateHandlingEnum.values()[getEnumInt(PREF_DUPLICATE_HANDLING, 0)];
    }

    public void setDuplicateHandling(DuplicateHandlingEnum value) {
        putEnumInt(PREF_DUPLICATE_HANDLING, value.ordinal());
    }

    public boolean getKeepUids() {
        return getBoolean(PREF_KEEP_UIDS, true);
    }

    public void setKeepUids(boolean value) {
        putBoolean(PREF_KEEP_UIDS, value);
    }

    public boolean getImportReminders() {
        return getBoolean(PREF_IMPORT_REMINDERS, true);
    }

    public void setImportReminders(boolean value) {
        putBoolean(PREF_IMPORT_REMINDERS, value);
    }

    public boolean getIcal4jUnfoldingRelaxed() {
        return getBoolean(PREF_ICAL4J_UNFOLDING_RELAXED, true);
    }

    public void setIcal4jUnfoldingRelaxed(boolean value) {
        putBoolean(PREF_ICAL4J_UNFOLDING_RELAXED, value);
    }

    public boolean getIcal4jParsingRelaxed() {
        return getBoolean(PREF_ICAL4J_PARSING_RELAXED, true);
    }

    public void setIcal4jParsingRelaxed(boolean value) {
        putBoolean(PREF_ICAL4J_PARSING_RELAXED, value);
    }

    public boolean getIcal4jCompatibilityOutlook() {
        return getBoolean(PREF_ICAL4J_COMPATIBILITY_OUTLOOK, true);
    }

    public void setIcal4jCompatibilityOutlook(boolean value) {
        putBoolean(PREF_ICAL4J_COMPATIBILITY_OUTLOOK, value);
    }

    public boolean getIcal4jCompatibilityNotes() {
        return getBoolean(PREF_ICAL4J_COMPATIBILITY_NOTES, true);
    }

    public void setIcal4jCompatibilityNotes(boolean value) {
        putBoolean(PREF_ICAL4J_COMPATIBILITY_NOTES, value);
    }

    public boolean getIcal4jCompatibilityVcard() {
        return getBoolean(PREF_ICAL4J_COMPATIBILITY_VCARD, false);
    }

    public void setIcal4jCompatibilityVcard(boolean value) {
        putBoolean(PREF_ICAL4J_COMPATIBILITY_VCARD, value);
    }

    public boolean getIcal4jValidationRelaxed() {
        return getBoolean(PREF_ICAL4J_VALIDATION_RELAXED, true);
    }

    public void setIcal4jValidationRelaxed(boolean value) {
        putBoolean(PREF_ICAL4J_VALIDATION_RELAXED, value);
    }

}
