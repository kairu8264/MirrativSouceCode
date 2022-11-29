package ph;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class i0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f47505a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f47506b;

    public i0(h0 h0Var) {
        this.f47506b = h0Var;
    }

    public final void a(Context context) {
        this.f47505a = context;
    }

    public final synchronized void b() {
        Context context = this.f47505a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f47505a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f47506b.a();
            b();
        }
    }
}
