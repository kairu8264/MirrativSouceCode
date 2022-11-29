package y4;

import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.savedstate.Recreator;
import jo.h;
import jo.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f61238d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final e f61239a;

    /* renamed from: b  reason: collision with root package name */
    public final c f61240b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f61241c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final d a(e eVar) {
            p.h(eVar, "owner");
            return new d(eVar, null);
        }
    }

    public d(e eVar) {
        this.f61239a = eVar;
        this.f61240b = new c();
    }

    public /* synthetic */ d(e eVar, h hVar) {
        this(eVar);
    }

    public static final d a(e eVar) {
        return f61238d.a(eVar);
    }

    public final c b() {
        return this.f61240b;
    }

    public final void c() {
        o g10 = this.f61239a.g();
        p.g(g10, "owner.lifecycle");
        if (g10.b() == o.c.INITIALIZED) {
            g10.a(new Recreator(this.f61239a));
            this.f61240b.d(g10);
            this.f61241c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f61241c) {
            c();
        }
        o g10 = this.f61239a.g();
        p.g(g10, "owner.lifecycle");
        if (!g10.b().a(o.c.STARTED)) {
            this.f61240b.e(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + g10.b()).toString());
    }

    public final void e(Bundle bundle) {
        p.h(bundle, "outBundle");
        this.f61240b.f(bundle);
    }
}
