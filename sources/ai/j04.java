package ai;

import android.util.Log;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
public final class j04 extends h04 {

    /* renamed from: n  reason: collision with root package name */
    public i04 f5576n;

    /* renamed from: o  reason: collision with root package name */
    public int f5577o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5578p;

    /* renamed from: q  reason: collision with root package name */
    public uw3 f5579q;

    /* renamed from: r  reason: collision with root package name */
    public rw3 f5580r;

    @Override // ai.h04
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f5576n = null;
            this.f5579q = null;
            this.f5580r = null;
        }
        this.f5577o = 0;
        this.f5578p = false;
    }

    @Override // ai.h04
    public final long b(hb hbVar) {
        if ((hbVar.q()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = hbVar.q()[0];
        i04 i04Var = this.f5576n;
        u9.e(i04Var);
        int i10 = !i04Var.f5071d[(b10 >> 1) & (255 >>> (8 - i04Var.f5072e))].f10487a ? i04Var.f5068a.f10866e : i04Var.f5068a.f10867f;
        long j10 = this.f5578p ? (this.f5577o + i10) / 4 : 0;
        if (hbVar.r() < hbVar.m() + 4) {
            byte[] copyOf = Arrays.copyOf(hbVar.q(), hbVar.m() + 4);
            hbVar.j(copyOf, copyOf.length);
        } else {
            hbVar.n(hbVar.m() + 4);
        }
        byte[] q10 = hbVar.q();
        q10[hbVar.m() - 4] = (byte) (j10 & 255);
        q10[hbVar.m() - 3] = (byte) ((j10 >>> 8) & 255);
        q10[hbVar.m() - 2] = (byte) ((j10 >>> 16) & 255);
        q10[hbVar.m() - 1] = (byte) ((j10 >>> 24) & 255);
        this.f5578p = true;
        this.f5577o = i10;
        return j10;
    }

    @Override // ai.h04
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(hb hbVar, long j10, f04 f04Var) throws IOException {
        i04 i04Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f5576n != null) {
            Objects.requireNonNull(f04Var.f3873a);
            return false;
        }
        uw3 uw3Var = this.f5579q;
        if (uw3Var == null) {
            vw3.c(1, hbVar, false);
            int c10 = hbVar.c();
            int v10 = hbVar.v();
            int c11 = hbVar.c();
            int E = hbVar.E();
            int i16 = E <= 0 ? -1 : E;
            int E2 = hbVar.E();
            int i17 = E2 <= 0 ? -1 : E2;
            int E3 = hbVar.E();
            int i18 = E3 <= 0 ? -1 : E3;
            int v11 = hbVar.v();
            this.f5579q = new uw3(c10, v10, c11, i16, i17, i18, (int) Math.pow(2.0d, v11 & 15), (int) Math.pow(2.0d, (v11 & PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (hbVar.v() & 1), Arrays.copyOf(hbVar.q(), hbVar.m()));
        } else {
            rw3 rw3Var = this.f5580r;
            if (rw3Var == null) {
                this.f5580r = vw3.b(hbVar, true, true);
            } else {
                byte[] bArr = new byte[hbVar.m()];
                System.arraycopy(hbVar.q(), 0, bArr, 0, hbVar.m());
                int i19 = uw3Var.f10862a;
                int i20 = 5;
                vw3.c(5, hbVar, false);
                int v12 = hbVar.v() + 1;
                qw3 qw3Var = new qw3(hbVar.q());
                qw3Var.c(hbVar.o() * 8);
                int i21 = 0;
                while (i21 < v12) {
                    if (qw3Var.b(24) == 5653314) {
                        int b10 = qw3Var.b(16);
                        int b11 = qw3Var.b(24);
                        long[] jArr = new long[b11];
                        long j11 = 0;
                        if (!qw3Var.a()) {
                            boolean a10 = qw3Var.a();
                            int i22 = 0;
                            while (i22 < b11) {
                                if (a10) {
                                    if (qw3Var.a()) {
                                        i15 = v12;
                                        jArr[i22] = qw3Var.b(i20) + 1;
                                    } else {
                                        i15 = v12;
                                        jArr[i22] = 0;
                                    }
                                    i14 = 5;
                                } else {
                                    i14 = i20;
                                    i15 = v12;
                                    jArr[i22] = qw3Var.b(i14) + 1;
                                }
                                i22++;
                                i20 = i14;
                                v12 = i15;
                            }
                            i13 = v12;
                        } else {
                            i13 = v12;
                            int b12 = qw3Var.b(i20) + 1;
                            int i23 = 0;
                            while (i23 < b11) {
                                int b13 = qw3Var.b(vw3.a(b11 - i23));
                                int i24 = 0;
                                while (i24 < b13 && i23 < b11) {
                                    jArr[i23] = b12;
                                    i23++;
                                    i24++;
                                    rw3Var = rw3Var;
                                    bArr = bArr;
                                }
                                b12++;
                                rw3Var = rw3Var;
                                bArr = bArr;
                            }
                        }
                        rw3 rw3Var2 = rw3Var;
                        byte[] bArr2 = bArr;
                        int b14 = qw3Var.b(4);
                        if (b14 <= 2) {
                            if (b14 != 1) {
                                if (b14 == 2) {
                                    b14 = 2;
                                } else {
                                    i21++;
                                    rw3Var = rw3Var2;
                                    v12 = i13;
                                    bArr = bArr2;
                                    i20 = 5;
                                }
                            }
                            qw3Var.c(32);
                            qw3Var.c(32);
                            int b15 = qw3Var.b(4) + 1;
                            qw3Var.c(1);
                            if (b14 != 1) {
                                j11 = b11 * b10;
                            } else if (b10 != 0) {
                                j11 = (long) Math.floor(Math.pow(b11, 1.0d / b10));
                            }
                            qw3Var.c((int) (b15 * j11));
                            i21++;
                            rw3Var = rw3Var2;
                            v12 = i13;
                            bArr = bArr2;
                            i20 = 5;
                        } else {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("lookup type greater than 2 not decodable: ");
                            sb2.append(b14);
                            throw zzaha.b(sb2.toString(), null);
                        }
                    } else {
                        int d10 = qw3Var.d();
                        StringBuilder sb3 = new StringBuilder(66);
                        sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb3.append(d10);
                        throw zzaha.b(sb3.toString(), null);
                    }
                }
                rw3 rw3Var3 = rw3Var;
                byte[] bArr3 = bArr;
                int i25 = 6;
                int b16 = qw3Var.b(6) + 1;
                for (int i26 = 0; i26 < b16; i26++) {
                    if (qw3Var.b(16) != 0) {
                        throw zzaha.b("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i27 = 1;
                int b17 = qw3Var.b(6) + 1;
                int i28 = 0;
                while (true) {
                    int i29 = 3;
                    if (i28 < b17) {
                        int b18 = qw3Var.b(16);
                        if (b18 == 0) {
                            int i30 = 8;
                            qw3Var.c(8);
                            qw3Var.c(16);
                            qw3Var.c(16);
                            qw3Var.c(6);
                            qw3Var.c(8);
                            int b19 = qw3Var.b(4) + 1;
                            int i31 = 0;
                            while (i31 < b19) {
                                qw3Var.c(i30);
                                i31++;
                                i30 = 8;
                            }
                        } else if (b18 == i27) {
                            int b20 = qw3Var.b(5);
                            int[] iArr = new int[b20];
                            int i32 = -1;
                            for (int i33 = 0; i33 < b20; i33++) {
                                int b21 = qw3Var.b(4);
                                iArr[i33] = b21;
                                if (b21 > i32) {
                                    i32 = b21;
                                }
                            }
                            int i34 = i32 + 1;
                            int[] iArr2 = new int[i34];
                            int i35 = 0;
                            while (i35 < i34) {
                                iArr2[i35] = qw3Var.b(i29) + 1;
                                int b22 = qw3Var.b(2);
                                if (b22 > 0) {
                                    i12 = 8;
                                    qw3Var.c(8);
                                } else {
                                    i12 = 8;
                                }
                                int i36 = 0;
                                for (int i37 = 1; i36 < (i37 << b22); i37 = 1) {
                                    qw3Var.c(i12);
                                    i36++;
                                    i12 = 8;
                                }
                                i35++;
                                i29 = 3;
                            }
                            qw3Var.c(2);
                            int b23 = qw3Var.b(4);
                            int i38 = 0;
                            int i39 = 0;
                            for (int i40 = 0; i40 < b20; i40++) {
                                i38 += iArr2[iArr[i40]];
                                while (i39 < i38) {
                                    qw3Var.c(b23);
                                    i39++;
                                }
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder(52);
                            sb4.append("floor type greater than 1 not decodable: ");
                            sb4.append(b18);
                            throw zzaha.b(sb4.toString(), null);
                        }
                        i28++;
                        i25 = 6;
                        i27 = 1;
                    } else {
                        int i41 = 1;
                        int b24 = qw3Var.b(i25) + 1;
                        int i42 = 0;
                        while (i42 < b24) {
                            if (qw3Var.b(16) <= 2) {
                                qw3Var.c(24);
                                qw3Var.c(24);
                                qw3Var.c(24);
                                int b25 = qw3Var.b(i25) + i41;
                                int i43 = 8;
                                qw3Var.c(8);
                                int[] iArr3 = new int[b25];
                                for (int i44 = 0; i44 < b25; i44++) {
                                    iArr3[i44] = ((qw3Var.a() ? qw3Var.b(5) : 0) * 8) + qw3Var.b(3);
                                }
                                int i45 = 0;
                                while (i45 < b25) {
                                    int i46 = 0;
                                    while (i46 < i43) {
                                        if ((iArr3[i45] & (1 << i46)) != 0) {
                                            qw3Var.c(i43);
                                        }
                                        i46++;
                                        i43 = 8;
                                    }
                                    i45++;
                                    i43 = 8;
                                }
                                i42++;
                                i25 = 6;
                                i41 = 1;
                            } else {
                                throw zzaha.b("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int b26 = qw3Var.b(i25) + 1;
                        for (int i47 = 0; i47 < b26; i47++) {
                            int b27 = qw3Var.b(16);
                            if (b27 != 0) {
                                StringBuilder sb5 = new StringBuilder(52);
                                sb5.append("mapping type other than 0 not supported: ");
                                sb5.append(b27);
                                Log.e("VorbisUtil", sb5.toString());
                            } else {
                                if (qw3Var.a()) {
                                    i10 = 1;
                                    i11 = qw3Var.b(4) + 1;
                                } else {
                                    i10 = 1;
                                    i11 = 1;
                                }
                                if (qw3Var.a()) {
                                    int b28 = qw3Var.b(8) + i10;
                                    for (int i48 = 0; i48 < b28; i48++) {
                                        int i49 = i19 - 1;
                                        qw3Var.c(vw3.a(i49));
                                        qw3Var.c(vw3.a(i49));
                                    }
                                }
                                if (qw3Var.b(2) != 0) {
                                    throw zzaha.b("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i11 > 1) {
                                    for (int i50 = 0; i50 < i19; i50++) {
                                        qw3Var.c(4);
                                    }
                                }
                                for (int i51 = 0; i51 < i11; i51++) {
                                    qw3Var.c(8);
                                    qw3Var.c(8);
                                    qw3Var.c(8);
                                }
                            }
                        }
                        int b29 = qw3Var.b(6) + 1;
                        tw3[] tw3VarArr = new tw3[b29];
                        for (int i52 = 0; i52 < b29; i52++) {
                            tw3VarArr[i52] = new tw3(qw3Var.a(), qw3Var.b(16), qw3Var.b(16), qw3Var.b(8));
                        }
                        if (qw3Var.a()) {
                            i04Var = new i04(uw3Var, rw3Var3, bArr3, tw3VarArr, vw3.a(b29 - 1));
                        } else {
                            throw zzaha.b("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        i04Var = null;
        this.f5576n = i04Var;
        if (i04Var == null) {
            return true;
        }
        uw3 uw3Var2 = i04Var.f5068a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(uw3Var2.f10868g);
        arrayList.add(i04Var.f5070c);
        t4 t4Var = new t4();
        t4Var.n(MimeTypes.AUDIO_VORBIS);
        t4Var.i(uw3Var2.f10865d);
        t4Var.j(uw3Var2.f10864c);
        t4Var.B(uw3Var2.f10862a);
        t4Var.C(uw3Var2.f10863b);
        t4Var.p(arrayList);
        f04Var.f3873a = t4Var.I();
        return true;
    }

    @Override // ai.h04
    public final void i(long j10) {
        super.i(j10);
        this.f5578p = j10 != 0;
        uw3 uw3Var = this.f5579q;
        this.f5577o = uw3Var != null ? uw3Var.f10866e : 0;
    }
}
