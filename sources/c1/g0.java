package c1;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;

/* loaded from: classes.dex */
public final class g0 implements Comparable<g0> {
    public static final float J;

    /* renamed from: w  reason: collision with root package name */
    public static final a f18668w = new a(null);

    /* renamed from: x  reason: collision with root package name */
    public static final short f18669x = c(5120);

    /* renamed from: y  reason: collision with root package name */
    public static final short f18670y = c(-1025);

    /* renamed from: z  reason: collision with root package name */
    public static final short f18671z = c(31743);
    public static final short A = c(SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL);
    public static final short B = c(1);
    public static final short C = c(32256);
    public static final short D = c(-1024);
    public static final short E = c(Short.MIN_VALUE);
    public static final short F = c(31744);
    public static final short G = c(0);
    public static final short H = a(1.0f);
    public static final short I = a(-1.0f);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final short b(float f10) {
            int i10;
            int i11;
            int floatToRawIntBits = Float.floatToRawIntBits(f10);
            int i12 = floatToRawIntBits >>> 31;
            int i13 = (floatToRawIntBits >>> 23) & 255;
            int i14 = floatToRawIntBits & 8388607;
            if (i13 == 255) {
                i10 = i14 != 0 ? 512 : 0;
                r3 = 31;
            } else {
                int i15 = (i13 - 127) + 15;
                if (i15 >= 31) {
                    r3 = 49;
                    i10 = 0;
                } else if (i15 > 0) {
                    int i16 = i14 >> 13;
                    if ((i14 & 4096) != 0) {
                        i11 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                        return (short) i11;
                    }
                    i10 = i16;
                    r3 = i15;
                } else if (i15 >= -10) {
                    int i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i10 = i17 >> 13;
                } else {
                    i10 = 0;
                }
            }
            i11 = i10 | (i12 << 15) | (r3 << 10);
            return (short) i11;
        }
    }

    static {
        jo.i iVar = jo.i.f38148a;
        J = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f10) {
        return c(f18668w.b(f10));
    }

    public static short c(short s10) {
        return s10;
    }

    public static final float e(short s10) {
        int i10;
        int i11;
        int i12 = s10 & 65535;
        int i13 = 32768 & i12;
        int i14 = (i12 >>> 10) & 31;
        int i15 = i12 & AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES;
        int i16 = 0;
        if (i14 != 0) {
            int i17 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i10 = (i14 - 15) + 127;
            }
            int i18 = i17;
            i16 = i10;
            i11 = i18;
        } else if (i15 != 0) {
            jo.i iVar = jo.i.f38148a;
            float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - J;
            return i13 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i11 = 0;
        }
        int i19 = i11 | (i13 << 16) | (i16 << 23);
        jo.i iVar2 = jo.i.f38148a;
        return Float.intBitsToFloat(i19);
    }
}
