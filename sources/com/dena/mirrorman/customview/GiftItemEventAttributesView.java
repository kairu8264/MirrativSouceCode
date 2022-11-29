package com.dena.mirrorman.customview;

import ae.ua;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jo.h;
import jo.p;
import nd.b1;
import rd.c0;
import ud.r0;
import ud.x0;
import xn.a0;

/* loaded from: classes2.dex */
public final class GiftItemEventAttributesView extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final a f25447x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f25448y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final ua f25449w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ x0 f25450e;

        public b(x0 x0Var) {
            this.f25450e = x0Var;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            r0 r0Var = (r0) a0.a0(this.f25450e.a(), i10);
            return (r0Var == null || r0Var.F0()) ? 2 : 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftItemEventAttributesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        ua uaVar = (ua) f.e(LayoutInflater.from(getContext()), b1.view_gift_item_event_attributes, this, true);
        this.f25449w = uaVar;
        uaVar.I.setAdapter(new c0());
    }

    public final void a(x0 x0Var) {
        p.h(x0Var, "bindModel");
        RecyclerView.h adapter = this.f25449w.I.getAdapter();
        p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.GiftItemAttributeAdapter");
        ((c0) adapter).d(x0Var.a());
        RecyclerView.p layoutManager = this.f25449w.I.getLayoutManager();
        p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).o3(new b(x0Var));
        this.f25449w.J.setTextSize(2, x0Var.g());
        this.f25449w.B.setTextSize(2, x0Var.d());
        this.f25449w.T(x0Var);
    }
}
