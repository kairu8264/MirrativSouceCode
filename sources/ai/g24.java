package ai;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class g24 implements mv3 {

    /* renamed from: q  reason: collision with root package name */
    public static final sv3 f4298q = d24.f3109a;

    /* renamed from: a  reason: collision with root package name */
    public final List<pb> f4299a;

    /* renamed from: b  reason: collision with root package name */
    public final hb f4300b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseIntArray f4301c;

    /* renamed from: d  reason: collision with root package name */
    public final j24 f4302d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<l24> f4303e;

    /* renamed from: f  reason: collision with root package name */
    public final SparseBooleanArray f4304f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseBooleanArray f4305g;

    /* renamed from: h  reason: collision with root package name */
    public final c24 f4306h;

    /* renamed from: i  reason: collision with root package name */
    public b24 f4307i;

    /* renamed from: j  reason: collision with root package name */
    public pv3 f4308j;

    /* renamed from: k  reason: collision with root package name */
    public int f4309k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4310l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4311m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4312n;

    /* renamed from: o  reason: collision with root package name */
    public int f4313o;

    /* renamed from: p  reason: collision with root package name */
    public int f4314p;

    public g24(int i10) {
        this(1, 0, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
        if (r2 == false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // ai.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(ai.nv3 r19, ai.iw3 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.g24.e(ai.nv3, ai.iw3):int");
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        b24 b24Var;
        int size = this.f4299a.size();
        for (int i10 = 0; i10 < size; i10++) {
            pb pbVar = this.f4299a.get(i10);
            if (pbVar.c() != C.TIME_UNSET) {
                long a10 = pbVar.a();
                if (a10 != C.TIME_UNSET) {
                    if (a10 != 0) {
                        if (a10 == j11) {
                        }
                    }
                }
            }
            pbVar.d(j11);
        }
        if (j11 != 0 && (b24Var = this.f4307i) != null) {
            b24Var.b(j11);
        }
        this.f4300b.i(0);
        this.f4301c.clear();
        for (int i11 = 0; i11 < this.f4303e.size(); i11++) {
            this.f4303e.valueAt(i11).zzb();
        }
        this.f4313o = 0;
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f4308j = pv3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // ai.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(ai.nv3 r7) throws java.io.IOException {
        /*
            r6 = this;
            ai.hb r0 = r6.f4300b
            byte[] r0 = r0.q()
            ai.hv3 r7 = (ai.hv3) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.c(r0, r1, r2, r1)
            r2 = r1
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = r1
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.q(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.g24.i(ai.nv3):boolean");
    }

    public g24(int i10, int i11, int i12) {
        pb pbVar = new pb(0L);
        this.f4302d = new t04(0);
        this.f4299a = Collections.singletonList(pbVar);
        this.f4300b = new hb(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f4304f = sparseBooleanArray;
        this.f4305g = new SparseBooleanArray();
        SparseArray<l24> sparseArray = new SparseArray<>();
        this.f4303e = sparseArray;
        this.f4301c = new SparseIntArray();
        this.f4306h = new c24(TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
        this.f4308j = pv3.f8702a;
        this.f4314p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f4303e.put(sparseArray2.keyAt(i13), (l24) sparseArray2.valueAt(i13));
        }
        this.f4303e.put(0, new y14(new e24(this)));
    }
}
