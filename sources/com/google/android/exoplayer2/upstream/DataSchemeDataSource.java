package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";
    private byte[] data;
    private DataSpec dataSpec;
    private int endPosition;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        this.readPosition = (int) dataSpec.position;
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] split = Util.split(uri.getSchemeSpecificPart(), ",");
            if (split.length == 2) {
                String str = split[1];
                if (split[0].contains(";base64")) {
                    try {
                        this.data = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e10) {
                        throw new ParserException("Error while parsing Base64 encoded string: " + str, e10);
                    }
                } else {
                    this.data = Util.getUtf8Bytes(URLDecoder.decode(str, kk.d.f38837a.name()));
                }
                long j10 = dataSpec.length;
                int length = j10 != -1 ? ((int) j10) + this.readPosition : this.data.length;
                this.endPosition = length;
                if (length <= this.data.length && this.readPosition <= length) {
                    transferStarted(dataSpec);
                    return this.endPosition - this.readPosition;
                }
                this.data = null;
                throw new DataSourceException(0);
            }
            throw new ParserException("Unexpected URI format: " + uri);
        }
        throw new ParserException("Unsupported scheme: " + scheme);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.endPosition - this.readPosition;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(Util.castNonNull(this.data), this.readPosition, bArr, i10, min);
        this.readPosition += min;
        bytesTransferred(min);
        return min;
    }
}
