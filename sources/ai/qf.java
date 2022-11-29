package ai;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class qf {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8914a = vj.l("vide");

    /* renamed from: b  reason: collision with root package name */
    public static final int f8915b = vj.l("soun");

    /* renamed from: c  reason: collision with root package name */
    public static final int f8916c = vj.l("text");

    /* renamed from: d  reason: collision with root package name */
    public static final int f8917d = vj.l("sbtl");

    /* renamed from: e  reason: collision with root package name */
    public static final int f8918e = vj.l("subt");

    /* renamed from: f  reason: collision with root package name */
    public static final int f8919f = vj.l("clcp");

    /* renamed from: g  reason: collision with root package name */
    public static final int f8920g = vj.l(C.CENC_TYPE_cenc);

    /* renamed from: h  reason: collision with root package name */
    public static final int f8921h = vj.l("meta");

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        if (r8 == 0) goto L417;
     */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0848 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ai.bg a(ai.hf r51, ai.Cif r52, long r53, ai.ie r55, boolean r56) throws com.google.android.gms.internal.ads.zzanp {
        /*
            Method dump skipped, instructions count: 2178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qf.a(ai.hf, ai.if, long, ai.ie, boolean):ai.bg");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173 A[LOOP:10: B:59:0x0173->B:60:0x0175, LOOP_START, PHI: r14 r15 r22 r25 
      PHI: (r14v3 int) = (r14v1 int), (r14v10 int) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v3 int) = (r15v1 int), (r15v9 int) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v2 int) = (r22v1 int), (r22v5 int) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:58:0x0171, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ai.eg b(ai.bg r42, ai.hf r43, ai.qe r44) throws com.google.android.gms.internal.ads.zzanp {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qf.b(ai.bg, ai.hf, ai.qe):ai.eg");
    }

    public static rg c(Cif cif, boolean z10) {
        if (z10) {
            return null;
        }
        nj njVar = cif.P0;
        njVar.i(8);
        while (njVar.d() >= 8) {
            int g10 = njVar.g();
            int r10 = njVar.r();
            if (njVar.r() == jf.B0) {
                njVar.i(g10);
                int i10 = g10 + r10;
                njVar.j(12);
                while (njVar.g() < i10) {
                    int g11 = njVar.g();
                    int r11 = njVar.r();
                    if (njVar.r() == jf.C0) {
                        njVar.i(g11);
                        int i11 = g11 + r11;
                        njVar.j(8);
                        ArrayList arrayList = new ArrayList();
                        while (njVar.g() < i11) {
                            qg a10 = wf.a(njVar);
                            if (a10 != null) {
                                arrayList.add(a10);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new rg(arrayList);
                    }
                    njVar.j(r11 - 8);
                }
                return null;
            }
            njVar.j(r10 - 8);
        }
        return null;
    }

    public static Pair<String, byte[]> d(nj njVar, int i10) {
        njVar.i(i10 + 12);
        njVar.j(1);
        f(njVar);
        njVar.j(2);
        int l10 = njVar.l();
        if ((l10 & 128) != 0) {
            njVar.j(2);
        }
        if ((l10 & 64) != 0) {
            njVar.j(njVar.m());
        }
        if ((l10 & 32) != 0) {
            njVar.j(2);
        }
        njVar.j(1);
        f(njVar);
        int l11 = njVar.l();
        String str = null;
        if (l11 == 32) {
            str = MimeTypes.VIDEO_MP4V;
        } else if (l11 == 33) {
            str = MimeTypes.VIDEO_H264;
        } else if (l11 != 35) {
            if (l11 != 64) {
                if (l11 == 107) {
                    return Pair.create(MimeTypes.AUDIO_MPEG, null);
                }
                if (l11 == 165) {
                    str = MimeTypes.AUDIO_AC3;
                } else if (l11 != 166) {
                    switch (l11) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (l11) {
                                case 169:
                                case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                                    return Pair.create(MimeTypes.AUDIO_DTS, null);
                                case 170:
                                case 171:
                                    return Pair.create(MimeTypes.AUDIO_DTS_HD, null);
                            }
                    }
                } else {
                    str = MimeTypes.AUDIO_E_AC3;
                }
            }
            str = MimeTypes.AUDIO_AAC;
        } else {
            str = MimeTypes.VIDEO_H265;
        }
        njVar.j(12);
        njVar.j(1);
        int f10 = f(njVar);
        byte[] bArr = new byte[f10];
        njVar.k(bArr, 0, f10);
        return Pair.create(str, bArr);
    }

    public static int e(nj njVar, int i10, int i11, mf mfVar, int i12) {
        int g10 = njVar.g();
        while (true) {
            if (g10 - i10 >= i11) {
                return 0;
            }
            njVar.i(g10);
            int r10 = njVar.r();
            fj.b(r10 > 0, "childAtomSize should be positive");
            if (njVar.r() == jf.W) {
                int i13 = g10 + 8;
                Pair pair = null;
                boolean z10 = false;
                Integer num = null;
                cg cgVar = null;
                while (i13 - g10 < r10) {
                    njVar.i(i13);
                    int r11 = njVar.r();
                    int r12 = njVar.r();
                    if (r12 == jf.f5717c0) {
                        num = Integer.valueOf(njVar.r());
                    } else if (r12 == jf.X) {
                        njVar.j(4);
                        z10 = njVar.r() == f8920g;
                    } else if (r12 == jf.Y) {
                        int i14 = i13 + 8;
                        while (true) {
                            if (i14 - i13 >= r11) {
                                cgVar = null;
                                break;
                            }
                            njVar.i(i14);
                            int r13 = njVar.r();
                            if (njVar.r() == jf.Z) {
                                njVar.j(6);
                                boolean z11 = njVar.l() == 1;
                                int l10 = njVar.l();
                                byte[] bArr = new byte[16];
                                njVar.k(bArr, 0, 16);
                                cgVar = new cg(z11, l10, bArr);
                            } else {
                                i14 += r13;
                            }
                        }
                    }
                    i13 += r11;
                }
                if (z10) {
                    fj.b(num != null, "frma atom is mandatory");
                    fj.b(cgVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, cgVar);
                }
                if (pair != null) {
                    mfVar.f6921a[i12] = (cg) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            g10 += r10;
        }
    }

    public static int f(nj njVar) {
        int l10 = njVar.l();
        int i10 = l10 & 127;
        while ((l10 & 128) == 128) {
            l10 = njVar.l();
            i10 = (i10 << 7) | (l10 & 127);
        }
        return i10;
    }
}
