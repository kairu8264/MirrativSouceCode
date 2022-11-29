package yi;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import o3.c0;
import o3.f;
import o3.p0;

/* loaded from: classes3.dex */
public abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    public final Rect f62021d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f62022e;

    /* renamed from: f  reason: collision with root package name */
    public int f62023f;

    /* renamed from: g  reason: collision with root package name */
    public int f62024g;

    public b() {
        this.f62021d = new Rect();
        this.f62022e = new Rect();
        this.f62023f = 0;
    }

    public static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // yi.c
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View H = H(coordinatorLayout.l(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f62021d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            p0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && c0.B(coordinatorLayout) && !c0.B(view)) {
                rect.left += lastWindowInsets.k();
                rect.right -= lastWindowInsets.l();
            }
            Rect rect2 = this.f62022e;
            f.a(N(fVar.f14933c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f62023f = rect2.top - H.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i10);
        this.f62023f = 0;
    }

    public abstract View H(List<View> list);

    public final int I(View view) {
        if (this.f62024g == 0) {
            return 0;
        }
        float J = J(view);
        int i10 = this.f62024g;
        return i3.a.b((int) (J * i10), 0, i10);
    }

    public float J(View view) {
        return 1.0f;
    }

    public final int K() {
        return this.f62024g;
    }

    public int L(View view) {
        return view.getMeasuredHeight();
    }

    public final int M() {
        return this.f62023f;
    }

    public final void O(int i10) {
        this.f62024g = i10;
    }

    public boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View H;
        p0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 == -1 || i14 == -2) && (H = H(coordinatorLayout.l(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                if (c0.B(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.m() + lastWindowInsets.j();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int L = size + L(H);
            int measuredHeight = H.getMeasuredHeight();
            if (P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                L -= measuredHeight;
            }
            coordinatorLayout.D(view, i10, i11, View.MeasureSpec.makeMeasureSpec(L, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
            return true;
        }
        return false;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62021d = new Rect();
        this.f62022e = new Rect();
        this.f62023f = 0;
    }
}
