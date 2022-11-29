package y;

import android.os.Build;
import android.view.View;
import java.util.List;
import o3.o0;

/* loaded from: classes.dex */
public final class z extends o0.b implements Runnable, o3.v, View.OnAttachStateChangeListener {
    public o3.p0 A;

    /* renamed from: y  reason: collision with root package name */
    public final p1 f61030y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f61031z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p1 p1Var) {
        super(!p1Var.c());
        jo.p.h(p1Var, "composeInsets");
        this.f61030y = p1Var;
    }

    @Override // o3.v
    public o3.p0 a(View view, o3.p0 p0Var) {
        jo.p.h(view, "view");
        jo.p.h(p0Var, "insets");
        if (this.f61031z) {
            this.A = p0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
            return p0Var;
        }
        p1.h(this.f61030y, p0Var, 0, 2, null);
        if (this.f61030y.c()) {
            o3.p0 p0Var2 = o3.p0.f44009b;
            jo.p.g(p0Var2, "CONSUMED");
            return p0Var2;
        }
        return p0Var;
    }

    @Override // o3.o0.b
    public void c(o3.o0 o0Var) {
        jo.p.h(o0Var, "animation");
        this.f61031z = false;
        o3.p0 p0Var = this.A;
        if (o0Var.a() != 0 && p0Var != null) {
            this.f61030y.g(p0Var, o0Var.c());
        }
        this.A = null;
        super.c(o0Var);
    }

    @Override // o3.o0.b
    public void d(o3.o0 o0Var) {
        jo.p.h(o0Var, "animation");
        this.f61031z = true;
        super.d(o0Var);
    }

    @Override // o3.o0.b
    public o3.p0 e(o3.p0 p0Var, List<o3.o0> list) {
        jo.p.h(p0Var, "insets");
        jo.p.h(list, "runningAnimations");
        p1.h(this.f61030y, p0Var, 0, 2, null);
        if (this.f61030y.c()) {
            o3.p0 p0Var2 = o3.p0.f44009b;
            jo.p.g(p0Var2, "CONSUMED");
            return p0Var2;
        }
        return p0Var;
    }

    @Override // o3.o0.b
    public o0.a f(o3.o0 o0Var, o0.a aVar) {
        jo.p.h(o0Var, "animation");
        jo.p.h(aVar, "bounds");
        this.f61031z = false;
        o0.a f10 = super.f(o0Var, aVar);
        jo.p.g(f10, "super.onStart(animation, bounds)");
        return f10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        jo.p.h(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        jo.p.h(view, "v");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f61031z) {
            this.f61031z = false;
            o3.p0 p0Var = this.A;
            if (p0Var != null) {
                p1.h(this.f61030y, p0Var, 0, 2, null);
                this.A = null;
            }
        }
    }
}
