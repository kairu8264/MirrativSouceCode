package r5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import k5.j;

/* loaded from: classes.dex */
public class b extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f49744i = j.f("BatteryNotLowTracker");

    public b(Context context, w5.a aVar) {
        super(context, aVar);
    }

    @Override // r5.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // r5.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        j.c().a(f49744i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // r5.d
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.f49750b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            j.c().b(f49744i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
