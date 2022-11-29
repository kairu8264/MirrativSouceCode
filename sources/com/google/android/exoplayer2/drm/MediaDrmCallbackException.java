package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final DataSpec dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j10, Throwable th2) {
        super(th2);
        this.dataSpec = dataSpec;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j10;
    }
}
