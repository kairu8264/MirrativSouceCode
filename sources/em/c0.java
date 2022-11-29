package em;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class c0 implements Closeable {

    /* renamed from: w  reason: collision with root package name */
    public final URL f30665w;

    /* renamed from: x  reason: collision with root package name */
    public vi.g<Bitmap> f30666x;

    /* renamed from: y  reason: collision with root package name */
    public volatile InputStream f30667y;

    public c0(URL url) {
        this.f30665w = url;
    }

    public static c0 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new c0(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    public Bitmap a() throws IOException {
        Log.i("FirebaseMessaging", "Starting download of: ".concat(String.valueOf(this.f30665w)));
        byte[] c10 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c10, 0, c10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(String.valueOf(this.f30665w)));
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: ".concat(String.valueOf(this.f30665w)));
    }

    public final byte[] c() throws IOException {
        URLConnection openConnection = this.f30665w.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f30667y = inputStream;
                byte[] b10 = gi.l.b(gi.l.a(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    String valueOf = String.valueOf(this.f30665w);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                    sb2.append("Downloaded ");
                    sb2.append(b10.length);
                    sb2.append(" bytes from ");
                    sb2.append(valueOf);
                    Log.v("FirebaseMessaging", sb2.toString());
                }
                if (b10.length <= 1048576) {
                    return b10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            gi.m.a(this.f30667y);
        } catch (NullPointerException e10) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e10);
        }
    }

    public vi.g<Bitmap> e() {
        return (vi.g) rh.p.i(this.f30666x);
    }

    public void h(Executor executor) {
        this.f30666x = vi.j.c(executor, new Callable() { // from class: em.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.this.a();
            }
        });
    }
}
