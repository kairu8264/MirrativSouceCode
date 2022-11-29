package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements CacheKeyFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f27045a = new a();

    @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
    public final String buildCacheKey(DataSpec dataSpec) {
        String lambda$static$0;
        lambda$static$0 = CacheKeyFactory.lambda$static$0(dataSpec);
        return lambda$static$0;
    }
}
