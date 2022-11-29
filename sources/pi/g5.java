package pi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class g5 {
    public long A;
    public long B;
    public String C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a  reason: collision with root package name */
    public final b5 f47844a;

    /* renamed from: b  reason: collision with root package name */
    public final String f47845b;

    /* renamed from: c  reason: collision with root package name */
    public String f47846c;

    /* renamed from: d  reason: collision with root package name */
    public String f47847d;

    /* renamed from: e  reason: collision with root package name */
    public String f47848e;

    /* renamed from: f  reason: collision with root package name */
    public String f47849f;

    /* renamed from: g  reason: collision with root package name */
    public long f47850g;

    /* renamed from: h  reason: collision with root package name */
    public long f47851h;

    /* renamed from: i  reason: collision with root package name */
    public long f47852i;

    /* renamed from: j  reason: collision with root package name */
    public String f47853j;

    /* renamed from: k  reason: collision with root package name */
    public long f47854k;

    /* renamed from: l  reason: collision with root package name */
    public String f47855l;

    /* renamed from: m  reason: collision with root package name */
    public long f47856m;

    /* renamed from: n  reason: collision with root package name */
    public long f47857n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f47858o;

    /* renamed from: p  reason: collision with root package name */
    public long f47859p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f47860q;

    /* renamed from: r  reason: collision with root package name */
    public String f47861r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f47862s;

    /* renamed from: t  reason: collision with root package name */
    public long f47863t;

    /* renamed from: u  reason: collision with root package name */
    public List<String> f47864u;

    /* renamed from: v  reason: collision with root package name */
    public String f47865v;

    /* renamed from: w  reason: collision with root package name */
    public long f47866w;

    /* renamed from: x  reason: collision with root package name */
    public long f47867x;

    /* renamed from: y  reason: collision with root package name */
    public long f47868y;

    /* renamed from: z  reason: collision with root package name */
    public long f47869z;

    public g5(b5 b5Var, String str) {
        rh.p.i(b5Var);
        rh.p.e(str);
        this.f47844a = b5Var;
        this.f47845b = str;
        b5Var.a().f();
    }

    public final long A() {
        this.f47844a.a().f();
        return this.f47859p;
    }

    public final void B(String str) {
        this.f47844a.a().f();
        this.D |= !ia.Z(this.C, str);
        this.C = str;
    }

    public final void C(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47852i != j10;
        this.f47852i = j10;
    }

    public final void D(long j10) {
        rh.p.a(j10 >= 0);
        this.f47844a.a().f();
        this.D |= this.f47850g != j10;
        this.f47850g = j10;
    }

    public final void E(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47851h != j10;
        this.f47851h = j10;
    }

    public final void F(boolean z10) {
        this.f47844a.a().f();
        this.D |= this.f47858o != z10;
        this.f47858o = z10;
    }

    public final void G(Boolean bool) {
        boolean equals;
        this.f47844a.a().f();
        boolean z10 = this.D;
        Boolean bool2 = this.f47862s;
        int i10 = ia.f47957i;
        if (bool2 == null && bool == null) {
            equals = true;
        } else {
            equals = bool2 == null ? false : bool2.equals(bool);
        }
        this.D = z10 | (!equals);
        this.f47862s = bool;
    }

    public final void H(String str) {
        this.f47844a.a().f();
        this.D |= !ia.Z(this.f47848e, str);
        this.f47848e = str;
    }

    public final void I(List<String> list) {
        this.f47844a.a().f();
        List<String> list2 = this.f47864u;
        int i10 = ia.f47957i;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.D = true;
        this.f47864u = list != null ? new ArrayList(list) : null;
    }

    public final boolean J() {
        this.f47844a.a().f();
        return this.f47860q;
    }

    public final boolean K() {
        this.f47844a.a().f();
        return this.f47858o;
    }

    public final boolean L() {
        this.f47844a.a().f();
        return this.D;
    }

    public final long M() {
        this.f47844a.a().f();
        return this.f47854k;
    }

    public final long N() {
        this.f47844a.a().f();
        return this.E;
    }

    public final long O() {
        this.f47844a.a().f();
        return this.f47869z;
    }

    public final long P() {
        this.f47844a.a().f();
        return this.A;
    }

    public final long Q() {
        this.f47844a.a().f();
        return this.f47868y;
    }

    public final long R() {
        this.f47844a.a().f();
        return this.f47867x;
    }

    public final long S() {
        this.f47844a.a().f();
        return this.B;
    }

    public final long T() {
        this.f47844a.a().f();
        return this.f47866w;
    }

    public final long U() {
        this.f47844a.a().f();
        return this.f47857n;
    }

    public final long V() {
        this.f47844a.a().f();
        return this.f47863t;
    }

    public final long W() {
        this.f47844a.a().f();
        return this.F;
    }

    public final long X() {
        this.f47844a.a().f();
        return this.f47856m;
    }

    public final long Y() {
        this.f47844a.a().f();
        return this.f47852i;
    }

    public final long Z() {
        this.f47844a.a().f();
        return this.f47850g;
    }

    public final String a() {
        this.f47844a.a().f();
        return this.C;
    }

    public final long a0() {
        this.f47844a.a().f();
        return this.f47851h;
    }

    public final String b() {
        this.f47844a.a().f();
        return this.f47848e;
    }

    public final Boolean b0() {
        this.f47844a.a().f();
        return this.f47862s;
    }

    public final List<String> c() {
        this.f47844a.a().f();
        return this.f47864u;
    }

    public final String c0() {
        this.f47844a.a().f();
        return this.f47861r;
    }

    public final void d() {
        this.f47844a.a().f();
        this.D = false;
    }

    public final String d0() {
        this.f47844a.a().f();
        String str = this.C;
        B(null);
        return str;
    }

    public final void e() {
        this.f47844a.a().f();
        long j10 = this.f47850g + 1;
        if (j10 > 2147483647L) {
            this.f47844a.r().v().b("Bundle index overflow. appId", q3.y(this.f47845b));
            j10 = 0;
        }
        this.D = true;
        this.f47850g = j10;
    }

    public final String e0() {
        this.f47844a.a().f();
        return this.f47845b;
    }

    public final void f(String str) {
        this.f47844a.a().f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ ia.Z(this.f47861r, str);
        this.f47861r = str;
    }

    public final String f0() {
        this.f47844a.a().f();
        return this.f47846c;
    }

    public final void g(boolean z10) {
        this.f47844a.a().f();
        this.D |= this.f47860q != z10;
        this.f47860q = z10;
    }

    public final String g0() {
        this.f47844a.a().f();
        return this.f47855l;
    }

    public final void h(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47859p != j10;
        this.f47859p = j10;
    }

    public final String h0() {
        this.f47844a.a().f();
        return this.f47853j;
    }

    public final void i(String str) {
        this.f47844a.a().f();
        this.D |= !ia.Z(this.f47846c, str);
        this.f47846c = str;
    }

    public final String i0() {
        this.f47844a.a().f();
        return this.f47849f;
    }

    public final void j(String str) {
        this.f47844a.a().f();
        this.D |= !ia.Z(this.f47855l, str);
        this.f47855l = str;
    }

    public final String j0() {
        this.f47844a.a().f();
        return this.f47865v;
    }

    public final void k(String str) {
        this.f47844a.a().f();
        this.D |= !ia.Z(this.f47853j, str);
        this.f47853j = str;
    }

    public final String k0() {
        this.f47844a.a().f();
        return this.f47847d;
    }

    public final void l(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47854k != j10;
        this.f47854k = j10;
    }

    public final void m(long j10) {
        this.f47844a.a().f();
        this.D |= this.E != j10;
        this.E = j10;
    }

    public final void n(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47869z != j10;
        this.f47869z = j10;
    }

    public final void o(long j10) {
        this.f47844a.a().f();
        this.D |= this.A != j10;
        this.A = j10;
    }

    public final void p(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47868y != j10;
        this.f47868y = j10;
    }

    public final void q(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47867x != j10;
        this.f47867x = j10;
    }

    public final void r(long j10) {
        this.f47844a.a().f();
        this.D |= this.B != j10;
        this.B = j10;
    }

    public final void s(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47866w != j10;
        this.f47866w = j10;
    }

    public final void t(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47857n != j10;
        this.f47857n = j10;
    }

    public final void u(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47863t != j10;
        this.f47863t = j10;
    }

    public final void v(long j10) {
        this.f47844a.a().f();
        this.D |= this.F != j10;
        this.F = j10;
    }

    public final void w(String str) {
        this.f47844a.a().f();
        this.D |= !ia.Z(this.f47849f, str);
        this.f47849f = str;
    }

    public final void x(String str) {
        this.f47844a.a().f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ ia.Z(this.f47865v, str);
        this.f47865v = str;
    }

    public final void y(String str) {
        this.f47844a.a().f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ ia.Z(this.f47847d, str);
        this.f47847d = str;
    }

    public final void z(long j10) {
        this.f47844a.a().f();
        this.D |= this.f47856m != j10;
        this.f47856m = j10;
    }
}
