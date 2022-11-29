package ai;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public final class ol3 {
    public static /* synthetic */ boolean a(byte b10) {
        return b10 >= 0;
    }

    public static /* synthetic */ boolean b(byte b10) {
        return b10 < -32;
    }

    public static /* synthetic */ boolean c(byte b10) {
        return b10 < -16;
    }

    public static /* synthetic */ void d(byte b10, byte b11, char[] cArr, int i10) throws zzggm {
        if (b10 >= -62 && !g(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw zzggm.l();
    }

    public static /* synthetic */ void e(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzggm {
        if (!g(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!g(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw zzggm.l();
    }

    public static /* synthetic */ void f(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzggm {
        if (!g(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !g(b12) && !g(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES) + 56320);
            return;
        }
        throw zzggm.l();
    }

    public static boolean g(byte b10) {
        return b10 > -65;
    }
}
