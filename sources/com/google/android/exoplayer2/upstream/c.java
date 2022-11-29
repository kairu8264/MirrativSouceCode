package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.DataSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements DataSource.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f27043a = new c();

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public final DataSource createDataSource() {
        return DummyDataSource.b();
    }
}
