package s1;

import c1.k0;
import c1.u0;
import c1.v0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class m implements e1.e, e1.c {

    /* renamed from: w  reason: collision with root package name */
    public final e1.a f51906w;

    /* renamed from: x  reason: collision with root package name */
    public d f51907x;

    public m(e1.a aVar) {
        jo.p.h(aVar, "canvasDrawScope");
        this.f51906w = aVar;
    }

    @Override // e1.e
    public void B0(u0 u0Var, c1.u uVar, float f10, e1.f fVar, c1.d0 d0Var, int i10) {
        jo.p.h(u0Var, "path");
        jo.p.h(uVar, "brush");
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.B0(u0Var, uVar, f10, fVar, d0Var, i10);
    }

    @Override // e1.e
    public void C0(long j10, long j11, long j12, long j13, e1.f fVar, float f10, c1.d0 d0Var, int i10) {
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.C0(j10, j11, j12, j13, fVar, f10, d0Var, i10);
    }

    @Override // e1.e
    public void F0(c1.u uVar, long j10, long j11, long j12, float f10, e1.f fVar, c1.d0 d0Var, int i10) {
        jo.p.h(uVar, "brush");
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.F0(uVar, j10, j11, j12, f10, fVar, d0Var, i10);
    }

    @Override // m2.d
    public float G0() {
        return this.f51906w.G0();
    }

    @Override // e1.e
    public void H0(c1.u uVar, long j10, long j11, float f10, int i10, v0 v0Var, float f11, c1.d0 d0Var, int i11) {
        jo.p.h(uVar, "brush");
        this.f51906w.H0(uVar, j10, j11, f10, i10, v0Var, f11, d0Var, i11);
    }

    @Override // e1.e
    public void I(c1.u uVar, long j10, long j11, float f10, e1.f fVar, c1.d0 d0Var, int i10) {
        jo.p.h(uVar, "brush");
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.I(uVar, j10, j11, f10, fVar, d0Var, i10);
    }

    @Override // m2.d
    public float I0(float f10) {
        return this.f51906w.I0(f10);
    }

    @Override // e1.e
    public e1.d M0() {
        return this.f51906w.M0();
    }

    @Override // m2.d
    public int N0(long j10) {
        return this.f51906w.N0(j10);
    }

    @Override // e1.e
    public void O(long j10, long j11, long j12, float f10, e1.f fVar, c1.d0 d0Var, int i10) {
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.O(j10, j11, j12, f10, fVar, d0Var, i10);
    }

    @Override // e1.e
    public long U0() {
        return this.f51906w.U0();
    }

    @Override // e1.e
    public void V0(k0 k0Var, long j10, float f10, e1.f fVar, c1.d0 d0Var, int i10) {
        jo.p.h(k0Var, "image");
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.V0(k0Var, j10, f10, fVar, d0Var, i10);
    }

    @Override // m2.d
    public long W0(long j10) {
        return this.f51906w.W0(j10);
    }

    @Override // m2.d
    public int X(float f10) {
        return this.f51906w.X(f10);
    }

    @Override // e1.e
    public void b1(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, e1.f fVar, c1.d0 d0Var, int i10) {
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.b1(j10, f10, f11, z10, j11, j12, f12, fVar, d0Var, i10);
    }

    @Override // e1.e
    public long c() {
        return this.f51906w.c();
    }

    @Override // m2.d
    public float c0(long j10) {
        return this.f51906w.c0(j10);
    }

    @Override // e1.c
    public void c1() {
        c1.w e10 = M0().e();
        d dVar = this.f51907x;
        jo.p.e(dVar);
        d d10 = dVar.d();
        if (d10 != null) {
            d10.m(e10);
        } else {
            dVar.b().a2(e10);
        }
    }

    @Override // e1.e
    public void d0(long j10, float f10, long j11, float f11, e1.f fVar, c1.d0 d0Var, int i10) {
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.d0(j10, f10, j11, f11, fVar, d0Var, i10);
    }

    @Override // m2.d
    public long f(long j10) {
        return this.f51906w.f(j10);
    }

    @Override // m2.d
    public float getDensity() {
        return this.f51906w.getDensity();
    }

    @Override // e1.e
    public m2.q getLayoutDirection() {
        return this.f51906w.getLayoutDirection();
    }

    @Override // e1.e
    public void q0(u0 u0Var, long j10, float f10, e1.f fVar, c1.d0 d0Var, int i10) {
        jo.p.h(u0Var, "path");
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.q0(u0Var, j10, f10, fVar, d0Var, i10);
    }

    @Override // m2.d
    public float s(int i10) {
        return this.f51906w.s(i10);
    }

    @Override // m2.d
    public float t(float f10) {
        return this.f51906w.t(f10);
    }

    @Override // e1.e
    public void w0(long j10, long j11, long j12, float f10, int i10, v0 v0Var, float f11, c1.d0 d0Var, int i11) {
        this.f51906w.w0(j10, j11, j12, f10, i10, v0Var, f11, d0Var, i11);
    }

    @Override // e1.e
    public void y(k0 k0Var, long j10, long j11, long j12, long j13, float f10, e1.f fVar, c1.d0 d0Var, int i10, int i11) {
        jo.p.h(k0Var, "image");
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        this.f51906w.y(k0Var, j10, j11, j12, j13, f10, fVar, d0Var, i10, i11);
    }

    public /* synthetic */ m(e1.a aVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new e1.a() : aVar);
    }
}
