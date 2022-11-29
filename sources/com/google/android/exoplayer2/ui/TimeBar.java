package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public interface TimeBar {

    /* loaded from: classes3.dex */
    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long j10);

        void onScrubStart(TimeBar timeBar, long j10);

        void onScrubStop(TimeBar timeBar, long j10, boolean z10);
    }

    void addListener(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void removeListener(OnScrubListener onScrubListener);

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i10);

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setKeyCountIncrement(int i10);

    void setKeyTimeIncrement(long j10);

    void setPosition(long j10);
}
