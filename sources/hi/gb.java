package hi;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.internal.measurement.zzkh;

/* loaded from: classes3.dex */
public final class gb {
    public static /* synthetic */ void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzkh {
        if (!e(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !e(b12) && !e(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES) + 56320);
            return;
        }
        throw zzkh.c();
    }

    public static /* synthetic */ void b(byte b10, byte b11, char[] cArr, int i10) throws zzkh {
        if (b10 >= -62 && !e(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw zzkh.c();
    }

    public static /* synthetic */ void c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzkh {
        if (!e(b11)) {
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
            if (!e(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw zzkh.c();
    }

    public static /* synthetic */ boolean d(byte b10) {
        return b10 >= 0;
    }

    public static boolean e(byte b10) {
        return b10 > -65;
    }
}
