package d8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m7.j;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f29306a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f29307b = new HashMap();

    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f29308a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f29309b;

        /* renamed from: c  reason: collision with root package name */
        public final j<T, R> f29310c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f29308a = cls;
            this.f29309b = cls2;
            this.f29310c = jVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f29308a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f29309b);
        }
    }

    public synchronized <T, R> void a(String str, j<T, R> jVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, jVar));
    }

    public synchronized <T, R> List<j<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f29306a) {
            List<a<?, ?>> list = this.f29307b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f29310c);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> list;
        if (!this.f29306a.contains(str)) {
            this.f29306a.add(str);
        }
        list = this.f29307b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f29307b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f29306a) {
            List<a<?, ?>> list = this.f29307b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f29309b)) {
                        arrayList.add(aVar.f29309b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(String str, j<T, R> jVar, Class<T> cls, Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, jVar));
    }

    public synchronized void f(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f29306a);
        this.f29306a.clear();
        for (String str : list) {
            this.f29306a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.f29306a.add(str2);
            }
        }
    }
}
