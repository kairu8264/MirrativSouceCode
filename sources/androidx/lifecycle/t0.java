package androidx.lifecycle;

import android.app.Application;
import com.google.android.exoplayer2.util.MimeTypes;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final u0 f15616a;

    /* renamed from: b  reason: collision with root package name */
    public final b f15617b;

    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: d  reason: collision with root package name */
        public static final C0067a f15618d = new C0067a(null);

        /* renamed from: e  reason: collision with root package name */
        public static a f15619e;

        /* renamed from: c  reason: collision with root package name */
        public final Application f15620c;

        /* renamed from: androidx.lifecycle.t0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0067a {
            public C0067a() {
            }

            public /* synthetic */ C0067a(jo.h hVar) {
                this();
            }

            public final a a(Application application) {
                jo.p.h(application, MimeTypes.BASE_TYPE_APPLICATION);
                if (a.f15619e == null) {
                    a.f15619e = new a(application);
                }
                a aVar = a.f15619e;
                jo.p.e(aVar);
                return aVar;
            }
        }

        public a(Application application) {
            jo.p.h(application, MimeTypes.BASE_TYPE_APPLICATION);
            this.f15620c = application;
        }

        public static final a g(Application application) {
            return f15618d.a(application);
        }

        @Override // androidx.lifecycle.t0.d, androidx.lifecycle.t0.b
        public <T extends q0> T a(Class<T> cls) {
            jo.p.h(cls, "modelClass");
            if (androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(this.f15620c);
                    jo.p.g(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(jo.p.o("Cannot create an instance of ", cls), e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException(jo.p.o("Cannot create an instance of ", cls), e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException(jo.p.o("Cannot create an instance of ", cls), e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException(jo.p.o("Cannot create an instance of ", cls), e13);
                }
            }
            return (T) super.a(cls);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        <T extends q0> T a(Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static abstract class c extends e implements b {
        public <T extends q0> T a(Class<T> cls) {
            jo.p.h(cls, "modelClass");
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementations of KeyedFactory");
        }

        public abstract <T extends q0> T c(String str, Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15621a = new a(null);

        /* renamed from: b  reason: collision with root package name */
        public static d f15622b;

        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }

            public final d a() {
                if (d.f15622b == null) {
                    d.f15622b = new d();
                }
                d dVar = d.f15622b;
                jo.p.e(dVar);
                return dVar;
            }
        }

        public static final d d() {
            return f15621a.a();
        }

        @Override // androidx.lifecycle.t0.b
        public <T extends q0> T a(Class<T> cls) {
            jo.p.h(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                jo.p.g(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(jo.p.o("Cannot create an instance of ", cls), e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(jo.p.o("Cannot create an instance of ", cls), e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public void b(q0 q0Var) {
            jo.p.h(q0Var, "viewModel");
        }
    }

    public t0(u0 u0Var, b bVar) {
        jo.p.h(u0Var, "store");
        jo.p.h(bVar, "factory");
        this.f15616a = u0Var;
        this.f15617b = bVar;
    }

    public <T extends q0> T a(Class<T> cls) {
        jo.p.h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(jo.p.o("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends q0> T b(String str, Class<T> cls) {
        T t10;
        jo.p.h(str, "key");
        jo.p.h(cls, "modelClass");
        T t11 = (T) this.f15616a.b(str);
        if (cls.isInstance(t11)) {
            b bVar = this.f15617b;
            e eVar = bVar instanceof e ? (e) bVar : null;
            if (eVar != null) {
                jo.p.g(t11, "viewModel");
                eVar.b(t11);
            }
            Objects.requireNonNull(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t11;
        }
        b bVar2 = this.f15617b;
        if (bVar2 instanceof c) {
            t10 = (T) ((c) bVar2).c(str, cls);
        } else {
            t10 = (T) bVar2.a(cls);
        }
        this.f15616a.d(str, t10);
        jo.p.g(t10, "viewModel");
        return t10;
    }
}
