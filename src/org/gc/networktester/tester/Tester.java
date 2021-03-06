/*
 *
 * Copyright (C) 2011 Guillaume Cottenceau.
 *
 * Android Network Tester is licensed under the Apache 2.0 license.
 *
 */

package org.gc.networktester.tester;

import org.gc.networktester.activity.MainActivity;

public interface Tester {
    
    /** Called by UI thread. */
    public void setupViews( MainActivity mainActivity );
    
    /** Called by UI thread. */
    public void prepareTest();

    /** Called by UI thread. */
    public boolean isActive();

    /** Called by UI thread. */
    public void setActive( boolean value );
    
    /** Called by background thread. */
    public boolean performTest();
    
    /** Called by UI thread. */
    public void cleanupTests();

    /** Called by UI thread. */
    public void onPause();
    
}
