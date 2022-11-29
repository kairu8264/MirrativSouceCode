package b0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q1.b0;
import q1.d0;
import q1.e0;
import q1.q0;
import q1.z0;
import wn.v;

/* loaded from: classes.dex */
public final class j implements i, e0 {

    /* renamed from: w  reason: collision with root package name */
    public final e f16693w;

    /* renamed from: x  reason: collision with root package name */
    public final z0 f16694x;

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<Integer, q0[]> f16695y;

    public j(e eVar, z0 z0Var) {
        jo.p.h(eVar, "itemContentFactory");
        jo.p.h(z0Var, "subcomposeMeasureScope");
        this.f16693w = eVar;
        this.f16694x = z0Var;
        this.f16695y = new HashMap<>();
    }

    @Override // m2.d
    public float G0() {
        return this.f16694x.G0();
    }

    @Override // m2.d
    public float I0(float f10) {
        return this.f16694x.I0(f10);
    }

    @Override // b0.i
    public q0[] J(int i10, long j10) {
        q0[] q0VarArr = this.f16695y.get(Integer.valueOf(i10));
        if (q0VarArr != null) {
            return q0VarArr;
        }
        Object e10 = this.f16693w.d().invoke().e(i10);
        List<b0> V = this.f16694x.V(e10, this.f16693w.b(i10, e10));
        int size = V.size();
        q0[] q0VarArr2 = new q0[size];
        for (int i11 = 0; i11 < size; i11++) {
            q0VarArr2[i11] = V.get(i11).M(j10);
        }
        this.f16695y.put(Integer.valueOf(i10), q0VarArr2);
        return q0VarArr2;
    }

    @Override // m2.d
    public int N0(long j10) {
        return this.f16694x.N0(j10);
    }

    @Override // q1.e0
    public d0 W(int i10, int i11, Map<q1.a, Integer> map, io.l<? super q0.a, v> lVar) {
        jo.p.h(map, "alignmentLines");
        jo.p.h(lVar, "placementBlock");
        return this.f16694x.W(i10, i11, map, lVar);
    }

    @Override // m2.d
    public long W0(long j10) {
        return this.f16694x.W0(j10);
    }

    @Override // m2.d
    public int X(float f10) {
        return this.f16694x.X(f10);
    }

    @Override // m2.d
    public float c0(long j10) {
        return this.f16694x.c0(j10);
    }

    @Override // b0.i, m2.d
    public long f(long j10) {
        return this.f16694x.f(j10);
    }

    @Override // m2.d
    public float getDensity() {
        return this.f16694x.getDensity();
    }

    @Override // q1.m
    public m2.q getLayoutDirection() {
        return this.f16694x.getLayoutDirection();
    }

    @Override // b0.i, m2.d
    public float s(int i10) {
        return this.f16694x.s(i10);
    }

    @Override // b0.i, m2.d
    public float t(float f10) {
        return this.f16694x.t(f10);
    }
}
