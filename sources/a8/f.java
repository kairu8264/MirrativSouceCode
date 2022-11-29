package a8;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?, ?>> f643a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f644a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f645b;

        /* renamed from: c  reason: collision with root package name */
        public final e<Z, R> f646c;

        public a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f644a = cls;
            this.f645b = cls2;
            this.f646c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f644a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f645b);
        }
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f643a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f646c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f643a) {
            if (aVar.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f643a.add(new a<>(cls, cls2, eVar));
    }
}
