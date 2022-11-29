package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class nr2 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7446a;

    public final boolean a() {
        return this.f7446a;
    }

    public final void b(Context context) {
        xs2.a(context, "Application Context cannot be null");
        if (this.f7446a) {
            return;
        }
        this.f7446a = true;
        ks2.a().b(context);
        fs2.a().b(context);
        vs2.a(context);
        hs2.a().c(context);
    }
}
