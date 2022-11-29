package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public interface TransferListener {
    void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z10, int i10);

    void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z10);

    void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z10);

    void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z10);
}
