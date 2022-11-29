package n9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import jo.h;
import jo.p;
import lo.c;
import sb.b;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: e  reason: collision with root package name */
    public Drawable f41621e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f41622f;

    public /* synthetic */ a(Context context, int i10, int i11, int i12, h hVar) {
        this(context, i10, (i12 & 4) != 0 ? b.divider_left_margin16_white_five : i11);
    }

    @Override // androidx.recyclerview.widget.k, androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        Drawable drawable;
        p.h(canvas, "canvas");
        p.h(recyclerView, "parent");
        p.h(b0Var, "state");
        int childCount = recyclerView.getChildCount();
        if (childCount == 0 || (drawable = this.f41621e) == null) {
            return;
        }
        canvas.save();
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        int i10 = childCount - 1;
        for (int i11 = 0; i11 < i10; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.j0(childAt, this.f41622f);
            int c10 = this.f41622f.bottom + c.c(childAt.getTranslationY());
            drawable.setBounds(paddingLeft, c10 - drawable.getIntrinsicHeight(), width, c10);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i10, int i11) {
        super(context, i10);
        p.h(context, "context");
        this.f41622f = new Rect();
        Drawable f10 = c3.a.f(context, i11);
        if (f10 != null) {
            n(f10);
            this.f41621e = f10;
        }
    }
}
