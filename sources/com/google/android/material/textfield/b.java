package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import o3.c0;
import tj.k;

/* loaded from: classes3.dex */
public class b extends xj.c {

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f27808q;

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f27809d;

    /* renamed from: e  reason: collision with root package name */
    public final View.OnFocusChangeListener f27810e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.e f27811f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.f f27812g;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.g f27813h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f27814i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f27815j;

    /* renamed from: k  reason: collision with root package name */
    public long f27816k;

    /* renamed from: l  reason: collision with root package name */
    public StateListDrawable f27817l;

    /* renamed from: m  reason: collision with root package name */
    public tj.g f27818m;

    /* renamed from: n  reason: collision with root package name */
    public AccessibilityManager f27819n;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f27820o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f27821p;

    /* loaded from: classes3.dex */
    public class a extends nj.i {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0248a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f27823w;

            public RunnableC0248a(AutoCompleteTextView autoCompleteTextView) {
                this.f27823w = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f27823w.isPopupShowing();
                b.this.E(isPopupShowing);
                b.this.f27814i = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // nj.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView y10 = b.y(b.this.f60320a.getEditText());
            if (b.this.f27819n.isTouchExplorationEnabled() && b.D(y10) && !b.this.f60322c.hasFocus()) {
                y10.dismissDropDown();
            }
            y10.post(new RunnableC0248a(y10));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0249b implements ValueAnimator.AnimatorUpdateListener {
        public C0249b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.f60322c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            b.this.f60320a.setEndIconActivated(z10);
            if (z10) {
                return;
            }
            b.this.E(false);
            b.this.f27814i = false;
        }
    }

    /* loaded from: classes3.dex */
    public class d extends TextInputLayout.e {
        public d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, o3.a
        public void g(View view, p3.c cVar) {
            super.g(view, cVar);
            if (!b.D(b.this.f60320a.getEditText())) {
                cVar.b0(Spinner.class.getName());
            }
            if (cVar.M()) {
                cVar.o0(null);
            }
        }

