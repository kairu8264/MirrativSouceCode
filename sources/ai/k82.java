package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class k82 implements xc2<l82> {

    /* renamed from: a  reason: collision with root package name */
    public final ih.b f6123a;

    public k82(Context context) {
        this.f6123a = ih.a.a(context);
    }

    @Override // ai.xc2
    public final s43<l82> zza() {
        if (((Boolean) ft.c().c(ox.O1)).booleanValue()) {
            return j43.j(qw2.a(this.f6123a.a()), j82.f5663a, hk0.f4883f);
        }
        return j43.a(new l82(null, -1));
    }
}
