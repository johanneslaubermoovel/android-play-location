/**
 * Copyright 2014 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.location.sample.geofencing;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Constants used in this sample.
 */
public final class Constants {

    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    public static final String LOG_KEY = PACKAGE_NAME + ".LOG_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 80;

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> BAY_AREA_LANDMARKS = new HashMap<String, LatLng>();
    static {
        // San Francisco International Airport.48.764444, 9.167813
        BAY_AREA_LANDMARKS.put("Marienplatz", new LatLng(48.764444, 9.167813));
        BAY_AREA_LANDMARKS.put("Moovel Office", new LatLng(48.764348, 9.169817));
        BAY_AREA_LANDMARKS.put("Österreichischer Platz", new LatLng(48.770726, 9.175798));
        BAY_AREA_LANDMARKS.put("Rotebühlplatz / Stadtmitte", new LatLng(48.774877, 9.172273));
        BAY_AREA_LANDMARKS.put("Rathaus", new LatLng(48.773766, 9.179878));
        BAY_AREA_LANDMARKS.put("Berliner Platz", new LatLng(48.777472, 9.168287));
        BAY_AREA_LANDMARKS.put("Schloss-/Johannesstraße", new LatLng(48.776551, 9.162597));
        BAY_AREA_LANDMARKS.put("Schwab-/Bebelstraße", new LatLng(48.775003, 9.155083));
        BAY_AREA_LANDMARKS.put("Arndt-/Spittastraße", new LatLng(48.774905, 9.151334));
        BAY_AREA_LANDMARKS.put("Vogelsang", new LatLng(48.774712, 9.145974));
        BAY_AREA_LANDMARKS.put("Herderplatz", new LatLng(48.772306, 9.141442));
        BAY_AREA_LANDMARKS.put("Lindpaintnerstraße", new LatLng(48.774102, 9.134254));
        BAY_AREA_LANDMARKS.put("Beethovenstraße", new LatLng(48.777151, 9.133191));
        BAY_AREA_LANDMARKS.put("Millöckerstraße", new LatLng(48.779446, 9.132111));
        BAY_AREA_LANDMARKS.put("Eltinger Straße", new LatLng(48.779262, 9.126634));
        BAY_AREA_LANDMARKS.put("Botnang", new LatLng(48.778690, 9.122091));

    }
}
