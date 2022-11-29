package j8;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final g<Object> f37251a = new C0493a();

    /* renamed from: j8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0493a implements g<Object> {
        @Override // j8.a.g
        public void a(Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements d<List<T>> {
        @Override // j8.a.d
        /* renamed from: a */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* loaded from: classes.dex */
    public class c implements g<List<T>> {
        @Override // j8.a.g
        /* renamed from: b */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        T create();
    }

    /* loaded from: classes.dex */
    public static final class e<T> implements n3.e<T> {

        /* renamed from: a  reason: collision with root package name */
        public final d<T> f37252a;

        /* renamed from: b  reason: collision with root package name */
        public final g<T> f37253b;

        /* renamed from: c  reason: collision with root package name */
        public final n3.e<T> f37254c;

        public e(n3.e<T> eVar, d<T> dVar, g<T> gVar) {
            this.f37254c = eVar;
            this.f37252a = dVar;
            this.f37253b = gVar;
        }

        @Override // n3.e
        public boolean a(T t10) {
            if (t10 instanceof f) {
                ((f) t10).e().b(true);
            }
            this.f37253b.a(t10);
            return this.f37254c.a(t10);
        }

        @Override // n3.e
        public T acquire() {
            T acquire = this.f37254c.acquire();
            if (acquire == null) {
                acquire = this.f37252a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + acquire.getClass());
                }
            }
            if (acquire instanceof f) {
                ((f) acquire).e().b(false);
            }
            return acquire;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        j8.c e();
    }

    /* loaded from: classes.dex */
    public interface g<T> {
        void a(T t10);
    }

    public static <T extends f> n3.e<T> a(n3.e<T> eVar, d<T> dVar) {
        return b(eVar, dVar, c());
    }

    public static <T> n3.e<T> b(n3.e<T> eVar, d<T> dVar, g<T> gVar) {
        return new e(eVar, dVar, gVar);
    }

    public static <T> g<T> c() {
        return (g<T>) f37251a;
    }

    public static <T extends f> n3.e<T> d(int i10, d<T> dVar) {
        return a(new n3.g(i10), dVar);
    }

    public static <T> n3.e<List<T>> e() {
        return f(20);
    }

    public static <T> n3.e<List<T>> f(int i10) {
        return b(new n3.g(i10), new b(), new c());
    }
}
