package be;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o1 extends androidx.fragment.app.e implements uo.q0 {
    public static final a W0 = new a(null);
    public static final int X0 = 8;
    public ae.z0 O0;
    public p1 Q0;
    public boolean U0;
    public boolean V0;
    public final /* synthetic */ da.j N0 = new da.j();
    public final ud.e0 P0 = new ud.e0(null, null, null, null, null, null, null, 127, null);
    public final wn.f R0 = wn.g.a(new b());
    public final wn.f S0 = wn.g.a(new h());
    public final wn.f T0 = wn.g.a(new i());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o1 a(jf.q qVar, int i10, int i11) {
            jo.p.h(qVar, "gift");
            o1 o1Var = new o1();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_EMOMO_RUN_SCORE_GIFT", qVar);
            bundle.putInt("EXTRA_EMOMO_RUN_REMAINING_COINS", i10);
            bundle.putInt("EXTRA_EMOMO_RUN_REMAINING_SCORE", i11);
            o1Var.V2(bundle);
            return o1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<jf.q> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final jf.q invoke() {
            return (jf.q) o1.this.M2().getParcelable("EXTRA_EMOMO_RUN_SCORE_GIFT");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (o1.this.V0 || editable == null) {
                return;
            }
            o1 o1Var = o1.this;
            o1Var.b4(o1Var.Q3(editable.toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null) {
                o1 o1Var = o1.this;
                ae.z0 z0Var = null;
                if (charSequence.length() == 0) {
                    ae.z0 z0Var2 = o1Var.O0;
                    if (z0Var2 == null) {
                        jo.p.v("binding");
                        z0Var2 = null;
                    }
                    z0Var2.J.setTextSize(2, 22.0f);
                    ae.z0 z0Var3 = o1Var.O0;
                    if (z0Var3 == null) {
                        jo.p.v("binding");
                    } else {
                        z0Var = z0Var3;
                    }
                    z0Var.J.setTypeface(Typeface.DEFAULT);
                    return;
                }
                ae.z0 z0Var4 = o1Var.O0;
                if (z0Var4 == null) {
                    jo.p.v("binding");
                    z0Var4 = null;
                }
                z0Var4.J.setTextSize(2, 26.0f);
                ae.z0 z0Var5 = o1Var.O0;
                if (z0Var5 == null) {
                    jo.p.v("binding");
                } else {
                    z0Var = z0Var5;
                }
                z0Var.J.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ae.z0 z0Var = o1.this.O0;
            ae.z0 z0Var2 = null;
            if (z0Var == null) {
                jo.p.v("binding");
                z0Var = null;
            }
            if (z0Var.J.hasFocus()) {
                return;
            }
            ae.z0 z0Var3 = o1.this.O0;
            if (z0Var3 == null) {
                jo.p.v("binding");
            } else {
                z0Var2 = z0Var3;
            }
            z0Var2.J.requestFocus();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ae.z0 z0Var = o1.this.O0;
            if (z0Var == null) {
                jo.p.v("binding");
                z0Var = null;
            }
            z0Var.J.clearFocus();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            o1 o1Var = o1.this;
            ae.z0 z0Var = o1Var.O0;
            ae.z0 z0Var2 = null;
            if (z0Var == null) {
                jo.p.v("binding");
                z0Var = null;
            }
            int Q3 = o1Var.Q3(z0Var.J.getText().toString());
            if (o1.this.U0) {
                ae.z0 z0Var3 = o1.this.O0;
                if (z0Var3 == null) {
                    jo.p.v("binding");
                } else {
                    z0Var2 = z0Var3;
                }
                z0Var2.J.clearFocus();
            } else if (o1.this.X3(Q3)) {
                jf.q T3 = o1.this.T3();
                if (T3 != null) {
                    o1 o1Var2 = o1.this;
                    p1 p1Var = o1Var2.Q0;
                    if (p1Var != null) {
                        p1Var.m2(T3, Q3);
                    }
                    o1Var2.m3();
                }
            } else if (o1.this.U3() >= Q3) {
                if (o1.this.V3() < Q3) {
                    of.n.f45411a.B(o1.this.N2(), o1.this.U0(nd.f1.f41990t2), false);
                }
            } else {
                of.n.f45411a.B(o1.this.N2(), o1.this.U0(nd.f1.f41993u3), false);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            o1.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<Integer> {
        public h() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(o1.this.M2().getInt("EXTRA_EMOMO_RUN_REMAINING_COINS", 0));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<Integer> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(o1.this.M2().getInt("EXTRA_EMOMO_RUN_REMAINING_SCORE", 0));
        }
    }

    public static final boolean Y3(o1 o1Var, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(o1Var, "this$0");
        o1Var.P3();
        return true;
    }

    public static final void Z3(o1 o1Var, View view, boolean z10) {
        jo.p.h(o1Var, "this$0");
        if (z10) {
            of.j.f45405a.d(o1Var.N2(), (EditText) view, 100);
            o1Var.a4();
            return;
        }
        of.j.f45405a.c(o1Var.N2(), view);
        o1Var.P3();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ae.z0 z0Var = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nd.b1.dialog_emomo_run_score_gift, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        ae.z0 z0Var2 = (ae.z0) e10;
        this.O0 = z0Var2;
        if (z0Var2 == null) {
            jo.p.v("binding");
        } else {
            z0Var = z0Var2;
        }
        View u10 = z0Var.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.Q0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    public final int N3(String str, float f10, boolean z10, int i10) {
        TextView textView = new TextView(N2());
        textView.setPadding(0, 0, 0, 0);
        textView.setTypeface(z10 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        textView.setText(str, TextView.BufferType.SPANNABLE);
        textView.setTextSize(2, f10);
        textView.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredWidth();
    }

    public final Drawable O3(int i10, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, xn.a0.A0(xn.s.m(Integer.valueOf(i10), Integer.valueOf(i10))));
        gradientDrawable.setCornerRadius(f10);
        return gradientDrawable;
    }

    public final void P3() {
        ae.z0 z0Var = this.O0;
        ae.z0 z0Var2 = null;
        if (z0Var == null) {
            jo.p.v("binding");
            z0Var = null;
        }
        z0Var.I.setVisibility(8);
        ae.z0 z0Var3 = this.O0;
        if (z0Var3 == null) {
            jo.p.v("binding");
            z0Var3 = null;
        }
        z0Var3.J.clearFocus();
        this.U0 = false;
        ae.z0 z0Var4 = this.O0;
        if (z0Var4 == null) {
            jo.p.v("binding");
        } else {
            z0Var2 = z0Var4;
        }
        b4(Q3(z0Var2.J.getText().toString()));
    }

    public final int Q3(String str) {
        String y10 = so.n.y(str, ",", "", false, 4, null);
        if (y10.length() > 10) {
            y10 = y10.substring(0, 10);
            jo.p.g(y10, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Integer i10 = so.m.i(y10);
        if (i10 != null) {
            return Math.min(V3(), i10.intValue());
        }
        return 0;
    }

    public final SpannableString R3(int i10) {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String U0 = U0(nd.f1.text_emomo_run_score_gift_dialog_score_prefix);
        jo.p.g(U0, "getString(R.string.text_…gift_dialog_score_prefix)");
        int i11 = nd.f1.text_emomo_run_reward_amount;
        jo.i0 i0Var = jo.i0.f38149a;
        Object format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(V3())}, 1));
        jo.p.g(format, "format(format, *args)");
        String V0 = V0(i11, format);
        jo.p.g(V0, "getString(R.string.text_…t(\"%,d\", remainingScore))");
        if (i10 > 0) {
            str = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            jo.p.g(str, "format(format, *args)");
        } else {
            str = "";
        }
        if (str.length() > 0) {
            str = " - " + V0(i11, str);
        }
        spannableStringBuilder.append((CharSequence) U0);
        spannableStringBuilder.append((CharSequence) V0);
        int length = U0.length() + 0 + V0.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.a.d(N2(), nd.w0.f42234j)), 0, length, 33);
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.a.d(N2(), nd.w0.S)), length, str.length() + length, 33);
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        jo.p.g(valueOf, "valueOf(spannableStringBuilder)");
        return valueOf;
    }

    public final Drawable S3(int i10) {
        return O3(c3.a.d(N2(), X3(i10) ? nd.w0.f42242u0 : nd.w0.T0), 0.0f);
    }

    public final jf.q T3() {
        return (jf.q) this.R0.getValue();
    }

    public final int U3() {
        return ((Number) this.S0.getValue()).intValue();
    }

    public final int V3() {
        return ((Number) this.T0.getValue()).intValue();
    }

    public final Drawable W3(int i10) {
        return O3(c3.a.d(N2(), X3(i10) ? nd.w0.f42241s0 : nd.w0.T0), de.e.b(this, 22));
    }

    public final boolean X3(int i10) {
        return (100 <= i10 && i10 <= V3()) && i10 <= U3();
    }

    public final void a4() {
        ae.z0 z0Var = this.O0;
        ae.z0 z0Var2 = null;
        if (z0Var == null) {
            jo.p.v("binding");
            z0Var = null;
        }
        z0Var.I.setVisibility(0);
        this.U0 = true;
        ae.z0 z0Var3 = this.O0;
        if (z0Var3 == null) {
            jo.p.v("binding");
        } else {
            z0Var2 = z0Var3;
        }
        z0Var2.J.setHint("");
    }

    public final void b4(int i10) {
        String str;
        int N3;
        this.V0 = true;
        String str2 = "";
        if (i10 > 0) {
            jo.i0 i0Var = jo.i0.f38149a;
            str = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            jo.p.g(str, "format(format, *args)");
        } else {
            str = "";
        }
        ae.z0 z0Var = this.O0;
        ae.z0 z0Var2 = null;
        if (z0Var == null) {
            jo.p.v("binding");
            z0Var = null;
        }
        z0Var.J.setText(str);
        ae.z0 z0Var3 = this.O0;
        if (z0Var3 == null) {
            jo.p.v("binding");
            z0Var3 = null;
        }
        z0Var3.J.setSelection(str.length());
        ae.z0 z0Var4 = this.O0;
        if (z0Var4 == null) {
            jo.p.v("binding");
            z0Var4 = null;
        }
        EditText editText = z0Var4.J;
        if (i10 <= 0 && !this.U0) {
            str2 = U0(nd.f1.text_emomo_run_score_gift_dialog_input_placeholder);
        }
        editText.setHint(str2);
        ae.z0 z0Var5 = this.O0;
        if (z0Var5 == null) {
            jo.p.v("binding");
            z0Var5 = null;
        }
        ViewGroup.LayoutParams layoutParams = z0Var5.J.getLayoutParams();
        if (i10 > 0) {
            ae.z0 z0Var6 = this.O0;
            if (z0Var6 == null) {
                jo.p.v("binding");
                z0Var6 = null;
            }
            N3 = N3(str, 26.0f, true, z0Var6.G.getWidth());
        } else {
            ae.z0 z0Var7 = this.O0;
            if (z0Var7 == null) {
                jo.p.v("binding");
                z0Var7 = null;
            }
            String obj = z0Var7.J.getHint().toString();
            ae.z0 z0Var8 = this.O0;
            if (z0Var8 == null) {
                jo.p.v("binding");
                z0Var8 = null;
            }
            N3 = N3(obj, 22.0f, false, z0Var8.G.getWidth());
        }
        layoutParams.width = N3;
        ae.z0 z0Var9 = this.O0;
        if (z0Var9 == null) {
            jo.p.v("binding");
            z0Var9 = null;
        }
        z0Var9.J.invalidate();
        ae.z0 z0Var10 = this.O0;
        if (z0Var10 == null) {
            jo.p.v("binding");
            z0Var10 = null;
        }
        z0Var10.J.requestLayout();
        ae.z0 z0Var11 = this.O0;
        if (z0Var11 == null) {
            jo.p.v("binding");
            z0Var11 = null;
        }
        z0Var11.O.setText(i10 > 0 ? String.valueOf(i10) : U0(nd.f1.text_emomo_run_score_gift_dialog_button_placeholder));
        ae.z0 z0Var12 = this.O0;
        if (z0Var12 == null) {
            jo.p.v("binding");
            z0Var12 = null;
        }
        z0Var12.O.setLines(i10 <= 0 ? 2 : 1);
        ae.z0 z0Var13 = this.O0;
        if (z0Var13 == null) {
            jo.p.v("binding");
            z0Var13 = null;
        }
        z0Var13.O.setTextSize(2, i10 > 0 ? 16.0f : 12.0f);
        ae.z0 z0Var14 = this.O0;
        if (z0Var14 == null) {
            jo.p.v("binding");
            z0Var14 = null;
        }
        z0Var14.O.getLayoutParams().width = i10 > 0 ? -2 : de.e.b(this, 100);
        ae.z0 z0Var15 = this.O0;
        if (z0Var15 == null) {
            jo.p.v("binding");
            z0Var15 = null;
        }
        z0Var15.O.invalidate();
        ae.z0 z0Var16 = this.O0;
        if (z0Var16 == null) {
            jo.p.v("binding");
        } else {
            z0Var2 = z0Var16;
        }
        z0Var2.O.requestLayout();
        this.P0.h(i10, R3(i10), W3(i10), S3(i10));
        this.V0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.z0 z0Var = this.O0;
        ae.z0 z0Var2 = null;
        if (z0Var == null) {
            jo.p.v("binding");
            z0Var = null;
        }
        z0Var.M(this);
        ae.z0 z0Var3 = this.O0;
        if (z0Var3 == null) {
            jo.p.v("binding");
            z0Var3 = null;
        }
        z0Var3.T(this.P0);
        jf.q T3 = T3();
        if (T3 != null) {
            ud.e0 e0Var = this.P0;
            int V3 = V3();
            String V0 = V0(nd.f1.text_emomo_run_reward_amount, "");
            jo.p.g(V0, "getString(R.string.text_…mo_run_reward_amount, \"\")");
            e0Var.a(T3, V3, V0, R3(0), W3(0), S3(0));
        }
        ae.z0 z0Var4 = this.O0;
        if (z0Var4 == null) {
            jo.p.v("binding");
            z0Var4 = null;
        }
        z0Var4.J.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: be.n1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean Y3;
                Y3 = o1.Y3(o1.this, textView, i10, keyEvent);
                return Y3;
            }
        });
        ae.z0 z0Var5 = this.O0;
        if (z0Var5 == null) {
            jo.p.v("binding");
            z0Var5 = null;
        }
        z0Var5.J.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: be.m1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                o1.Z3(o1.this, view2, z10);
            }
        });
        ae.z0 z0Var6 = this.O0;
        if (z0Var6 == null) {
            jo.p.v("binding");
            z0Var6 = null;
        }
        z0Var6.J.addTextChangedListener(new c());
        ae.z0 z0Var7 = this.O0;
        if (z0Var7 == null) {
            jo.p.v("binding");
            z0Var7 = null;
        }
        ConstraintLayout constraintLayout = z0Var7.L;
        jo.p.g(constraintLayout, "binding.scoreEditTextContainer");
        yd.g1.a(constraintLayout, new d());
        ae.z0 z0Var8 = this.O0;
        if (z0Var8 == null) {
            jo.p.v("binding");
            z0Var8 = null;
        }
        ConstraintLayout constraintLayout2 = z0Var8.I;
        jo.p.g(constraintLayout2, "binding.scoreEditButtonContainer");
        yd.g1.a(constraintLayout2, new e());
        ae.z0 z0Var9 = this.O0;
        if (z0Var9 == null) {
            jo.p.v("binding");
            z0Var9 = null;
        }
        ConstraintLayout constraintLayout3 = z0Var9.N;
        jo.p.g(constraintLayout3, "binding.sendButtonContainer");
        yd.g1.a(constraintLayout3, new f());
        ae.z0 z0Var10 = this.O0;
        if (z0Var10 == null) {
            jo.p.v("binding");
        } else {
            z0Var2 = z0Var10;
        }
        AppCompatImageView appCompatImageView = z0Var2.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new g());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        super.t1(bundle);
        Dialog p32 = p3();
        if (p32 != null) {
            Window window = p32.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            Window window2 = p32.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawableResource(nd.w0.Q0);
            }
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.Q0 = context instanceof p1 ? (p1) context : null;
    }
}
