package mm;

import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rm.k;
import sm.h;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    public static final lm.a f41209f = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final d f41210a;

    /* renamed from: b  reason: collision with root package name */
    public final h f41211b;

    /* renamed from: e  reason: collision with root package name */
    public boolean f41214e;

    /* renamed from: d  reason: collision with root package name */
    public boolean f41213d = false;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f41212c = new ConcurrentHashMap();

    public c(String str, String str2, k kVar, h hVar) {
        this.f41214e = false;
        this.f41211b = hVar;
        d l10 = d.c(kVar).w(str).l(str2);
        this.f41210a = l10;
        l10.n();
        if (im.a.f().I()) {
            return;
        }
        f41209f.g("HttpMetric feature is disabled. URL %s", str);
        this.f41214e = true;
    }

    public final void a(String str, String str2) {
        if (this.f41213d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        }
        if (str != null && str2 != null) {
            if (!this.f41212c.containsKey(str) && this.f41212c.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            String d10 = nm.e.d(new AbstractMap.SimpleEntry(str, str2));
            if (d10 != null) {
                throw new IllegalArgumentException(d10);
            }
            return;
        }
        throw new IllegalArgumentException("Attribute must not have null key or value.");
    }

    public void b(String str, String str2) {
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            a(str, str2);
            f41209f.b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f41210a.f());
            z10 = true;
        } catch (Exception e10) {
            f41209f.d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f41212c.put(str, str2);
        }
    }

    public void c(int i10) {
        this.f41210a.m(i10);
    }

    public void d(String str) {
        this.f41210a.r(str);
    }

    public void e() {
        this.f41211b.e();
        this.f41210a.q(this.f41211b.d());
    }

    public void f() {
        if (this.f41214e) {
            return;
        }
        this.f41210a.u(this.f41211b.b()).k(this.f41212c).b();
        this.f41213d = true;
    }
}
