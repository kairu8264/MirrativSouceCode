package com.google.android.exoplayer2.offline;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface Downloader {

    /* loaded from: classes3.dex */
    public interface ProgressListener {
        void onProgress(long j10, long j11, float f10);
    }

    void cancel();

    void download(ProgressListener progressListener) throws IOException, InterruptedException;

    void remove();
}
