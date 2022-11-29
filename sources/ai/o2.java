package ai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class o2 extends BroadcastReceiver implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final p2 f7621w;

    /* renamed from: x  reason: collision with root package name */
    public final Handler f7622x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q2 f7623y;

    public o2(q2 q2Var, Handler handler, p2 p2Var) {
        this.f7623y = q2Var;
        this.f7622x = handler;
        this.f7621w = p2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f7622x.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
