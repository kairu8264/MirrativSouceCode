package ai;

import com.google.android.gms.internal.ads.zzaha;

/* loaded from: classes3.dex */
public abstract class ix3 {

    /* renamed from: a  reason: collision with root package name */
    public final pw3 f5443a;

    public ix3(pw3 pw3Var) {
        this.f5443a = pw3Var;
    }

    public abstract boolean a(hb hbVar) throws zzaha;

    public abstract boolean b(hb hbVar, long j10) throws zzaha;

    public final boolean c(hb hbVar, long j10) throws zzaha {
        return a(hbVar) && b(hbVar, j10);
    }
}
