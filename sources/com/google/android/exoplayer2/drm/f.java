package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f26821a = new f();

    @Override // com.google.android.exoplayer2.util.Consumer
    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmSessionReleased();
    }
}
