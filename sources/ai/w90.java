package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class w90 implements ah.d<ah.v, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f90 f11517a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y90 f11518b;

    public w90(y90 y90Var, f90 f90Var) {
        this.f11518b = y90Var;
        this.f11517a = f90Var;
    }

    @Override // ah.d
    public final void a(rg.a aVar) {
        Object obj;
        try {
            obj = this.f11518b.f12483w;
            String canonicalName = obj.getClass().getCanonicalName();
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
            this.f11517a.c4(aVar.d());
            this.f11517a.M5(aVar.a(), aVar.c());
            this.f11517a.Y(aVar.a());
        } catch (RemoteException e10) {
            uj0.d("", e10);
        }
    }
}
