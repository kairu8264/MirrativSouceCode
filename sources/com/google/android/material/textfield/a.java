package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import wi.j;

/* loaded from: classes3.dex */
public class a extends xj.c {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f27791d;

    /* renamed from: e  reason: collision with root package name */
    public final View.OnFocusChangeListener f27792e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.f f27793f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.g f27794g;

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f27795h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f27796i;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0246a implements TextWatcher {
        public C0246a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f60320a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.f60320a.hasFocus() && a.l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            boolean z11 = true;
            a.this.i(((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z10) ? false : false);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && a.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f27792e);
            editText.removeTextChangedListener(a.this.f27791d);
            editText.addTextChangedListener(a.this.f27791d);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0247a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EditText f27801w;

            public RunnableC0247a(EditText editText) {
                this.f27801w = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27801w.removeTextChangedListener(a.this.f27791d);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 2) {
                return;
            }
            editText.post(new RunnableC0247a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f27792e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f60320a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f60320a.V();
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f60320a.setEndIconVisible(true);
        }
    }

    /* loaded from: classes3.dex */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f60320a.setEndIconVisible(false);
        }
    }

    /* loaded from: classes3.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f60322c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f60322c.setScaleX(floatValue);
            a.this.f60322c.setScaleY(floatValue);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f27791d = new C0246a();
        this.f27792e = new b();
        this.f27793f = new c();
        this.f27794g = new d();
    }

    public static boolean l(Editable editable) {
        return editable.length() > 0;
    }

    @Override // xj.c
    public void a() {
        this.f60320a.setEndIconDrawable(f.a.b(this.f60321b, wi.e.f58833f));
        TextInputLayout textInputLayout = this.f60320a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.f58888e));
        this.f60320a.setEndIconOnClickListener(new e());
        this.f60320a.e(this.f27793f);
        this.f60320a.f(this.f27794g);
        m();
    }

    @Override // xj.c
    public void c(boolean z10) {
        if (this.f60320a.getSuffixText() == null) {
            return;
        }
        i(z10);
    }

    public final void i(boolean z10) {
        boolean z11 = this.f60320a.K() == z10;
        if (z10 && !this.f27795h.isRunning()) {
            this.f27796i.cancel();
            this.f27795h.start();
            if (z11) {
                this.f27795h.end();
            }
        } else if (z10) {
        } else {
            this.f27795h.cancel();
            this.f27796i.start();
            if (z11) {
                this.f27796i.end();
            }
        }
    }

    public final ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(xi.a.f60297a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    public final ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(xi.a.f60300d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    public final void m() {
        ValueAnimator k10 = k();
        ValueAnimator j10 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f27795h = animatorSet;
        animatorSet.playTogether(k10, j10);
        this.f27795h.addListener(new f());
        ValueAnimator j11 = j(1.0f, 0.0f);
        this.f27796i = j11;
        j11.addListener(new g());
    }
}
