/**
 *  Copyright (C) 2015  Jon Griffiths (jon_p_griffiths@yahoo.com)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.sufficientlysecure.ical.ui;

import org.sufficientlysecure.ical.Settings;
import org.sufficientlysecure.ical.util.Log;

import android.content.SharedPreferences;

public class SettingsActivity extends SettingsActivityBase {

    @Override
    public void onSharedPreferenceChanged(SharedPreferences prefs, String key) {
        super.onSharedPreferenceChanged(prefs, key);

        if (key.equals(Settings.PREF_SAVE_PASSWORDS)) {
            // Blank any stored password when this setting is changed
            new Settings(prefs).putString(Settings.PREF_LASTURLPASSWORD, "");
        } else if (key.equals(Settings.PREF_DEBUG_LOGGING)) {
            // Enable or disable debug logging in release builds
            Log.setIsUserEnabled(new Settings(prefs).getDebugLogging());
        }
    }

    public SettingsActivity() {
        super();
    }
}