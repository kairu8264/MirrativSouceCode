package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;
    @Deprecated
    public final long absoluteStreamPosition;
    public final Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private Map<String, String> httpRequestHeaders;
        private String key;
        private long length;
        private long position;
        private Uri uri;
        private long uriPositionOffset;

        public DataSpec build() {
            Assertions.checkStateNotNull(this.uri, "The uri must be set.");
            return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }

        public Builder setCustomData(Object obj) {
            this.customData = obj;
            return this;
        }

        public Builder setFlags(int i10) {
            this.flags = i10;
            return this;
        }

        public Builder setHttpBody(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public Builder setHttpMethod(int i10) {
            this.httpMethod = i10;
            return this;
        }

        public Builder setHttpRequestHeaders(Map<String, String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setLength(long j10) {
            this.length = j10;
            return this;
        }

        public Builder setPosition(long j10) {
            this.position = j10;
            return this;
        }

        public Builder setUri(String str) {
            this.uri = Uri.parse(str);
            return this;
        }

        public Builder setUriPositionOffset(long j10) {
            this.uriPositionOffset = j10;
            return this;
        }

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = Collections.emptyMap();
            this.length = -1L;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        private Builder(DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Flags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface HttpMethod {
    }

    public static String getStringForHttpMethod(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i10) {
        return (this.flags & i10) == i10;
    }

    public DataSpec subrange(long j10) {
        long j11 = this.length;
        return subrange(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public String toString() {
        return "DataSpec[" + getHttpMethodString() + " " + this.uri + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + "]";
    }

    public DataSpec withAdditionalHeaders(Map<String, String> map) {
        HashMap hashMap = new HashMap(this.httpRequestHeaders);
        hashMap.putAll(map);
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, hashMap, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withRequestHeaders(Map<String, String> map) {
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec subrange(long j10, long j11) {
        return (j10 == 0 && this.length == j11) ? this : new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j10, j11, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    @Deprecated
    public DataSpec(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    @Deprecated
    public DataSpec(Uri uri, long j10, long j11, String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    @Deprecated
    public DataSpec(Uri uri, long j10, long j11, String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    @Deprecated
    public DataSpec(Uri uri, long j10, long j11, String str, int i10, Map<String, String> map) {
        this(uri, 1, null, j10, j10, j11, str, i10, map);
    }

    @Deprecated
    public DataSpec(Uri uri, long j10, long j11, long j12, String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    @Deprecated
    public DataSpec(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, bArr != null ? 2 : 1, bArr, j10, j11, j12, str, i10);
    }

    @Deprecated
    public DataSpec(Uri uri, int i10, byte[] bArr, long j10, long j11, long j12, String str, int i11) {
        this(uri, i10, bArr, j10, j11, j12, str, i11, Collections.emptyMap());
    }

    @Deprecated
    public DataSpec(Uri uri, int i10, byte[] bArr, long j10, long j11, long j12, String str, int i11, Map<String, String> map) {
        this(uri, j10 - j11, i10, bArr, map, j11, j12, str, i11, null);
    }

    private DataSpec(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        Assertions.checkArgument(j13 >= 0);
        Assertions.checkArgument(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.uri = uri;
        this.uriPositionOffset = j10;
        this.httpMethod = i10;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = Collections.unmodifiableMap(new HashMap(map));
        this.position = j11;
        this.absoluteStreamPosition = j13;
        this.length = j12;
        this.key = str;
        this.flags = i11;
        this.customData = obj;
    }
}