        @Override // o3.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView y10 = b.y(b.this.f60320a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.f27819n.isTouchExplorationEnabled() && !b.D(b.this.f60320a.getEditText())) {
                b.this.H(y10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements TextInputLayout.f {
        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView y10 = b.y(textInputLayout.getEditText());
            b.this.F(y10);
            b.this.v(y10);
            b.this.G(y10);
            y10.setThreshold(0);
            y10.removeTextChangedListener(b.this.f27809d);
            y10.addTextChangedListener(b.this.f27809d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!b.D(y10)) {
                c0.C0(b.this.f60322c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(b.this.f27811f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements TextInputLayout.g {

        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f27830w;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f27830w = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27830w.removeTextChangedListener(b.this.f27809d);
            }
        }

        public f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i10 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f27810e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (b.f27808q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.H((AutoCompleteTextView) b.this.f60320a.getEditText());
        }
    }

    /* loaded from: classes3.dex */
    public class h implements View.OnTouchListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ AutoCompleteTextView f27833w;

        public h(AutoCompleteTextView autoCompleteTextView) {
            this.f27833w = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (b.this.C()) {
                    b.this.f27814i = false;
                }
                b.this.H(this.f27833w);
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class i implements AutoCompleteTextView.OnDismissListener {
        public i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            b.this.f27814i = true;
            b.this.f27816k = System.currentTimeMillis();
            b.this.E(false);
        }
    }

    /* loaded from: classes3.dex */
    public class j extends AnimatorListenerAdapter {
        public j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            bVar.f60322c.setChecked(bVar.f27815j);
            b.this.f27821p.start();
        }
    }

    static {
        f27808q = Build.VERSION.SDK_INT >= 21;
    }

    public b(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f27809d = new a();
        this.f27810e = new c();
        this.f27811f = new d(this.f60320a);
        this.f27812g = new e();
        this.f27813h = new f();
        this.f27814i = false;
        this.f27815j = false;
        this.f27816k = Long.MAX_VALUE;
    }

    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final tj.g A(float f10, float f11, float f12, int i10) {
        k m10 = k.a().D(f10).H(f10).t(f11).x(f11).m();
        tj.g m11 = tj.g.m(this.f60321b, f12);
        m11.setShapeAppearanceModel(m10);
        m11.a0(0, i10, 0, i10);
        return m11;
    }

    public final void B() {
        this.f27821p = z(67, 0.0f, 1.0f);
        ValueAnimator z10 = z(50, 1.0f, 0.0f);
        this.f27820o = z10;
        z10.addListener(new j());
    }

    public final boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f27816k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final void E(boolean z10) {
        if (this.f27815j != z10) {
            this.f27815j = z10;
            this.f27821p.cancel();
            this.f27820o.start();
        }
    }

    public final void F(AutoCompleteTextView autoCompleteTextView) {
        if (f27808q) {
            int boxBackgroundMode = this.f60320a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f27818m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f27817l);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f27810e);
        if (f27808q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    public final void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.f27814i = false;
        }
        if (!this.f27814i) {
            if (f27808q) {
                E(!this.f27815j);
            } else {
                this.f27815j = !this.f27815j;
                this.f60322c.toggle();
            }
            if (this.f27815j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.f27814i = false;
    }

    @Override // xj.c
    public void a() {
        float dimensionPixelOffset = this.f60321b.getResources().getDimensionPixelOffset(wi.d.W);
        float dimensionPixelOffset2 = this.f60321b.getResources().getDimensionPixelOffset(wi.d.S);
        int dimensionPixelOffset3 = this.f60321b.getResources().getDimensionPixelOffset(wi.d.T);
        tj.g A = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        tj.g A2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f27818m = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f27817l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.f27817l.addState(new int[0], A2);
        this.f60320a.setEndIconDrawable(f.a.b(this.f60321b, f27808q ? wi.e.f58831d : wi.e.f58832e));
        TextInputLayout textInputLayout = this.f60320a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(wi.j.f58890g));
        this.f60320a.setEndIconOnClickListener(new g());
        this.f60320a.e(this.f27812g);
        this.f60320a.f(this.f27813h);
        B();
        this.f27819n = (AccessibilityManager) this.f60321b.getSystemService("accessibility");
    }

    @Override // xj.c
    public boolean b(int i10) {
        return i10 != 0;
    }

    @Override // xj.c
    public boolean d() {
        return true;
    }

    public final void v(AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f60320a.getBoxBackgroundMode();
        tj.g boxBackground = this.f60320a.getBoxBackground();
        int c10 = hj.a.c(autoCompleteTextView, wi.b.f58774k);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, c10, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, c10, iArr, boxBackground);
        }
    }

    public final void w(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, tj.g gVar) {
        int boxBackgroundColor = this.f60320a.getBoxBackgroundColor();
        int[] iArr2 = {hj.a.g(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f27808q) {
            c0.v0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        tj.g gVar2 = new tj.g(gVar.D());
        gVar2.Y(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int J = c0.J(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int I = c0.I(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        c0.v0(autoCompleteTextView, layerDrawable);
        c0.G0(autoCompleteTextView, J, paddingTop, I, paddingBottom);
    }

    public final void x(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, tj.g gVar) {
        LayerDrawable layerDrawable;
        int c10 = hj.a.c(autoCompleteTextView, wi.b.f58778o);
        tj.g gVar2 = new tj.g(gVar.D());
        int g10 = hj.a.g(i10, c10, 0.1f);
        gVar2.Y(new ColorStateList(iArr, new int[]{g10, 0}));
        if (f27808q) {
            gVar2.setTint(c10);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{g10, c10});
            tj.g gVar3 = new tj.g(gVar.D());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        c0.v0(autoCompleteTextView, layerDrawable);
    }

    public final ValueAnimator z(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(xi.a.f60297a);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new C0249b());
        return ofFloat;
    }
}
