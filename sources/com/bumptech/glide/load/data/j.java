package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements d<InputStream> {
    public static final b C = new a();
    public InputStream A;
    public volatile boolean B;

    /* renamed from: w  reason: collision with root package name */
    public final s7.g f20139w;

    /* renamed from: x  reason: collision with root package name */
    public final int f20140x;

    /* renamed from: y  reason: collision with root package name */
    public final b f20141y;

    /* renamed from: z  reason: collision with root package name */
    public HttpURLConnection f20142z;

    /* loaded from: classes.dex */
    public static class a implements b {
        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(s7.g gVar, int i10) {
        this(gVar, i10, C);
    }

    public static int e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
                return -1;
            }
            return -1;
        }
    }

    public static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    public static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.A;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f20142z;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f20142z = null;
    }

    public final HttpURLConnection c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a10 = this.f20141y.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a10.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a10.setConnectTimeout(this.f20140x);
            a10.setReadTimeout(this.f20140x);
            a10.setUseCaches(false);
            a10.setDoInput(true);
            a10.setInstanceFollowRedirects(false);
            return a10;
        } catch (IOException e10) {
            throw new HttpException("URL.openConnection threw", 0, e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.B = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public m7.a d() {
        return m7.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(com.bumptech.glide.h hVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        long b10 = i8.f.b();
        try {
            try {
                aVar.e(j(this.f20139w.i(), 0, null, this.f20139w.e()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
                sb2 = new StringBuilder();
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(i8.f.a(b10));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + i8.f.a(b10));
            }
            throw th2;
        }
    }

    public final InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.A = i8.c.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.A = httpURLConnection.getInputStream();
            }
            return this.A;
        } catch (IOException e10) {
            throw new HttpException("Failed to obtain InputStream", e(httpURLConnection), e10);
        }
    }

    public final InputStream j(URL url, int i10, URL url2, Map<String, String> map) throws HttpException {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c10 = c(url, map);
            this.f20142z = c10;
            try {
                c10.connect();
                this.A = this.f20142z.getInputStream();
                if (this.B) {
                    return null;
                }
                int e10 = e(this.f20142z);
                if (h(e10)) {
                    return g(this.f20142z);
                }
                if (!i(e10)) {
                    if (e10 == -1) {
                        throw new HttpException(e10);
                    }
                    try {
                        throw new HttpException(this.f20142z.getResponseMessage(), e10);
                    } catch (IOException e11) {
                        throw new HttpException("Failed to get a response message", e10, e11);
                    }
                }
                String headerField = this.f20142z.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    try {
                        URL url3 = new URL(url, headerField);
                        b();
                        return j(url3, i10 + 1, url, map);
                    } catch (MalformedURLException e12) {
                        throw new HttpException("Bad redirect url: " + headerField, e10, e12);
                    }
                }
                throw new HttpException("Received empty or null redirect url", e10);
            } catch (IOException e13) {
                throw new HttpException("Failed to connect or obtain data", e(this.f20142z), e13);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    public j(s7.g gVar, int i10, b bVar) {
        this.f20139w = gVar;
        this.f20140x = i10;
        this.f20141y = bVar;
    }
}
