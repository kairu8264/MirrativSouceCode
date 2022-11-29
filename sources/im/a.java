package im;

import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    public static final lm.a f36870d = lm.a.e();

    /* renamed from: e  reason: collision with root package name */
    public static volatile a f36871e;

    /* renamed from: a  reason: collision with root package name */
    public final RemoteConfigManager f36872a;

    /* renamed from: b  reason: collision with root package name */
    public sm.d f36873b;

    /* renamed from: c  reason: collision with root package name */
    public v f36874c;

    public a(RemoteConfigManager remoteConfigManager, sm.d dVar, v vVar) {
        this.f36872a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f36873b = dVar == null ? new sm.d() : dVar;
        this.f36874c = vVar == null ? v.e() : vVar;
    }

    public static synchronized a f() {
        a aVar;
        synchronized (a.class) {
            if (f36871e == null) {
                f36871e = new a(null, null, null);
            }
            aVar = f36871e;
        }
        return aVar;
    }

    public long A() {
        o e10 = o.e();
        sm.e<Long> n10 = n(e10);
        if (n10.d() && H(n10.c().longValue())) {
            return n10.c().longValue();
        }
        sm.e<Long> u10 = u(e10);
        if (u10.d() && H(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && H(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public float B() {
        p e10 = p.e();
        sm.e<Float> m10 = m(e10);
        if (m10.d()) {
            float floatValue = m10.c().floatValue() / 100.0f;
            if (J(floatValue)) {
                return floatValue;
            }
        }
        sm.e<Float> t10 = t(e10);
        if (t10.d() && J(t10.c().floatValue())) {
            this.f36874c.j(e10.a(), t10.c().floatValue());
            return t10.c().floatValue();
        }
        sm.e<Float> c10 = c(e10);
        if (c10.d() && J(c10.c().floatValue())) {
            return c10.c().floatValue();
        }
        return e10.d().floatValue();
    }

    public long C() {
        q e10 = q.e();
        sm.e<Long> u10 = u(e10);
        if (u10.d() && F(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && F(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long D() {
        r e10 = r.e();
        sm.e<Long> u10 = u(e10);
        if (u10.d() && F(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && F(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public float E() {
        s e10 = s.e();
        sm.e<Float> t10 = t(e10);
        if (t10.d() && J(t10.c().floatValue())) {
            this.f36874c.j(e10.a(), t10.c().floatValue());
            return t10.c().floatValue();
        }
        sm.e<Float> c10 = c(e10);
        if (c10.d() && J(c10.c().floatValue())) {
            return c10.c().floatValue();
        }
        return e10.d().floatValue();
    }

    public final boolean F(long j10) {
        return j10 >= 0;
    }

    public final boolean G(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(gm.a.f33662b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean H(long j10) {
        return j10 >= 0;
    }

    public boolean I() {
        Boolean h10 = h();
        return (h10 == null || h10.booleanValue()) && k();
    }

    public final boolean J(float f10) {
        return 0.0f <= f10 && f10 <= 1.0f;
    }

    public final boolean K(long j10) {
        return j10 > 0;
    }

    public final boolean L(long j10) {
        return j10 > 0;
    }

    public void M(Context context) {
        f36870d.i(sm.k.b(context));
        this.f36874c.i(context);
    }

    public void N(Context context) {
        M(context.getApplicationContext());
    }

    public void O(sm.d dVar) {
        this.f36873b = dVar;
    }

    public String a() {
        String f10;
        d e10 = d.e();
        if (gm.a.f33661a.booleanValue()) {
            return e10.d();
        }
        String c10 = e10.c();
        long longValue = c10 != null ? ((Long) this.f36872a.getRemoteConfigValueOrDefault(c10, -1L)).longValue() : -1L;
        String a10 = e10.a();
        if (d.g(longValue) && (f10 = d.f(longValue)) != null) {
            this.f36874c.l(a10, f10);
            return f10;
        }
        sm.e<String> e11 = e(e10);
        if (e11.d()) {
            return e11.c();
        }
        return e10.d();
    }

    public final sm.e<Boolean> b(t<Boolean> tVar) {
        return this.f36874c.b(tVar.a());
    }

    public final sm.e<Float> c(t<Float> tVar) {
        return this.f36874c.d(tVar.a());
    }

    public final sm.e<Long> d(t<Long> tVar) {
        return this.f36874c.f(tVar.a());
    }

    public final sm.e<String> e(t<String> tVar) {
        return this.f36874c.g(tVar.a());
    }

    public Boolean g() {
        b e10 = b.e();
        sm.e<Boolean> l10 = l(e10);
        if (l10.d()) {
            return l10.c();
        }
        return e10.d();
    }

    public Boolean h() {
        if (g().booleanValue()) {
            return Boolean.FALSE;
        }
        c d10 = c.d();
        sm.e<Boolean> b10 = b(d10);
        if (b10.d()) {
            return b10.c();
        }
        sm.e<Boolean> l10 = l(d10);
        if (l10.d()) {
            return l10.c();
        }
        return null;
    }

    public final boolean i() {
        j e10 = j.e();
        sm.e<Boolean> s10 = s(e10);
        if (s10.d()) {
            if (this.f36872a.isLastFetchFailed()) {
                return false;
            }
            this.f36874c.m(e10.a(), s10.c().booleanValue());
            return s10.c().booleanValue();
        }
        sm.e<Boolean> b10 = b(e10);
        if (b10.d()) {
            return b10.c().booleanValue();
        }
        return e10.d().booleanValue();
    }

    public final boolean j() {
        i e10 = i.e();
        sm.e<String> v10 = v(e10);
        if (v10.d()) {
            this.f36874c.l(e10.a(), v10.c());
            return G(v10.c());
        }
        sm.e<String> e11 = e(e10);
        if (e11.d()) {
            return G(e11.c());
        }
        return G(e10.d());
    }

    public boolean k() {
        return i() && !j();
    }

    public final sm.e<Boolean> l(t<Boolean> tVar) {
        return this.f36873b.b(tVar.b());
    }

    public final sm.e<Float> m(t<Float> tVar) {
        return this.f36873b.c(tVar.b());
    }

    public final sm.e<Long> n(t<Long> tVar) {
        return this.f36873b.e(tVar.b());
    }

    public long o() {
        e e10 = e.e();
        sm.e<Long> u10 = u(e10);
        if (u10.d() && F(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && F(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long p() {
        f e10 = f.e();
        sm.e<Long> u10 = u(e10);
        if (u10.d() && F(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && F(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public float q() {
        g e10 = g.e();
        sm.e<Float> t10 = t(e10);
        if (t10.d() && J(t10.c().floatValue())) {
            this.f36874c.j(e10.a(), t10.c().floatValue());
            return t10.c().floatValue();
        }
        sm.e<Float> c10 = c(e10);
        if (c10.d() && J(c10.c().floatValue())) {
            return c10.c().floatValue();
        }
        return e10.d().floatValue();
    }

    public long r() {
        h e10 = h.e();
        sm.e<Long> u10 = u(e10);
        if (u10.d() && L(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && L(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public final sm.e<Boolean> s(t<Boolean> tVar) {
        return this.f36872a.getBoolean(tVar.c());
    }

    public final sm.e<Float> t(t<Float> tVar) {
        return this.f36872a.getFloat(tVar.c());
    }

    public final sm.e<Long> u(t<Long> tVar) {
        return this.f36872a.getLong(tVar.c());
    }

    public final sm.e<String> v(t<String> tVar) {
        return this.f36872a.getString(tVar.c());
    }

    public long w() {
        k e10 = k.e();
        sm.e<Long> n10 = n(e10);
        if (n10.d() && H(n10.c().longValue())) {
            return n10.c().longValue();
        }
        sm.e<Long> u10 = u(e10);
        if (u10.d() && H(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && H(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long x() {
        l e10 = l.e();
        sm.e<Long> n10 = n(e10);
        if (n10.d() && H(n10.c().longValue())) {
            return n10.c().longValue();
        }
        sm.e<Long> u10 = u(e10);
        if (u10.d() && H(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && H(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long y() {
        m e10 = m.e();
        sm.e<Long> n10 = n(e10);
        if (n10.d() && K(n10.c().longValue())) {
            return n10.c().longValue();
        }
        sm.e<Long> u10 = u(e10);
        if (u10.d() && K(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && K(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long z() {
        n e10 = n.e();
        sm.e<Long> n10 = n(e10);
        if (n10.d() && H(n10.c().longValue())) {
            return n10.c().longValue();
        }
        sm.e<Long> u10 = u(e10);
        if (u10.d() && H(u10.c().longValue())) {
            this.f36874c.k(e10.a(), u10.c().longValue());
            return u10.c().longValue();
        }
        sm.e<Long> d10 = d(e10);
        if (d10.d() && H(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }
}
