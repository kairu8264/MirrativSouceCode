package xj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import o3.c0;
import s3.j;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f60323a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f60324b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f60325c;

    /* renamed from: d  reason: collision with root package name */
    public int f60326d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f60327e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f60328f;

    /* renamed from: g  reason: collision with root package name */
    public final float f60329g;

    /* renamed from: h  reason: collision with root package name */
    public int f60330h;

    /* renamed from: i  reason: collision with root package name */
    public int f60331i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f60332j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f60333k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f60334l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f60335m;

    /* renamed from: n  reason: collision with root package name */
    public int f60336n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f60337o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f60338p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f60339q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f60340r;

    /* renamed from: s  reason: collision with root package name */
    public int f60341s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f60342t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f60343u;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f60344a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f60345b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f60346c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f60347d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f60344a = i10;
            this.f60345b = textView;
            this.f60346c = i11;
            this.f60347d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f60330h = this.f60344a;
            d.this.f60328f = null;
            TextView textView = this.f60345b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f60346c == 1 && d.this.f60334l != null) {
                    d.this.f60334l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f60347d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f60347d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f60347d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public d(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f60323a = context;
        this.f60324b = textInputLayout;
        this.f60329g = context.getResources().getDimensionPixelSize(wi.d.f58811j);
    }

    public final void A(int i10, int i11) {
        TextView l10;
        TextView l11;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (l11 = l(i11)) != null) {
            l11.setVisibility(0);
            l11.setAlpha(1.0f);
        }
        if (i10 != 0 && (l10 = l(i10)) != null) {
            l10.setVisibility(4);
            if (i10 == 1) {
                l10.setText((CharSequence) null);
            }
        }
        this.f60330h = i11;
    }

    public void B(CharSequence charSequence) {
        this.f60335m = charSequence;
        TextView textView = this.f60334l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void C(boolean z10) {
        if (this.f60333k == z10) {
            return;
        }
        g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f60323a);
            this.f60334l = appCompatTextView;
            appCompatTextView.setId(wi.f.O);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f60334l.setTextAlignment(5);
            }
            Typeface typeface = this.f60343u;
            if (typeface != null) {
                this.f60334l.setTypeface(typeface);
            }
            D(this.f60336n);
            E(this.f60337o);
            B(this.f60335m);
            this.f60334l.setVisibility(4);
            c0.t0(this.f60334l, 1);
            d(this.f60334l, 0);
        } else {
            t();
            z(this.f60334l, 0);
            this.f60334l = null;
            this.f60324b.s0();
            this.f60324b.F0();
        }
        this.f60333k = z10;
    }

    public void D(int i10) {
        this.f60336n = i10;
        TextView textView = this.f60334l;
        if (textView != null) {
            this.f60324b.e0(textView, i10);
        }
    }

    public void E(ColorStateList colorStateList) {
        this.f60337o = colorStateList;
        TextView textView = this.f60334l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void F(int i10) {
        this.f60341s = i10;
        TextView textView = this.f60340r;
        if (textView != null) {
            j.q(textView, i10);
        }
    }

    public void G(boolean z10) {
        if (this.f60339q == z10) {
            return;
        }
        g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f60323a);
            this.f60340r = appCompatTextView;
            appCompatTextView.setId(wi.f.P);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f60340r.setTextAlignment(5);
            }
            Typeface typeface = this.f60343u;
            if (typeface != null) {
                this.f60340r.setTypeface(typeface);
            }
            this.f60340r.setVisibility(4);
            c0.t0(this.f60340r, 1);
            F(this.f60341s);
            H(this.f60342t);
            d(this.f60340r, 1);
        } else {
            u();
            z(this.f60340r, 1);
            this.f60340r = null;
            this.f60324b.s0();
            this.f60324b.F0();
        }
        this.f60339q = z10;
    }

    public void H(ColorStateList colorStateList) {
        this.f60342t = colorStateList;
        TextView textView = this.f60340r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void J(Typeface typeface) {
        if (typeface != this.f60343u) {
            this.f60343u = typeface;
            I(this.f60334l, typeface);
            I(this.f60340r, typeface);
        }
    }

    public final void K(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean L(TextView textView, CharSequence charSequence) {
        return c0.V(this.f60324b) && this.f60324b.isEnabled() && !(this.f60331i == this.f60330h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public void M(CharSequence charSequence) {
        g();
        this.f60332j = charSequence;
        this.f60334l.setText(charSequence);
        int i10 = this.f60330h;
        if (i10 != 1) {
            this.f60331i = 1;
        }
        O(i10, this.f60331i, L(this.f60334l, charSequence));
    }

    public void N(CharSequence charSequence) {
        g();
        this.f60338p = charSequence;
        this.f60340r.setText(charSequence);
        int i10 = this.f60330h;
        if (i10 != 2) {
            this.f60331i = 2;
        }
        O(i10, this.f60331i, L(this.f60340r, charSequence));
    }

    public final void O(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f60328f = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.f60339q, this.f60340r, 2, i10, i11);
            h(arrayList, this.f60333k, this.f60334l, 1, i10, i11);
            xi.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, l(i10), i10, l(i11)));
            animatorSet.start();
        } else {
            A(i10, i11);
        }
        this.f60324b.s0();
        this.f60324b.v0(z10);
        this.f60324b.F0();
    }

    public void d(TextView textView, int i10) {
        if (this.f60325c == null && this.f60327e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f60323a);
            this.f60325c = linearLayout;
            linearLayout.setOrientation(0);
            this.f60324b.addView(this.f60325c, -1, -2);
            this.f60327e = new FrameLayout(this.f60323a);
            this.f60325c.addView(this.f60327e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f60324b.getEditText() != null) {
                e();
            }
        }
        if (w(i10)) {
            this.f60327e.setVisibility(0);
            this.f60327e.addView(textView);
        } else {
            this.f60325c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f60325c.setVisibility(0);
        this.f60326d++;
    }

    public void e() {
        if (f()) {
            EditText editText = this.f60324b.getEditText();
            boolean g10 = qj.c.g(this.f60323a);
            LinearLayout linearLayout = this.f60325c;
            int i10 = wi.d.f58823v;
            c0.G0(linearLayout, s(g10, i10, c0.J(editText)), s(g10, wi.d.f58824w, this.f60323a.getResources().getDimensionPixelSize(wi.d.f58822u)), s(g10, i10, c0.I(editText)), 0);
        }
    }

    public final boolean f() {
        return (this.f60325c == null || this.f60324b.getEditText() == null) ? false : true;
    }

    public void g() {
        Animator animator = this.f60328f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void h(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            list.add(i(textView, i12 == i10));
            if (i12 == i10) {
                list.add(j(textView));
            }
        }
    }

    public final ObjectAnimator i(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(xi.a.f60297a);
        return ofFloat;
    }

    public final ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f60329g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(xi.a.f60300d);
        return ofFloat;
    }

    public boolean k() {
        return v(this.f60331i);
    }

    public final TextView l(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f60340r;
        }
        return this.f60334l;
    }

    public CharSequence m() {
        return this.f60335m;
    }

    public CharSequence n() {
        return this.f60332j;
    }

    public int o() {
        TextView textView = this.f60334l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList p() {
        TextView textView = this.f60334l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence q() {
        return this.f60338p;
    }

    public int r() {
        TextView textView = this.f60340r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int s(boolean z10, int i10, int i11) {
        return z10 ? this.f60323a.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void t() {
        this.f60332j = null;
        g();
        if (this.f60330h == 1) {
            if (this.f60339q && !TextUtils.isEmpty(this.f60338p)) {
                this.f60331i = 2;
            } else {
                this.f60331i = 0;
            }
        }
        O(this.f60330h, this.f60331i, L(this.f60334l, null));
    }

    public void u() {
        g();
        int i10 = this.f60330h;
        if (i10 == 2) {
            this.f60331i = 0;
        }
        O(i10, this.f60331i, L(this.f60340r, null));
    }

    public final boolean v(int i10) {
        return (i10 != 1 || this.f60334l == null || TextUtils.isEmpty(this.f60332j)) ? false : true;
    }

    public boolean w(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public boolean x() {
        return this.f60333k;
    }

    public boolean y() {
        return this.f60339q;
    }

    public void z(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f60325c == null) {
            return;
        }
        if (w(i10) && (frameLayout = this.f60327e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f60325c.removeView(textView);
        }
        int i11 = this.f60326d - 1;
        this.f60326d = i11;
        K(this.f60325c, i11);
    }
}
