package ai;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class hi2 {
    public static <T> void a(AtomicReference<T> atomicReference, gi2<T> gi2Var) {
        T t10 = atomicReference.get();
        if (t10 == null) {
            return;
        }
        try {
            gi2Var.a(t10);
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            uj0.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
