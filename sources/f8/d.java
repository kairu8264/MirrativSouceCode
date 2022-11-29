package f8;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d<T extends View, Z> implements j<Z> {
    public static final int B = com.bumptech.glide.i.glide_custom_view_target_tag;
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final a f31829w;

    /* renamed from: x  reason: collision with root package name */
    public final T f31830x;

    /* renamed from: y  reason: collision with root package name */
    public View.OnAttachStateChangeListener f31831y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f31832z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static Integer f31833e;

        /* renamed from: a  reason: collision with root package name */
        public final View f31834a;

        /* renamed from: b  reason: collision with root package name */
        public final List<i> f31835b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public boolean f31836c;

        /* renamed from: d  reason: collision with root package name */
        public ViewTreeObserver$OnPreDrawListenerC0345a f31837d;

        /* renamed from: f8.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0345a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: w  reason: collision with root package name */
            public final WeakReference<a> f31838w;

            public ViewTreeObserver$OnPreDrawListenerC0345a(a aVar) {
                this.f31838w = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f31838w.get();
                if (aVar != null) {
                    aVar.a();
                    return true;
                }
                return true;
            }
        }

        public a(View view) {
            this.f31834a = view;
        }

        public static int c(Context context) {
            if (f31833e == null) {
                Display defaultDisplay = ((WindowManager) i8.j.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f31833e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f31833e.intValue();
        }

        public void a() {
            if (this.f31835b.isEmpty()) {
                return;
            }
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                j(g10, f10);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.f31834a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f31837d);
            }
            this.f31837d = null;
            this.f31835b.clear();
        }

        public void d(i iVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                iVar.d(g10, f10);
                return;
            }
            if (!this.f31835b.contains(iVar)) {
                this.f31835b.add(iVar);
            }
            if (this.f31837d == null) {
                ViewTreeObserver viewTreeObserver = this.f31834a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC0345a viewTreeObserver$OnPreDrawListenerC0345a = new ViewTreeObserver$OnPreDrawListenerC0345a(this);
                this.f31837d = viewTreeObserver$OnPreDrawListenerC0345a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0345a);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f31836c && this.f31834a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f31834a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f31834a.getContext());
        }

        public final int f() {
            int paddingTop = this.f31834a.getPaddingTop() + this.f31834a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f31834a.getLayoutParams();
            return e(this.f31834a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f31834a.getPaddingLeft() + this.f31834a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f31834a.getLayoutParams();
            return e(this.f31834a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f31835b).iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(i10, i11);
            }
        }

        public void k(i iVar) {
            this.f31835b.remove(iVar);
        }
    }

    public d(T t10) {
        this.f31830x = (T) i8.j.d(t10);
        this.f31829w = new a(t10);
    }

    public final Object a() {
        return this.f31830x.getTag(B);
    }

    @Override // f8.j
    public final e8.d b() {
        Object a10 = a();
        if (a10 != null) {
            if (a10 instanceof e8.d) {
                return (e8.d) a10;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    public final void c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f31831y;
        if (onAttachStateChangeListener == null || this.A) {
            return;
        }
        this.f31830x.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.A = true;
    }

    @Override // f8.j
    public final void d(i iVar) {
        this.f31829w.k(iVar);
    }

    @Override // f8.j
    public final void f(Drawable drawable) {
        c();
        m(drawable);
    }

    @Override // f8.j
    public final void g(Drawable drawable) {
        this.f31829w.b();
        i(drawable);
        if (this.f31832z) {
            return;
        }
        h();
    }

    public final void h() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f31831y;
        if (onAttachStateChangeListener == null || !this.A) {
            return;
        }
        this.f31830x.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.A = false;
    }

    public abstract void i(Drawable drawable);

    @Override // f8.j
    public final void j(e8.d dVar) {
        n(dVar);
    }

    @Override // f8.j
    public final void l(i iVar) {
        this.f31829w.d(iVar);
    }

    public void m(Drawable drawable) {
    }

    public final void n(Object obj) {
        this.f31830x.setTag(B, obj);
    }

    @Override // b8.m
    public void onDestroy() {
    }

    @Override // b8.m
    public void onStart() {
    }

    @Override // b8.m
    public void onStop() {
    }

    public String toString() {
        return "Target for: " + this.f31830x;
    }
}
