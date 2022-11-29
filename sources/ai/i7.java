package ai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class i7 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j7 f5128a;

    public /* synthetic */ i7(j7 j7Var, g7 g7Var) {
        this.f5128a = j7Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler a10 = j7.a(this.f5128a);
        final j7 j7Var = this.f5128a;
        a10.post(new Runnable(j7Var) { // from class: ai.h7

            /* renamed from: w  reason: collision with root package name */
            public final j7 f4766w;

            {
                this.f4766w = j7Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j7.f(this.f4766w);
            }
        });
    }
}
