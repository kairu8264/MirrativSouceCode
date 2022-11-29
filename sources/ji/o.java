package ji;

import java.util.List;

/* loaded from: classes3.dex */
public final class o extends p {
    public final /* synthetic */ p A;

    /* renamed from: y  reason: collision with root package name */
    public final transient int f38063y;

    /* renamed from: z  reason: collision with root package name */
    public final transient int f38064z;

    public o(p pVar, int i10, int i11) {
        this.A = pVar;
        this.f38063y = i10;
        this.f38064z = i11;
    }

    @Override // ji.m
    public final int f() {
        return this.A.g() + this.f38063y + this.f38064z;
    }

    @Override // ji.m
    public final int g() {
        return this.A.g() + this.f38063y;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j.a(i10, this.f38064z, "index");
        return this.A.get(i10 + this.f38063y);
    }

    @Override // ji.m
    public final Object[] j() {
        return this.A.j();
    }

    @Override // ji.p
    public final p k(int i10, int i11) {
        j.c(i10, i11, this.f38064z);
        p pVar = this.A;
        int i12 = this.f38063y;
        return pVar.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38064z;
    }

    @Override // ji.p, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
