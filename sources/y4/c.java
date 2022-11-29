package y4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import androidx.savedstate.Recreator;
import java.util.Map;
import jo.h;
import jo.p;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: g  reason: collision with root package name */
    public static final b f61231g = new b(null);

    /* renamed from: b  reason: collision with root package name */
    public boolean f61233b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f61234c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f61235d;

    /* renamed from: e  reason: collision with root package name */
    public Recreator.b f61236e;

    /* renamed from: a  reason: collision with root package name */
    public final m.b<String, InterfaceC1040c> f61232a = new m.b<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f61237f = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* renamed from: y4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC1040c {
        Bundle a();
    }

    public static final void c(c cVar, u uVar, o.b bVar) {
        p.h(cVar, "this$0");
        p.h(uVar, "<anonymous parameter 0>");
        p.h(bVar, "event");
        if (bVar == o.b.ON_START) {
            cVar.f61237f = true;
        } else if (bVar == o.b.ON_STOP) {
            cVar.f61237f = false;
        }
    }

    public final Bundle b(String str) {
        p.h(str, "key");
        if (this.f61235d) {
            Bundle bundle = this.f61234c;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
                Bundle bundle3 = this.f61234c;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.f61234c;
                boolean z10 = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z10 = true;
                }
                if (!z10) {
                    this.f61234c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final void d(o oVar) {
        p.h(oVar, "lifecycle");
        if (!this.f61233b) {
            oVar.a(new r() { // from class: y4.b
                @Override // androidx.lifecycle.r
                public final void i(u uVar, o.b bVar) {
                    c.c(c.this, uVar, bVar);
                }
            });
            this.f61233b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void e(Bundle bundle) {
        if (this.f61233b) {
            if (!this.f61235d) {
                this.f61234c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                this.f61235d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    public final void f(Bundle bundle) {
        p.h(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f61234c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.b<String, InterfaceC1040c>.d g10 = this.f61232a.g();
        p.g(g10, "this.components.iteratorWithAdditions()");
        while (g10.hasNext()) {
            Map.Entry next = g10.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC1040c) next.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void g(String str, InterfaceC1040c interfaceC1040c) {
        p.h(str, "key");
        p.h(interfaceC1040c, "provider");
        if (!(this.f61232a.l(str, interfaceC1040c) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void h(Class<? extends a> cls) {
        p.h(cls, "clazz");
        if (this.f61237f) {
            Recreator.b bVar = this.f61236e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f61236e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f61236e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    p.g(name, "clazz.name");
                    bVar2.b(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    public final void i(String str) {
        p.h(str, "key");
        this.f61232a.m(str);
    }
}
