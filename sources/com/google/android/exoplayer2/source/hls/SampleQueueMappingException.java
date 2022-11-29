package com.google.android.exoplayer2.source.hls;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + TopicConstant.SEPARATOR);
    }
}
