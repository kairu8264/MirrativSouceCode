package ak;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes3.dex */
public final class o4 implements dk.f0<b> {

    /* renamed from: a  reason: collision with root package name */
    public final dk.f0<h4> f13573a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.f0<Context> f13574b;

    public o4(dk.f0<h4> f0Var, dk.f0<Context> f0Var2) {
        this.f13573a = f0Var;
        this.f13574b = f0Var2;
    }

    @Override // dk.f0
    public final /* bridge */ /* synthetic */ b zza() {
        h4 zza = this.f13573a.zza();
        Context a10 = ((q4) this.f13574b).a();
        h4 h4Var = zza;
        dk.s.a(a10.getPackageManager(), new ComponentName(a10.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        dk.s.a(a10.getPackageManager(), new ComponentName(a10.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        dk.e0.a(h4Var);
        return h4Var;
    }
}
