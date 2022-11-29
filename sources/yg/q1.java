package yg;

import ai.ow2;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
public final class q1 extends ow2 {
    public q1(Looper looper) {
        super(looper);
    }

    @Override // ai.ow2
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th2) {
            wg.t.d();
            d2.o(wg.t.h().q(), th2);
            throw th2;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            wg.t.h().k(e10, "AdMobHandler.handleMessage");
        }
    }
}
