package ai;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class pp3 implements ap3, zo3 {
    public uz3 A;
    public final no3 D;

    /* renamed from: w  reason: collision with root package name */
    public final ap3[] f8496w;

    /* renamed from: z  reason: collision with root package name */
    public zo3 f8499z;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<ap3> f8498y = new ArrayList<>();
    public sq3 C = new mo3(new sq3[0]);

    /* renamed from: x  reason: collision with root package name */
    public final IdentityHashMap<qq3, Integer> f8497x = new IdentityHashMap<>();
    public ap3[] B = new ap3[0];

    public pp3(no3 no3Var, long[] jArr, ap3[] ap3VarArr, byte... bArr) {
        this.D = no3Var;
        this.f8496w = ap3VarArr;
        for (int i10 = 0; i10 < ap3VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f8496w[i10] = new np3(ap3VarArr[i10], j10);
            }
        }
    }

    @Override // ai.ap3, ai.sq3
    public final void a(long j10) {
        this.C.a(j10);
    }

    @Override // ai.ap3
    public final void b() throws IOException {
        for (ap3 ap3Var : this.f8496w) {
            ap3Var.b();
        }
    }

    @Override // ai.ap3, ai.sq3
    public final boolean c(long j10) {
        if (!this.f8498y.isEmpty()) {
            int size = this.f8498y.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f8498y.get(i10).c(j10);
            }
            return false;
        }
        return this.C.c(j10);
    }

    @Override // ai.ap3
    public final uz3 d() {
        uz3 uz3Var = this.A;
        Objects.requireNonNull(uz3Var);
        return uz3Var;
    }

    @Override // ai.ap3, ai.sq3
    public final long e() {
        return this.C.e();
    }

    @Override // ai.ap3
    public final long f() {
        ap3[] ap3VarArr;
        ap3[] ap3VarArr2;
        long j10 = -9223372036854775807L;
        for (ap3 ap3Var : this.B) {
            long f10 = ap3Var.f();
            if (f10 != C.TIME_UNSET) {
                if (j10 == C.TIME_UNSET) {
                    for (ap3 ap3Var2 : this.B) {
                        if (ap3Var2 == ap3Var) {
                            break;
                        } else if (ap3Var2.j(f10) != f10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = f10;
                } else if (f10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != C.TIME_UNSET && ap3Var.j(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // ai.zo3
    public final void g(ap3 ap3Var) {
        this.f8498y.remove(ap3Var);
        if (this.f8498y.isEmpty()) {
            int i10 = 0;
            for (ap3 ap3Var2 : this.f8496w) {
                i10 += ap3Var2.d().f10893a;
            }
            sx3[] sx3VarArr = new sx3[i10];
            int i11 = 0;
            for (ap3 ap3Var3 : this.f8496w) {
                uz3 d10 = ap3Var3.d();
                int i12 = d10.f10893a;
                int i13 = 0;
                while (i13 < i12) {
                    sx3VarArr[i11] = d10.a(i13);
                    i13++;
                    i11++;
                }
            }
            this.A = new uz3(sx3VarArr);
            zo3 zo3Var = this.f8499z;
            Objects.requireNonNull(zo3Var);
            zo3Var.g(this);
        }
    }

    @Override // ai.rq3
    public final /* bridge */ /* synthetic */ void h(ap3 ap3Var) {
        zo3 zo3Var = this.f8499z;
        Objects.requireNonNull(zo3Var);
        zo3Var.h(this);
    }

    @Override // ai.ap3, ai.sq3
    public final long i() {
        return this.C.i();
    }

    @Override // ai.ap3
    public final long j(long j10) {
        long j11 = this.B[0].j(j10);
        int i10 = 1;
        while (true) {
            ap3[] ap3VarArr = this.B;
            if (i10 >= ap3VarArr.length) {
                return j11;
            }
            if (ap3VarArr[i10].j(j11) != j11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // ai.ap3, ai.sq3
    public final boolean k() {
        return this.C.k();
    }

    @Override // ai.ap3
    public final void l(long j10, boolean z10) {
        for (ap3 ap3Var : this.B) {
            ap3Var.l(j10, false);
        }
    }

    public final ap3 m(int i10) {
        ap3 ap3Var;
        ap3 ap3Var2 = this.f8496w[i10];
        if (ap3Var2 instanceof np3) {
            ap3Var = ((np3) ap3Var2).f7433w;
            return ap3Var;
        }
        return ap3Var2;
    }

    @Override // ai.ap3
    public final long o(long j10, y6 y6Var) {
        ap3[] ap3VarArr = this.B;
        return (ap3VarArr.length > 0 ? ap3VarArr[0] : this.f8496w[0]).o(j10, y6Var);
    }

    @Override // ai.ap3
    public final long q(br3[] br3VarArr, boolean[] zArr, qq3[] qq3VarArr, boolean[] zArr2, long j10) {
        int length;
        int length2 = br3VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        while (true) {
            length = br3VarArr.length;
            if (i10 >= length) {
                break;
            }
            qq3 qq3Var = qq3VarArr[i10];
            Integer num = qq3Var == null ? null : this.f8497x.get(qq3Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            br3 br3Var = br3VarArr[i10];
            if (br3Var != null) {
                sx3 a10 = br3Var.a();
                int i11 = 0;
                while (true) {
                    ap3[] ap3VarArr = this.f8496w;
                    if (i11 >= ap3VarArr.length) {
                        break;
                    } else if (ap3VarArr[i11].d().b(a10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i10++;
        }
        this.f8497x.clear();
        qq3[] qq3VarArr2 = new qq3[length];
        qq3[] qq3VarArr3 = new qq3[length];
        br3[] br3VarArr2 = new br3[length];
        ArrayList arrayList = new ArrayList(this.f8496w.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f8496w.length) {
            for (int i13 = 0; i13 < br3VarArr.length; i13++) {
                qq3VarArr3[i13] = iArr[i13] == i12 ? qq3VarArr[i13] : null;
                br3VarArr2[i13] = iArr2[i13] == i12 ? br3VarArr[i13] : null;
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            qq3[] qq3VarArr4 = qq3VarArr3;
            br3[] br3VarArr3 = br3VarArr2;
            long q10 = this.f8496w[i12].q(br3VarArr2, zArr, qq3VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = q10;
            } else if (q10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < br3VarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    qq3 qq3Var2 = qq3VarArr4[i15];
                    Objects.requireNonNull(qq3Var2);
                    qq3VarArr2[i15] = qq3Var2;
                    this.f8497x.put(qq3Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    u9.d(qq3VarArr4[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f8496w[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            qq3VarArr3 = qq3VarArr4;
            br3VarArr2 = br3VarArr3;
        }
        System.arraycopy(qq3VarArr2, 0, qq3VarArr, 0, length);
        ap3[] ap3VarArr2 = (ap3[]) arrayList.toArray(new ap3[0]);
        this.B = ap3VarArr2;
        this.C = new mo3(ap3VarArr2);
        return j11;
    }

    @Override // ai.ap3
    public final void r(zo3 zo3Var, long j10) {
        this.f8499z = zo3Var;
        Collections.addAll(this.f8498y, this.f8496w);
        for (ap3 ap3Var : this.f8496w) {
            ap3Var.r(this, j10);
        }
    }
}
