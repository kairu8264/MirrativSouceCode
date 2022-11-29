package m8;

import android.util.Log;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: x  reason: collision with root package name */
    public static final String f40622x = d.class.getSimpleName();

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f40623w;

    public d(Runnable runnable) {
        this.f40623w = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f40623w.run();
        } catch (Error e10) {
            Log.e(f40622x, "Puree detected an uncaught error while executing", e10);
            throw e10;
        } catch (RuntimeException e11) {
            Log.e(f40622x, "Puree detected an uncaught runtime exception while executing", e11);
            throw e11;
        }
    }
}
