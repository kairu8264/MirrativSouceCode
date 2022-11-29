package ai;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class og3 extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f7788a;

    public og3(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, referenceQueue);
        Objects.requireNonNull(th2, "The referent cannot be null");
        this.f7788a = System.identityHashCode(th2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == og3.class) {
            if (this == obj) {
                return true;
            }
            og3 og3Var = (og3) obj;
            if (this.f7788a == og3Var.f7788a && get() == og3Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7788a;
    }
}
