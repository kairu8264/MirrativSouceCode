package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import o3.p0;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final List<View> f15189w;

    /* renamed from: x  reason: collision with root package name */
    public final List<View> f15190x;

    /* renamed from: y  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f15191y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f15192z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15193a = new a();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            jo.p.h(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            jo.p.h(view, "v");
            jo.p.h(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            jo.p.g(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        jo.p.h(context, "context");
        this.f15189w = new ArrayList();
        this.f15190x = new ArrayList();
        this.f15192z = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public final void a(View view) {
        if (this.f15190x.contains(view)) {
            this.f15189w.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        jo.p.h(view, "child");
        if (FragmentManager.x0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        p0 d02;
        jo.p.h(windowInsets, "insets");
        p0 x10 = p0.x(windowInsets);
        jo.p.g(x10, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f15191y;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f15193a;
            jo.p.e(onApplyWindowInsetsListener);
            d02 = p0.x(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            d02 = o3.c0.d0(this, x10);
        }
        if (!d02.p()) {
            int i10 = 0;
            int childCount = getChildCount();
            if (childCount > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    o3.c0.i(getChildAt(i10), d02);
                    if (i11 >= childCount) {
                        break;
                    }
                    i10 = i11;
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        jo.p.h(canvas, "canvas");
        if (this.f15192z) {
            for (View view : this.f15189w) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        jo.p.h(canvas, "canvas");
        jo.p.h(view, "child");
        if (this.f15192z && (!this.f15189w.isEmpty()) && this.f15189w.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        jo.p.h(view, "view");
        this.f15190x.remove(view);
        if (this.f15189w.remove(view)) {
            this.f15192z = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.g0(this).d0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        jo.p.h(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i10 = childCount - 1;
                View childAt = getChildAt(childCount);
                jo.p.g(childAt, "view");
                a(childAt);
                if (i10 < 0) {
                    break;
                }
                childCount = i10;
            }
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        jo.p.h(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        jo.p.g(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        jo.p.h(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        if (i10 < i12) {
            int i13 = i10;
            while (true) {
                int i14 = i13 + 1;
                View childAt = getChildAt(i13);
                jo.p.g(childAt, "view");
                a(childAt);
                if (i14 >= i12) {
                    break;
                }
                i13 = i14;
            }
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        if (i10 < i12) {
            int i13 = i10;
            while (true) {
                int i14 = i13 + 1;
                View childAt = getChildAt(i13);
                jo.p.g(childAt, "view");
                a(childAt);
                if (i14 >= i12) {
                    break;
                }
                i13 = i14;
            }
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f15192z = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        jo.p.h(onApplyWindowInsetsListener, "listener");
        this.f15191y = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        jo.p.h(view, "view");
        if (view.getParent() == this) {
            this.f15190x.add(view);
        }
        super.startViewTransition(view);
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, jo.h hVar) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String str;
        jo.p.h(context, "context");
        this.f15189w = new ArrayList();
        this.f15190x = new ArrayList();
        this.f15192z = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = g4.c.f32633e;
            jo.p.g(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(g4.c.f32634f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + ((Object) classAttribute) + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        jo.p.h(context, "context");
        jo.p.h(attributeSet, "attrs");
        jo.p.h(fragmentManager, "fm");
        this.f15189w = new ArrayList();
        this.f15190x = new ArrayList();
        this.f15192z = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = g4.c.f32633e;
        jo.p.g(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(g4.c.f32634f) : classAttribute;
        String string = obtainStyledAttributes.getString(g4.c.f32635g);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment d02 = fragmentManager.d0(id2);
        if (classAttribute != null && d02 == null) {
            if (id2 <= 0) {
                String o10 = string != null ? jo.p.o(" with tag ", string) : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((Object) classAttribute) + o10);
            }
            Fragment a10 = fragmentManager.o0().a(context.getClassLoader(), classAttribute);
            jo.p.g(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.N1(context, attributeSet, null);
            fragmentManager.k().w(true).c(this, a10, string).l();
        }
        fragmentManager.P0(this);
    }
}
