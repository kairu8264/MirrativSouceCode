package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.SlidingPercentile;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ c f27052w = new c();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        lambda$static$0 = SlidingPercentile.lambda$static$0((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
        return lambda$static$0;
    }
}
