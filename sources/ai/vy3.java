package ai;

import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class vy3 implements sy3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f11417a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11418b;

    /* renamed from: c  reason: collision with root package name */
    public final hb f11419c;

    public vy3(py3 py3Var, v4 v4Var) {
        hb hbVar = py3Var.f8740b;
        this.f11419c = hbVar;
        hbVar.p(12);
        int b10 = hbVar.b();
        if (MimeTypes.AUDIO_RAW.equals(v4Var.f10960l)) {
            int s10 = sb.s(v4Var.A, v4Var.f10973y);
            if (b10 == 0 || b10 % s10 != 0) {
                StringBuilder sb2 = new StringBuilder(88);
                sb2.append("Audio sample size mismatch. stsd sample size: ");
                sb2.append(s10);
                sb2.append(", stsz sample size: ");
                sb2.append(b10);
                Log.w("AtomParsers", sb2.toString());
                b10 = s10;
            }
        }
        this.f11417a = b10 == 0 ? -1 : b10;
        this.f11418b = hbVar.b();
    }

    @Override // ai.sy3
    public final int b() {
        int i10 = this.f11417a;
        return i10 == -1 ? this.f11419c.b() : i10;
    }

    @Override // ai.sy3
    public final int zza() {
        return this.f11418b;
    }

    @Override // ai.sy3
    public final int zzb() {
        return this.f11417a;
    }
}
