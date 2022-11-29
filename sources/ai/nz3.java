package ai;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class nz3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f7590a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(nv3 nv3Var) throws IOException {
        return c(nv3Var, true, false);
    }

    public static boolean b(nv3 nv3Var, boolean z10) throws IOException {
        return c(nv3Var, false, false);
    }

    public static boolean c(nv3 nv3Var, boolean z10, boolean z11) throws IOException {
        boolean z12;
        long o10 = nv3Var.o();
        long j10 = -1;
        int i10 = (o10 > (-1L) ? 1 : (o10 == (-1L) ? 0 : -1));
        long j11 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i10 != 0 && o10 <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j11 = o10;
        }
        int i11 = (int) j11;
        hb hbVar = new hb(64);
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        while (i12 < i11) {
            hbVar.i(8);
            if (!nv3Var.c(hbVar.q(), z13 ? 1 : 0, 8, true)) {
                z12 = z13 ? 1 : 0;
                break;
            }
            long B = hbVar.B();
            int D = hbVar.D();
            int i13 = 16;
            if (B == 1) {
                nv3Var.d(hbVar.q(), 8, 8);
                hbVar.n(16);
                B = hbVar.F();
            } else {
                if (B == 0) {
                    long o11 = nv3Var.o();
                    if (o11 != j10) {
                        B = (o11 - nv3Var.k()) + 8;
                    }
                }
                i13 = 8;
            }
            long j12 = i13;
            if (B < j12) {
                return z13;
            }
            i12 += i13;
            if (D == 1836019574) {
                i11 += (int) B;
                if (i10 != 0 && i11 > o10) {
                    i11 = (int) o10;
                }
                j10 = -1;
            } else if (D == 1836019558 || D == 1836475768) {
                z12 = true;
                break;
            } else {
                long j13 = o10;
                if ((i12 + B) - j12 >= i11) {
                    break;
                }
                int i14 = (int) (B - j12);
                i12 += i14;
                if (D == 1718909296) {
                    if (i14 < 8) {
                        return false;
                    }
                    hbVar.i(i14);
                    nv3Var.d(hbVar.q(), 0, i14);
                    int i15 = i14 >> 2;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (i16 == 1) {
                            hbVar.s(4);
                        } else {
                            int D2 = hbVar.D();
                            if ((D2 >>> 8) != 3368816) {
                                if (D2 == 1751476579) {
                                    D2 = 1751476579;
                                }
                                int[] iArr = f7590a;
                                for (int i17 = 0; i17 < 29; i17++) {
                                    if (iArr[i17] != D2) {
                                    }
                                }
                                continue;
                            }
                            z14 = true;
                            break;
                        }
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i14 != 0) {
                    nv3Var.f0(i14);
                }
                o10 = j13;
                j10 = -1;
                z13 = false;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }
}
