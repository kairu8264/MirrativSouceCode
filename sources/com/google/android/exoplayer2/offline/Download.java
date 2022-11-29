package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class Download {
    public static final int FAILURE_REASON_NONE = 0;
    public static final int FAILURE_REASON_UNKNOWN = 1;
    public static final int STATE_COMPLETED = 3;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_FAILED = 4;
    public static final int STATE_QUEUED = 0;
    public static final int STATE_REMOVING = 5;
    public static final int STATE_RESTARTING = 7;
    public static final int STATE_STOPPED = 1;
    public static final int STOP_REASON_NONE = 0;
    public final long contentLength;
    public final int failureReason;
    public final DownloadProgress progress;
    public final DownloadRequest request;
    public final long startTimeMs;
    public final int state;
    public final int stopReason;
    public final long updateTimeMs;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FailureReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface State {
    }

    public Download(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new DownloadProgress());
    }

    public long getBytesDownloaded() {
        return this.progress.bytesDownloaded;
    }

    public float getPercentDownloaded() {
        return this.progress.percentDownloaded;
    }

    public boolean isTerminalState() {
        int i10 = this.state;
        return i10 == 3 || i10 == 4;
    }

    public Download(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, DownloadProgress downloadProgress) {
        Assertions.checkNotNull(downloadProgress);
        boolean z10 = true;
        Assertions.checkArgument((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            Assertions.checkArgument((i10 == 2 || i10 == 0) ? false : z10);
        }
        this.request = downloadRequest;
        this.state = i10;
        this.startTimeMs = j10;
        this.updateTimeMs = j11;
        this.contentLength = j12;
        this.stopReason = i11;
        this.failureReason = i12;
        this.progress = downloadProgress;
    }
}
