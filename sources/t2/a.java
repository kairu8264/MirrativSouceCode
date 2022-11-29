package t2;

import t2.d;
import t2.e;

/* loaded from: classes.dex */
public class a extends i {
    public int L0 = 0;
    public boolean M0 = true;
    public int N0 = 0;
    public boolean O0 = false;

    @Override // t2.e
    public void g(q2.d dVar, boolean z10) {
        Object[] objArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr = this.V;
        dVarArr[0] = this.N;
        dVarArr[2] = this.O;
        dVarArr[1] = this.P;
        dVarArr[3] = this.Q;
        int i13 = 0;
        while (true) {
            objArr = this.V;
            if (i13 >= objArr.length) {
                break;
            }
            objArr[i13].f53051i = dVar.q(objArr[i13]);
            i13++;
        }
        int i14 = this.L0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar2 = objArr[i14];
        if (!this.O0) {
            k1();
        }
        if (this.O0) {
            this.O0 = false;
            int i15 = this.L0;
            if (i15 == 0 || i15 == 1) {
                dVar.f(this.N.f53051i, this.f53062e0);
                dVar.f(this.P.f53051i, this.f53062e0);
                return;
            } else if (i15 == 2 || i15 == 3) {
                dVar.f(this.O.f53051i, this.f53064f0);
                dVar.f(this.Q.f53051i, this.f53064f0);
                return;
            } else {
                return;
            }
        }
        for (int i16 = 0; i16 < this.K0; i16++) {
            e eVar = this.J0[i16];
            if ((this.M0 || eVar.h()) && ((((i11 = this.L0) == 0 || i11 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.N.f53048f != null && eVar.P.f53048f != null) || (((i12 = this.L0) == 2 || i12 == 3) && eVar.O() == e.b.MATCH_CONSTRAINT && eVar.O.f53048f != null && eVar.Q.f53048f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.N.k() || this.P.k();
        boolean z13 = this.O.k() || this.Q.k();
        int i17 = !z11 && (((i10 = this.L0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13)))) ? 5 : 4;
        for (int i18 = 0; i18 < this.K0; i18++) {
            e eVar2 = this.J0[i18];
            if (this.M0 || eVar2.h()) {
                q2.i q10 = dVar.q(eVar2.V[this.L0]);
                d[] dVarArr2 = eVar2.V;
                int i19 = this.L0;
                dVarArr2[i19].f53051i = q10;
                int i20 = (dVarArr2[i19].f53048f == null || dVarArr2[i19].f53048f.f53046d != this) ? 0 : dVarArr2[i19].f53049g + 0;
                if (i19 != 0 && i19 != 2) {
                    dVar.g(dVar2.f53051i, q10, this.N0 + i20, z11);
                } else {
                    dVar.i(dVar2.f53051i, q10, this.N0 - i20, z11);
                }
                dVar.e(dVar2.f53051i, q10, this.N0 + i20, i17);
            }
        }
        int i21 = this.L0;
        if (i21 == 0) {
            dVar.e(this.P.f53051i, this.N.f53051i, 0, 8);
            dVar.e(this.N.f53051i, this.Z.P.f53051i, 0, 4);
            dVar.e(this.N.f53051i, this.Z.N.f53051i, 0, 0);
        } else if (i21 == 1) {
            dVar.e(this.N.f53051i, this.P.f53051i, 0, 8);
            dVar.e(this.N.f53051i, this.Z.N.f53051i, 0, 4);
            dVar.e(this.N.f53051i, this.Z.P.f53051i, 0, 0);
        } else if (i21 == 2) {
            dVar.e(this.Q.f53051i, this.O.f53051i, 0, 8);
            dVar.e(this.O.f53051i, this.Z.Q.f53051i, 0, 4);
            dVar.e(this.O.f53051i, this.Z.O.f53051i, 0, 0);
        } else if (i21 == 3) {
            dVar.e(this.O.f53051i, this.Q.f53051i, 0, 8);
            dVar.e(this.O.f53051i, this.Z.O.f53051i, 0, 4);
            dVar.e(this.O.f53051i, this.Z.Q.f53051i, 0, 0);
        }
    }

    @Override // t2.e
    public boolean h() {
        return true;
    }

    @Override // t2.e
    public boolean i0() {
        return this.O0;
    }

    @Override // t2.e
    public boolean j0() {
        return this.O0;
    }

    public boolean k1() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.K0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.J0[i13];
            if ((this.M0 || eVar.h()) && ((((i11 = this.L0) == 0 || i11 == 1) && !eVar.i0()) || (((i12 = this.L0) == 2 || i12 == 3) && !eVar.j0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.K0; i15++) {
            e eVar2 = this.J0[i15];
            if (this.M0 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.L0;
                    if (i16 == 0) {
                        i14 = eVar2.m(d.b.LEFT).d();
                    } else if (i16 == 1) {
                        i14 = eVar2.m(d.b.RIGHT).d();
                    } else if (i16 == 2) {
                        i14 = eVar2.m(d.b.TOP).d();
                    } else if (i16 == 3) {
                        i14 = eVar2.m(d.b.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i17 = this.L0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.m(d.b.LEFT).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.m(d.b.RIGHT).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.m(d.b.TOP).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.m(d.b.BOTTOM).d());
                }
            }
        }
        int i18 = i14 + this.N0;
        int i19 = this.L0;
        if (i19 != 0 && i19 != 1) {
            z0(i18, i18);
        } else {
            w0(i18, i18);
        }
        this.O0 = true;
        return true;
    }

    public boolean l1() {
        return this.M0;
    }

    public int m1() {
        return this.L0;
    }

    public int n1() {
        return this.N0;
    }

    public int o1() {
        int i10 = this.L0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    public void p1() {
        for (int i10 = 0; i10 < this.K0; i10++) {
            e eVar = this.J0[i10];
            if (this.M0 || eVar.h()) {
                int i11 = this.L0;
                if (i11 == 0 || i11 == 1) {
                    eVar.J0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.J0(1, true);
                }
            }
        }
    }

    public void q1(boolean z10) {
        this.M0 = z10;
    }

    public void r1(int i10) {
        this.L0 = i10;
    }

    public void s1(int i10) {
        this.N0 = i10;
    }

    @Override // t2.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.K0; i10++) {
            e eVar = this.J0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
