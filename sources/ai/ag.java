package ai;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1844a = {vj.l("isom"), vj.l("iso2"), vj.l("iso3"), vj.l("iso4"), vj.l("iso5"), vj.l("iso6"), vj.l("avc1"), vj.l("hvc1"), vj.l("hev1"), vj.l("mp41"), vj.l("mp42"), vj.l("3g2a"), vj.l("3g2b"), vj.l("3gr6"), vj.l("3gs6"), vj.l("3ge6"), vj.l("3gg6"), vj.l("M4V "), vj.l("M4A "), vj.l("f4v "), vj.l("kddi"), vj.l("M4VP"), vj.l("qt  "), vj.l("MSNV")};

    public static boolean a(le leVar) throws IOException, InterruptedException {
        return c(leVar, true);
    }

    public static boolean b(le leVar) throws IOException, InterruptedException {
        return c(leVar, false);
    }

    public static boolean c(le leVar, boolean z10) throws IOException, InterruptedException {
        boolean z11;
        long i10 = leVar.i();
        int i11 = (int) ((i10 == -1 || i10 > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) ? 4096L : 4096L);
        nj njVar = new nj(64);
        int i12 = 0;
        boolean z12 = false;
        while (i12 < i11) {
            njVar.a(8);
            leVar.e(njVar.f7359a, 0, 8, false);
            long p10 = njVar.p();
            int r10 = njVar.r();
            int i13 = 16;
            if (p10 == 1) {
                leVar.e(njVar.f7359a, 8, 8, false);
                njVar.f(16);
                p10 = njVar.v();
            } else {
                i13 = 8;
            }
            long j10 = i13;
            if (p10 < j10) {
                return false;
            }
            i12 += i13;
            if (r10 != jf.C) {
                if (r10 == jf.L || r10 == jf.N) {
                    z11 = true;
                    break;
                } else if ((i12 + p10) - j10 >= i11) {
                    break;
                } else {
                    int i14 = (int) (p10 - j10);
                    i12 += i14;
                    if (r10 == jf.f5714b) {
                        if (i14 < 8) {
                            return false;
                        }
                        njVar.a(i14);
                        leVar.e(njVar.f7359a, 0, i14, false);
                        int i15 = i14 >> 2;
                        for (int i16 = 0; i16 < i15; i16++) {
                            if (i16 == 1) {
                                njVar.j(4);
                            } else {
                                int r11 = njVar.r();
                                if ((r11 >>> 8) != vj.l("3gp")) {
                                    int[] iArr = f1844a;
                                    int length = iArr.length;
                                    for (int i17 = 0; i17 < 24; i17++) {
                                        if (iArr[i17] != r11) {
                                        }
                                    }
                                    continue;
                                }
                                z12 = true;
                                break;
                            }
                        }
                        if (!z12) {
                            return false;
                        }
                    } else if (i14 != 0) {
                        leVar.f(i14, false);
                    }
                }
            }
        }
        z11 = false;
        return z12 && z10 == z11;
    }
}
