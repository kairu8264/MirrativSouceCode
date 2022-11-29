package o2;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.l2;
import io.l;
import jo.p;
import jo.q;
import l0.m;
import wn.v;

/* loaded from: classes.dex */
public final class f<T extends View> extends o2.a implements l2 {
    public T P;
    public l<? super Context, ? extends T> Q;
    public l<? super T, v> R;

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f<T> f43874w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f<T> fVar) {
            super(0);
            this.f43874w = fVar;
        }

        public final void a() {
            T typedView$ui_release = this.f43874w.getTypedView$ui_release();
            if (typedView$ui_release != null) {
                this.f43874w.getUpdateBlock().invoke(typedView$ui_release);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, m mVar, m1.b bVar) {
        super(context, mVar, bVar);
        p.h(context, "context");
        p.h(bVar, "dispatcher");
        this.R = e.b();
    }

    public final l<Context, T> getFactory() {
        return (l<? super Context, ? extends T>) this.Q;
    }

    @Override // androidx.compose.ui.platform.l2
    public /* bridge */ /* synthetic */ androidx.compose.ui.platform.a getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final T getTypedView$ui_release() {
        return this.P;
    }

    public final l<T, v> getUpdateBlock() {
        return (l<? super T, v>) this.R;
    }

    @Override // androidx.compose.ui.platform.l2
    public View getViewRoot() {
        return this;
    }

    public final void setFactory(l<? super Context, ? extends T> lVar) {
        this.Q = lVar;
        if (lVar != null) {
            Context context = getContext();
            p.g(context, "context");
            T invoke = lVar.invoke(context);
            this.P = invoke;
            setView$ui_release(invoke);
        }
    }

    public final void setTypedView$ui_release(T t10) {
        this.P = t10;
    }

    public final void setUpdateBlock(l<? super T, v> lVar) {
        p.h(lVar, "value");
        this.R = lVar;
        setUpdate(new a(this));
    }
}
