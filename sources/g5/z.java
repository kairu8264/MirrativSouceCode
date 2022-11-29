package g5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class z implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public a f32791a;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup {
        public static Method B;
        public boolean A;

        /* renamed from: w  reason: collision with root package name */
        public ViewGroup f32792w;

        /* renamed from: x  reason: collision with root package name */
        public View f32793x;

        /* renamed from: y  reason: collision with root package name */
        public ArrayList<Drawable> f32794y;

        /* renamed from: z  reason: collision with root package name */
        public z f32795z;

        static {
            try {
                Class cls = Integer.TYPE;
                B = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, z zVar) {
            super(context);
            this.f32794y = null;
            this.f32792w = viewGroup;
            this.f32793x = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f32795z = zVar;
        }

        public void a(Drawable drawable) {
            c();
            if (this.f32794y == null) {
                this.f32794y = new ArrayList<>();
            }
            if (this.f32794y.contains(drawable)) {
                return;
            }
            this.f32794y.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f32792w && viewGroup.getParent() != null && o3.c0.U(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f32792w.getLocationOnScreen(iArr2);
                    o3.c0.b0(view, iArr[0] - iArr2[0]);
                    o3.c0.c0(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public final void c() {
            if (this.A) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        public final void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f32794y;
                if (arrayList == null || arrayList.size() == 0) {
                    this.A = true;
                    this.f32792w.removeView(this);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f32792w.getLocationOnScreen(iArr);
            this.f32793x.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f32793x.getWidth(), this.f32793x.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f32794y;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f32794y.get(i10).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f32792w.getLocationOnScreen(iArr2);
            this.f32793x.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f32794y;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f32792w != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f32792w instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    e(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
                return null;
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f32794y) != null && arrayList.contains(drawable));
        }
    }

    public z(Context context, ViewGroup viewGroup, View view) {
        this.f32791a = new a(context, viewGroup, view, this);
    }

    public static z e(View view) {
        ViewGroup f10 = f(view);
        if (f10 != null) {
            int childCount = f10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = f10.getChildAt(i10);
                if (childAt instanceof a) {
                    return ((a) childAt).f32795z;
                }
            }
            return new u(f10.getContext(), f10, view);
        }
        return null;
    }

    public static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // g5.b0
    public void a(Drawable drawable) {
        this.f32791a.a(drawable);
    }

    @Override // g5.b0
    public void b(Drawable drawable) {
        this.f32791a.f(drawable);
    }
}
