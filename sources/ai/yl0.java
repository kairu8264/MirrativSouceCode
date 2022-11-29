package ai;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class yl0 implements Runnable {
    public yl0(am0 am0Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
