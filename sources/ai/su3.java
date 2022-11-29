package ai;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.encoder.AACEncoder;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class su3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f9994a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f9995b = {OpusUtil.SAMPLE_RATE, AACEncoder.SAMPLING_RATE, 32000};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f9996c = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f9997d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f9998e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f9999f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f10000g = 0;

    public static v4 a(hb hbVar, String str, String str2, ru3 ru3Var) {
        int i10 = f9995b[(hbVar.v() & PsExtractor.AUDIO_STREAM) >> 6];
        int v10 = hbVar.v();
        int i11 = f9997d[(v10 & 56) >> 3];
        if ((v10 & 4) != 0) {
            i11++;
        }
        t4 t4Var = new t4();
        t4Var.d(str);
        t4Var.n(MimeTypes.AUDIO_AC3);
        t4Var.B(i11);
        t4Var.C(i10);
        t4Var.q(ru3Var);
        t4Var.g(str2);
        return t4Var.I();
    }

    public static v4 b(hb hbVar, String str, String str2, ru3 ru3Var) {
        hbVar.s(2);
        int i10 = f9995b[(hbVar.v() & PsExtractor.AUDIO_STREAM) >> 6];
        int v10 = hbVar.v();
        int i11 = f9997d[(v10 & 14) >> 1];
        if ((v10 & 1) != 0) {
            i11++;
        }
        if (((hbVar.v() & 30) >> 1) > 0 && (2 & hbVar.v()) != 0) {
            i11 += 2;
        }
        String str3 = (hbVar.l() <= 0 || (hbVar.v() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC;
        t4 t4Var = new t4();
        t4Var.d(str);
        t4Var.n(str3);
        t4Var.B(i11);
        t4Var.C(i10);
        t4Var.q(ru3Var);
        t4Var.g(str2);
        return t4Var.I();
    }

    public static qu3 c(gb gbVar) {
        int e10;
        int i10;
        int i11;
        int i12;
        String str;
        int h10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int c10 = gbVar.c();
        gbVar.f(40);
        int h11 = gbVar.h(5);
        gbVar.d(c10);
        int i18 = -1;
        if (h11 > 10) {
            gbVar.f(16);
            int h12 = gbVar.h(2);
            if (h12 == 0) {
                i18 = 0;
            } else if (h12 == 1) {
                i18 = 1;
            } else if (h12 == 2) {
                i18 = 2;
            }
            gbVar.f(3);
            int h13 = gbVar.h(11) + 1;
            e10 = h13 + h13;
            int h14 = gbVar.h(2);
            if (h14 == 3) {
                i13 = 6;
                i10 = f9996c[gbVar.h(2)];
                h10 = 3;
            } else {
                h10 = gbVar.h(2);
                i13 = f9994a[h10];
                i10 = f9995b[h14];
            }
            i12 = i13 * 256;
            int h15 = gbVar.h(3);
            boolean g10 = gbVar.g();
            i11 = f9997d[h15] + (g10 ? 1 : 0);
            gbVar.f(10);
            if (gbVar.g()) {
                gbVar.f(8);
            }
            if (h15 == 0) {
                gbVar.f(5);
                if (gbVar.g()) {
                    gbVar.f(8);
                }
                i14 = 0;
                h15 = 0;
            } else {
                i14 = h15;
            }
            if (i18 == 1) {
                if (gbVar.g()) {
                    gbVar.f(16);
                }
                i15 = 1;
            } else {
                i15 = i18;
            }
            if (gbVar.g()) {
                if (i14 > 2) {
                    gbVar.f(2);
                }
                if ((i14 & 1) != 0 && i14 > 2) {
                    gbVar.f(6);
                }
                if ((i14 & 4) != 0) {
                    gbVar.f(6);
                }
                if (g10 && gbVar.g()) {
                    gbVar.f(5);
                }
                if (i15 == 0) {
                    if (gbVar.g()) {
                        gbVar.f(6);
                    }
                    if (i14 == 0 && gbVar.g()) {
                        gbVar.f(6);
                    }
                    if (gbVar.g()) {
                        gbVar.f(6);
                    }
                    int h16 = gbVar.h(2);
                    if (h16 == 1) {
                        gbVar.f(5);
                    } else if (h16 == 2) {
                        gbVar.f(12);
                    } else if (h16 == 3) {
                        int h17 = gbVar.h(5);
                        if (gbVar.g()) {
                            gbVar.f(5);
                            if (gbVar.g()) {
                                gbVar.f(4);
                            }
                            if (gbVar.g()) {
                                gbVar.f(4);
                            }
                            if (gbVar.g()) {
                                gbVar.f(4);
                            }
                            if (gbVar.g()) {
                                gbVar.f(4);
                            }
                            if (gbVar.g()) {
                                gbVar.f(4);
                            }
                            if (gbVar.g()) {
                                gbVar.f(4);
                            }
                            if (gbVar.g()) {
                                gbVar.f(4);
                            }
                            if (gbVar.g()) {
                                if (gbVar.g()) {
                                    gbVar.f(4);
                                }
                                if (gbVar.g()) {
                                    gbVar.f(4);
                                }
                            }
                        }
                        if (gbVar.g()) {
                            gbVar.f(5);
                            if (gbVar.g()) {
                                gbVar.f(7);
                                if (gbVar.g()) {
                                    i17 = 8;
                                    gbVar.f(8);
                                    gbVar.f((h17 + 2) * i17);
                                    gbVar.j();
                                }
                            }
                        }
                        i17 = 8;
                        gbVar.f((h17 + 2) * i17);
                        gbVar.j();
                    }
                    if (i14 < 2) {
                        if (gbVar.g()) {
                            gbVar.f(14);
                        }
                        if (h15 == 0 && gbVar.g()) {
                            gbVar.f(14);
                        }
                    }
                    if (gbVar.g()) {
                        if (h10 == 0) {
                            gbVar.f(5);
                            i15 = 0;
                            h10 = 0;
                        } else {
                            for (int i19 = 0; i19 < i13; i19++) {
                                if (gbVar.g()) {
                                    gbVar.f(5);
                                }
                            }
                        }
                    }
                    i15 = 0;
                }
            }
            if (gbVar.g()) {
                gbVar.f(5);
                if (i14 == 2) {
                    gbVar.f(4);
                    i14 = 2;
                }
                if (i14 >= 6) {
                    gbVar.f(2);
                }
                if (gbVar.g()) {
                    i16 = 8;
                    gbVar.f(8);
                } else {
                    i16 = 8;
                }
                if (i14 == 0 && gbVar.g()) {
                    gbVar.f(i16);
                }
                if (h14 < 3) {
                    gbVar.e();
                }
            }
            if (i15 == 0 && h10 != 3) {
                gbVar.e();
            }
            if (i15 == 2 && (h10 == 3 || gbVar.g())) {
                gbVar.f(6);
            }
            str = (gbVar.g() && gbVar.h(6) == 1 && gbVar.h(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
        } else {
            gbVar.f(32);
            int h18 = gbVar.h(2);
            String str2 = h18 == 3 ? null : MimeTypes.AUDIO_AC3;
            e10 = e(h18, gbVar.h(6));
            gbVar.f(8);
            int h19 = gbVar.h(3);
            if ((h19 & 1) != 0 && h19 != 1) {
                gbVar.f(2);
            }
            if ((h19 & 4) != 0) {
                gbVar.f(2);
            }
            if (h19 == 2) {
                gbVar.f(2);
            }
            i10 = h18 < 3 ? f9995b[h18] : -1;
            i11 = f9997d[h19] + (gbVar.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
        }
        return new qu3(str, i18, i11, i10, e10, i12, null);
    }

    public static int d(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i10 = ((bArr[3] & TagConstant.TAG_CAT_RESERVED) | ((bArr[2] & 7) << 8)) + 1;
            return i10 + i10;
        }
        byte b10 = bArr[4];
        return e((b10 & 192) >> 6, b10 & 63);
    }

    public static int e(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f9995b[i10];
        if (i13 == 44100) {
            int i14 = f9999f[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = f9998e[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
