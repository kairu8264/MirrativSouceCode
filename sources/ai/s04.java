package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class s04 implements x04 {

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f9647v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9648a;

    /* renamed from: b  reason: collision with root package name */
    public final gb f9649b = new gb(new byte[7], 7);

    /* renamed from: c  reason: collision with root package name */
    public final hb f9650c = new hb(Arrays.copyOf(f9647v, 10));

    /* renamed from: d  reason: collision with root package name */
    public final String f9651d;

    /* renamed from: e  reason: collision with root package name */
    public String f9652e;

    /* renamed from: f  reason: collision with root package name */
    public pw3 f9653f;

    /* renamed from: g  reason: collision with root package name */
    public pw3 f9654g;

    /* renamed from: h  reason: collision with root package name */
    public int f9655h;

    /* renamed from: i  reason: collision with root package name */
    public int f9656i;

    /* renamed from: j  reason: collision with root package name */
    public int f9657j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9658k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9659l;

    /* renamed from: m  reason: collision with root package name */
    public int f9660m;

    /* renamed from: n  reason: collision with root package name */
    public int f9661n;

    /* renamed from: o  reason: collision with root package name */
    public int f9662o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f9663p;

    /* renamed from: q  reason: collision with root package name */
    public long f9664q;

    /* renamed from: r  reason: collision with root package name */
    public int f9665r;

    /* renamed from: s  reason: collision with root package name */
    public long f9666s;

    /* renamed from: t  reason: collision with root package name */
    public pw3 f9667t;

    /* renamed from: u  reason: collision with root package name */
    public long f9668u;

    public s04(boolean z10, String str) {
        h();
        this.f9660m = -1;
        this.f9661n = -1;
        this.f9664q = C.TIME_UNSET;
        this.f9666s = C.TIME_UNSET;
        this.f9648a = z10;
        this.f9651d = str;
    }

    public static boolean e(int i10) {
        return (i10 & 65526) == 65520;
    }

    public static final boolean k(byte b10, byte b11) {
        return e((b11 & TagConstant.TAG_CAT_RESERVED) | 65280);
    }

    public static final boolean l(hb hbVar, byte[] bArr, int i10) {
        if (hbVar.l() < i10) {
            return false;
        }
        hbVar.u(bArr, 0, i10);
        return true;
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f9652e = k24Var.c();
        pw3 p10 = pv3Var.p(k24Var.b(), 1);
        this.f9653f = p10;
        this.f9667t = p10;
        if (this.f9648a) {
            k24Var.a();
            pw3 p11 = pv3Var.p(k24Var.b(), 5);
            this.f9654g = p11;
            t4 t4Var = new t4();
            t4Var.d(k24Var.c());
            t4Var.n(MimeTypes.APPLICATION_ID3);
            p11.b(t4Var.I());
            return;
        }
        this.f9654g = new lv3();
    }

    @Override // ai.x04
    public final void b(hb hbVar) throws zzaha {
        int i10;
        int i11;
        int i12;
        int i13;
        Objects.requireNonNull(this.f9653f);
        int i14 = sb.f9778a;
        while (hbVar.l() > 0) {
            int i15 = this.f9655h;
            int i16 = 13;
            int i17 = 2;
            if (i15 == 0) {
                byte[] q10 = hbVar.q();
                int o10 = hbVar.o();
                int m10 = hbVar.m();
                while (true) {
                    if (o10 < m10) {
                        i10 = o10 + 1;
                        i11 = q10[o10] & TagConstant.TAG_CAT_RESERVED;
                        if (this.f9657j == 512 && k((byte) -1, (byte) i11)) {
                            if (!this.f9659l) {
                                int i18 = i10 - 2;
                                hbVar.p(i18 + 1);
                                if (l(hbVar, this.f9649b.f4375a, 1)) {
                                    this.f9649b.d(4);
                                    int h10 = this.f9649b.h(1);
                                    int i19 = this.f9660m;
                                    if (i19 == -1 || h10 == i19) {
                                        if (this.f9661n != -1) {
                                            if (!l(hbVar, this.f9649b.f4375a, 1)) {
                                                break;
                                            }
                                            this.f9649b.d(i17);
                                            if (this.f9649b.h(4) == this.f9661n) {
                                                hbVar.p(i18 + 2);
                                            }
                                        }
                                        if (!l(hbVar, this.f9649b.f4375a, 4)) {
                                            break;
                                        }
                                        this.f9649b.d(14);
                                        int h11 = this.f9649b.h(i16);
                                        if (h11 >= 7) {
                                            byte[] q11 = hbVar.q();
                                            int m11 = hbVar.m();
                                            int i20 = i18 + h11;
                                            if (i20 >= m11) {
                                                break;
                                            } else if ((r8 = q11[i20]) == -1) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i21 = this.f9657j;
                        int i22 = i21 | i11;
                        if (i22 == 329) {
                            i12 = 2;
                            i13 = 768;
                        } else if (i22 == 511) {
                            i12 = 2;
                            i13 = 512;
                        } else if (i22 == 836) {
                            i12 = 2;
                            i13 = 1024;
                        } else if (i22 == 1075) {
                            this.f9655h = 2;
                            this.f9656i = 3;
                            this.f9665r = 0;
                            this.f9650c.p(0);
                            hbVar.p(i10);
                            break;
                        } else if (i21 != 256) {
                            this.f9657j = 256;
                            o10 = i10 - 1;
                            i16 = 13;
                            i17 = 2;
                        } else {
                            i12 = 2;
                            i17 = i12;
                            o10 = i10;
                            i16 = 13;
                        }
                        this.f9657j = i13;
                        i17 = i12;
                        o10 = i10;
                        i16 = 13;
                    } else {
                        hbVar.p(o10);
                        break;
                    }
                }
                this.f9662o = (i11 & 8) >> 3;
                this.f9658k = 1 == ((i11 & 1) ^ 1);
                if (this.f9659l) {
                    j();
                } else {
                    this.f9655h = 1;
                    this.f9656i = 0;
                }
                hbVar.p(i10);
            } else if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        int min = Math.min(hbVar.l(), this.f9665r - this.f9656i);
                        this.f9667t.a(hbVar, min);
                        int i23 = this.f9656i + min;
                        this.f9656i = i23;
                        int i24 = this.f9665r;
                        if (i23 == i24) {
                            long j10 = this.f9666s;
                            if (j10 != C.TIME_UNSET) {
                                this.f9667t.e(j10, 1, i24, 0, null);
                                this.f9666s += this.f9668u;
                            }
                            h();
                        }
                    } else {
                        if (g(hbVar, this.f9649b.f4375a, true != this.f9658k ? 5 : 7)) {
                            this.f9649b.d(0);
                            if (!this.f9663p) {
                                int h12 = this.f9649b.h(2) + 1;
                                if (h12 != 2) {
                                    StringBuilder sb2 = new StringBuilder(61);
                                    sb2.append("Detected audio object type: ");
                                    sb2.append(h12);
                                    sb2.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb2.toString());
                                }
                                this.f9649b.f(5);
                                int h13 = this.f9649b.h(3);
                                int i25 = this.f9661n;
                                int i26 = ou3.f7922c;
                                byte[] bArr = {(byte) (((i25 >> 1) & 7) | 16), (byte) (((h13 << 3) & 120) | ((i25 << 7) & 128))};
                                mu3 a10 = ou3.a(bArr);
                                t4 t4Var = new t4();
                                t4Var.d(this.f9652e);
                                t4Var.n(MimeTypes.AUDIO_AAC);
                                t4Var.k(a10.f7066c);
                                t4Var.B(a10.f7065b);
                                t4Var.C(a10.f7064a);
                                t4Var.p(Collections.singletonList(bArr));
                                t4Var.g(this.f9651d);
                                v4 I = t4Var.I();
                                this.f9664q = 1024000000 / I.f10974z;
                                this.f9653f.b(I);
                                this.f9663p = true;
                            } else {
                                this.f9649b.f(10);
                            }
                            this.f9649b.f(4);
                            int h14 = this.f9649b.h(13) - 7;
                            if (this.f9658k) {
                                h14 -= 2;
                            }
                            i(this.f9653f, this.f9664q, 0, h14);
                        }
                    }
                } else if (g(hbVar, this.f9650c.q(), 10)) {
                    this.f9654g.a(this.f9650c, 10);
                    this.f9650c.p(6);
                    i(this.f9654g, 0L, 10, 10 + this.f9650c.a());
                }
            } else if (hbVar.l() != 0) {
                this.f9649b.f4375a[0] = hbVar.q()[hbVar.o()];
                this.f9649b.d(2);
                int h15 = this.f9649b.h(4);
                int i27 = this.f9661n;
                if (i27 != -1 && h15 != i27) {
                    f();
                } else {
                    if (!this.f9659l) {
                        this.f9659l = true;
                        this.f9660m = this.f9662o;
                        this.f9661n = h15;
                    }
                    j();
                }
            }
        }
    }

    @Override // ai.x04
    public final void c() {
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f9666s = j10;
        }
    }

    public final void f() {
        this.f9659l = false;
        h();
    }

    public final boolean g(hb hbVar, byte[] bArr, int i10) {
        int min = Math.min(hbVar.l(), i10 - this.f9656i);
        hbVar.u(bArr, this.f9656i, min);
        int i11 = this.f9656i + min;
        this.f9656i = i11;
        return i11 == i10;
    }

    public final void h() {
        this.f9655h = 0;
        this.f9656i = 0;
        this.f9657j = 256;
    }

    public final void i(pw3 pw3Var, long j10, int i10, int i11) {
        this.f9655h = 4;
        this.f9656i = i10;
        this.f9667t = pw3Var;
        this.f9668u = j10;
        this.f9665r = i11;
    }

    public final void j() {
        this.f9655h = 3;
        this.f9656i = 0;
    }

    @Override // ai.x04
    public final void zza() {
        this.f9666s = C.TIME_UNSET;
        f();
    }
}
