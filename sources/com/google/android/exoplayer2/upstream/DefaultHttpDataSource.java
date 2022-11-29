package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import kk.k;

/* loaded from: classes3.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    private static final Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesSkipped;
    private long bytesToRead;
    private long bytesToSkip;
    private final int connectTimeoutMillis;
    private HttpURLConnection connection;
    private k<String> contentTypePredicate;
    private DataSpec dataSpec;
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    private InputStream inputStream;
    private boolean opened;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    private byte[] skipBuffer;
    private final String userAgent;

    /* loaded from: classes3.dex */
    public static final class Factory implements HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;
        private k<String> contentTypePredicate;
        private TransferListener transferListener;
        private String userAgent;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @Deprecated
        public final HttpDataSource.RequestProperties getDefaultRequestProperties() {
            return this.defaultRequestProperties;
        }

        public Factory setAllowCrossProtocolRedirects(boolean z10) {
            this.allowCrossProtocolRedirects = z10;
            return this;
        }

        public Factory setConnectTimeoutMs(int i10) {
            this.connectTimeoutMs = i10;
            return this;
        }

        public Factory setContentTypePredicate(k<String> kVar) {
            this.contentTypePredicate = kVar;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        public Factory setReadTimeoutMs(int i10) {
            this.readTimeoutMs = i10;
            return this;
        }

        public Factory setTransferListener(TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public Factory setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.defaultRequestProperties, this.contentTypePredicate);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e(TAG, "Unexpected error while disconnecting", e10);
            }
            this.connection = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long getContentLength(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L2c
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L2e
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.exoplayer2.util.Log.e(r3, r1)
        L2c:
            r4 = -1
        L2e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto Lb0
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.upstream.DefaultHttpDataSource.CONTENT_RANGE_HEADER
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto Lb0
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L99
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L99
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L99
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L99
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L70
            r4 = r6
            goto Lb0
        L70:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto Lb0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L99
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch: java.lang.NumberFormatException -> L99
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L99
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L99
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r0 = r1.toString()     // Catch: java.lang.NumberFormatException -> L99
            com.google.android.exoplayer2.util.Log.w(r3, r0)     // Catch: java.lang.NumberFormatException -> L99
            long r0 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L99
            r4 = r0
            goto Lb0
        L99:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            com.google.android.exoplayer2.util.Log.e(r3, r10)
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultHttpDataSource.getContentLength(java.net.HttpURLConnection):long");
    }

    private static URL handleRedirect(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
        }
        throw new ProtocolException("Null location redirect");
    }

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        HttpURLConnection makeConnection;
        DataSpec dataSpec2 = dataSpec;
        URL url = new URL(dataSpec2.uri.toString());
        int i10 = dataSpec2.httpMethod;
        byte[] bArr = dataSpec2.httpBody;
        long j10 = dataSpec2.position;
        long j11 = dataSpec2.length;
        int i11 = 1;
        boolean isFlagSet = dataSpec2.isFlagSet(1);
        if (this.allowCrossProtocolRedirects) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 <= 20) {
                    byte[] bArr2 = bArr;
                    int i14 = i11;
                    long j12 = j11;
                    long j13 = j10;
                    makeConnection = makeConnection(url, i10, bArr, j10, j11, isFlagSet, false, dataSpec2.httpRequestHeaders);
                    int responseCode = makeConnection.getResponseCode();
                    String headerField = makeConnection.getHeaderField("Location");
                    if ((i10 == i14 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == HTTP_STATUS_TEMPORARY_REDIRECT || responseCode == HTTP_STATUS_PERMANENT_REDIRECT)) {
                        makeConnection.disconnect();
                        url = handleRedirect(url, headerField);
                    } else if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    } else {
                        makeConnection.disconnect();
                        url = handleRedirect(url, headerField);
                        bArr2 = null;
                        i10 = i14;
                    }
                    i12 = i13;
                    i11 = i14;
                    bArr = bArr2;
                    j11 = j12;
                    j10 = j13;
                    dataSpec2 = dataSpec;
                } else {
                    throw new NoRouteToHostException("Too many redirects: " + i13);
                }
            }
            return makeConnection;
        }
        return makeConnection(url, i10, bArr, j10, j11, isFlagSet, true, dataSpec2.httpRequestHeaders);
    }

    private static void maybeTerminateInputStream(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = Util.SDK_INT) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) Assertions.checkNotNull(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    private int readInternal(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.bytesToRead;
        if (j10 != -1) {
            long j11 = j10 - this.bytesRead;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.bytesToRead == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.bytesRead += read;
        bytesTransferred(read);
        return read;
    }

    private void skipInternal() throws IOException {
        if (this.bytesSkipped == this.bytesToSkip) {
            return;
        }
        if (this.skipBuffer == null) {
            this.skipBuffer = new byte[4096];
        }
        while (true) {
            long j10 = this.bytesSkipped;
            long j11 = this.bytesToSkip;
            if (j10 == j11) {
                return;
            }
            int read = ((InputStream) Util.castNonNull(this.inputStream)).read(this.skipBuffer, 0, (int) Math.min(j11 - j10, this.skipBuffer.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read != -1) {
                this.bytesSkipped += read;
                bytesTransferred(read);
            } else {
                throw new EOFException();
            }
        }
    }

    public final long bytesRead() {
        return this.bytesRead;
    }

    public final long bytesRemaining() {
        long j10 = this.bytesToRead;
        return j10 == -1 ? j10 : j10 - this.bytesRead;
    }

    public final long bytesSkipped() {
        return this.bytesSkipped;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                maybeTerminateInputStream(this.connection, bytesRemaining());
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource.HttpDataSourceException(e10, (DataSpec) Util.castNonNull(this.dataSpec), 3);
                }
            }
        } finally {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int getResponseCode() {
        int i10;
        if (this.connection == null || (i10 = this.responseCode) <= 0) {
            return -1;
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] bArr;
        this.dataSpec = dataSpec;
        long j10 = 0;
        this.bytesRead = 0L;
        this.bytesSkipped = 0L;
        transferInitializing(dataSpec);
        try {
            HttpURLConnection makeConnection = makeConnection(dataSpec);
            this.connection = makeConnection;
            try {
                this.responseCode = makeConnection.getResponseCode();
                String responseMessage = makeConnection.getResponseMessage();
                int i10 = this.responseCode;
                if (i10 >= 200 && i10 <= 299) {
                    String contentType = makeConnection.getContentType();
                    k<String> kVar = this.contentTypePredicate;
                    if (kVar != null && !kVar.apply(contentType)) {
                        closeConnectionQuietly();
                        throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
                    }
                    if (this.responseCode == 200) {
                        long j11 = dataSpec.position;
                        if (j11 != 0) {
                            j10 = j11;
                        }
                    }
                    this.bytesToSkip = j10;
                    boolean isCompressed = isCompressed(makeConnection);
                    if (!isCompressed) {
                        long j12 = dataSpec.length;
                        if (j12 != -1) {
                            this.bytesToRead = j12;
                        } else {
                            long contentLength = getContentLength(makeConnection);
                            this.bytesToRead = contentLength != -1 ? contentLength - this.bytesToSkip : -1L;
                        }
                    } else {
                        this.bytesToRead = dataSpec.length;
                    }
                    try {
                        this.inputStream = makeConnection.getInputStream();
                        if (isCompressed) {
                            this.inputStream = new GZIPInputStream(this.inputStream);
                        }
                        this.opened = true;
                        transferStarted(dataSpec);
                        return this.bytesToRead;
                    } catch (IOException e10) {
                        closeConnectionQuietly();
                        throw new HttpDataSource.HttpDataSourceException(e10, dataSpec, 1);
                    }
                }
                Map<String, List<String>> headerFields = makeConnection.getHeaderFields();
                InputStream errorStream = makeConnection.getErrorStream();
                try {
                    bArr = errorStream != null ? Util.toByteArray(errorStream) : Util.EMPTY_BYTE_ARRAY;
                } catch (IOException unused) {
                    bArr = Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr2 = bArr;
                closeConnectionQuietly();
                HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, headerFields, dataSpec, bArr2);
                if (this.responseCode == 416) {
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                }
                throw invalidResponseCodeException;
            } catch (IOException e11) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect", e11, dataSpec, 1);
            }
        } catch (IOException e12) {
            String message = e12.getMessage();
            if (message != null && Util.toLowerInvariant(message).matches("cleartext http traffic.*not permitted.*")) {
                throw new HttpDataSource.CleartextNotPermittedException(e12, dataSpec);
            }
            throw new HttpDataSource.HttpDataSourceException("Unable to connect", e12, dataSpec, 1);
        }
    }

    public HttpURLConnection openConnection(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource.HttpDataSourceException {
        try {
            skipInternal();
            return readInternal(bArr, i10, i11);
        } catch (IOException e10) {
            throw new HttpDataSource.HttpDataSourceException(e10, (DataSpec) Util.castNonNull(this.dataSpec), 2);
        }
    }

    @Deprecated
    public void setContentTypePredicate(k<String> kVar) {
        this.contentTypePredicate = kVar;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    @Deprecated
    public DefaultHttpDataSource() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(String str, int i10, int i11) {
        this(str, i10, i11, false, null);
    }

    @Deprecated
    public DefaultHttpDataSource(String str, int i10, int i11, boolean z10, HttpDataSource.RequestProperties requestProperties) {
        this(str, i10, i11, z10, requestProperties, null);
    }

    private DefaultHttpDataSource(String str, int i10, int i11, boolean z10, HttpDataSource.RequestProperties requestProperties, k<String> kVar) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i10;
        this.readTimeoutMillis = i11;
        this.allowCrossProtocolRedirects = z10;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = kVar;
        this.requestProperties = new HttpDataSource.RequestProperties();
    }

    private HttpURLConnection makeConnection(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection openConnection = openConnection(url);
        openConnection.setConnectTimeout(this.connectTimeoutMillis);
        openConnection.setReadTimeout(this.readTimeoutMillis);
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.getSnapshot());
        }
        hashMap.putAll(this.requestProperties.getSnapshot());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = "bytes=" + j10 + "-";
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            openConnection.setRequestProperty("Range", str);
        }
        String str2 = this.userAgent;
        if (str2 != null) {
            openConnection.setRequestProperty("User-Agent", str2);
        }
        openConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        openConnection.setInstanceFollowRedirects(z11);
        openConnection.setDoOutput(bArr != null);
        openConnection.setRequestMethod(DataSpec.getStringForHttpMethod(i10));
        if (bArr != null) {
            openConnection.setFixedLengthStreamingMode(bArr.length);
            openConnection.connect();
            OutputStream outputStream = openConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            openConnection.connect();
        }
        return openConnection;
    }
}
