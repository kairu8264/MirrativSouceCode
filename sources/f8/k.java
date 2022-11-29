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

@Deprecated
/* loaded from: classes.dex */
public abstract class k<T extends View, Z> extends f8.a<Z> {
    public static boolean B;
    public static int C = com.bumptech.glide.i.glide_custom_view_target_tag;
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public final T f31840w;

    /* renamed from: x  reason: collision with root package name */
    public final b f31841x;

    /* renamed from: y  reason: collision with root package name */
    public View.OnAttachStateChangeListener f31842y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f31843z;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            k.this.n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            k.this.m();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static Integer f31845e;

        /* renamed from: a  reason: collision with root package name */
        public final View f31846a;

        /* renamed from: b  reason: collision with root package name */
        public final List<i> f31847b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public boolean f31848c;

        /* renamed from: d  reason: collision with root package name */
        public a f31849d;

        /* loaded from: classes.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: w  reason: collision with root package name */
            public final WeakReference<b> f31850w;

            public a(b bVar) {
                this.f31850w = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f31850w.get();
                if (bVar != null) {
                    bVar.a();
                    return true;
                }
                return true;
            }
        }

        public b(View view) {
            this.f31846a = view;
        }

        public static int c(Context context) {
            if (f31845e == null) {
                Display defaultDisplay = ((WindowManager) i8.j.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f31845e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f31845e.intValue();
        }

        public void a() {
            if (this.f31847b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f31846a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f31849d);
            }
            this.f31849d = null;
            this.f31847b.clear();
        }

        public void d(i iVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                iVar.d(g10, f10);
                return;
            }
            if (!this.f31847b.contains(iVar)) {
                this.f31847b.add(iVar);
            }
            if (this.f31849d == null) {
                ViewTreeObserver viewTreeObserver = this.f31846a.getViewTreeObserver();
                a aVar = new a(this);
                this.f31849d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f31848c && this.f31846a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f31846a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f31846a.getContext());
        }

        public final int f() {
            int paddingTop = this.f31846a.getPaddingTop() + this.f31846a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f31846a.getLayoutParams();
            return e(this.f31846a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f31846a.getPaddingLeft() + this.f31846a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f31846a.getLayoutParams();
            return e(this.f31846a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f31847b).iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(i10, i11);
            }
        }

        public void k(i iVar) {
            this.f31847b.remove(iVar);
        }
    }

    public k(T t10) {
        this.f31840w = (T) i8.j.d(t10);
        this.f31841x = new b(t10);
    }

    public final k<T, Z> a() {
        if (this.f31842y != null) {
            return this;
        }
        this.f31842y = new a();
        h();
        return this;
    }

    @Override // f8.j
    public e8.d b() {
        Object c10 = c();
        if (c10 != null) {
            if (c10 instanceof e8.d) {
                return (e8.d) c10;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    public final Object c() {
        return this.f31840w.getTag(C);
    }

    @Override // f8.j
    public void d(i iVar) {
        this.f31841x.k(iVar);
    }

    @Override // f8.a, f8.j
    public void f(Drawable drawable) {
        super.f(drawable);
        h();
    }

    @Override // f8.a, f8.j
    public void g(Drawable drawable) {
        super.g(drawable);
        this.f31841x.b();
        if (this.f31843z) {
            return;
        }
        i();
    }

    public final void h() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f31842y;
        if (onAttachStateChangeListener == null || this.A) {
            return;
        }
        this.f31840w.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.A = true;
    }

    public final void i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f31842y;
        if (onAttachStateChangeListener == null || !this.A) {
            return;
        }
        this.f31840w.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.A = false;
    }

    @Override // f8.j
    public void j(e8.d dVar) {
        o(dVar);
    }

    @Override // f8.j
    public void l(i iVar) {
        this.f31841x.d(iVar);
    }

    public void m() {
        e8.d b10 = b();
        if (b10 != null) {
            this.f31843z = true;
            b10.clear();
            this.f31843z = false;
        }
    }

    public void n() {
        e8.d b10 = b();
        if (b10 == null || !b10.e()) {
            return;
        }
        b10.i();
    }

    public final void o(Object obj) {
        B = true;
        this.f31840w.setTag(C, obj);
    }

    public String toString() {
        return "Target for: " + this.f31840w;
    }
}
