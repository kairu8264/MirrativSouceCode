package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.MutableFlags;

/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements ListenerSet.IterationFinishedEvent {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ y0 f26781a = new y0();

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public final void invoke(Object obj, MutableFlags mutableFlags) {
        AnalyticsCollector.lambda$new$0((AnalyticsListener) obj, (AnalyticsListener.Events) mutableFlags);
    }
}
