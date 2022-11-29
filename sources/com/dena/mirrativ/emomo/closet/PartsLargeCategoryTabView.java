package com.dena.mirrativ.emomo.closet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.l;
import java.util.List;
import jf.m0;
import jf.n0;
import jo.h;
import jo.p;
import jo.q;
import q9.e;
import r9.t1;
import wn.v;
import xn.s;
import yd.g1;

/* loaded from: classes.dex */
public final class PartsLargeCategoryTabView extends LinearLayout {

    /* renamed from: w  reason: collision with root package name */
    public List<n0> f20802w;

    /* renamed from: x  reason: collision with root package name */
    public int f20803x;

    /* renamed from: y  reason: collision with root package name */
    public l<? super m0, v> f20804y;

    /* loaded from: classes.dex */
    public static final class a extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f20806x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ n0 f20807y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, n0 n0Var) {
            super(1);
            this.f20806x = i10;
            this.f20807y = n0Var;
        }

        public final void a(View view) {
            p.h(view, "it");
            PartsLargeCategoryTabView.this.setSelectedIndex(this.f20806x);
            l<m0, v> selectedListener = PartsLargeCategoryTabView.this.getSelectedListener();
            if (selectedListener != null) {
                selectedListener.invoke(this.f20807y.c());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PartsLargeCategoryTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ PartsLargeCategoryTabView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedIndex(int i10) {
        this.f20803x = i10;
        b();
    }

    public final void b() {
        removeAllViews();
        int i10 = 0;
        for (n0 n0Var : this.f20802w) {
            int i11 = i10 + 1;
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            g1.a(frameLayout, new a(i10, n0Var));
            Context context = frameLayout.getContext();
            p.g(context, "context");
            t1 t1Var = new t1(context, null, 0, 6, null);
            t1Var.w(n0Var, this.f20803x == i10);
            frameLayout.addView(t1Var);
            addView(frameLayout);
            i10 = i11;
        }
        invalidate();
    }

    public final void c(List<n0> list, int i10) {
        p.h(list, "bindModels");
        this.f20802w = list;
        setSelectedIndex(i10);
    }

    public final List<n0> getBindModels() {
        return this.f20802w;
    }

    public final l<m0, v> getSelectedListener() {
        return this.f20804y;
    }

    public final void setSelectedListener(l<? super m0, v> lVar) {
        this.f20804y = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartsLargeCategoryTabView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f20802w = s.k();
        setOrientation(0);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, getResources().getDimensionPixelSize(e.emomo_parts_type_group_view_height)));
    }
}
