package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o3.c0;
import o3.p0;
import o3.v;
import tj.g;
import wi.h;
import wi.k;

/* loaded from: classes3.dex */
public class a extends e.f {
    public CoordinatorLayout A;
    public FrameLayout B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public BottomSheetBehavior.g G;
    public boolean H;
    public BottomSheetBehavior.g I;

    /* renamed from: y  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f27438y;

    /* renamed from: z  reason: collision with root package name */
    public FrameLayout f27439z;

    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0240a implements v {
        public C0240a() {
        }

        @Override // o3.v
        public p0 a(View view, p0 p0Var) {
            if (a.this.G != null) {
                a.this.f27438y.j0(a.this.G);
            }
            if (p0Var != null) {
                a aVar = a.this;
                aVar.G = new f(aVar.B, p0Var, null);
                a.this.f27438y.S(a.this.G);
            }
            return p0Var;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.D && aVar.isShowing() && a.this.n()) {
                a.this.cancel();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends o3.a {
        public c() {
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            super.g(view, cVar);
            if (a.this.D) {
                cVar.a(1048576);
                cVar.h0(true);
                return;
            }
            cVar.h0(false);
        }

        @Override // o3.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.D) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class e extends BottomSheetBehavior.g {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends BottomSheetBehavior.g {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f27445a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f27446b;

        /* renamed from: c  reason: collision with root package name */
        public final p0 f27447c;

        public /* synthetic */ f(View view, p0 p0Var, C0240a c0240a) {
            this(view, p0Var);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(View view, float f10) {
            c(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, int i10) {
            c(view);
        }

        public final void c(View view) {
            if (view.getTop() < this.f27447c.m()) {
                a.m(view, this.f27445a);
                view.setPadding(view.getPaddingLeft(), this.f27447c.m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                a.m(view, this.f27446b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public f(View view, p0 p0Var) {
            ColorStateList u10;
            this.f27447c = p0Var;
            boolean z10 = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.f27446b = z10;
            g e02 = BottomSheetBehavior.c0(view).e0();
            if (e02 != null) {
                u10 = e02.x();
            } else {
                u10 = c0.u(view);
            }
            if (u10 != null) {
                this.f27445a = hj.a.e(u10.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f27445a = hj.a.e(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f27445a = z10;
            }
        }
    }

    public a(Context context, int i10) {
        super(context, b(context, i10));
        this.D = true;
        this.E = true;
        this.I = new e();
        d(1);
        this.H = getContext().getTheme().obtainStyledAttributes(new int[]{wi.b.f58782s}).getBoolean(0, false);
    }

    public static int b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(wi.b.f58767d, typedValue, true)) {
                return typedValue.resourceId;
            }
            return k.f58909f;
        }
        return i10;
    }

    public static void m(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> j10 = j();
        if (this.C && j10.f0() != 5) {
            j10.z0(5);
        } else {
            super.cancel();
        }
    }

    public final FrameLayout i() {
        if (this.f27439z == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.f58863a, null);
            this.f27439z = frameLayout;
            this.A = (CoordinatorLayout) frameLayout.findViewById(wi.f.f58838d);
            FrameLayout frameLayout2 = (FrameLayout) this.f27439z.findViewById(wi.f.f58839e);
            this.B = frameLayout2;
            BottomSheetBehavior<FrameLayout> c02 = BottomSheetBehavior.c0(frameLayout2);
            this.f27438y = c02;
            c02.S(this.I);
            this.f27438y.t0(this.D);
        }
        return this.f27439z;
    }

    public BottomSheetBehavior<FrameLayout> j() {
        if (this.f27438y == null) {
            i();
        }
        return this.f27438y;
    }

    public boolean k() {
        return this.C;
    }

    public void l() {
        this.f27438y.j0(this.I);
    }

    public boolean n() {
        if (!this.F) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.E = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.F = true;
        }
        return this.E;
    }

    public final View o(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f27439z.findViewById(wi.f.f58838d);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.H) {
            c0.F0(this.B, new C0240a());
        }
        this.B.removeAllViews();
        if (layoutParams == null) {
            this.B.addView(view);
        } else {
            this.B.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(wi.f.T).setOnClickListener(new b());
        c0.r0(this.B, new c());
        this.B.setOnTouchListener(new d());
        return this.f27439z;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z10 = this.H && Color.alpha(window.getNavigationBarColor()) < 255;
        FrameLayout frameLayout = this.f27439z;
        if (frameLayout != null) {
            frameLayout.setFitsSystemWindows(!z10);
        }
        CoordinatorLayout coordinatorLayout = this.A;
        if (coordinatorLayout != null) {
            coordinatorLayout.setFitsSystemWindows(!z10);
        }
        if (z10) {
            window.getDecorView().setSystemUiVisibility(768);
        }
    }

    @Override // e.f, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                window.setStatusBarColor(0);
                window.addFlags(Integer.MIN_VALUE);
                if (i10 < 23) {
                    window.addFlags(67108864);
                }
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f27438y;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f0() != 5) {
            return;
        }
        this.f27438y.z0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.D != z10) {
            this.D = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f27438y;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.t0(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.D) {
            this.D = true;
        }
        this.E = z10;
        this.F = true;
    }

    @Override // e.f, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(o(i10, null, null));
    }

    @Override // e.f, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(o(0, view, null));
    }

    @Override // e.f, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(o(0, view, layoutParams));
    }
}
