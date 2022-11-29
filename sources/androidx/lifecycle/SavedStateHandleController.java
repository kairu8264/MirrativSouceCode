package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.o;
import y4.c;

/* loaded from: classes.dex */
final class SavedStateHandleController implements r {

    /* renamed from: w  reason: collision with root package name */
    public final String f15490w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f15491x = false;

    /* renamed from: y  reason: collision with root package name */
    public final l0 f15492y;

    /* loaded from: classes.dex */
    public static final class a implements c.a {
        @Override // y4.c.a
        public void a(y4.e eVar) {
            if (eVar instanceof v0) {
                u0 U = ((v0) eVar).U();
                y4.c a02 = eVar.a0();
                for (String str : U.c()) {
                    SavedStateHandleController.a(U.b(str), a02, eVar.g());
                }
                if (U.c().isEmpty()) {
                    return;
                }
                a02.h(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, l0 l0Var) {
        this.f15490w = str;
        this.f15492y = l0Var;
    }

    public static void a(q0 q0Var, y4.c cVar, o oVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) q0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.l()) {
            return;
        }
        savedStateHandleController.e(cVar, oVar);
        m(cVar, oVar);
    }

    public static SavedStateHandleController j(y4.c cVar, o oVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, l0.a(cVar.b(str), bundle));
        savedStateHandleController.e(cVar, oVar);
        m(cVar, oVar);
        return savedStateHandleController;
    }

    public static void m(final y4.c cVar, final o oVar) {
        o.c b10 = oVar.b();
        if (b10 != o.c.INITIALIZED && !b10.a(o.c.STARTED)) {
            oVar.a(new r() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.r
                public void i(u uVar, o.b bVar) {
                    if (bVar == o.b.ON_START) {
                        o.this.c(this);
                        cVar.h(a.class);
                    }
                }
            });
        } else {
            cVar.h(a.class);
        }
    }

    public void e(y4.c cVar, o oVar) {
        if (!this.f15491x) {
            this.f15491x = true;
            oVar.a(this);
            cVar.g(this.f15490w, this.f15492y.d());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // androidx.lifecycle.r
    public void i(u uVar, o.b bVar) {
        if (bVar == o.b.ON_DESTROY) {
            this.f15491x = false;
            uVar.g().c(this);
        }
    }

    public l0 k() {
        return this.f15492y;
    }

    public boolean l() {
        return this.f15491x;
    }
}
