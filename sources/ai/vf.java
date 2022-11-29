package ai;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzanp;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* loaded from: classes3.dex */
public final class vf implements me {

    /* renamed from: w  reason: collision with root package name */
    public static final oe f11049w = new sf();

    /* renamed from: x  reason: collision with root package name */
    public static final int f11050x = vj.l("seig");

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f11051y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: j  reason: collision with root package name */
    public int f11061j;

    /* renamed from: k  reason: collision with root package name */
    public int f11062k;

    /* renamed from: l  reason: collision with root package name */
    public long f11063l;

    /* renamed from: m  reason: collision with root package name */
    public int f11064m;

    /* renamed from: n  reason: collision with root package name */
    public nj f11065n;

    /* renamed from: o  reason: collision with root package name */
    public long f11066o;

    /* renamed from: q  reason: collision with root package name */
    public uf f11068q;

    /* renamed from: r  reason: collision with root package name */
    public int f11069r;

    /* renamed from: s  reason: collision with root package name */
    public int f11070s;

    /* renamed from: t  reason: collision with root package name */
    public int f11071t;

    /* renamed from: u  reason: collision with root package name */
    public ne f11072u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f11073v;

    /* renamed from: f  reason: collision with root package name */
    public final nj f11057f = new nj(16);

    /* renamed from: b  reason: collision with root package name */
    public final nj f11053b = new nj(lj.f6576a);

    /* renamed from: c  reason: collision with root package name */
    public final nj f11054c = new nj(5);

    /* renamed from: d  reason: collision with root package name */
    public final nj f11055d = new nj();

    /* renamed from: e  reason: collision with root package name */
    public final nj f11056e = new nj(1);

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f11058g = new byte[16];

    /* renamed from: h  reason: collision with root package name */
    public final Stack<hf> f11059h = new Stack<>();

    /* renamed from: i  reason: collision with root package name */
    public final LinkedList<tf> f11060i = new LinkedList<>();

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<uf> f11052a = new SparseArray<>();

    /* renamed from: p  reason: collision with root package name */
    public long f11067p = C.TIME_UNSET;

    public vf(int i10, sj sjVar, bg bgVar) {
        a();
    }

    public static void c(nj njVar, int i10, dg dgVar) throws zzanp {
        njVar.i(i10 + 8);
        int b10 = jf.b(njVar.r());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int u10 = njVar.u();
            int i11 = dgVar.f3267e;
            if (u10 == i11) {
                Arrays.fill(dgVar.f3275m, 0, u10, z10);
                dgVar.a(njVar.d());
                njVar.k(dgVar.f3278p.f7359a, 0, dgVar.f3277o);
                dgVar.f3278p.i(0);
                dgVar.f3279q = false;
                return;
            }
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Length mismatch: ");
            sb2.append(u10);
            sb2.append(", ");
            sb2.append(i11);
            throw new zzanp(sb2.toString());
        }
        throw new zzanp("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ai.ie d(java.util.List<ai.Cif> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb7
            java.lang.Object r5 = r14.get(r3)
            ai.if r5 = (ai.Cif) r5
            int r6 = r5.f5764a
            int r7 = ai.jf.V
            if (r6 != r7) goto Lb3
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            ai.nj r5 = r5.P0
            byte[] r5 = r5.f7359a
            ai.nj r6 = new ai.nj
            r6.<init>(r5)
            int r8 = r6.e()
            r9 = 32
            if (r8 >= r9) goto L30
        L2e:
            r6 = r2
            goto L97
        L30:
            r6.i(r1)
            int r8 = r6.r()
            int r9 = r6.d()
            int r9 = r9 + 4
            if (r8 == r9) goto L40
            goto L2e
        L40:
            int r8 = r6.r()
            if (r8 == r7) goto L47
            goto L2e
        L47:
            int r7 = r6.r()
            int r7 = ai.jf.a(r7)
            r8 = 1
            if (r7 <= r8) goto L6b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L2e
        L6b:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.s()
            long r12 = r6.s()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L83
            int r7 = r6.u()
            int r7 = r7 * 16
            r6.j(r7)
        L83:
            int r7 = r6.u()
            int r8 = r6.d()
            if (r7 == r8) goto L8e
            goto L2e
        L8e:
            byte[] r8 = new byte[r7]
            r6.k(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L97:
            if (r6 != 0) goto L9b
            r6 = r2
            goto L9f
        L9b:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L9f:
            if (r6 != 0) goto La9
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb3
        La9:
            ai.he r7 = new ai.he
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        Lb3:
            int r3 = r3 + 1
            goto L8
        Lb7:
            if (r4 != 0) goto Lba
            return r2
        Lba:
            ai.ie r14 = new ai.ie
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.vf.d(java.util.List):ai.ie");
    }

    public final void a() {
        this.f11061j = 0;
        this.f11064m = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0633, code lost:
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0637, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x059b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r50) throws com.google.android.gms.internal.ads.zzanp {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.vf.b(long):void");
    }

    @Override // ai.me
    public final void g(long j10, long j11) {
        int size = this.f11052a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f11052a.valueAt(i10).b();
        }
        this.f11060i.clear();
        this.f11059h.clear();
        a();
    }

