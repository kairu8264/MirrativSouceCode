package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ b f27046w = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        compare = LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
        return compare;
    }
}
