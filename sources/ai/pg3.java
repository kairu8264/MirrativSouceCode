package ai;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class pg3 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<og3, List<Throwable>> f8409a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    public final ReferenceQueue<Throwable> f8410b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th2, boolean z10) {
        ReferenceQueue<Throwable> referenceQueue = this.f8410b;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.f8409a.remove(poll);
            referenceQueue = this.f8410b;
        }
        List<Throwable> list = this.f8409a.get(new og3(th2, null));
        if (z10 && list == null) {
            Vector vector = new Vector(2);
            List<Throwable> putIfAbsent = this.f8409a.putIfAbsent(new og3(th2, this.f8410b), vector);
            return putIfAbsent == null ? vector : putIfAbsent;
        }
        return list;
    }
}
