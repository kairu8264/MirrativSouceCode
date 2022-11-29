package pi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class y3 extends BroadcastReceiver {

    /* renamed from: d  reason: collision with root package name */
    public static final String f48368d = y3.class.getName();

    /* renamed from: a  reason: collision with root package name */
    public final ba f48369a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f48370b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f48371c;

    public y3(ba baVar) {
        rh.p.i(baVar);
        this.f48369a = baVar;
    }

    public final void b() {
        this.f48369a.e();
        this.f48369a.a().f();
        if (this.f48370b) {
            return;
        }
        this.f48369a.F().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f48371c = this.f48369a.X().k();
        this.f48369a.r().u().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f48371c));
        this.f48370b = true;
    }

    public final void c() {
        this.f48369a.e();
        this.f48369a.a().f();
        this.f48369a.a().f();
        if (this.f48370b) {
            this.f48369a.r().u().a("Unregistering connectivity change receiver");
            this.f48370b = false;
            this.f48371c = false;
            try {
                this.f48369a.F().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f48369a.r().p().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f48369a.e();
        String action = intent.getAction();
        this.f48369a.r().u().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean k10 = this.f48369a.X().k();
            if (this.f48371c != k10) {
                this.f48371c = k10;
                this.f48369a.a().y(new x3(this, k10));
                return;
            }
            return;
        }
        this.f48369a.r().v().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
