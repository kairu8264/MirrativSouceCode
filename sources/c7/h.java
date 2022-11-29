package c7;

import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import s6.l;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final g f18853a;

    /* renamed from: b  reason: collision with root package name */
    public final f f18854b;

    public h(g gVar, f fVar) {
        this.f18853a = gVar;
        this.f18854b = fVar;
    }

    public final s6.d a(String str, String str2) {
        Pair<c, InputStream> a10;
        l<s6.d> i10;
        if (str2 == null || (a10 = this.f18853a.a(str)) == null) {
            return null;
        }
        c cVar = (c) a10.first;
        InputStream inputStream = (InputStream) a10.second;
        if (cVar == c.ZIP) {
            i10 = s6.e.v(new ZipInputStream(inputStream), str);
        } else {
            i10 = s6.e.i(inputStream, str);
        }
        if (i10.b() != null) {
            return i10.b();
        }
        return null;
    }

    public final l<s6.d> b(String str, String str2) {
        f7.d.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d a10 = this.f18854b.a(str);
                if (a10.u0()) {
                    l<s6.d> d10 = d(str, a10.f0(), a10.Z(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(d10.b() != null);
                    f7.d.a(sb2.toString());
                    try {
                        a10.close();
                    } catch (IOException e10) {
                        f7.d.d("LottieFetchResult close failed ", e10);
                    }
                    return d10;
                }
                l<s6.d> lVar = new l<>(new IllegalArgumentException(a10.n1()));
                try {
                    a10.close();
                } catch (IOException e11) {
                    f7.d.d("LottieFetchResult close failed ", e11);
                }
                return lVar;
            } catch (Exception e12) {
                l<s6.d> lVar2 = new l<>(e12);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e13) {
                        f7.d.d("LottieFetchResult close failed ", e13);
                    }
                }
                return lVar2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e14) {
                    f7.d.d("LottieFetchResult close failed ", e14);
                }
            }
            throw th2;
        }
    }

    public l<s6.d> c(String str, String str2) {
        s6.d a10 = a(str, str2);
        if (a10 != null) {
            return new l<>(a10);
        }
        f7.d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }

    public final l<s6.d> d(String str, InputStream inputStream, String str2, String str3) throws IOException {
        c cVar;
        l<s6.d> f10;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            f7.d.a("Received json response.");
            cVar = c.JSON;
            f10 = e(str, inputStream, str3);
        } else {
            f7.d.a("Handling zip response.");
            cVar = c.ZIP;
            f10 = f(str, inputStream, str3);
        }
        if (str3 != null && f10.b() != null) {
            this.f18853a.e(str, cVar);
        }
        return f10;
    }

    public final l<s6.d> e(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return s6.e.i(inputStream, null);
        }
        return s6.e.i(new FileInputStream(this.f18853a.f(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    public final l<s6.d> f(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return s6.e.v(new ZipInputStream(inputStream), null);
        }
        return s6.e.v(new ZipInputStream(new FileInputStream(this.f18853a.f(str, inputStream, c.ZIP))), str);
    }
}
