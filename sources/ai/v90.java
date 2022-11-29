package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class v90 implements ah.d<ah.l, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f90 f11008a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y90 f11009b;

    public v90(y90 y90Var, f90 f90Var) {
        this.f11009b = y90Var;
        this.f11008a = f90Var;
    }

    @Override // ah.d
    public final void a(rg.a aVar) {
        Object obj;
        try {
            obj = this.f11009b.f12483w;
            String canonicalName = obj.getClass().getCanonicalName();
            int a10 = aVar.a();
            String c10 = aVar.c();
            String b10 = aVar.b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 87 + String.valueOf(c10).length() + String.valueOf(b10).length());
            sb2.append(canonicalName);
            sb2.append("failed to loaded mediation ad: ErrorCode = ");
            sb2.append(a10);
            sb2.append(". ErrorMessage = ");
            sb2.append(c10);
            sb2.append(". ErrorDomain = ");
            sb2.append(b10);
            uj0.a(sb2.toString());
            this.f11008a.c4(aVar.d());
            this.f11008a.M5(aVar.a(), aVar.c());
            this.f11008a.Y(aVar.a());
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
