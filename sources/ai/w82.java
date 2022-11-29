package ai;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class w82 implements xc2<x82> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f11511a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f11512b;

    public w82(t43 t43Var, Context context) {
        this.f11511a = t43Var;
        this.f11512b = context;
    }

    public final /* synthetic */ x82 a() throws Exception {
        double d10;
        Intent registerReceiver = this.f11512b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d10 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z10 = true;
            }
        } else {
            d10 = -1.0d;
        }
        return new x82(d10, z10);
    }

    @Override // ai.xc2
    public final s43<x82> zza() {
        return this.f11511a.h(new Callable(this) { // from class: ai.u82

            /* renamed from: a  reason: collision with root package name */
            public final w82 f10655a;

            {
                this.f10655a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10655a.a();
            }
        });
    }
}
