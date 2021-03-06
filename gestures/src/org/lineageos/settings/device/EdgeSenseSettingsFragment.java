/*
 * Copyright (C) 2016 The CyanogenMod Project
 *               2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lineageos.settings.device;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v14.preference.PreferenceFragment;
import android.util.Log;

import org.lineageos.settings.device.widget.SeekBarPreference;

public class EdgeSenseSettingsFragment extends PreferenceFragment {
public static final String TAG = "GESTURESETTINGS";
    private static final String SEEKBAR_PREFERENCE  = "squeeze_force";
    private SeekBarPreference mSeekBar;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.gesture_panel_edge_sense);
        final ActionBar actionBar = getActivity().getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        mSeekBar = (SeekBarPreference) findPreference(SEEKBAR_PREFERENCE);
        Log.d(TAG, "OnCreatePref" +  mSeekBar );
    }
}
