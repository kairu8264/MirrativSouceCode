package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.SlidingPercentile;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ d f27053w = new d();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$1;
        lambda$static$1 = SlidingPercentile.lambda$static$1((SlidingPercentile.Sample) obj, (SlidingPercentile.Sample) obj2);
        return lambda$static$1;
    }
}
