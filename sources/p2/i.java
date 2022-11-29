package p2;

import jo.p;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f45730a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f45731b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f45732c;

    /* renamed from: d  reason: collision with root package name */
    public final j f45733d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f45734e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f45735f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f45736g;

    public i() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    public i(boolean z10, boolean z11, boolean z12, j jVar, boolean z13, boolean z14, boolean z15) {
        p.h(jVar, "securePolicy");
        this.f45730a = z10;
        this.f45731b = z11;
        this.f45732c = z12;
        this.f45733d = jVar;
        this.f45734e = z13;
        this.f45735f = z14;
        this.f45736g = z15;
    }

    public final boolean a() {
        return this.f45735f;
    }

    public final boolean b() {
        return this.f45731b;
    }

    public final boolean c() {
        return this.f45732c;
    }

    public final boolean d() {
        return this.f45734e;
    }

    public final boolean e() {
        return this.f45730a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f45730a == iVar.f45730a && this.f45731b == iVar.f45731b && this.f45732c == iVar.f45732c && this.f45733d == iVar.f45733d && this.f45734e == iVar.f45734e && this.f45735f == iVar.f45735f && this.f45736g == iVar.f45736g;
        }
        return false;
    }

    public final j f() {
        return this.f45733d;
    }

    public final boolean g() {
        return this.f45736g;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f45731b) * 31) + Boolean.hashCode(this.f45730a)) * 31) + Boolean.hashCode(this.f45731b)) * 31) + Boolean.hashCode(this.f45732c)) * 31) + this.f45733d.hashCode()) * 31) + Boolean.hashCode(this.f45734e)) * 31) + Boolean.hashCode(this.f45735f)) * 31) + Boolean.hashCode(this.f45736g);
    }

    public /* synthetic */ i(boolean z10, boolean z11, boolean z12, j jVar, boolean z13, boolean z14, boolean z15, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? j.Inherit : jVar, (i10 & 16) != 0 ? true : z13, (i10 & 32) == 0 ? z14 : true, (i10 & 64) != 0 ? false : z15);
    }

    public /* synthetic */ i(boolean z10, boolean z11, boolean z12, j jVar, boolean z13, boolean z14, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? j.Inherit : jVar, (i10 & 16) != 0 ? true : z13, (i10 & 32) == 0 ? z14 : true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(boolean z10, boolean z11, boolean z12, j jVar, boolean z13, boolean z14) {
        this(z10, z11, z12, jVar, z13, z14, false);
        p.h(jVar, "securePolicy");
    }
}
