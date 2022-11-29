package ai;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class jz3 implements mv3, lw3 {

    /* renamed from: x  reason: collision with root package name */
    public static final sv3 f5988x = hz3.f5056a;

    /* renamed from: i  reason: collision with root package name */
    public int f5997i;

    /* renamed from: j  reason: collision with root package name */
    public long f5998j;

    /* renamed from: k  reason: collision with root package name */
    public int f5999k;

    /* renamed from: l  reason: collision with root package name */
    public hb f6000l;

    /* renamed from: n  reason: collision with root package name */
    public int f6002n;

    /* renamed from: o  reason: collision with root package name */
    public int f6003o;

    /* renamed from: p  reason: collision with root package name */
    public int f6004p;

    /* renamed from: q  reason: collision with root package name */
    public pv3 f6005q;

    /* renamed from: r  reason: collision with root package name */
    public iz3[] f6006r;

    /* renamed from: s  reason: collision with root package name */
    public long[][] f6007s;

    /* renamed from: t  reason: collision with root package name */
    public int f6008t;

    /* renamed from: u  reason: collision with root package name */
    public long f6009u;

    /* renamed from: v  reason: collision with root package name */
    public int f6010v;

    /* renamed from: w  reason: collision with root package name */
    public o9 f6011w;

    /* renamed from: h  reason: collision with root package name */
    public int f5996h = 0;

    /* renamed from: f  reason: collision with root package name */
    public final mz3 f5994f = new mz3();

    /* renamed from: g  reason: collision with root package name */
    public final List<u7> f5995g = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final hb f5992d = new hb(16);

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<oy3> f5993e = new ArrayDeque<>();

    /* renamed from: a  reason: collision with root package name */
    public final hb f5989a = new hb(xa.f11894a);

    /* renamed from: b  reason: collision with root package name */
    public final hb f5990b = new hb(4);

    /* renamed from: c  reason: collision with root package name */
    public final hb f5991c = new hb();

    /* renamed from: m  reason: collision with root package name */
    public int f6001m = -1;

    public jz3(int i10) {
    }

    public static long l(rz3 rz3Var, long j10, long j11) {
        int m10 = m(rz3Var, j10);
        return m10 == -1 ? j11 : Math.min(rz3Var.f9639c[m10], j11);
    }

    public static int m(rz3 rz3Var, long j10) {
        int a10 = rz3Var.a(j10);
        return a10 == -1 ? rz3Var.b(j10) : a10;
    }

    public static int n(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        long j11;
        long j12;
        int b10;
        iz3[] iz3VarArr = this.f6006r;
        Objects.requireNonNull(iz3VarArr);
        if (iz3VarArr.length == 0) {
            mw3 mw3Var = mw3.f7081c;
            return new jw3(mw3Var, mw3Var);
        }
        int i10 = this.f6008t;
        long j13 = -1;
        if (i10 != -1) {
            rz3 rz3Var = iz3VarArr[i10].f5458b;
            int m10 = m(rz3Var, j10);
            if (m10 == -1) {
                mw3 mw3Var2 = mw3.f7081c;
                return new jw3(mw3Var2, mw3Var2);
            }
            long j14 = rz3Var.f9642f[m10];
            j11 = rz3Var.f9639c[m10];
            if (j14 >= j10 || m10 >= rz3Var.f9638b - 1 || (b10 = rz3Var.b(j10)) == -1 || b10 == m10) {
                j12 = -9223372036854775807L;
            } else {
                j12 = rz3Var.f9642f[b10];
                j13 = rz3Var.f9639c[b10];
            }
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            iz3[] iz3VarArr2 = this.f6006r;
            if (i11 >= iz3VarArr2.length) {
                break;
            }
            if (i11 != this.f6008t) {
                rz3 rz3Var2 = iz3VarArr2[i11].f5458b;
                long l10 = l(rz3Var2, j10, j11);
                if (j12 != C.TIME_UNSET) {
                    j13 = l(rz3Var2, j12, j13);
                }
                j11 = l10;
            }
            i11++;
        }
        mw3 mw3Var3 = new mw3(j10, j11);
        if (j12 == C.TIME_UNSET) {
            return new jw3(mw3Var3, mw3Var3);
        }
        return new jw3(mw3Var3, new mw3(j12, j13));
    }

    @Override // ai.lw3
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x035c, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    @Override // ai.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(ai.nv3 r33, ai.iw3 r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.jz3.e(ai.nv3, ai.iw3):int");
    }

    @Override // ai.lw3
    public final long f() {
        return this.f6009u;
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        this.f5993e.clear();
        this.f5999k = 0;
        this.f6001m = -1;
        this.f6002n = 0;
        this.f6003o = 0;
        this.f6004p = 0;
        if (j10 == 0) {
            j();
            return;
        }
        iz3[] iz3VarArr = this.f6006r;
        if (iz3VarArr != null) {
            for (iz3 iz3Var : iz3VarArr) {
                rz3 rz3Var = iz3Var.f5458b;
                int a10 = rz3Var.a(j11);
                if (a10 == -1) {
                    a10 = rz3Var.b(j11);
                }
                iz3Var.f5460d = a10;
            }
        }
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f6005q = pv3Var;
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        return nz3.b(nv3Var, false);
    }

    public final void j() {
        this.f5996h = 0;
        this.f5999k = 0;
    }

    public final void k(long j10) throws zzaha {
        jz3 jz3Var;
        v7 v7Var;
        v7 v7Var2;
        long j11;
        List<rz3> list;
        int i10;
        jz3 jz3Var2;
        v7 v7Var3;
        char c10;
        int i11;
        jz3 jz3Var3 = this;
        while (!jz3Var3.f5993e.isEmpty() && jz3Var3.f5993e.peek().f8170b == j10) {
            oy3 pop = jz3Var3.f5993e.pop();
            if (pop.f9239a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z10 = jz3Var3.f6010v == 1;
                bw3 bw3Var = new bw3();
                py3 e10 = pop.e(Atom.TYPE_udta);
                if (e10 != null) {
                    Pair<v7, v7> b10 = yy3.b(e10);
                    v7 v7Var4 = (v7) b10.first;
                    v7 v7Var5 = (v7) b10.second;
                    if (v7Var4 != null) {
                        bw3Var.a(v7Var4);
                    }
                    v7Var = v7Var5;
                    v7Var2 = v7Var4;
                } else {
                    v7Var = null;
                    v7Var2 = null;
                }
                oy3 f10 = pop.f(Atom.TYPE_meta);
                v7 c11 = f10 != null ? yy3.c(f10) : null;
                List<rz3> a10 = yy3.a(pop, bw3Var, C.TIME_UNSET, null, false, z10, gz3.f4665a);
                pv3 pv3Var = jz3Var3.f6005q;
                Objects.requireNonNull(pv3Var);
                int size = a10.size();
                long j12 = C.TIME_UNSET;
                long j13 = -9223372036854775807L;
                int i12 = 0;
                int i13 = -1;
                while (true) {
                    j11 = 0;
                    if (i12 >= size) {
                        break;
                    }
                    rz3 rz3Var = a10.get(i12);
                    if (rz3Var.f9638b == 0) {
                        jz3Var2 = jz3Var3;
                        list = a10;
                        i10 = size;
                    } else {
                        oz3 oz3Var = rz3Var.f9637a;
                        ArrayList arrayList2 = arrayList;
                        long j14 = oz3Var.f8185e;
                        if (j14 == j12) {
                            j14 = rz3Var.f9644h;
                        }
                        long max = Math.max(j13, j14);
                        iz3 iz3Var = new iz3(oz3Var, rz3Var, pv3Var.p(i12, oz3Var.f8182b));
                        int i14 = rz3Var.f9641e;
                        list = a10;
                        t4 a11 = oz3Var.f8186f.a();
                        a11.o(i14 + 30);
                        i10 = size;
                        if (oz3Var.f8182b == 2 && j14 > 0 && (i11 = rz3Var.f9638b) > 1) {
                            a11.u(i11 / (((float) j14) / 1000000.0f));
                        }
                        int i15 = oz3Var.f8182b;
                        int i16 = fz3.f4264b;
                        if (i15 == 1 && bw3Var.b()) {
                            a11.E(bw3Var.f2573a);
                            a11.F(bw3Var.f2574b);
                        }
                        int i17 = oz3Var.f8182b;
                        v7[] v7VarArr = new v7[2];
                        v7VarArr[0] = v7Var;
                        jz3Var2 = this;
                        if (jz3Var2.f5995g.isEmpty()) {
                            c10 = 1;
                            v7Var3 = null;
                        } else {
                            v7Var3 = new v7(jz3Var2.f5995g);
                            c10 = 1;
                        }
                        v7VarArr[c10] = v7Var3;
                        v7 v7Var6 = new v7(new u7[0]);
                        if (i17 == 1) {
                            if (v7Var2 != null) {
                                v7Var6 = v7Var2;
                            }
                        } else if (i17 == 2 && c11 != null) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= c11.a()) {
                                    break;
                                }
                                u7 b11 = c11.b(i18);
                                if (b11 instanceof l9) {
                                    l9 l9Var = (l9) b11;
                                    if (MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS.equals(l9Var.f6499w)) {
                                        v7Var6 = new v7(l9Var);
                                        break;
                                    }
                                }
                                i18++;
                            }
                        }
                        for (int i19 = 0; i19 < 2; i19++) {
                            v7Var6 = v7Var6.c(v7VarArr[i19]);
                        }
                        if (v7Var6.a() > 0) {
                            a11.l(v7Var6);
                        }
                        iz3Var.f5459c.b(a11.I());
                        if (oz3Var.f8182b == 2 && i13 == -1) {
                            i13 = arrayList2.size();
                        }
                        arrayList = arrayList2;
                        arrayList.add(iz3Var);
                        j13 = max;
                    }
                    i12++;
                    jz3Var3 = jz3Var2;
                    a10 = list;
                    size = i10;
                    j12 = C.TIME_UNSET;
                }
                jz3Var = jz3Var3;
                jz3Var.f6008t = i13;
                jz3Var.f6009u = j13;
                iz3[] iz3VarArr = (iz3[]) arrayList.toArray(new iz3[0]);
                jz3Var.f6006r = iz3VarArr;
                int length = iz3VarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i20 = 0; i20 < iz3VarArr.length; i20++) {
                    jArr[i20] = new long[iz3VarArr[i20].f5458b.f9638b];
                    jArr2[i20] = iz3VarArr[i20].f5458b.f9642f[0];
                }
                int i21 = 0;
                while (i21 < iz3VarArr.length) {
                    long j15 = Long.MAX_VALUE;
                    int i22 = -1;
                    for (int i23 = 0; i23 < iz3VarArr.length; i23++) {
                        if (!zArr[i23]) {
                            long j16 = jArr2[i23];
                            if (j16 <= j15) {
                                i22 = i23;
                                j15 = j16;
                            }
                        }
                    }
                    int i24 = iArr[i22];
                    long[] jArr3 = jArr[i22];
                    jArr3[i24] = j11;
                    rz3 rz3Var2 = iz3VarArr[i22].f5458b;
                    j11 += rz3Var2.f9640d[i24];
                    int i25 = i24 + 1;
                    iArr[i22] = i25;
                    if (i25 < jArr3.length) {
                        jArr2[i22] = rz3Var2.f9642f[i25];
                    } else {
                        zArr[i22] = true;
                        i21++;
                    }
                }
                jz3Var.f6007s = jArr;
                pv3Var.x();
                pv3Var.s(jz3Var);
                jz3Var.f5993e.clear();
                jz3Var.f5996h = 2;
            } else {
                jz3Var = jz3Var3;
                if (!jz3Var.f5993e.isEmpty()) {
                    jz3Var.f5993e.peek().d(pop);
                }
            }
            jz3Var3 = jz3Var;
        }
        if (jz3Var3.f5996h != 2) {
            j();
        }
    }
}
