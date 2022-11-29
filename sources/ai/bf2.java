package ai;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class bf2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f2301a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2302b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2303c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2304d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2305e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2306f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2307g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2308h;

    /* renamed from: i  reason: collision with root package name */
    public final short[] f2309i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f2310j;

    /* renamed from: k  reason: collision with root package name */
    public int f2311k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f2312l;

    /* renamed from: m  reason: collision with root package name */
    public int f2313m;

    /* renamed from: n  reason: collision with root package name */
    public short[] f2314n;

    /* renamed from: o  reason: collision with root package name */
    public int f2315o;

    /* renamed from: p  reason: collision with root package name */
    public int f2316p;

    /* renamed from: q  reason: collision with root package name */
    public int f2317q;

    /* renamed from: r  reason: collision with root package name */
    public int f2318r;

    /* renamed from: s  reason: collision with root package name */
    public int f2319s;

    /* renamed from: t  reason: collision with root package name */
    public int f2320t;

    /* renamed from: u  reason: collision with root package name */
    public int f2321u;

    /* renamed from: v  reason: collision with root package name */
    public int f2322v;

    public bf2(int i10, int i11, float f10, float f11, int i12) {
        this.f2301a = i10;
        this.f2302b = i11;
        this.f2303c = f10;
        this.f2304d = f11;
        this.f2305e = i10 / i12;
        this.f2306f = i10 / 400;
        int i13 = i10 / 65;
        this.f2307g = i13;
        int i14 = i13 + i13;
        this.f2308h = i14;
        this.f2309i = new short[i14];
        int i15 = i14 * i11;
        this.f2310j = new short[i15];
        this.f2312l = new short[i15];
        this.f2314n = new short[i15];
    }

    public static void l(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final int a() {
        int i10 = this.f2311k * this.f2302b;
        return i10 + i10;
    }

    public final void b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f2302b;
        int i11 = remaining / i10;
        int i12 = i10 * i11;
        short[] g10 = g(this.f2310j, this.f2311k, i11);
        this.f2310j = g10;
        shortBuffer.get(g10, this.f2311k * this.f2302b, (i12 + i12) / 2);
        this.f2311k += i11;
        k();
    }

    public final void c(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f2302b, this.f2313m);
        shortBuffer.put(this.f2312l, 0, this.f2302b * min);
        int i10 = this.f2313m - min;
        this.f2313m = i10;
        short[] sArr = this.f2312l;
        int i11 = this.f2302b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public final void d() {
        int i10;
        int i11 = this.f2311k;
        float f10 = this.f2303c;
        float f11 = this.f2304d;
        int i12 = this.f2313m + ((int) ((((i11 / (f10 / f11)) + this.f2315o) / (this.f2305e * f11)) + 0.5f));
        short[] sArr = this.f2310j;
        int i13 = this.f2308h;
        this.f2310j = g(sArr, i11, i13 + i13 + i11);
        int i14 = 0;
        while (true) {
            int i15 = this.f2308h;
            i10 = i15 + i15;
            int i16 = this.f2302b;
            if (i14 >= i10 * i16) {
                break;
            }
            this.f2310j[(i16 * i11) + i14] = 0;
            i14++;
        }
        this.f2311k += i10;
        k();
        if (this.f2313m > i12) {
            this.f2313m = i12;
        }
        this.f2311k = 0;
        this.f2318r = 0;
        this.f2315o = 0;
    }

    public final void e() {
        this.f2311k = 0;
        this.f2313m = 0;
        this.f2315o = 0;
        this.f2316p = 0;
        this.f2317q = 0;
        this.f2318r = 0;
        this.f2319s = 0;
        this.f2320t = 0;
        this.f2321u = 0;
        this.f2322v = 0;
    }

    public final int f() {
        int i10 = this.f2313m * this.f2302b;
        return i10 + i10;
    }

    public final short[] g(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f2302b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final void h(short[] sArr, int i10, int i11) {
        short[] g10 = g(this.f2312l, this.f2313m, i11);
        this.f2312l = g10;
        int i12 = this.f2302b;
        System.arraycopy(sArr, i10 * i12, g10, this.f2313m * i12, i12 * i11);
        this.f2313m += i11;
    }

    public final void i(short[] sArr, int i10, int i11) {
        int i12 = this.f2308h / i11;
        int i13 = this.f2302b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f2309i[i16] = (short) (i17 / i14);
        }
    }

    public final int j(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f2302b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            int i20 = i18 * i16;
            int i21 = i14 * i11;
            if (i20 < i21) {
                i14 = i18;
            }
            if (i20 < i21) {
                i16 = i11;
            }
            int i22 = i18 * i15;
            int i23 = i17 * i11;
            if (i22 > i23) {
                i17 = i18;
            }
            if (i22 > i23) {
                i15 = i11;
            }
            i11++;
        }
        this.f2321u = i14 / i16;
        this.f2322v = i17 / i15;
        return i16;
    }

    public final void k() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f2313m;
        float f10 = this.f2303c;
        float f11 = this.f2304d;
        float f12 = f10 / f11;
        float f13 = this.f2305e * f11;
        double d10 = f12;
        float f14 = 1.0f;
        int i19 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            h(this.f2310j, 0, this.f2311k);
            this.f2311k = 0;
        } else {
            int i20 = this.f2311k;
            if (i20 >= this.f2308h) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f2318r;
                    if (i22 > 0) {
                        int min = Math.min(this.f2308h, i22);
                        h(this.f2310j, i21, min);
                        this.f2318r -= min;
                        i21 += min;
                    } else {
                        short[] sArr = this.f2310j;
                        int i23 = this.f2301a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i19;
                        if (this.f2302b == i19 && i24 == i19) {
                            i10 = j(sArr, i21, this.f2306f, this.f2307g);
                        } else {
                            i(sArr, i21, i24);
                            int j10 = j(this.f2309i, 0, this.f2306f / i24, this.f2307g / i24);
                            if (i24 != i19) {
                                int i25 = j10 * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.f2306f;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.f2307g;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.f2302b == i19) {
                                    i10 = j(sArr, i21, i27, i28);
                                } else {
                                    i(sArr, i21, i19);
                                    i10 = j(this.f2309i, 0, i27, i28);
                                }
                            } else {
                                i10 = j10;
                            }
                        }
                        int i31 = this.f2321u;
                        int i32 = (i31 == 0 || (i13 = this.f2319s) == 0 || this.f2322v > i31 * 3 || i31 + i31 <= this.f2320t * 3) ? i10 : i13;
                        this.f2320t = i31;
                        this.f2319s = i10;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.f2310j;
                            if (f12 >= 2.0f) {
                                i12 = (int) (i32 / ((-1.0f) + f12));
                            } else {
                                this.f2318r = (int) ((i32 * (2.0f - f12)) / ((-1.0f) + f12));
                                i12 = i32;
                            }
                            short[] g10 = g(this.f2312l, this.f2313m, i12);
                            this.f2312l = g10;
                            int i33 = i12;
                            l(i12, this.f2302b, g10, this.f2313m, sArr2, i21, sArr2, i21 + i32);
                            this.f2313m += i33;
                            i21 += i32 + i33;
                        } else {
                            int i34 = i32;
                            short[] sArr3 = this.f2310j;
                            if (f12 < 0.5f) {
                                i11 = (int) ((i34 * f12) / (f14 - f12));
                            } else {
                                this.f2318r = (int) ((i34 * ((f12 + f12) - 1.0f)) / (f14 - f12));
                                i11 = i34;
                            }
                            int i35 = i34 + i11;
                            short[] g11 = g(this.f2312l, this.f2313m, i35);
                            this.f2312l = g11;
                            int i36 = this.f2302b;
                            System.arraycopy(sArr3, i21 * i36, g11, this.f2313m * i36, i36 * i34);
                            l(i11, this.f2302b, this.f2312l, this.f2313m + i34, sArr3, i21 + i34, sArr3, i21);
                            this.f2313m += i35;
                            i21 += i11;
                        }
                    }
                    if (this.f2308h + i21 > i20) {
                        break;
                    }
                    f14 = 1.0f;
                    i19 = 1;
                }
                int i37 = this.f2311k - i21;
                short[] sArr4 = this.f2310j;
                int i38 = this.f2302b;
                System.arraycopy(sArr4, i21 * i38, sArr4, 0, i38 * i37);
                this.f2311k = i37;
                f14 = 1.0f;
            }
        }
        if (f13 == f14 || this.f2313m == i18) {
            return;
        }
        int i39 = this.f2301a;
        int i40 = (int) (i39 / f13);
        while (true) {
            if (i40 <= 16384 && i39 <= 16384) {
                break;
            }
            i40 /= 2;
            i39 /= 2;
        }
        int i41 = this.f2313m - i18;
        short[] g12 = g(this.f2314n, this.f2315o, i41);
        this.f2314n = g12;
        short[] sArr5 = this.f2312l;
        int i42 = this.f2302b;
        System.arraycopy(sArr5, i18 * i42, g12, this.f2315o * i42, i42 * i41);
        this.f2313m = i18;
        this.f2315o += i41;
        int i43 = 0;
        while (true) {
            i14 = this.f2315o;
            i15 = i14 - 1;
            if (i43 >= i15) {
                break;
            }
            while (true) {
                i16 = this.f2316p + 1;
                i17 = this.f2317q;
                if (i16 * i40 <= i17 * i39) {
                    break;
                }
                this.f2312l = g(this.f2312l, this.f2313m, 1);
                int i44 = 0;
                while (true) {
                    int i45 = this.f2302b;
                    if (i44 < i45) {
                        short[] sArr6 = this.f2312l;
                        int i46 = this.f2313m;
                        short[] sArr7 = this.f2314n;
                        int i47 = (i43 * i45) + i44;
                        short s10 = sArr7[i47];
                        short s11 = sArr7[i47 + i45];
                        int i48 = this.f2317q;
                        int i49 = this.f2316p;
                        int i50 = (i49 + 1) * i40;
                        int i51 = i50 - (i48 * i39);
                        int i52 = i50 - (i49 * i40);
                        sArr6[(i46 * i45) + i44] = (short) (((s10 * i51) + ((i52 - i51) * s11)) / i52);
                        i44++;
                    }
                }
                this.f2317q++;
                this.f2313m++;
            }
            this.f2316p = i16;
            if (i16 == i39) {
                this.f2316p = 0;
                u9.d(i17 == i40);
                this.f2317q = 0;
            }
            i43++;
        }
        if (i15 != 0) {
            short[] sArr8 = this.f2314n;
            int i53 = this.f2302b;
            System.arraycopy(sArr8, i15 * i53, sArr8, 0, (i14 - i15) * i53);
            this.f2315o -= i15;
        }
    }
}
