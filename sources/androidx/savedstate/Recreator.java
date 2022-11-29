package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import jo.h;
import jo.p;
import y4.c;
import y4.e;

/* loaded from: classes.dex */
public final class Recreator implements r {

    /* renamed from: x  reason: collision with root package name */
    public static final a f16411x = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final e f16412w;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c.InterfaceC1040c {

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f16413a;

        public b(c cVar) {
            p.h(cVar, "registry");
            this.f16413a = new LinkedHashSet();
            cVar.g("androidx.savedstate.Restarter", this);
        }

        @Override // y4.c.InterfaceC1040c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f16413a));
            return bundle;
        }

        public final void b(String str) {
            p.h(str, "className");
            this.f16413a.add(str);
        }
    }

    public Recreator(e eVar) {
        p.h(eVar, "owner");
        this.f16412w = eVar;
    }

    public final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(c.a.class);
            p.g(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    p.g(newInstance, "{\n                constr…wInstance()\n            }");
                    ((c.a) newInstance).a(this.f16412w);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.r
    public void i(u uVar, o.b bVar) {
        p.h(uVar, "source");
        p.h(bVar, "event");
        if (bVar == o.b.ON_CREATE) {
            uVar.g().c(this);
            Bundle b10 = this.f16412w.a0().b("androidx.savedstate.Restarter");
            if (b10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    a(str);
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
