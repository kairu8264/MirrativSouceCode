package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface LoadErrorHandlingPolicy {

    /* loaded from: classes3.dex */
    public static final class LoadErrorInfo {
        public final int errorCount;
        public final IOException exception;
        public final LoadEventInfo loadEventInfo;
        public final MediaLoadData mediaLoadData;

        public LoadErrorInfo(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, int i10) {
            this.loadEventInfo = loadEventInfo;
            this.mediaLoadData = mediaLoadData;
            this.exception = iOException;
            this.errorCount = i10;
        }
    }

    @Deprecated
    default long getBlacklistDurationMsFor(int i10, long j10, IOException iOException, int i11) {
        throw new UnsupportedOperationException();
    }

    int getMinimumLoadableRetryCount(int i10);

    @Deprecated
    default long getRetryDelayMsFor(int i10, long j10, IOException iOException, int i11) {
        throw new UnsupportedOperationException();
    }

    default void onLoadTaskConcluded(long j10) {
    }

    default long getBlacklistDurationMsFor(LoadErrorInfo loadErrorInfo) {
        return getBlacklistDurationMsFor(loadErrorInfo.mediaLoadData.dataType, loadErrorInfo.loadEventInfo.loadDurationMs, loadErrorInfo.exception, loadErrorInfo.errorCount);
    }

    default long getRetryDelayMsFor(LoadErrorInfo loadErrorInfo) {
        return getRetryDelayMsFor(loadErrorInfo.mediaLoadData.dataType, loadErrorInfo.loadEventInfo.loadDurationMs, loadErrorInfo.exception, loadErrorInfo.errorCount);
    }
}
