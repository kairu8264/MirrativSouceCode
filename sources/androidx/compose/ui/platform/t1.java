package androidx.compose.ui.platform;

import java.util.List;

/* loaded from: classes.dex */
public final class t1 implements s1.z {
    public w1.i A;
    public w1.i B;

    /* renamed from: w  reason: collision with root package name */
    public final int f14658w;

    /* renamed from: x  reason: collision with root package name */
    public final List<t1> f14659x;

    /* renamed from: y  reason: collision with root package name */
    public Float f14660y;

    /* renamed from: z  reason: collision with root package name */
    public Float f14661z;

    public t1(int i10, List<t1> list, Float f10, Float f11, w1.i iVar, w1.i iVar2) {
        jo.p.h(list, "allScopes");
        this.f14658w = i10;
        this.f14659x = list;
        this.f14660y = f10;
        this.f14661z = f11;
        this.A = iVar;
        this.B = iVar2;
    }

    public final w1.i a() {
        return this.A;
    }

    public final Float b() {
        return this.f14660y;
    }

    public final Float c() {
        return this.f14661z;
    }

    public final int d() {
        return this.f14658w;
    }

    public final w1.i e() {
        return this.B;
    }

    public final void f(w1.i iVar) {
        this.A = iVar;
    }

    public final void g(Float f10) {
        this.f14660y = f10;
    }

    public final void h(Float f10) {
        this.f14661z = f10;
    }

    public final void i(w1.i iVar) {
        this.B = iVar;
    }

    @Override // s1.z
    public boolean m0() {
        return this.f14659x.contains(this);
    }
}
