package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final m0.e<Reference<T>> f14535a = new m0.e<>(new Reference[16], 0);

    /* renamed from: b  reason: collision with root package name */
    public final ReferenceQueue<T> f14536b = new ReferenceQueue<>();

    public final void a() {
        Reference<? extends T> poll;
        do {
            poll = this.f14536b.poll();
            if (poll != null) {
                this.f14535a.u(poll);
                continue;
            }
        } while (poll != null);
    }

    public final int b() {
        a();
        return this.f14535a.p();
    }

    public final T c() {
        a();
        while (this.f14535a.s()) {
            m0.e<Reference<T>> eVar = this.f14535a;
            T t10 = eVar.y(eVar.p() - 1).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void d(T t10) {
        a();
        this.f14535a.c(new WeakReference(t10, this.f14536b));
    }
}
