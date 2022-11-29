package v;

import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;
import c1.a1;
import c1.g1;

/* loaded from: classes.dex */
public final class d extends d1 implements z0.h {
    public final g1 A;
    public b1.l B;
    public m2.q C;
    public c1.q0 D;

    /* renamed from: x  reason: collision with root package name */
    public final c1.c0 f56174x;

    /* renamed from: y  reason: collision with root package name */
    public final c1.u f56175y;

    /* renamed from: z  reason: collision with root package name */
    public final float f56176z;

    public /* synthetic */ d(c1.c0 c0Var, c1.u uVar, float f10, g1 g1Var, io.l lVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? null : c0Var, (i10 & 2) != 0 ? null : uVar, (i10 & 4) != 0 ? 1.0f : f10, g1Var, lVar, null);
    }

    public /* synthetic */ d(c1.c0 c0Var, c1.u uVar, float f10, g1 g1Var, io.l lVar, jo.h hVar) {
        this(c0Var, uVar, f10, g1Var, lVar);
    }

    public final void b(e1.c cVar) {
        c1.q0 a10;
        if (b1.l.e(cVar.c(), this.B) && cVar.getLayoutDirection() == this.C) {
            a10 = this.D;
            jo.p.e(a10);
        } else {
            a10 = this.A.a(cVar.c(), cVar.getLayoutDirection(), cVar);
        }
        c1.c0 c0Var = this.f56174x;
        if (c0Var != null) {
            c0Var.u();
            c1.r0.d(cVar, a10, this.f56174x.u(), (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? e1.i.f30046a : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? e1.e.f30042e.a() : 0);
        }
        c1.u uVar = this.f56175y;
        if (uVar != null) {
            c1.r0.c(cVar, a10, uVar, this.f56176z, null, null, 0, 56, null);
        }
        this.D = a10;
        this.B = b1.l.c(cVar.c());
    }

    public final void c(e1.c cVar) {
        c1.c0 c0Var = this.f56174x;
        if (c0Var != null) {
            e1.e.L0(cVar, c0Var.u(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        c1.u uVar = this.f56175y;
        if (uVar != null) {
            e1.e.x(cVar, uVar, 0L, 0L, this.f56176z, null, null, 0, 118, null);
        }
    }

    public boolean equals(Object obj) {
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null && jo.p.c(this.f56174x, dVar.f56174x) && jo.p.c(this.f56175y, dVar.f56175y)) {
            return ((this.f56176z > dVar.f56176z ? 1 : (this.f56176z == dVar.f56176z ? 0 : -1)) == 0) && jo.p.c(this.A, dVar.A);
        }
        return false;
    }

    public int hashCode() {
        c1.c0 c0Var = this.f56174x;
        int s10 = (c0Var != null ? c1.c0.s(c0Var.u()) : 0) * 31;
        c1.u uVar = this.f56175y;
        return ((((s10 + (uVar != null ? uVar.hashCode() : 0)) * 31) + Float.hashCode(this.f56176z)) * 31) + this.A.hashCode();
    }

    public String toString() {
        return "Background(color=" + this.f56174x + ", brush=" + this.f56175y + ", alpha = " + this.f56176z + ", shape=" + this.A + ')';
    }

    @Override // z0.h
    public void x0(e1.c cVar) {
        jo.p.h(cVar, "<this>");
        if (this.A == a1.a()) {
            c(cVar);
        } else {
            b(cVar);
        }
        cVar.c1();
    }

    public d(c1.c0 c0Var, c1.u uVar, float f10, g1 g1Var, io.l<? super c1, wn.v> lVar) {
        super(lVar);
        this.f56174x = c0Var;
        this.f56175y = uVar;
        this.f56176z = f10;
        this.A = g1Var;
    }
}
