package j6;

import android.view.View;
import coil.request.ViewTargetRequestDelegate;
import uo.d2;
import uo.g1;
import uo.q0;
import uo.v1;
import uo.y0;
import wn.v;

/* loaded from: classes.dex */
public final class s implements View.OnAttachStateChangeListener {
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final View f37241w;

    /* renamed from: x  reason: collision with root package name */
    public r f37242x;

    /* renamed from: y  reason: collision with root package name */
    public d2 f37243y;

    /* renamed from: z  reason: collision with root package name */
    public ViewTargetRequestDelegate f37244z;

    @co.f(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37245w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f37245w == 0) {
                wn.m.b(obj);
                s.this.c(null);
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public s(View view) {
        this.f37241w = view;
    }

    public final synchronized void a() {
        d2 d10;
        d2 d2Var = this.f37243y;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = uo.l.d(v1.f56093w, g1.c().h0(), null, new a(null), 2, null);
        this.f37243y = d10;
        this.f37242x = null;
    }

    public final synchronized r b(y0<? extends j> y0Var) {
        r rVar = this.f37242x;
        if (rVar != null && o6.k.r() && this.A) {
            this.A = false;
            rVar.a(y0Var);
            return rVar;
        }
        d2 d2Var = this.f37243y;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.f37243y = null;
        r rVar2 = new r(this.f37241w, y0Var);
        this.f37242x = rVar2;
        return rVar2;
    }

    public final void c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f37244z;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.k();
        }
        this.f37244z = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f37244z;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.A = true;
        viewTargetRequestDelegate.l();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f37244z;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        viewTargetRequestDelegate.k();
    }
}
