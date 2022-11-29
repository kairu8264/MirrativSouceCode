package ai;

import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import com.google.android.gms.internal.ads.zzpp;
import com.mirrativ.llstream.encoder.AACEncoder;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class ex3 extends ix3 {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f3811e = {5512, 11025, 22050, AACEncoder.SAMPLING_RATE};

    /* renamed from: b  reason: collision with root package name */
    public boolean f3812b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3813c;

    /* renamed from: d  reason: collision with root package name */
    public int f3814d;

    public ex3(pw3 pw3Var) {
        super(pw3Var);
    }

    @Override // ai.ix3
    public final boolean a(hb hbVar) throws zzpp {
        if (!this.f3812b) {
            int v10 = hbVar.v();
            int i10 = v10 >> 4;
            this.f3814d = i10;
            if (i10 == 2) {
                int i11 = f3811e[(v10 >> 2) & 3];
                t4 t4Var = new t4();
                t4Var.n(MimeTypes.AUDIO_MPEG);
                t4Var.B(1);
                t4Var.C(i11);
                this.f5443a.b(t4Var.I());
                this.f3813c = true;
            } else if (i10 == 7 || i10 == 8) {
                String str = i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                t4 t4Var2 = new t4();
                t4Var2.n(str);
                t4Var2.B(1);
                t4Var2.C(8000);
                this.f5443a.b(t4Var2.I());
                this.f3813c = true;
            } else if (i10 != 10) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Audio format not supported: ");
                sb2.append(i10);
                throw new zzpp(sb2.toString());
            }
            this.f3812b = true;
        } else {
            hbVar.s(1);
        }
        return true;
    }

    @Override // ai.ix3
    public final boolean b(hb hbVar, long j10) throws zzaha {
        if (this.f3814d == 2) {
            int l10 = hbVar.l();
            this.f5443a.a(hbVar, l10);
            this.f5443a.e(j10, 1, l10, 0, null);
            return true;
        }
        int v10 = hbVar.v();
        if (v10 == 0 && !this.f3813c) {
            int l11 = hbVar.l();
            byte[] bArr = new byte[l11];
            hbVar.u(bArr, 0, l11);
            mu3 a10 = ou3.a(bArr);
            t4 t4Var = new t4();
            t4Var.n(MimeTypes.AUDIO_AAC);
            t4Var.k(a10.f7066c);
            t4Var.B(a10.f7065b);
            t4Var.C(a10.f7064a);
            t4Var.p(Collections.singletonList(bArr));
            this.f5443a.b(t4Var.I());
            this.f3813c = true;
            return false;
        } else if (this.f3814d != 10 || v10 == 1) {
            int l12 = hbVar.l();
            this.f5443a.a(hbVar, l12);
            this.f5443a.e(j10, 1, l12, 0, null);
            return true;
        } else {
            return false;
        }
    }
}
