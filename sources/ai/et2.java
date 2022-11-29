package ai;

import android.os.Handler;

/* loaded from: classes3.dex */
public final class et2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = ht2.f4986i;
        if (handler != null) {
            handler2 = ht2.f4986i;
            runnable = ht2.f4987j;
            handler2.post(runnable);
            handler3 = ht2.f4986i;
            runnable2 = ht2.f4988k;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
