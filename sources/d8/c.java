package d8;

import a8.g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import o7.i;
import o7.s;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final s<?, ?, ?> f29301c = new s<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a  reason: collision with root package name */
    public final s.a<i8.i, s<?, ?, ?>> f29302a = new s.a<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<i8.i> f29303b = new AtomicReference<>();

    public <Data, TResource, Transcode> s<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        s<Data, TResource, Transcode> sVar;
        i8.i b10 = b(cls, cls2, cls3);
        synchronized (this.f29302a) {
            sVar = (s<Data, TResource, Transcode>) this.f29302a.get(b10);
        }
        this.f29303b.set(b10);
        return sVar;
    }

    public final i8.i b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        i8.i andSet = this.f29303b.getAndSet(null);
        if (andSet == null) {
            andSet = new i8.i();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public boolean c(s<?, ?, ?> sVar) {
        return f29301c.equals(sVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, s<?, ?, ?> sVar) {
        synchronized (this.f29302a) {
            s.a<i8.i, s<?, ?, ?>> aVar = this.f29302a;
            i8.i iVar = new i8.i(cls, cls2, cls3);
            if (sVar == null) {
                sVar = f29301c;
            }
            aVar.put(iVar, sVar);
        }
    }
}
