package ti;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import rh.c;
import rh.n0;
import rh.p;

/* loaded from: classes3.dex */
public class a extends rh.g<g> implements si.f {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f53647i0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f53648e0;

    /* renamed from: f0  reason: collision with root package name */
    public final rh.d f53649f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Bundle f53650g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Integer f53651h0;

    public a(Context context, Looper looper, boolean z10, rh.d dVar, Bundle bundle, c.a aVar, c.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f53648e0 = true;
        this.f53649f0 = dVar;
        this.f53650g0 = bundle;
        this.f53651h0 = dVar.g();
    }

    public static Bundle j0(rh.d dVar) {
        dVar.f();
        Integer g10 = dVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (g10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // rh.c
    public final String C() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // rh.c
    public final String D() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // rh.c, com.google.android.gms.common.api.a.f
    public final boolean f() {
        return this.f53648e0;
    }

    @Override // si.f
    public final void g() {
        k(new c.d());
    }

    @Override // si.f
    public final void i(f fVar) {
        p.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b10 = this.f53649f0.b();
            ((g) B()).h1(new j(1, new n0(b10, ((Integer) p.i(this.f53651h0)).intValue(), "<<default account>>".equals(b10.name) ? kh.a.a(w()).b() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.o2(new l(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // rh.c
    public final int l() {
        return nh.g.f43544a;
    }

    @Override // rh.c
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // rh.c
    public final Bundle y() {
        if (!w().getPackageName().equals(this.f53649f0.d())) {
            this.f53650g0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f53649f0.d());
        }
        return this.f53650g0;
    }
}
