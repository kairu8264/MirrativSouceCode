package com.dena.mirrorman.customview;

import ae.al;
import ae.yi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.c;
import androidx.databinding.f;
import androidx.recyclerview.widget.RecyclerView;
import de.n;
import jo.p;
import nd.b1;
import nd.h1;

/* loaded from: classes2.dex */
public final class MultipleStarView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final al f25525w;

    /* renamed from: x  reason: collision with root package name */
    public AttributeSet f25526x;

    /* renamed from: y  reason: collision with root package name */
    public int f25527y;

    /* renamed from: z  reason: collision with root package name */
    public int f25528z;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.h<RecyclerView.e0> {

        /* renamed from: com.dena.mirrorman.customview.MultipleStarView$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0222a extends RecyclerView.e0 {
            public C0222a(View view) {
                super(view);
            }
        }

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return MultipleStarView.this.f25528z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
            p.h(e0Var, "holder");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
            p.h(viewGroup, "parent");
            yi yiVar = (yi) f.e(LayoutInflater.from(viewGroup.getContext()), b1.view_holder_star, viewGroup, false);
            c cVar = new c();
            MultipleStarView multipleStarView = MultipleStarView.this;
            cVar.g(yiVar.B);
            cVar.m(yiVar.C.getId(), multipleStarView.f25527y);
            cVar.l(yiVar.C.getId(), multipleStarView.f25527y);
            cVar.c(yiVar.B);
            return new C0222a(yiVar.u());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleStarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25525w = (al) f.e(LayoutInflater.from(getContext()), b1.view_multiple_star, this, true);
        this.f25527y = n.b(this, 20);
        this.f25526x = attributeSet;
        c();
    }

    public final void c() {
        AttributeSet attributeSet = this.f25526x;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h1.f42047f2, 0, 0);
            this.f25527y = obtainStyledAttributes.getDimensionPixelSize(h1.f42053g2, this.f25527y);
            obtainStyledAttributes.recycle();
        }
        this.f25525w.B.setAdapter(new a());
        if (isInEditMode()) {
            setStarCountAndApply(4);
        }
    }

    public final void setStarCountAndApply(int i10) {
        this.f25528z = i10;
        RecyclerView.h adapter = this.f25525w.B.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
