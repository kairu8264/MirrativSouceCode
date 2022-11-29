package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f26817a = new b();

    @Override // com.google.android.exoplayer2.util.Consumer
    public final void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysLoaded();
    }
}
