package com.dena.mirrorman.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.HorizontalScrollBar;
import jo.h;
import jo.p;
import nd.w0;
import of.t;

/* loaded from: classes2.dex */
public final class HorizontalScrollBar extends View {

    /* renamed from: w  reason: collision with root package name */
    public RecyclerView f25462w;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.u {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            HorizontalScrollBar.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            HorizontalScrollBar.this.d();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.j {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            super.a();
            HorizontalScrollBar.this.d();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ HorizontalScrollBar(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void e(HorizontalScrollBar horizontalScrollBar) {
        p.h(horizontalScrollBar, "this$0");
        horizontalScrollBar.invalidate();
    }

    public final void c(Canvas canvas) {
        Context context;
        Context context2;
        Context context3;
        RecyclerView recyclerView = this.f25462w;
        if (recyclerView != null) {
            int computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
            float f10 = computeHorizontalScrollExtent;
            float width = (((1.0f * f10) / computeHorizontalScrollRange) / f10) * getWidth();
            float f11 = f10 * width;
            float f12 = computeHorizontalScrollOffset * width;
            if (computeHorizontalScrollExtent == computeHorizontalScrollRange) {
                return;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Context context4 = getContext();
            p.e(context4);
            paint.setColor(context4.getResources().getColor(w0.f42242u0));
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            Context context5 = getContext();
            p.e(context5);
            paint2.setColor(context5.getResources().getColor(w0.R0));
            p.e(getContext());
            p.e(getContext());
            canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), t.b(context, 3), t.b(context2, 3), paint2);
            float height = getHeight();
            Context context6 = getContext();
            p.e(context6);
            float b10 = t.b(context6, 3);
            p.e(getContext());
            canvas.drawRoundRect(f12, 0.0f, f12 + f11, height, b10, t.b(context3, 3), paint);
        }
    }

    public final void d() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: yd.g0
                @Override // java.lang.Runnable
                public final void run() {
                    HorizontalScrollBar.e(HorizontalScrollBar.this);
                }
            });
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            c(canvas);
        }
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        p.h(recyclerView, "recyclerView");
        recyclerView.k(new a());
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new b());
        }
        this.f25462w = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        setWillNotDraw(false);
    }
}
