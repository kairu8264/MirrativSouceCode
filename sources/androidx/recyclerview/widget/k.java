package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class k extends RecyclerView.o {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f16211d = {16843284};

    /* renamed from: a  reason: collision with root package name */
    public Drawable f16212a;

    /* renamed from: b  reason: collision with root package name */
    public int f16213b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f16214c = new Rect();

    public k(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f16211d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f16212a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        o(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        Drawable drawable = this.f16212a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f16213b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (recyclerView.getLayoutManager() == null || this.f16212a == null) {
            return;
        }
        if (this.f16213b == 1) {
            m(canvas, recyclerView);
        } else {
            l(canvas, recyclerView);
        }
    }

    public final void l(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i10 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i10, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i10 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.getLayoutManager().a0(childAt, this.f16214c);
            int round = this.f16214c.right + Math.round(childAt.getTranslationX());
            this.f16212a.setBounds(round - this.f16212a.getIntrinsicWidth(), i10, round, height);
            this.f16212a.draw(canvas);
        }
        canvas.restore();
    }

    public final void m(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i10 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i10, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i10 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.j0(childAt, this.f16214c);
            int round = this.f16214c.bottom + Math.round(childAt.getTranslationY());
            this.f16212a.setBounds(i10, round - this.f16212a.getIntrinsicHeight(), width, round);
            this.f16212a.draw(canvas);
        }
        canvas.restore();
    }

    public void n(Drawable drawable) {
        if (drawable != null) {
            this.f16212a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void o(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f16213b = i10;
    }
}
