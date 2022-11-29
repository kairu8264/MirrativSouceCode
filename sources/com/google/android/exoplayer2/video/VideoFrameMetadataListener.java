package com.google.android.exoplayer2.video;

import android.media.MediaFormat;
import com.google.android.exoplayer2.Format;

/* loaded from: classes3.dex */
public interface VideoFrameMetadataListener {
    void onVideoFrameAboutToBeRendered(long j10, long j11, Format format, MediaFormat mediaFormat);
}
