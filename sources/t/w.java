package t;

import c1.n1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final float f53006a;

    /* renamed from: b  reason: collision with root package name */
    public final long f53007b;

    /* renamed from: c  reason: collision with root package name */
    public final u.c0<Float> f53008c;

    public w(float f10, long j10, u.c0<Float> c0Var) {
        this.f53006a = f10;
        this.f53007b = j10;
        this.f53008c = c0Var;
    }

    public /* synthetic */ w(float f10, long j10, u.c0 c0Var, jo.h hVar) {
        this(f10, j10, c0Var);
    }

    public final u.c0<Float> a() {
        return this.f53008c;
    }

    public final float b() {
        return this.f53006a;
    }

    public final long c() {
        return this.f53007b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return jo.p.c(Float.valueOf(this.f53006a), Float.valueOf(wVar.f53006a)) && n1.e(this.f53007b, wVar.f53007b) && jo.p.c(this.f53008c, wVar.f53008c);
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f53006a) * 31) + n1.h(this.f53007b)) * 31) + this.f53008c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f53006a + ", transformOrigin=" + ((Object) n1.i(this.f53007b)) + ", animationSpec=" + this.f53008c + ')';
    }
}
