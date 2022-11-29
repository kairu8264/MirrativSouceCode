package c1;

import android.graphics.Shader;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 extends d1 {

    /* renamed from: e  reason: collision with root package name */
    public final List<c0> f18724e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Float> f18725f;

    /* renamed from: g  reason: collision with root package name */
    public final long f18726g;

    /* renamed from: h  reason: collision with root package name */
    public final long f18727h;

    /* renamed from: i  reason: collision with root package name */
    public final int f18728i;

    public n0(List<c0> list, List<Float> list2, long j10, long j11, int i10) {
        this.f18724e = list;
        this.f18725f = list2;
        this.f18726g = j10;
        this.f18727h = j11;
        this.f18728i = i10;
    }

    public /* synthetic */ n0(List list, List list2, long j10, long j11, int i10, jo.h hVar) {
        this(list, list2, j10, j11, i10);
    }

    @Override // c1.d1
    public Shader b(long j10) {
        return e1.a(b1.g.a((b1.f.m(this.f18726g) > Float.POSITIVE_INFINITY ? 1 : (b1.f.m(this.f18726g) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? b1.l.i(j10) : b1.f.m(this.f18726g), (b1.f.n(this.f18726g) > Float.POSITIVE_INFINITY ? 1 : (b1.f.n(this.f18726g) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? b1.l.g(j10) : b1.f.n(this.f18726g)), b1.g.a((b1.f.m(this.f18727h) > Float.POSITIVE_INFINITY ? 1 : (b1.f.m(this.f18727h) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? b1.l.i(j10) : b1.f.m(this.f18727h), b1.f.n(this.f18727h) == Float.POSITIVE_INFINITY ? b1.l.g(j10) : b1.f.n(this.f18727h)), this.f18724e, this.f18725f, this.f18728i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            return jo.p.c(this.f18724e, n0Var.f18724e) && jo.p.c(this.f18725f, n0Var.f18725f) && b1.f.j(this.f18726g, n0Var.f18726g) && b1.f.j(this.f18727h, n0Var.f18727h) && l1.f(this.f18728i, n0Var.f18728i);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f18724e.hashCode() * 31;
        List<Float> list = this.f18725f;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + b1.f.o(this.f18726g)) * 31) + b1.f.o(this.f18727h)) * 31) + l1.g(this.f18728i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (b1.g.b(this.f18726g)) {
            str = "start=" + ((Object) b1.f.t(this.f18726g)) + ", ";
        } else {
            str = "";
        }
        if (b1.g.b(this.f18727h)) {
            str2 = "end=" + ((Object) b1.f.t(this.f18727h)) + ", ";
        }
        return "LinearGradient(colors=" + this.f18724e + ", stops=" + this.f18725f + ", " + str + str2 + "tileMode=" + ((Object) l1.h(this.f18728i)) + ')';
    }
}
