package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class StatsDataSource implements DataSource {
    private long bytesRead;
    private final DataSource dataSource;
    private Uri lastOpenedUri = Uri.EMPTY;
    private Map<String, List<String>> lastResponseHeaders = Collections.emptyMap();

    public StatsDataSource(DataSource dataSource) {
        this.dataSource = (DataSource) Assertions.checkNotNull(dataSource);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.dataSource.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.dataSource.close();
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    public Uri getLastOpenedUri() {
        return this.lastOpenedUri;
    }

    public Map<String, List<String>> getLastResponseHeaders() {
        return this.lastResponseHeaders;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.dataSource.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.dataSource.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.lastOpenedUri = dataSpec.uri;
        this.lastResponseHeaders = Collections.emptyMap();
        long open = this.dataSource.open(dataSpec);
        this.lastOpenedUri = (Uri) Assertions.checkNotNull(getUri());
        this.lastResponseHeaders = getResponseHeaders();
        return open;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.dataSource.read(bArr, i10, i11);
        if (read != -1) {
            this.bytesRead += read;
        }
        return read;
    }

    public void resetBytesRead() {
        this.bytesRead = 0L;
    }
}
