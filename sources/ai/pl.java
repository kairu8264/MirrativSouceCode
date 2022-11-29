package ai;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* loaded from: classes3.dex */
public final class pl {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8459a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public nl f8460b = null;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8461c = false;

    public final void a(Context context) {
        synchronized (this.f8459a) {
            if (!this.f8461c) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    uj0.f("Can not cast Context to Application");
                    return;
                }
                if (this.f8460b == null) {
                    this.f8460b = new nl();
                }
                this.f8460b.f(application, context);
                this.f8461c = true;
            }
        }
    }

    public final void b(ol olVar) {
        synchronized (this.f8459a) {
            if (this.f8460b == null) {
                this.f8460b = new nl();
            }
            this.f8460b.g(olVar);
        }
    }

    public final void c(ol olVar) {
        synchronized (this.f8459a) {
            nl nlVar = this.f8460b;
            if (nlVar == null) {
                return;
            }
            nlVar.h(olVar);
        }
    }

    public final Activity d() {
        synchronized (this.f8459a) {
            nl nlVar = this.f8460b;
            if (nlVar != null) {
                return nlVar.i();
            }
            return null;
        }
    }

    public final Context e() {
        synchronized (this.f8459a) {
            nl nlVar = this.f8460b;
            if (nlVar != null) {
                return nlVar.j();
            }
            return null;
        }
    }
}
