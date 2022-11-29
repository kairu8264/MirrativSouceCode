package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements ListenerSet.Event {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ l f26876a = new l();

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ExoPlayerImpl.lambda$release$5((Player.EventListener) obj);
    }
}
