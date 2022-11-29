package lf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import jo.h;
import jo.p;
import wn.v;

/* loaded from: classes2.dex */
public final class a extends BroadcastReceiver {

    /* renamed from: c  reason: collision with root package name */
    public static final C0576a f40131c = new C0576a(null);

    /* renamed from: a  reason: collision with root package name */
    public final io.a<v> f40132a;

    /* renamed from: b  reason: collision with root package name */
    public final io.a<v> f40133b;

    /* renamed from: lf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0576a {
        public C0576a() {
        }

        public /* synthetic */ C0576a(h hVar) {
            this();
        }

        public final IntentFilter a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            return intentFilter;
        }

        public final a b(Context context, io.a<v> aVar, io.a<v> aVar2) {
            p.h(context, "context");
            p.h(aVar, "connected");
            p.h(aVar2, "disconnected");
            a aVar3 = new a(aVar, aVar2);
            context.registerReceiver(aVar3, a.f40131c.a());
            return aVar3;
        }
    }

    public a(io.a<v> aVar, io.a<v> aVar2) {
        p.h(aVar, "connected");
        p.h(aVar2, "disconnected");
        this.f40132a = aVar;
        this.f40133b = aVar2;
    }

    public final void a(Context context) {
        if (context != null) {
            context.unregisterReceiver(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !p.c(intent.getAction(), "android.intent.action.HEADSET_PLUG")) {
            return;
        }
        int intExtra = intent.getIntExtra("state", -1);
        if (intExtra == 0) {
            this.f40133b.invoke();
        } else if (intExtra != 1) {
        } else {
            this.f40132a.invoke();
        }
    }
}
