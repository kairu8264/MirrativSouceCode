package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import o3.c0;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f27890a;

    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f27891w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f27892x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ lj.a f27893y;

        public a(View view, int i10, lj.a aVar) {
            this.f27891w = view;
            this.f27892x = i10;
            this.f27893y = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f27891w.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f27890a == this.f27892x) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                lj.a aVar = this.f27893y;
                expandableBehavior.H((View) aVar, this.f27891w, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f27890a = 0;
    }

    public final boolean F(boolean z10) {
        if (!z10) {
            return this.f27890a == 1;
        }
        int i10 = this.f27890a;
        return i10 == 0 || i10 == 2;
    }

    public lj.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> l10 = coordinatorLayout.l(view);
        int size = l10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = l10.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (lj.a) view2;
            }
        }
        return null;
    }

    public abstract boolean H(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        lj.a aVar = (lj.a) view2;
        if (F(aVar.a())) {
            this.f27890a = aVar.a() ? 1 : 2;
            return H((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        lj.a G;
        if (c0.V(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i11 = G.a() ? 1 : 2;
        this.f27890a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27890a = 0;
    }
}
