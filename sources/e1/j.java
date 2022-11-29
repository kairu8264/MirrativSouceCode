package e1;

import c1.j1;
import c1.k1;
import c1.v0;
import jo.p;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: f  reason: collision with root package name */
    public static final a f30047f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f30048g = j1.f18697b.a();

    /* renamed from: h  reason: collision with root package name */
    public static final int f30049h = k1.f18705b.b();

    /* renamed from: a  reason: collision with root package name */
    public final float f30050a;

    /* renamed from: b  reason: collision with root package name */
    public final float f30051b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30052c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30053d;

    /* renamed from: e  reason: collision with root package name */
    public final v0 f30054e;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final int a() {
            return j.f30048g;
        }
    }

    public /* synthetic */ j(float f10, float f11, int i10, int i11, v0 v0Var, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? j1.f18697b.a() : i10, (i12 & 8) != 0 ? k1.f18705b.b() : i11, (i12 & 16) != 0 ? null : v0Var, null);
    }

    public /* synthetic */ j(float f10, float f11, int i10, int i11, v0 v0Var, jo.h hVar) {
        this(f10, f11, i10, i11, v0Var);
    }

    public final int b() {
        return this.f30052c;
    }

    public final int c() {
        return this.f30053d;
    }

    public final float d() {
        return this.f30051b;
    }

    public final v0 e() {
        return this.f30054e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f30050a == jVar.f30050a) {
                return ((this.f30051b > jVar.f30051b ? 1 : (this.f30051b == jVar.f30051b ? 0 : -1)) == 0) && j1.g(this.f30052c, jVar.f30052c) && k1.g(this.f30053d, jVar.f30053d) && p.c(this.f30054e, jVar.f30054e);
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f30050a;
    }

    public int hashCode() {
        int hashCode = ((((((Float.hashCode(this.f30050a) * 31) + Float.hashCode(this.f30051b)) * 31) + j1.h(this.f30052c)) * 31) + k1.h(this.f30053d)) * 31;
        v0 v0Var = this.f30054e;
        return hashCode + (v0Var != null ? v0Var.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.f30050a + ", miter=" + this.f30051b + ", cap=" + ((Object) j1.i(this.f30052c)) + ", join=" + ((Object) k1.i(this.f30053d)) + ", pathEffect=" + this.f30054e + ')';
    }

    public j(float f10, float f11, int i10, int i11, v0 v0Var) {
        super(null);
        this.f30050a = f10;
        this.f30051b = f11;
        this.f30052c = i10;
        this.f30053d = i11;
        this.f30054e = v0Var;
    }
}
