package yg;

import ai.ft;
import ai.ox;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class l1 {

    /* renamed from: d  reason: collision with root package name */
    public boolean f61915d;

    /* renamed from: e  reason: collision with root package name */
    public Context f61916e;

    /* renamed from: c  reason: collision with root package name */
    public boolean f61914c = false;

    /* renamed from: b  reason: collision with root package name */
    public final Map<BroadcastReceiver, IntentFilter> f61913b = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final BroadcastReceiver f61912a = new k1(this);

    public final synchronized void a(Context context) {
        if (this.f61914c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f61916e = applicationContext;
        if (applicationContext == null) {
            this.f61916e = context;
        }
        ox.a(this.f61916e);
        this.f61915d = ((Boolean) ft.c().c(ox.f8047n2)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f61916e.registerReceiver(this.f61912a, intentFilter);
        this.f61914c = true;
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f61915d) {
            this.f61913b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f61915d) {
            this.f61913b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.f61913b.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
        }
    }
}
