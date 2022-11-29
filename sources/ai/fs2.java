package ai;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class fs2 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f  reason: collision with root package name */
    public static final fs2 f4184f = new fs2();

    /* renamed from: a  reason: collision with root package name */
    public Context f4185a;

    /* renamed from: b  reason: collision with root package name */
    public BroadcastReceiver f4186b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4187c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4188d;

    /* renamed from: e  reason: collision with root package name */
    public ks2 f4189e;

    public static fs2 a() {
        return f4184f;
    }

    public static /* synthetic */ void f(fs2 fs2Var, boolean z10) {
        if (fs2Var.f4188d != z10) {
            fs2Var.f4188d = z10;
            if (fs2Var.f4187c) {
                fs2Var.h();
                if (fs2Var.f4189e != null) {
                    if (fs2Var.e()) {
                        ht2.f().g();
                    } else {
                        ht2.f().i();
                    }
                }
            }
        }
    }

    public final void b(Context context) {
        this.f4185a = context.getApplicationContext();
    }

    public final void c() {
        this.f4186b = new es2(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f4185a.registerReceiver(this.f4186b, intentFilter);
        this.f4187c = true;
        h();
    }

    public final void d() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f4185a;
        if (context != null && (broadcastReceiver = this.f4186b) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f4186b = null;
        }
        this.f4187c = false;
        this.f4188d = false;
        this.f4189e = null;
    }

    public final boolean e() {
        return !this.f4188d;
    }

    public final void g(ks2 ks2Var) {
        this.f4189e = ks2Var;
    }

    public final void h() {
        boolean z10 = this.f4188d;
        for (sr2 sr2Var : ds2.a().e()) {
            rs2 g10 = sr2Var.g();
            if (g10.e()) {
                js2.a().g(g10.d(), "setState", true != z10 ? "foregrounded" : "backgrounded");
            }
        }
    }
}
