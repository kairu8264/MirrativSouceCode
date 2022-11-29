package ai;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaat;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f10522d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a  reason: collision with root package name */
    public final String f10523a = "ad.doubleclick.net";

    /* renamed from: b  reason: collision with root package name */
    public final String[] f10524b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c  reason: collision with root package name */
    public final q f10525c;

    @Deprecated
    public u(q qVar) {
        this.f10525c = qVar;
    }

    public final boolean a(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f10524b;
            for (int i10 = 0; i10 < 3; i10++) {
                if (host.endsWith(strArr[i10])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    @Deprecated
    public final q b() {
        return this.f10525c;
    }

    @Deprecated
    public final Uri c(Uri uri, Context context) throws zzaat {
        return g(uri, this.f10525c.d(context));
    }

    @Deprecated
    public final void d(MotionEvent motionEvent) {
        this.f10525c.c(motionEvent);
    }

    @Deprecated
    public final Uri e(Uri uri, Context context, View view, Activity activity) throws zzaat {
        try {
            return g(uri, this.f10525c.f(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzaat("Provided Uri is not in a valid state");
        }
    }

    public final boolean f(Uri uri) {
        if (a(uri)) {
            String[] strArr = f10522d;
            for (int i10 = 0; i10 < 3; i10++) {
                if (uri.getPath().endsWith(strArr[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Uri g(Uri uri, String str) throws zzaat {
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.f10523a)) {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i10 = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i10) + "dc_ms=" + str + ";" + uri2.substring(i10));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new zzaat("Parameter already exists: dc_ms");
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") == null) {
                String uri3 = uri.toString();
                int indexOf3 = uri3.indexOf("&adurl");
                if (indexOf3 == -1) {
                    indexOf3 = uri3.indexOf("?adurl");
                }
                if (indexOf3 != -1) {
                    int i11 = indexOf3 + 1;
                    return Uri.parse(uri3.substring(0, i11) + "ms=" + str + "&" + uri3.substring(i11));
                }
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            throw new zzaat("Query parameter already exists: ms");
        } catch (UnsupportedOperationException unused2) {
            throw new zzaat("Provided Uri is not in a valid state");
        }
    }
}
