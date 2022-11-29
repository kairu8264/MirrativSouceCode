package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public interface SequenceableLoader {

    /* loaded from: classes3.dex */
    public interface Callback<T extends SequenceableLoader> {
        void onContinueLoadingRequested(T t10);
    }

    boolean continueLoading(long j10);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j10);
}
