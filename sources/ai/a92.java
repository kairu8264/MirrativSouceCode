package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class a92 implements xc2<wc2<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    public final zh2 f1790a;

    public a92(zh2 zh2Var) {
        this.f1790a = zh2Var;
    }

    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.f1790a.a());
    }

    @Override // ai.xc2
    public final s43<wc2<Bundle>> zza() {
        zh2 zh2Var = this.f1790a;
        wc2 wc2Var = null;
        if (zh2Var != null && zh2Var.a() != null && !this.f1790a.a().isEmpty()) {
            wc2Var = new wc2(this) { // from class: ai.z82

                /* renamed from: a  reason: collision with root package name */
                public final a92 f12910a;

                {
                    this.f12910a = this;
                }

                @Override // ai.wc2
                public final void d(Object obj) {
                    this.f12910a.a((Bundle) obj);
                }
            };
        }
        return j43.a(wc2Var);
    }
}
