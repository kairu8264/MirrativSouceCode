package ai;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class ez3 implements mv3 {
    public static final sv3 E = bz3.f2641a;
    public static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final v4 G;
    public boolean D;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f3843f;

    /* renamed from: g  reason: collision with root package name */
    public final hb f3844g;

    /* renamed from: l  reason: collision with root package name */
    public int f3849l;

    /* renamed from: m  reason: collision with root package name */
    public int f3850m;

    /* renamed from: n  reason: collision with root package name */
    public long f3851n;

    /* renamed from: o  reason: collision with root package name */
    public int f3852o;

    /* renamed from: p  reason: collision with root package name */
    public hb f3853p;

    /* renamed from: q  reason: collision with root package name */
    public long f3854q;

    /* renamed from: r  reason: collision with root package name */
    public int f3855r;

    /* renamed from: v  reason: collision with root package name */
    public dz3 f3859v;

    /* renamed from: w  reason: collision with root package name */
    public int f3860w;

    /* renamed from: x  reason: collision with root package name */
    public int f3861x;

    /* renamed from: y  reason: collision with root package name */
    public int f3862y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3863z;

    /* renamed from: a  reason: collision with root package name */
    public final List<v4> f3838a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: h  reason: collision with root package name */
    public final b8 f3845h = new b8();

    /* renamed from: i  reason: collision with root package name */
    public final hb f3846i = new hb(16);

    /* renamed from: c  reason: collision with root package name */
    public final hb f3840c = new hb(xa.f11894a);

    /* renamed from: d  reason: collision with root package name */
    public final hb f3841d = new hb(5);

    /* renamed from: e  reason: collision with root package name */
    public final hb f3842e = new hb();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque<oy3> f3847j = new ArrayDeque<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayDeque<cz3> f3848k = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<dz3> f3839b = new SparseArray<>();

    /* renamed from: t  reason: collision with root package name */
    public long f3857t = C.TIME_UNSET;

    /* renamed from: s  reason: collision with root package name */
    public long f3856s = C.TIME_UNSET;

    /* renamed from: u  reason: collision with root package name */
    public long f3858u = C.TIME_UNSET;
    public pv3 A = pv3.f8702a;
    public pw3[] B = new pw3[0];
    public pw3[] C = new pw3[0];

    static {
        t4 t4Var = new t4();
        t4Var.n(MimeTypes.APPLICATION_EMSG);
        G = t4Var.I();
    }

    public ez3(int i10, pb pbVar) {
        byte[] bArr = new byte[16];
        this.f3843f = bArr;
        this.f3844g = new hb(bArr);
    }

    public static int c(int i10) throws zzaha {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw zzaha.b(sb2.toString(), null);
    }

    public static void d(hb hbVar, int i10, qz3 qz3Var) throws zzaha {
        hbVar.p(i10 + 8);
        int D = hbVar.D() & 16777215;
        if ((D & 1) == 0) {
            boolean z10 = (D & 2) != 0;
            int b10 = hbVar.b();
            if (b10 == 0) {
                Arrays.fill(qz3Var.f9255m, 0, qz3Var.f9247e, false);
                return;
            }
            int i11 = qz3Var.f9247e;
            if (b10 == i11) {
                Arrays.fill(qz3Var.f9255m, 0, b10, z10);
                qz3Var.a(hbVar.l());
                hbVar.u(qz3Var.f9257o.q(), 0, qz3Var.f9257o.m());
                qz3Var.f9257o.p(0);
                qz3Var.f9258p = false;
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("Senc sample count ");
            sb2.append(b10);
            sb2.append(" is different from fragment sample count");
            sb2.append(i11);
            throw zzaha.b(sb2.toString(), null);
        }
        throw zzaha.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static ru3 f(List<py3> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            py3 py3Var = list.get(i10);
            if (py3Var.f9239a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] q10 = py3Var.f8740b.q();
                UUID a10 = lz3.a(q10);
                if (a10 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new qt3(a10, null, MimeTypes.VIDEO_MP4, q10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new ru3(arrayList);
    }

    public static final zy3 j(SparseArray<zy3> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        zy3 zy3Var = sparseArray.get(i10);
        Objects.requireNonNull(zy3Var);
        return zy3Var;
    }

    public final void a() {
        this.f3849l = 0;
        this.f3852o = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r48) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 1799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ez3.b(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024b, code lost:
        r5.e(r10, r20, r33.f3860w, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025e, code lost:
        if (r33.f3848k.isEmpty() != false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0260, code lost:
        r1 = r33.f3848k.removeFirst();
        r33.f3855r -= r1.f3088b;
        r3 = r1.f3087a + r10;
        r5 = r33.B;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0276, code lost:
        if (r8 >= r6) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0278, code lost:
        r5[r8].e(r3, 1, r1.f3088b, r33.f3855r, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0290, code lost:
        if (r2.i() != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0292, code lost:
        r33.f3859v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0294, code lost:
        r33.f3849l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0298, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r33.f3849l != 3) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
        r3 = r2.g();
        r33.f3860w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (r2.f3474f >= r2.f3477i) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
        ((ai.hv3) r1).q(r3, false);
        r1 = r2.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r1 != null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
        r3 = r2.f3470b.f9257o;
        r1 = r1.f8757d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
        if (r1 == 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
        r3.s(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r2.f3470b.c(r2.f3474f) == false) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r3.s(r3.w() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
        if (r2.i() != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
        r33.f3859v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
        r33.f3849l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
        if (r2.f3472d.f9637a.f8187g != 1) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
        r33.f3860w = r3 - 8;
        ((ai.hv3) r1).q(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.AUDIO_AC4.equals(r2.f3472d.f9637a.f8186f.f10960l) == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
        r33.f3861x = r2.j(r33.f3860w, 7);
        ai.vu3.b(r33.f3860w, r33.f3844g);
        ai.nw3.b(r2.f3469a, r33.f3844g, 7);
        r3 = r33.f3861x + 7;
        r33.f3861x = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
        r3 = r2.j(r33.f3860w, 0);
        r33.f3861x = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
        r33.f3860w += r3;
        r33.f3849l = 4;
        r33.f3862y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        r3 = r2.f3472d.f9637a;
        r5 = r2.f3469a;
        r10 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
        if (r3.f8190j != 0) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
        r3 = r33.f3861x;
        r4 = r33.f3860w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
        if (r3 >= r4) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0147, code lost:
        r33.f3861x += ai.nw3.a(r5, r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
        r6 = r33.f3841d.q();
        r6[0] = 0;
        r6[1] = 0;
        r6[2] = 0;
        r13 = r3.f8190j;
        r14 = r13 + 1;
        r13 = 4 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
        if (r33.f3861x >= r33.f3860w) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
        r12 = r33.f3862y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
        if (r12 != 0) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
        ((ai.hv3) r1).f(r6, r13, r14, r9);
        r33.f3841d.p(r9);
        r12 = r33.f3841d.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0183, code lost:
        if (r12 <= 0) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0185, code lost:
        r33.f3862y = r12 - 1;
        r33.f3840c.p(r9);
        ai.nw3.b(r5, r33.f3840c, 4);
        ai.nw3.b(r5, r33.f3841d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019c, code lost:
        if (r33.C.length <= 0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019e, code lost:
        r12 = r3.f8186f.f10960l;
        r17 = r6[4];
        r9 = ai.xa.f11894a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ac, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.VIDEO_H264.equals(r12) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b0, code lost:
        if ((r17 & 31) == r4) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b3, code lost:
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
        if (com.google.android.exoplayer2.util.MimeTypes.VIDEO_H265.equals(r12) == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
        if (((r17 & 126) >> r8) != 39) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c4, code lost:
        r33.f3863z = r9;
        r33.f3861x += 5;
        r33.f3860w += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d8, code lost:
        throw com.google.android.gms.internal.ads.zzaha.b("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01db, code lost:
        if (r33.f3863z == false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01dd, code lost:
        r33.f3842e.i(r12);
        ((ai.hv3) r1).f(r33.f3842e.q(), 0, r33.f3862y, false);
        ai.nw3.b(r5, r33.f3842e, r33.f3862y);
        r4 = r33.f3862y;
        r8 = ai.xa.a(r33.f3842e.q(), r33.f3842e.m());
        r33.f3842e.p(com.google.android.exoplayer2.util.MimeTypes.VIDEO_H265.equals(r3.f8186f.f10960l) ? 1 : 0);
        r33.f3842e.n(r8);
        ai.ev3.a(r10, r33.f3842e, r33.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0224, code lost:
        r4 = ai.nw3.a(r5, r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022a, code lost:
        r33.f3861x += r4;
        r33.f3862y -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0236, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023a, code lost:
        r20 = r2.h();
        r1 = r2.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0242, code lost:
        if (r1 == null) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
        r23 = r1.f8756c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0249, code lost:
        r23 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    @Override // ai.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(ai.nv3 r34, ai.iw3 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ez3.e(ai.nv3, ai.iw3):int");
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        int size = this.f3839b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3839b.valueAt(i10).d();
        }
        this.f3848k.clear();
        this.f3855r = 0;
        this.f3856s = j11;
        this.f3847j.clear();
        a();
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.A = pv3Var;
        a();
        pw3[] pw3VarArr = new pw3[2];
        this.B = pw3VarArr;
        int i10 = 0;
        pw3[] pw3VarArr2 = (pw3[]) sb.K(pw3VarArr, 0);
        this.B = pw3VarArr2;
        for (pw3 pw3Var : pw3VarArr2) {
            pw3Var.b(G);
        }
        this.C = new pw3[this.f3838a.size()];
        int i11 = 100;
        while (i10 < this.C.length) {
            int i12 = i11 + 1;
            pw3 p10 = this.A.p(i11, 3);
            p10.b(this.f3838a.get(i10));
            this.C[i10] = p10;
            i10++;
            i11 = i12;
        }
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        return nz3.a(nv3Var);
    }
}
