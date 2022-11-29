package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import k5.j;
import l5.i;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16581a = j.f("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Intent f16582w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Context f16583x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f16584y;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f16582w = intent;
            this.f16583x = context;
            this.f16584y = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f16582w.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f16582w.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f16582w.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f16582w.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                j.c().a(ConstraintProxyUpdateReceiver.f16581a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                u5.d.a(this.f16583x, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                u5.d.a(this.f16583x, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                u5.d.a(this.f16583x, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                u5.d.a(this.f16583x, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f16584y.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            j.c().a(f16581a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        } else {
            i.k(context).p().b(new a(intent, context, goAsync()));
        }
    }
}
