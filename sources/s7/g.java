package s7;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class g implements m7.e {

    /* renamed from: b  reason: collision with root package name */
    public final h f52236b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f52237c;

    /* renamed from: d  reason: collision with root package name */
    public final String f52238d;

    /* renamed from: e  reason: collision with root package name */
    public String f52239e;

    /* renamed from: f  reason: collision with root package name */
    public URL f52240f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f52241g;

    /* renamed from: h  reason: collision with root package name */
    public int f52242h;

    public g(URL url) {
        this(url, h.f52244b);
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f52238d;
        return str != null ? str : ((URL) i8.j.d(this.f52237c)).toString();
    }

    public final byte[] d() {
        if (this.f52241g == null) {
            this.f52241g = c().getBytes(m7.e.f40610a);
        }
        return this.f52241g;
    }

    public Map<String, String> e() {
        return this.f52236b.a();
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return c().equals(gVar.c()) && this.f52236b.equals(gVar.f52236b);
        }
        return false;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f52239e)) {
            String str = this.f52238d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) i8.j.d(this.f52237c)).toString();
            }
            this.f52239e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f52239e;
    }

    public final URL g() throws MalformedURLException {
        if (this.f52240f == null) {
            this.f52240f = new URL(f());
        }
        return this.f52240f;
    }

    public String h() {
        return f();
    }

    @Override // m7.e
    public int hashCode() {
        if (this.f52242h == 0) {
            int hashCode = c().hashCode();
            this.f52242h = hashCode;
            this.f52242h = (hashCode * 31) + this.f52236b.hashCode();
        }
        return this.f52242h;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.f52244b);
    }

    public g(URL url, h hVar) {
        this.f52237c = (URL) i8.j.d(url);
        this.f52238d = null;
        this.f52236b = (h) i8.j.d(hVar);
    }

    public g(String str, h hVar) {
        this.f52237c = null;
        this.f52238d = i8.j.b(str);
        this.f52236b = (h) i8.j.d(hVar);
    }
}
