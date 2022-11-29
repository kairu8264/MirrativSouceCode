package ai;

import java.util.List;

/* loaded from: classes3.dex */
public final class yz2 extends zz2 {
    public final /* synthetic */ zz2 A;

    /* renamed from: y  reason: collision with root package name */
    public final transient int f12777y;

    /* renamed from: z  reason: collision with root package name */
    public final transient int f12778z;

    public yz2(zz2 zz2Var, int i10, int i11) {
        this.A = zz2Var;
        this.f12777y = i10;
        this.f12778z = i11;
    }

    @Override // ai.uz2
    public final Object[] f() {
        return this.A.f();
    }

    @Override // ai.uz2
    public final int g() {
        return this.A.g() + this.f12777y;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        lx2.e(i10, this.f12778z, "index");
        return this.A.get(i10 + this.f12777y);
    }

    @Override // ai.uz2
    public final int j() {
        return this.A.g() + this.f12777y + this.f12778z;
    }

    @Override // ai.uz2
    public final boolean l() {
        return true;
    }

    @Override // ai.zz2
    public final zz2 p(int i10, int i11) {
        lx2.g(i10, i11, this.f12778z);
        zz2 zz2Var = this.A;
        int i12 = this.f12777y;
        return zz2Var.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12778z;
    }

    @Override // ai.zz2, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
