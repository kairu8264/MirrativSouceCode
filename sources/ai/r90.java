package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class r90 implements ah.d<ah.k, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f90 f9377a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ah.a f9378b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y90 f9379c;

    public r90(y90 y90Var, f90 f90Var, ah.a aVar) {
        this.f9379c = y90Var;
        this.f9377a = f90Var;
        this.f9378b = aVar;
    }

    @Override // ah.d
    public final void a(rg.a aVar) {
        try {
            String canonicalName = this.f9378b.getClass().getCanonicalName();
            int a10 = aVar.a();
            String c10 = aVar.c();
            String b10 = aVar.b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 85 + String.valueOf(c10).length() + String.valueOf(b10).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(a10);
            sb2.append(". ErrorMessage = ");
            sb2.append(c10);
            sb2.append(". ErrorDomain = ");
            sb2.append(b10);
            uj0.a(sb2.toString());
            this.f9377a.c4(aVar.d());
            this.f9377a.M5(aVar.a(), aVar.c());
            this.f9377a.Y(aVar.a());
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
