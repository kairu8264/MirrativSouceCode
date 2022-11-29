package ai;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* loaded from: classes3.dex */
public final class ph implements mh, lh {
    public ci A;
    public mh[] B;
    public zh C;

    /* renamed from: w  reason: collision with root package name */
    public final mh[] f8411w;

    /* renamed from: x  reason: collision with root package name */
    public final IdentityHashMap<xh, Integer> f8412x = new IdentityHashMap<>();

    /* renamed from: y  reason: collision with root package name */
    public lh f8413y;

    /* renamed from: z  reason: collision with root package name */
    public int f8414z;

    public ph(mh... mhVarArr) {
        this.f8411w = mhVarArr;
    }

    @Override // ai.yh
    public final /* bridge */ /* synthetic */ void b(mh mhVar) {
        if (this.A == null) {
            return;
        }
        this.f8413y.b(this);
    }

    @Override // ai.lh
    public final void c(mh mhVar) {
        int i10 = this.f8414z - 1;
        this.f8414z = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (mh mhVar2 : this.f8411w) {
            i11 += mhVar2.n().f2835a;
        }
        bi[] biVarArr = new bi[i11];
        int i12 = 0;
        for (mh mhVar3 : this.f8411w) {
            ci n10 = mhVar3.n();
            int i13 = n10.f2835a;
            int i14 = 0;
            while (i14 < i13) {
                biVarArr[i12] = n10.a(i14);
                i14++;
                i12++;
            }
        }
        this.A = new ci(biVarArr);
        this.f8413y.c(this);
    }

    @Override // ai.mh, ai.zh
    public final boolean d(long j10) {
        return this.C.d(j10);
    }

    @Override // ai.mh
    public final void e(lh lhVar, long j10) {
        this.f8413y = lhVar;
        mh[] mhVarArr = this.f8411w;
        this.f8414z = mhVarArr.length;
        for (mh mhVar : mhVarArr) {
            mhVar.e(this, j10);
        }
    }

    @Override // ai.mh
    public final long h(fi[] fiVarArr, boolean[] zArr, xh[] xhVarArr, boolean[] zArr2, long j10) {
        int length;
        xh[] xhVarArr2 = xhVarArr;
        int length2 = fiVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        while (true) {
            length = fiVarArr.length;
            if (i10 >= length) {
                break;
            }
            xh xhVar = xhVarArr2[i10];
            iArr[i10] = xhVar == null ? -1 : this.f8412x.get(xhVar).intValue();
            iArr2[i10] = -1;
            fi fiVar = fiVarArr[i10];
            if (fiVar != null) {
                bi a10 = fiVar.a();
                int i11 = 0;
                while (true) {
                    mh[] mhVarArr = this.f8411w;
                    if (i11 >= mhVarArr.length) {
                        break;
                    } else if (mhVarArr[i11].n().b(a10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i10++;
        }
        this.f8412x.clear();
        xh[] xhVarArr3 = new xh[length];
        xh[] xhVarArr4 = new xh[length];
        fi[] fiVarArr2 = new fi[length];
        ArrayList arrayList = new ArrayList(this.f8411w.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f8411w.length) {
            for (int i13 = 0; i13 < fiVarArr.length; i13++) {
                fi fiVar2 = null;
                xhVarArr4[i13] = iArr[i13] == i12 ? xhVarArr2[i13] : null;
                if (iArr2[i13] == i12) {
                    fiVar2 = fiVarArr[i13];
                }
                fiVarArr2[i13] = fiVar2;
            }
            int i14 = i12;
            fi[] fiVarArr3 = fiVarArr2;
            ArrayList arrayList2 = arrayList;
            long h10 = this.f8411w[i12].h(fiVarArr2, zArr, xhVarArr4, zArr2, j11);
            if (i14 == 0) {
                j11 = h10;
            } else if (h10 != j11) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < fiVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    fj.d(xhVarArr4[i15] != null);
                    xh xhVar2 = xhVarArr4[i15];
                    xhVarArr3[i15] = xhVar2;
                    this.f8412x.put(xhVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    fj.d(xhVarArr4[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f8411w[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            fiVarArr2 = fiVarArr3;
            xhVarArr2 = xhVarArr;
        }
        xh[] xhVarArr5 = xhVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(xhVarArr3, 0, xhVarArr5, 0, length);
        mh[] mhVarArr2 = new mh[arrayList3.size()];
        this.B = mhVarArr2;
        arrayList3.toArray(mhVarArr2);
        this.C = new ah(this.B);
        return j11;
    }

    @Override // ai.mh
    public final long j(long j10) {
        long j11 = this.B[0].j(j10);
        int i10 = 1;
        while (true) {
            mh[] mhVarArr = this.B;
            if (i10 >= mhVarArr.length) {
                return j11;
            }
            if (mhVarArr[i10].j(j11) != j11) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i10++;
        }
    }

    @Override // ai.mh
    public final void k() throws IOException {
        for (mh mhVar : this.f8411w) {
            mhVar.k();
        }
    }

    @Override // ai.mh
    public final long l() {
        long j10 = Long.MAX_VALUE;
        for (mh mhVar : this.B) {
            long l10 = mhVar.l();
            if (l10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, l10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // ai.mh
    public final ci n() {
        return this.A;
    }

    @Override // ai.mh
    public final void o(long j10) {
        for (mh mhVar : this.B) {
            mhVar.o(j10);
        }
    }

    @Override // ai.mh
    public final long p() {
        mh[] mhVarArr;
        long p10 = this.f8411w[0].p();
        int i10 = 1;
        while (true) {
            mh[] mhVarArr2 = this.f8411w;
            if (i10 >= mhVarArr2.length) {
                if (p10 != C.TIME_UNSET) {
                    for (mh mhVar : this.B) {
                        if (mhVar != this.f8411w[0] && mhVar.j(p10) != p10) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return p10;
            } else if (mhVarArr2[i10].p() != C.TIME_UNSET) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i10++;
            }
        }
    }

    @Override // ai.mh, ai.zh
    public final long zza() {
        return this.C.zza();
    }
}
