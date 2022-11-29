package com.dena.mirrorman.customview;

import ae.cl;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.MultipleUserView;
import com.dena.mirrorman.net.glide.GlideApp;
import de.n;
import java.util.List;
import jo.h;
import jo.p;
import nd.b1;
import nd.h1;
import nd.w0;
import nd.y0;
import o3.c0;
import rd.q0;

/* loaded from: classes2.dex */
public final class MultipleUserView extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: w  reason: collision with root package name */
    public final cl f25530w;

    /* renamed from: x  reason: collision with root package name */
    public int f25531x;

    /* renamed from: y  reason: collision with root package name */
    public int f25532y;

    /* renamed from: z  reason: collision with root package name */
    public int f25533z;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.o {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            p.h(rect, "outRect");
            p.h(view, "view");
            p.h(recyclerView, "parent");
            p.h(b0Var, "state");
            super.g(rect, view, recyclerView, b0Var);
            int f02 = recyclerView.f0(view);
            RecyclerView.h adapter = recyclerView.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                boolean z10 = false;
                if (!MultipleUserView.this.C ? f02 <= 0 : f02 >= itemCount - 1) {
                    z10 = true;
                }
                if (z10) {
                    return;
                }
                rect.left = -MultipleUserView.this.f25532y;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q0 f25536x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List f25537y;

        public b(q0 q0Var, List list) {
            this.f25536x = q0Var;
            this.f25537y = list;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            int max = Math.max(0, (MultipleUserView.this.f25530w.C.getWidth() - MultipleUserView.this.f25532y) / (MultipleUserView.this.f25531x - MultipleUserView.this.f25532y));
            if (MultipleUserView.this.A && max > 0 && this.f25536x.getItemCount() > max) {
                max--;
            }
            if (this.f25536x.getItemCount() > max) {
                this.f25536x.d(this.f25537y.subList(0, Math.max(0, max)));
                MultipleUserView.this.f25530w.B.setVisibility(MultipleUserView.this.A ? 0 : 8);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultipleUserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ MultipleUserView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void i(MultipleUserView multipleUserView, q0 q0Var, List list) {
        p.h(multipleUserView, "this$0");
        p.h(q0Var, "$adapter");
        p.h(list, "$viewerImageUrls");
        RecyclerView recyclerView = multipleUserView.f25530w.C;
        p.g(recyclerView, "binding.recyclerView");
        if (c0.V(recyclerView) && !recyclerView.isLayoutRequested()) {
            int max = Math.max(0, (multipleUserView.f25530w.C.getWidth() - multipleUserView.f25532y) / (multipleUserView.f25531x - multipleUserView.f25532y));
            if (multipleUserView.A && max > 0 && q0Var.getItemCount() > max) {
                max--;
            }
            if (q0Var.getItemCount() > max) {
                q0Var.d(list.subList(0, Math.max(0, max)));
                multipleUserView.f25530w.B.setVisibility(multipleUserView.A ? 0 : 8);
                return;
            }
            return;
        }
        recyclerView.addOnLayoutChangeListener(new b(q0Var, list));
    }

    public final void g(final List<String> list) {
        p.h(list, "viewerImageUrls");
        RecyclerView.h adapter = this.f25530w.C.getAdapter();
        p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.MultipleUserAdapter");
        final q0 q0Var = (q0) adapter;
        q0Var.f(list, new Runnable() { // from class: yd.r0
            @Override // java.lang.Runnable
            public final void run() {
                MultipleUserView.i(MultipleUserView.this, q0Var, list);
            }
        });
        this.f25530w.B.setVisibility(8);
    }

    public final void h(List<String> list, int i10, int i11) {
        p.h(list, "viewerImageUrls");
        this.f25532y = i11;
        this.f25531x = i10;
        this.f25530w.C.setAdapter(new q0(i10, this.f25533z));
        ViewGroup.LayoutParams layoutParams = this.f25530w.B.getLayoutParams();
        layoutParams.height = i10;
        layoutParams.width = i10;
        this.f25530w.B.setTranslationX(-i11);
        this.f25530w.B.setLayoutParams(layoutParams);
        g(list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleUserView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        cl clVar = (cl) f.e(LayoutInflater.from(context), b1.view_multiple_user, this, true);
        this.f25530w = clVar;
        this.f25531x = n.b(this, 14);
        this.f25532y = n.b(this, 4);
        this.f25533z = w0.U0;
        this.B = true;
        this.C = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.f42059h2);
        this.A = obtainStyledAttributes.getBoolean(h1.f42095n2, this.A);
        this.f25531x = obtainStyledAttributes.getDimensionPixelSize(h1.f42071j2, this.f25531x);
        this.f25532y = obtainStyledAttributes.getDimensionPixelSize(h1.f42089m2, this.f25532y);
        this.f25533z = obtainStyledAttributes.getResourceId(h1.f42065i2, this.f25533z);
        this.B = obtainStyledAttributes.getBoolean(h1.f42077k2, this.B);
        this.C = obtainStyledAttributes.getBoolean(h1.f42083l2, this.C);
        obtainStyledAttributes.recycle();
        RecyclerView recyclerView = clVar.C;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(clVar.u().getContext(), 0, this.C);
        linearLayoutManager.M2(this.C);
        recyclerView.setLayoutManager(linearLayoutManager);
        clVar.C.setItemAnimator(null);
        clVar.C.setAdapter(new q0(this.f25531x, this.f25533z));
        clVar.C.setPadding(this.f25532y, 0, 0, 0);
        clVar.C.g(new a());
        if (this.A) {
            GlideApp.with(clVar.B).load(c3.a.f(context, y0.ic_more)).apply((e8.a<?>) e8.h.bitmapTransform(new xd.a(n.b(this, 1), c3.a.d(context, this.f25533z)))).skipMemoryCache(true).into(clVar.B).a();
            ViewGroup.LayoutParams layoutParams = clVar.B.getLayoutParams();
            int i11 = this.f25531x;
            layoutParams.height = i11;
            layoutParams.width = i11;
            clVar.B.setTranslationX(-this.f25532y);
            clVar.B.setLayoutParams(layoutParams);
            if (this.B) {
                clVar.B.bringToFront();
            } else {
                clVar.C.bringToFront();
            }
        }
    }
}
