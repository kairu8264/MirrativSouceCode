package r5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import k5.j;

/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final String f49745h = j.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    public final BroadcastReceiver f49746g;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, w5.a aVar) {
        super(context, aVar);
        this.f49746g = new a();
    }

    @Override // r5.d
    public void e() {
        j.c().a(f49745h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f49750b.registerReceiver(this.f49746g, g());
    }

    @Override // r5.d
    public void f() {
        j.c().a(f49745h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f49750b.unregisterReceiver(this.f49746g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
