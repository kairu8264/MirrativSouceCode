package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzaha;

/* loaded from: classes3.dex */
public final class o14 implements l24 {

    /* renamed from: a  reason: collision with root package name */
    public final x04 f7610a;

    /* renamed from: b  reason: collision with root package name */
    public final gb f7611b = new gb(new byte[10], 10);

    /* renamed from: c  reason: collision with root package name */
    public int f7612c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f7613d;

    /* renamed from: e  reason: collision with root package name */
    public pb f7614e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7615f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7616g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7617h;

    /* renamed from: i  reason: collision with root package name */
    public int f7618i;

    /* renamed from: j  reason: collision with root package name */
    public int f7619j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7620k;

    public o14(x04 x04Var) {
        this.f7610a = x04Var;
    }

    @Override // ai.l24
    public final void a(pb pbVar, pv3 pv3Var, k24 k24Var) {
        this.f7614e = pbVar;
        this.f7610a.a(pv3Var, k24Var);
    }

    @Override // ai.l24
    public final void b(hb hbVar, int i10) throws zzaha {
        int i11;
        long j10;
        u9.e(this.f7614e);
        int i12 = -1;
        int i13 = 2;
        if ((i10 & 1) != 0) {
            int i14 = this.f7612c;
            if (i14 != 0 && i14 != 1) {
                if (i14 != 2) {
                    int i15 = this.f7619j;
                    if (i15 != -1) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i15);
                        sb2.append(" more bytes");
                        Log.w("PesReader", sb2.toString());
                    }
                    this.f7610a.c();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            c(1);
        }
        int i16 = i10;
        while (hbVar.l() > 0) {
            int i17 = this.f7612c;
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != i13) {
                        int l10 = hbVar.l();
                        int i18 = this.f7619j;
                        int i19 = i18 != i12 ? l10 - i18 : 0;
                        if (i19 > 0) {
                            l10 -= i19;
                            hbVar.n(hbVar.o() + l10);
                        }
                        this.f7610a.b(hbVar);
                        int i20 = this.f7619j;
                        if (i20 != i12) {
                            int i21 = i20 - l10;
                            this.f7619j = i21;
                            if (i21 == 0) {
                                this.f7610a.c();
                                c(1);
                            }
                        }
                    } else {
                        if (d(hbVar, this.f7611b.f4375a, Math.min(10, this.f7618i)) && d(hbVar, null, this.f7618i)) {
                            this.f7611b.d(0);
                            if (this.f7615f) {
                                this.f7611b.f(4);
                                int h10 = this.f7611b.h(3);
                                this.f7611b.f(1);
                                int h11 = this.f7611b.h(15);
                                this.f7611b.f(1);
                                long h12 = (h11 << 15) | (h10 << 30) | this.f7611b.h(15);
                                this.f7611b.f(1);
                                if (!this.f7617h && this.f7616g) {
                                    this.f7611b.f(4);
                                    int h13 = this.f7611b.h(3);
                                    this.f7611b.f(1);
                                    int h14 = this.f7611b.h(15);
                                    this.f7611b.f(1);
                                    int h15 = this.f7611b.h(15);
                                    this.f7611b.f(1);
                                    this.f7614e.e((h13 << 30) | (h14 << 15) | h15);
                                    this.f7617h = true;
                                }
                                j10 = this.f7614e.e(h12);
                            } else {
                                j10 = C.TIME_UNSET;
                            }
                            i16 |= true != this.f7620k ? 0 : 4;
                            this.f7610a.d(j10, i16);
                            c(3);
                            i12 = -1;
                            i13 = 2;
                        }
                    }
                    i11 = i13;
                } else if (d(hbVar, this.f7611b.f4375a, 9)) {
                    int i22 = 0;
                    this.f7611b.d(0);
                    int h16 = this.f7611b.h(24);
                    if (h16 != 1) {
                        StringBuilder sb3 = new StringBuilder(41);
                        sb3.append("Unexpected start code prefix: ");
                        sb3.append(h16);
                        Log.w("PesReader", sb3.toString());
                        i12 = -1;
                        this.f7619j = -1;
                        i11 = 2;
                    } else {
                        this.f7611b.f(8);
                        int h17 = this.f7611b.h(16);
                        this.f7611b.f(5);
                        this.f7620k = this.f7611b.g();
                        i11 = 2;
                        this.f7611b.f(2);
                        this.f7615f = this.f7611b.g();
                        this.f7616g = this.f7611b.g();
                        this.f7611b.f(6);
                        int h18 = this.f7611b.h(8);
                        this.f7618i = h18;
                        if (h17 == 0) {
                            this.f7619j = -1;
                            i12 = -1;
                        } else {
                            int i23 = (h17 - 3) - h18;
                            this.f7619j = i23;
                            if (i23 < 0) {
                                StringBuilder sb4 = new StringBuilder(47);
                                sb4.append("Found negative packet payload size: ");
                                sb4.append(i23);
                                Log.w("PesReader", sb4.toString());
                                i12 = -1;
                                this.f7619j = -1;
                            } else {
                                i12 = -1;
                            }
                        }
                        i22 = 2;
                    }
                    c(i22);
                } else {
                    i12 = -1;
                    i11 = 2;
                }
            } else {
                i11 = i13;
                hbVar.s(hbVar.l());
            }
            i13 = i11;
        }
    }

    public final void c(int i10) {
        this.f7612c = i10;
        this.f7613d = 0;
    }

    public final boolean d(hb hbVar, byte[] bArr, int i10) {
        int min = Math.min(hbVar.l(), i10 - this.f7613d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            hbVar.s(min);
        } else {
            hbVar.u(bArr, this.f7613d, min);
        }
        int i11 = this.f7613d + min;
        this.f7613d = i11;
        return i11 == i10;
    }

    @Override // ai.l24
    public final void zzb() {
        this.f7612c = 0;
        this.f7613d = 0;
        this.f7617h = false;
        this.f7610a.zza();
    }
}
