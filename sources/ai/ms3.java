package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ms3 implements z6 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7037a;

    /* renamed from: b  reason: collision with root package name */
    public final z6 f7038b;

    public ms3(Context context) {
        ad adVar = new ad();
        this.f7037a = context.getApplicationContext();
        this.f7038b = adVar;
    }

    @Override // ai.z6
    public final /* bridge */ /* synthetic */ a8 zza() {
        return new ns3(this.f7037a, ((ad) this.f7038b).zza());
    }
}
