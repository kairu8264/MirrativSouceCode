package com.dena.mirrorman.unity;

import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public interface MRUnityPlayer {
    void pause();

    void resume();

    void start(FrameLayout frameLayout);

    void startWithAlpha(FrameLayout frameLayout);

    void stop();
}