    @Override // ai.me
    public final boolean h(le leVar) throws IOException, InterruptedException {
        return ag.a(leVar);
    }

    @Override // ai.me
    public final void i(ne neVar) {
        this.f11072u = neVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        r2 = r24.f11068q;
        r3 = r2.f10686a;
        r5 = r3.f3270h;
        r9 = r2.f10690e;
        r5 = r5[r9];
        r24.f11069r = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r3.f3274l == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        r5 = r3.f3278p;
        r10 = r3.f3263a.f9415a;
        r11 = r3.f3276n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r11 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        r11 = r2.f10688c.f2334h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r10 = r11.f2802a;
        r3 = r3.f3275m[r9];
        r9 = r24.f11056e;
        r11 = r9.f7359a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (true == r3) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r11[0] = (byte) (r12 | r10);
        r9.i(0);
        r2 = r2.f10687b;
        r2.c(r24.f11056e, 1);
        r2.c(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r3 != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r3 = r5.m();
        r5.j(-2);
        r3 = (r3 * 6) + 2;
        r2.c(r5, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
        r24.f11070s = r10;
        r5 = r24.f11069r + r10;
        r24.f11069r = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
        r24.f11070s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r24.f11068q.f10688c.f2333g != 1) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
        r24.f11069r = r5 - 8;
        r1.d(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
        r24.f11061j = 4;
        r24.f11071t = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
        r2 = r24.f11068q;
        r3 = r2.f10686a;
        r5 = r2.f10688c;
        r9 = r2.f10687b;
        r2 = r2.f10690e;
        r6 = r5.f2337k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        if (r6 != 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
        r4 = r24.f11070s;
        r6 = r24.f11069r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
        if (r4 >= r6) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        r24.f11070s += r9.d(r1, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
        r10 = r24.f11054c.f7359a;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r24.f11070s >= r24.f11069r) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
        r11 = r24.f11071t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012a, code lost:
        if (r11 != 0) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
        r1.b(r10, r6, r4, false);
        r24.f11054c.i(0);
        r24.f11071t = r24.f11054c.u() - 1;
        r24.f11053b.i(0);
        r9.c(r24.f11053b, 4);
        r9.c(r24.f11054c, 1);
        r24.f11070s += 5;
        r24.f11069r += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
        r11 = r9.d(r1, r11, false);
        r24.f11070s += r11;
        r24.f11071t -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
        r10 = (r3.f3272j[r2] + r3.f3271i[r2]) * 1000;
        r1 = r3.f3274l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0178, code lost:
        if (true == r1) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017a, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017c, code lost:
        r4 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017e, code lost:
        r12 = r4 | (r3.f3273k[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
        if (r1 == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
        r1 = r3.f3276n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0188, code lost:
        if (r1 != null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
        r1 = r5.f2334h[r3.f3263a.f9415a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
        r2 = r24.f11068q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
        if (r1 == r2.f10694i) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
        r2 = new ai.ue(1, r1.f2803b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a0, code lost:
        r2 = r2.f10693h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a2, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a4, code lost:
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a6, code lost:
        r2 = r24.f11068q;
        r2.f10693h = r15;
        r2.f10694i = r1;
        r9.b(r10, r12, r24.f11069r, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b8, code lost:
        if (r24.f11060i.isEmpty() == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ba, code lost:
        r1 = r24.f11068q;
        r1.f10690e++;
        r2 = r1.f10691f + 1;
        r1.f10691f = r2;
        r3 = r3.f3269g;
        r4 = r1.f10692g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cc, code lost:
        if (r2 != r3[r4]) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ce, code lost:
        r1.f10692g = r4 + 1;
        r1.f10691f = 0;
        r24.f11068q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d6, code lost:
        r24.f11061j = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d9, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01da, code lost:
        r2 = r24.f11060i.removeFirst().f10277a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e5, code lost:
        throw null;
     */
    @Override // ai.me
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(ai.le r25, ai.re r26) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.vf.j(ai.le, ai.re):int");
    }
}
