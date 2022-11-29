package com.dena.showroom.flvplayback.impl;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class ThreadingPolicy {

    /* loaded from: classes3.dex */
    public interface Actor {
    }

    /* loaded from: classes3.dex */
    public interface Fragile {
    }

    /* loaded from: classes3.dex */
    public interface LooperAware {
        Looper getLooper();
    }

    /* loaded from: classes3.dex */
    public interface Safe {
    }
}
