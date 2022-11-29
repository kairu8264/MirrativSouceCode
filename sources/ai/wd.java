package ai;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wd {

    /* renamed from: a  reason: collision with root package name */
    public final int f11547a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11548b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11549c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11550d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11551e;

    /* renamed from: f  reason: collision with root package name */
    public final short[] f11552f;

    /* renamed from: g  reason: collision with root package name */
    public int f11553g;

    /* renamed from: h  reason: collision with root package name */
    public short[] f11554h;

    /* renamed from: i  reason: collision with root package name */
    public int f11555i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f11556j;

    /* renamed from: k  reason: collision with root package name */
    public int f11557k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f11558l;

    /* renamed from: q  reason: collision with root package name */
    public int f11563q;

    /* renamed from: r  reason: collision with root package name */
    public int f11564r;

    /* renamed from: s  reason: collision with root package name */
    public int f11565s;

    /* renamed from: t  reason: collision with root package name */
    public int f11566t;

    /* renamed from: v  reason: collision with root package name */
    public int f11568v;

    /* renamed from: w  reason: collision with root package name */
    public int f11569w;

    /* renamed from: x  reason: collision with root package name */
    public int f11570x;

    /* renamed from: m  reason: collision with root package name */
    public int f11559m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f11560n = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f11567u = 0;

    /* renamed from: o  reason: collision with root package name */
    public float f11561o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f11562p = 1.0f;

    public wd(int i10, int i11) {
        this.f11547a = i10;
        this.f11548b = i11;
        this.f11549c = i10 / 400;
        int i12 = i10 / 65;
        this.f11550d = i12;
        int i13 = i12 + i12;
        this.f11551e = i13;
        this.f11552f = new short[i13];
        this.f11553g = i13;
        int i14 = i11 * i13;
        this.f11554h = new short[i14];
        this.f11555i = i13;
        this.f11556j = new short[i14];
        this.f11557k = i13;
        this.f11558l = new short[i14];
    }

    public static void m(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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

    public final void a(float f10) {
        this.f11561o = f10;
    }

    public final void b(float f10) {
        this.f11562p = f10;
    }

    public final void c(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f11548b;
        int i11 = remaining / i10;
        int i12 = i10 * i11;
        h(i11);
        shortBuffer.get(this.f11554h, this.f11563q * this.f11548b, (i12 + i12) / 2);
        this.f11563q += i11;
        l();
    }

    public final void d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f11548b, this.f11564r);
        shortBuffer.put(this.f11556j, 0, this.f11548b * min);
        int i10 = this.f11564r - min;
        this.f11564r = i10;
        short[] sArr = this.f11556j;
        int i11 = this.f11548b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public final void e() {
        int i10;
        int i11 = this.f11563q;
        float f10 = this.f11561o;
        float f11 = this.f11562p;
        int i12 = this.f11564r + ((int) ((((i11 / (f10 / f11)) + this.f11565s) / f11) + 0.5f));
        int i13 = this.f11551e;
        h(i13 + i13 + i11);
        int i14 = 0;
        while (true) {
            int i15 = this.f11551e;
            i10 = i15 + i15;
            int i16 = this.f11548b;
            if (i14 >= i10 * i16) {
                break;
            }
            this.f11554h[(i16 * i11) + i14] = 0;
            i14++;
        }
        this.f11563q += i10;
        l();
        if (this.f11564r > i12) {
            this.f11564r = i12;
        }
        this.f11563q = 0;
        this.f11566t = 0;
        this.f11565s = 0;
    }

    public final int f() {
        return this.f11564r;
    }

    public final void g(int i10) {
        int i11 = this.f11564r;
        int i12 = this.f11555i;
        if (i11 + i10 > i12) {
            int i13 = i12 + (i12 / 2) + i10;
            this.f11555i = i13;
            this.f11556j = Arrays.copyOf(this.f11556j, i13 * this.f11548b);
        }
    }

    public final void h(int i10) {
        int i11 = this.f11563q;
        int i12 = this.f11553g;
        if (i11 + i10 > i12) {
            int i13 = i12 + (i12 / 2) + i10;
            this.f11553g = i13;
            this.f11554h = Arrays.copyOf(this.f11554h, i13 * this.f11548b);
        }
    }

    public final void i(short[] sArr, int i10, int i11) {
        g(i11);
        int i12 = this.f11548b;
        System.arraycopy(sArr, i10 * i12, this.f11556j, this.f11564r * i12, i12 * i11);
        this.f11564r += i11;
    }

    public final void j(short[] sArr, int i10, int i11) {
        int i12 = this.f11551e / i11;
        int i13 = this.f11548b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f11552f[i16] = (short) (i17 / i14);
        }
    }

    public final int k(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f11548b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
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
        this.f11569w = i14 / i16;
        this.f11570x = i17 / i15;
        return i16;
    }

    public final void l() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f11564r;
        float f10 = this.f11561o / this.f11562p;
        double d10 = f10;
        int i19 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            i(this.f11554h, 0, this.f11563q);
            this.f11563q = 0;
        } else {
            int i20 = this.f11563q;
            if (i20 >= this.f11551e) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f11566t;
                    if (i22 > 0) {
                        int min = Math.min(this.f11551e, i22);
                        i(this.f11554h, i21, min);
                        this.f11566t -= min;
                        i21 += min;
                    } else {
                        short[] sArr = this.f11554h;
                        int i23 = this.f11547a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i19;
                        if (this.f11548b == i19 && i24 == i19) {
                            i10 = k(sArr, i21, this.f11549c, this.f11550d);
                        } else {
                            j(sArr, i21, i24);
                            int k10 = k(this.f11552f, 0, this.f11549c / i24, this.f11550d / i24);
                            if (i24 != i19) {
                                int i25 = k10 * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.f11549c;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.f11550d;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.f11548b == i19) {
                                    i10 = k(sArr, i21, i27, i28);
                                } else {
                                    j(sArr, i21, i19);
                                    i10 = k(this.f11552f, 0, i27, i28);
                                }
                            } else {
                                i10 = k10;
                            }
                        }
                        int i31 = this.f11569w;
                        int i32 = (i31 == 0 || (i13 = this.f11567u) == 0 || this.f11570x > i31 * 3 || i31 + i31 <= this.f11568v * 3) ? i10 : i13;
                        this.f11568v = i31;
                        this.f11567u = i10;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.f11554h;
                            if (f10 >= 2.0f) {
                                i12 = (int) (i32 / ((-1.0f) + f10));
                            } else {
                                this.f11566t = (int) ((i32 * (2.0f - f10)) / ((-1.0f) + f10));
                                i12 = i32;
                            }
                            g(i12);
                            int i33 = i12;
                            m(i12, this.f11548b, this.f11556j, this.f11564r, sArr2, i21, sArr2, i21 + i32);
                            this.f11564r += i33;
                            i21 += i32 + i33;
                        } else {
                            int i34 = i32;
                            short[] sArr3 = this.f11554h;
                            if (f10 < 0.5f) {
                                i11 = (int) ((i34 * f10) / (1.0f - f10));
                            } else {
                                this.f11566t = (int) ((i34 * ((f10 + f10) - 1.0f)) / (1.0f - f10));
                                i11 = i34;
                            }
                            int i35 = i34 + i11;
                            g(i35);
                            int i36 = this.f11548b;
                            System.arraycopy(sArr3, i21 * i36, this.f11556j, this.f11564r * i36, i36 * i34);
                            m(i11, this.f11548b, this.f11556j, this.f11564r + i34, sArr3, i34 + i21, sArr3, i21);
                            this.f11564r += i35;
                            i21 += i11;
                        }
                    }
                    if (this.f11551e + i21 > i20) {
                        break;
                    }
                    i19 = 1;
                }
                int i37 = this.f11563q - i21;
                short[] sArr4 = this.f11554h;
                int i38 = this.f11548b;
                System.arraycopy(sArr4, i21 * i38, sArr4, 0, i38 * i37);
                this.f11563q = i37;
            }
        }
        float f11 = this.f11562p;
        if (f11 == 1.0f || this.f11564r == i18) {
            return;
        }
        int i39 = this.f11547a;
        int i40 = (int) (i39 / f11);
        while (true) {
            if (i40 <= 16384 && i39 <= 16384) {
                break;
            }
            i40 /= 2;
            i39 /= 2;
        }
        int i41 = this.f11564r - i18;
        int i42 = this.f11565s;
        int i43 = this.f11557k;
        if (i42 + i41 > i43) {
            int i44 = i43 + (i43 / 2) + i41;
            this.f11557k = i44;
            this.f11558l = Arrays.copyOf(this.f11558l, i44 * this.f11548b);
        }
        short[] sArr5 = this.f11556j;
        int i45 = this.f11548b;
        System.arraycopy(sArr5, i18 * i45, this.f11558l, this.f11565s * i45, i45 * i41);
        this.f11564r = i18;
        this.f11565s += i41;
        int i46 = 0;
        while (true) {
            i14 = this.f11565s;
            i15 = i14 - 1;
            if (i46 >= i15) {
                break;
            }
            while (true) {
                i16 = this.f11559m + 1;
                i17 = this.f11560n;
                if (i16 * i40 <= i17 * i39) {
                    break;
                }
                g(1);
                int i47 = 0;
                while (true) {
                    int i48 = this.f11548b;
                    if (i47 < i48) {
                        short[] sArr6 = this.f11556j;
                        int i49 = this.f11564r;
                        short[] sArr7 = this.f11558l;
                        int i50 = (i46 * i48) + i47;
                        short s10 = sArr7[i50];
                        short s11 = sArr7[i50 + i48];
                        int i51 = this.f11560n;
                        int i52 = this.f11559m;
                        int i53 = (i52 + 1) * i40;
                        int i54 = i53 - (i51 * i39);
                        int i55 = i53 - (i52 * i40);
                        sArr6[(i49 * i48) + i47] = (short) (((s10 * i54) + ((i55 - i54) * s11)) / i55);
                        i47++;
                    }
                }
                this.f11560n++;
                this.f11564r++;
            }
            this.f11559m = i16;
            if (i16 == i39) {
                this.f11559m = 0;
                fj.d(i17 == i40);
                this.f11560n = 0;
            }
            i46++;
        }
        if (i15 != 0) {
            short[] sArr8 = this.f11558l;
            int i56 = this.f11548b;
            System.arraycopy(sArr8, i15 * i56, sArr8, 0, (i14 - i15) * i56);
            this.f11565s -= i15;
        }
    }
}
