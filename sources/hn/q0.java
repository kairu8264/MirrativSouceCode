package hn;

import androidx.appcompat.widget.ListPopupWindow;
import java.io.IOException;
import java.net.URI;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public class q0 {

    /* renamed from: c  reason: collision with root package name */
    public int f36254c;

    /* renamed from: d  reason: collision with root package name */
    public int f36255d;

    /* renamed from: h  reason: collision with root package name */
    public String[] f36259h;

    /* renamed from: e  reason: collision with root package name */
    public j f36256e = j.BOTH;

    /* renamed from: f  reason: collision with root package name */
    public int f36257f = ListPopupWindow.EXPAND_LIST_TIMEOUT;

    /* renamed from: g  reason: collision with root package name */
    public boolean f36258g = true;

    /* renamed from: a  reason: collision with root package name */
    public final h0 f36252a = new h0();

    /* renamed from: b  reason: collision with root package name */
    public final d0 f36253b = new d0(this);

    public static String h(String str) {
        if (str == null || str.length() == 0) {
            return "/";
        }
        if (str.startsWith("/")) {
            return str;
        }
        return "/" + str;
    }

    public static int i(int i10, boolean z10) {
        return i10 >= 0 ? i10 : z10 ? 443 : 80;
    }

    public static boolean k(String str) {
        if (str != null && str.length() != 0) {
            if ("wss".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str)) {
                return true;
            }
            if ("ws".equalsIgnoreCase(str) || "http".equalsIgnoreCase(str)) {
                return false;
            }
            throw new IllegalArgumentException("Bad scheme: " + str);
        }
        throw new IllegalArgumentException("The scheme part is empty.");
    }

    public final g0 a(String str, int i10, boolean z10, int i11) {
        return new g0(this.f36252a.a(z10), new a(str, i10), i11, this.f36259h, this.f36255d).h(this.f36256e, this.f36257f).j(this.f36258g);
    }

    public final g0 b(String str, int i10, boolean z10, int i11) {
        int i12 = i(this.f36253b.e(), this.f36253b.g());
        return new g0(this.f36253b.i(), new a(this.f36253b.b(), i12), i11, this.f36255d, this.f36253b.f(), new c0(str, i10, this.f36253b), z10 ? (SSLSocketFactory) this.f36252a.a(z10) : null, str, i10).h(this.f36256e, this.f36257f).j(this.f36258g);
    }

    public final g0 c(String str, int i10, boolean z10, int i11) throws IOException {
        int i12 = i(i10, z10);
        if (this.f36253b.b() != null) {
            return b(str, i12, z10, i11);
        }
        return a(str, i12, z10, i11);
    }

    public final n0 d(String str, String str2, String str3, int i10, String str4, String str5, int i11) throws IOException {
        boolean k10 = k(str);
        if (str3 != null && str3.length() != 0) {
            return g(k10, str2, str3, i10, h(str4), str5, c(str3, i10, k10, i11));
        }
        throw new IllegalArgumentException("The host part is empty.");
    }

    public n0 e(URI uri) throws IOException {
        return f(uri, j());
    }

    public n0 f(URI uri, int i10) throws IOException {
        if (uri != null) {
            if (i10 >= 0) {
                return d(uri.getScheme(), uri.getUserInfo(), t.a(uri), uri.getPort(), uri.getRawPath(), uri.getRawQuery(), i10);
            }
            throw new IllegalArgumentException("The given timeout value is negative.");
        }
        throw new IllegalArgumentException("The given URI is null.");
    }

    public final n0 g(boolean z10, String str, String str2, int i10, String str3, String str4, g0 g0Var) {
        if (i10 >= 0) {
            str2 = str2 + ":" + i10;
        }
        String str5 = str2;
        if (str4 != null) {
            str3 = str3 + "?" + str4;
        }
        return new n0(this, z10, str, str5, str3, g0Var);
    }

    public int j() {
        return this.f36254c;
    }
}
