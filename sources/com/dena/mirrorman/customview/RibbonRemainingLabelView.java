package com.dena.mirrorman.customview;

import ae.gm;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import de.n;
import jo.h;
import jo.p;
import nd.b1;
import o3.c0;
import tj.k;
import ud.g3;
import yd.d1;

/* loaded from: classes2.dex */
public final class RibbonRemainingLabelView extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final a f25585x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f25586y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final gm f25587w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            k m10 = k.a().p(new tj.a(n.a(RibbonRemainingLabelView.this, 8.0f))).q(new d1(RibbonRemainingLabelView.this)).m();
            p.g(m10, "builder()\n              …\n                .build()");
            RibbonRemainingLabelView.this.f25587w.B.setStrokeWidth(n.b(RibbonRemainingLabelView.this, 1));
            RibbonRemainingLabelView.this.f25587w.B.setStrokeColor(-1);
            RibbonRemainingLabelView.this.f25587w.B.setCardElevation(n.a(RibbonRemainingLabelView.this, 4.0f));
            RibbonRemainingLabelView.this.f25587w.B.setShapeAppearanceModel(m10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RibbonRemainingLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25587w = (gm) f.e(LayoutInflater.from(getContext()), b1.view_ribbon_remaining_label, this, true);
        setClipChildren(false);
        if (c0.V(this) && !isLayoutRequested()) {
            k m10 = k.a().p(new tj.a(n.a(this, 8.0f))).q(new d1(this)).m();
            p.g(m10, "builder()\n              …\n                .build()");
            this.f25587w.B.setStrokeWidth(n.b(this, 1));
            this.f25587w.B.setStrokeColor(-1);
            this.f25587w.B.setCardElevation(n.a(this, 4.0f));
            this.f25587w.B.setShapeAppearanceModel(m10);
            return;
        }
        addOnLayoutChangeListener(new b());
    }

    public final void b(g3 g3Var) {
        p.h(g3Var, "bindModel");
        this.f25587w.T(g3Var);
    }
}
