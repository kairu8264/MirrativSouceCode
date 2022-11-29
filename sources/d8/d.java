package d8;

import i8.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<i> f29304a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public final s.a<i, List<Class<?>>> f29305b = new s.a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        i andSet = this.f29304a.getAndSet(null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f29305b) {
            list = this.f29305b.get(andSet);
        }
        this.f29304a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f29305b) {
            this.f29305b.put(new i(cls, cls2, cls3), list);
        }
    }
}
