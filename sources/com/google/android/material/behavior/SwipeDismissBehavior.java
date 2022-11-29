package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o3.c0;
import p3.c;
import p3.f;
import w3.c;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public w3.c f27349a;

    /* renamed from: b  reason: collision with root package name */
    public c f27350b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27351c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27353e;

    /* renamed from: d  reason: collision with root package name */
    public float f27352d = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f27354f = 2;

    /* renamed from: g  reason: collision with root package name */
    public float f27355g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public float f27356h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f27357i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    public final c.AbstractC0951c f27358j = new a();

    /* loaded from: classes3.dex */
    public class a extends c.AbstractC0951c {

        /* renamed from: a  reason: collision with root package name */
        public int f27359a;

        /* renamed from: b  reason: collision with root package name */
        public int f27360b = -1;

        public a() {
        }

        @Override // w3.c.AbstractC0951c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = c0.E(view) == 1;
            int i12 = SwipeDismissBehavior.this.f27354f;
            if (i12 == 0) {
                if (z10) {
                    width = this.f27359a - view.getWidth();
                    width2 = this.f27359a;
                } else {
                    width = this.f27359a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f27359a - view.getWidth();
                width2 = view.getWidth() + this.f27359a;
            } else if (z10) {
                width = this.f27359a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f27359a - view.getWidth();
                width2 = this.f27359a;
            }
            return SwipeDismissBehavior.G(width, i10, width2);
        }

        @Override // w3.c.AbstractC0951c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // w3.c.AbstractC0951c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // w3.c.AbstractC0951c
        public void i(View view, int i10) {
            this.f27360b = i10;
            this.f27359a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // w3.c.AbstractC0951c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f27350b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // w3.c.AbstractC0951c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = this.f27359a + (view.getWidth() * SwipeDismissBehavior.this.f27356h);
            float width2 = this.f27359a + (view.getWidth() * SwipeDismissBehavior.this.f27357i);
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f10), 1.0f));
            }
        }

        @Override // w3.c.AbstractC0951c
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            c cVar;
            this.f27360b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f27359a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f27359a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f27349a.F(i10, view.getTop())) {
                c0.j0(view, new d(view, z10));
            } else if (!z10 || (cVar = SwipeDismissBehavior.this.f27350b) == null) {
            } else {
                cVar.a(view);
            }
        }

        @Override // w3.c.AbstractC0951c
        public boolean m(View view, int i10) {
            int i11 = this.f27360b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.E(view);
        }

        public final boolean n(View view, float f10) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                return Math.abs(view.getLeft() - this.f27359a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f27355g);
            }
            boolean z10 = c0.E(view) == 1;
            int i11 = SwipeDismissBehavior.this.f27354f;
            if (i11 == 2) {
                return true;
            }
            if (i11 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (i10 <= 0) {
                    return false;
                }
                return true;
            } else if (i11 == 1) {
                if (z10) {
                    if (i10 <= 0) {
                        return false;
                    }
                } else if (f10 >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements f {
        public b() {
        }

        @Override // p3.f
        public boolean a(View view, f.a aVar) {
            boolean z10 = false;
            if (SwipeDismissBehavior.this.E(view)) {
                boolean z11 = c0.E(view) == 1;
                int i10 = SwipeDismissBehavior.this.f27354f;
                if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                    z10 = true;
                }
                int width = view.getWidth();
                if (z10) {
                    width = -width;
                }
                c0.b0(view, width);
                view.setAlpha(0.0f);
                c cVar = SwipeDismissBehavior.this.f27350b;
                if (cVar != null) {
                    cVar.a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(View view);

        void b(int i10);
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final View f27363w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f27364x;

        public d(View view, boolean z10) {
            this.f27363w = view;
            this.f27364x = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            w3.c cVar2 = SwipeDismissBehavior.this.f27349a;
            if (cVar2 != null && cVar2.k(true)) {
                c0.j0(this.f27363w, this);
            } else if (!this.f27364x || (cVar = SwipeDismissBehavior.this.f27350b) == null) {
            } else {
                cVar.a(this.f27363w);
            }
        }
    }

    public static float F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    public static int G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    public static float I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        w3.c cVar = this.f27349a;
        if (cVar != null) {
            cVar.z(motionEvent);
            return true;
        }
        return false;
    }

    public boolean E(View view) {
        return true;
    }

    public final void H(ViewGroup viewGroup) {
        w3.c m10;
        if (this.f27349a == null) {
            if (this.f27353e) {
                m10 = w3.c.l(viewGroup, this.f27352d, this.f27358j);
            } else {
                m10 = w3.c.m(viewGroup, this.f27358j);
            }
            this.f27349a = m10;
        }
    }

    public void J(float f10) {
        this.f27357i = F(0.0f, f10, 1.0f);
    }

    public void K(float f10) {
        this.f27356h = F(0.0f, f10, 1.0f);
    }

    public void L(int i10) {
        this.f27354f = i10;
    }

    public final void M(View view) {
        c0.l0(view, 1048576);
        if (E(view)) {
            c0.n0(view, c.a.f45765y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f27351c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.v(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f27351c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f27351c = false;
        }
        if (z10) {
            H(coordinatorLayout);
            return this.f27349a.G(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean l10 = super.l(coordinatorLayout, v10, i10);
        if (c0.C(v10) == 0) {
            c0.C0(v10, 1);
            M(v10);
        }
        return l10;
    }
}
