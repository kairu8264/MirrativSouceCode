package jn;

import android.app.Activity;
import in.o;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f38111a = new AtomicReference<>(null);

    public boolean a(Activity activity, a aVar) {
        if (d()) {
            o.g().a("Twitter", "Authorize already in progress");
        } else if (aVar.a(activity)) {
            boolean compareAndSet = this.f38111a.compareAndSet(null, aVar);
            if (compareAndSet) {
                return compareAndSet;
            }
            o.g().a("Twitter", "Failed to update authHandler, authorize already in progress.");
            return compareAndSet;
        }
        return false;
    }

    public void b() {
        this.f38111a.set(null);
    }

    public a c() {
        return this.f38111a.get();
    }

    public boolean d() {
        return this.f38111a.get() != null;
    }
}
