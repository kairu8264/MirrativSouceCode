package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o3.c0;
import o3.i;
import wi.j;
import wi.k;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: i1  reason: collision with root package name */
    public static final int f27743i1 = k.f58917n;
    public EditText A;
    public final LinkedHashSet<f> A0;
    public CharSequence B;
    public int B0;
    public int C;
    public final SparseArray<xj.c> C0;
    public int D;
    public final CheckableImageButton D0;
    public final xj.d E;
    public final LinkedHashSet<g> E0;
    public boolean F;
    public ColorStateList F0;
    public int G;
    public boolean G0;
    public boolean H;
    public PorterDuff.Mode H0;
    public TextView I;
    public boolean I0;
    public int J;
    public Drawable J0;
    public int K;
    public int K0;
    public CharSequence L;
    public Drawable L0;
    public boolean M;
    public View.OnLongClickListener M0;
    public TextView N;
    public View.OnLongClickListener N0;
    public ColorStateList O;
    public final CheckableImageButton O0;
    public int P;
    public ColorStateList P0;
    public ColorStateList Q;
    public ColorStateList Q0;
    public ColorStateList R;
    public ColorStateList R0;
    public CharSequence S;
    public int S0;
    public final TextView T;
    public int T0;
    public CharSequence U;
    public int U0;
    public final TextView V;
    public ColorStateList V0;
    public boolean W;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* renamed from: a0  reason: collision with root package name */
    public CharSequence f27744a0;

    /* renamed from: a1  reason: collision with root package name */
    public int f27745a1;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f27746b0;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f27747b1;

    /* renamed from: c0  reason: collision with root package name */
    public tj.g f27748c0;

    /* renamed from: c1  reason: collision with root package name */
    public final nj.a f27749c1;

    /* renamed from: d0  reason: collision with root package name */
    public tj.g f27750d0;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f27751d1;

    /* renamed from: e0  reason: collision with root package name */
    public tj.k f27752e0;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f27753e1;

    /* renamed from: f0  reason: collision with root package name */
    public final int f27754f0;

    /* renamed from: f1  reason: collision with root package name */
    public ValueAnimator f27755f1;

    /* renamed from: g0  reason: collision with root package name */
    public int f27756g0;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f27757g1;

    /* renamed from: h0  reason: collision with root package name */
    public int f27758h0;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f27759h1;

    /* renamed from: i0  reason: collision with root package name */
    public int f27760i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f27761j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f27762k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f27763l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f27764m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f27765n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Rect f27766o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Rect f27767p0;

    /* renamed from: q0  reason: collision with root package name */
    public final RectF f27768q0;

    /* renamed from: r0  reason: collision with root package name */
    public Typeface f27769r0;

    /* renamed from: s0  reason: collision with root package name */
    public final CheckableImageButton f27770s0;

    /* renamed from: t0  reason: collision with root package name */
    public ColorStateList f27771t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f27772u0;

    /* renamed from: v0  reason: collision with root package name */
    public PorterDuff.Mode f27773v0;

    /* renamed from: w  reason: collision with root package name */
    public final FrameLayout f27774w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f27775w0;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f27776x;

    /* renamed from: x0  reason: collision with root package name */
    public Drawable f27777x0;

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f27778y;

    /* renamed from: y0  reason: collision with root package name */
    public int f27779y0;

    /* renamed from: z  reason: collision with root package name */
    public final FrameLayout f27780z;

    /* renamed from: z0  reason: collision with root package name */
    public View.OnLongClickListener f27781z0;

    /* loaded from: classes3.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.v0(!textInputLayout.f27759h1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.F) {
                textInputLayout2.n0(editable.length());
            }
            if (TextInputLayout.this.M) {
                TextInputLayout.this.z0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.D0.performClick();
            TextInputLayout.this.D0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.A.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f27749c1.p0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends o3.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f27786d;

        public e(TextInputLayout textInputLayout) {
            this.f27786d = textInputLayout;
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            super.g(view, cVar);
            EditText editText = this.f27786d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f27786d.getHint();
            CharSequence error = this.f27786d.getError();
            CharSequence placeholderText = this.f27786d.getPlaceholderText();
            int counterMaxLength = this.f27786d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f27786d.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !this.f27786d.N();
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z11 ? hint.toString() : "";
            if (z10) {
                cVar.G0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                cVar.G0(charSequence);
                if (z12 && placeholderText != null) {
                    cVar.G0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                cVar.G0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.o0(charSequence);
                } else {
                    if (z10) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    cVar.G0(charSequence);
                }
                cVar.D0(!z10);
            }
            cVar.r0((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                cVar.k0(error);
            }
            if (Build.VERSION.SDK_INT < 17 || editText == null) {
                return;
            }
            editText.setLabelFor(wi.f.P);
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    /* loaded from: classes3.dex */
    public static class h extends v3.a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public CharSequence A;

        /* renamed from: w  reason: collision with root package name */
        public CharSequence f27787w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f27788x;

        /* renamed from: y  reason: collision with root package name */
        public CharSequence f27789y;

        /* renamed from: z  reason: collision with root package name */
        public CharSequence f27790z;

        /* loaded from: classes3.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f27787w) + " hint=" + ((Object) this.f27789y) + " helperText=" + ((Object) this.f27790z) + " placeholderText=" + ((Object) this.A) + "}";
        }

        @Override // v3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f27787w, parcel, i10);
            parcel.writeInt(this.f27788x ? 1 : 0);
            TextUtils.writeToParcel(this.f27789y, parcel, i10);
            TextUtils.writeToParcel(this.f27790z, parcel, i10);
            TextUtils.writeToParcel(this.A, parcel, i10);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27787w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f27788x = parcel.readInt() == 1;
            this.f27789y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f27790z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.K);
    }

    public static void U(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, z10);
            }
        }
    }

    public static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean Q = c0.Q(checkableImageButton);
        boolean z10 = false;
        boolean z11 = onLongClickListener != null;
        if (Q || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(Q);
        checkableImageButton.setPressable(Q);
        checkableImageButton.setLongClickable(z11);
        c0.C0(checkableImageButton, z10 ? 1 : 2);
    }

    public static void c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    public static void d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    private xj.c getEndIconDelegate() {
        xj.c cVar = this.C0.get(this.B0);
        return cVar != null ? cVar : this.C0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.O0.getVisibility() == 0) {
            return this.O0;
        }
        if (I() && K()) {
            return this.D0;
        }
        return null;
    }

    public static void o0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? j.f58886c : j.f58885b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void setEditText(EditText editText) {
        if (this.A == null) {
            if (this.B0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.A = editText;
            setMinWidth(this.C);
            setMaxWidth(this.D);
            S();
            setTextInputAccessibilityDelegate(new e(this));
            this.f27749c1.C0(this.A.getTypeface());
            this.f27749c1.m0(this.A.getTextSize());
            int gravity = this.A.getGravity();
            this.f27749c1.c0((gravity & (-113)) | 48);
            this.f27749c1.l0(gravity);
            this.A.addTextChangedListener(new a());
            if (this.Q0 == null) {
                this.Q0 = this.A.getHintTextColors();
            }
            if (this.W) {
                if (TextUtils.isEmpty(this.f27744a0)) {
                    CharSequence hint = this.A.getHint();
                    this.B = hint;
                    setHint(hint);
                    this.A.setHint((CharSequence) null);
                }
                this.f27746b0 = true;
            }
            if (this.I != null) {
                n0(this.A.getText().length());
            }
            s0();
            this.E.e();
            this.f27776x.bringToFront();
            this.f27778y.bringToFront();
            this.f27780z.bringToFront();
            this.O0.bringToFront();
            B();
            A0();
            D0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z10) {
        this.O0.setVisibility(z10 ? 0 : 8);
        this.f27780z.setVisibility(z10 ? 8 : 0);
        D0();
        if (I()) {
            return;
        }
        r0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f27744a0)) {
            return;
        }
        this.f27744a0 = charSequence;
        this.f27749c1.A0(charSequence);
        if (this.f27747b1) {
            return;
        }
        T();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.M == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.N = appCompatTextView;
            appCompatTextView.setId(wi.f.Q);
            c0.t0(this.N, 1);
            setPlaceholderTextAppearance(this.P);
            setPlaceholderTextColor(this.O);
            g();
        } else {
            Z();
            this.N = null;
        }
        this.M = z10;
    }

    public final boolean A() {
        return this.W && !TextUtils.isEmpty(this.f27744a0) && (this.f27748c0 instanceof xj.b);
    }

    public final void A0() {
        if (this.A == null) {
            return;
        }
        c0.G0(this.T, Q() ? 0 : c0.J(this.A), this.A.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(wi.d.f58825x), this.A.getCompoundPaddingBottom());
    }

    public final void B() {
        Iterator<f> it = this.A0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void B0() {
        this.T.setVisibility((this.S == null || N()) ? 8 : 0);
        r0();
    }

    public final void C(int i10) {
        Iterator<g> it = this.E0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10);
        }
    }

    public final void C0(boolean z10, boolean z11) {
        int defaultColor = this.V0.getDefaultColor();
        int colorForState = this.V0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.V0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f27764m0 = colorForState2;
        } else if (z11) {
            this.f27764m0 = colorForState;
        } else {
            this.f27764m0 = defaultColor;
        }
    }

    public final void D(Canvas canvas) {
        tj.g gVar = this.f27750d0;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f27761j0;
            this.f27750d0.draw(canvas);
        }
    }

    public final void D0() {
        if (this.A == null) {
            return;
        }
        c0.G0(this.V, getContext().getResources().getDimensionPixelSize(wi.d.f58825x), this.A.getPaddingTop(), (K() || L()) ? 0 : c0.I(this.A), this.A.getPaddingBottom());
    }

    public final void E(Canvas canvas) {
        if (this.W) {
            this.f27749c1.m(canvas);
        }
    }

    public final void E0() {
        int visibility = this.V.getVisibility();
        boolean z10 = (this.U == null || N()) ? false : true;
        this.V.setVisibility(z10 ? 0 : 8);
        if (visibility != this.V.getVisibility()) {
            getEndIconDelegate().c(z10);
        }
        r0();
    }

    public final void F(boolean z10) {
        ValueAnimator valueAnimator = this.f27755f1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27755f1.cancel();
        }
        if (z10 && this.f27753e1) {
            i(0.0f);
        } else {
            this.f27749c1.p0(0.0f);
        }
        if (A() && ((xj.b) this.f27748c0).m0()) {
            y();
        }
        this.f27747b1 = true;
        J();
        B0();
        E0();
    }

    public void F0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f27748c0 == null || this.f27758h0 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.A) != null && editText2.hasFocus());
        boolean z12 = isHovered() || ((editText = this.A) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f27764m0 = this.f27745a1;
        } else if (this.E.k()) {
            if (this.V0 != null) {
                C0(z11, z12);
            } else {
                this.f27764m0 = this.E.o();
            }
        } else if (!this.H || (textView = this.I) == null) {
            if (z11) {
                this.f27764m0 = this.U0;
            } else if (z12) {
                this.f27764m0 = this.T0;
            } else {
                this.f27764m0 = this.S0;
            }
        } else if (this.V0 != null) {
            C0(z11, z12);
        } else {
            this.f27764m0 = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.E.x() && this.E.k()) {
            z10 = true;
        }
        setErrorIconVisible(z10);
        W();
        Y();
        V();
        if (getEndIconDelegate().d()) {
            j0(this.E.k());
        }
        if (z11 && isEnabled()) {
            this.f27761j0 = this.f27763l0;
        } else {
            this.f27761j0 = this.f27762k0;
        }
        if (this.f27758h0 == 2) {
            q0();
        }
        if (this.f27758h0 == 1) {
            if (!isEnabled()) {
                this.f27765n0 = this.X0;
            } else if (z12 && !z11) {
                this.f27765n0 = this.Z0;
            } else if (z11) {
                this.f27765n0 = this.Y0;
            } else {
                this.f27765n0 = this.W0;
            }
        }
        j();
    }

    public final int G(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.A.getCompoundPaddingLeft();
        return (this.S == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - this.T.getMeasuredWidth()) + this.T.getPaddingLeft();
    }

    public final int H(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.A.getCompoundPaddingRight();
        return (this.S == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (this.T.getMeasuredWidth() - this.T.getPaddingRight());
    }

    public final boolean I() {
        return this.B0 != 0;
    }

    public final void J() {
        TextView textView = this.N;
        if (textView == null || !this.M) {
            return;
        }
        textView.setText((CharSequence) null);
        this.N.setVisibility(4);
    }

    public boolean K() {
        return this.f27780z.getVisibility() == 0 && this.D0.getVisibility() == 0;
    }

    public final boolean L() {
        return this.O0.getVisibility() == 0;
    }

    public boolean M() {
        return this.E.y();
    }

    public final boolean N() {
        return this.f27747b1;
    }

    public boolean O() {
        return this.f27746b0;
    }

    public final boolean P() {
        return this.f27758h0 == 1 && (Build.VERSION.SDK_INT < 16 || this.A.getMinLines() <= 1);
    }

    public boolean Q() {
        return this.f27770s0.getVisibility() == 0;
    }

    public final int[] R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public final void S() {
        p();
        a0();
        F0();
        k0();
        h();
        if (this.f27758h0 != 0) {
            u0();
        }
    }

    public final void T() {
        if (A()) {
            RectF rectF = this.f27768q0;
            this.f27749c1.p(rectF, this.A.getWidth(), this.A.getGravity());
            l(rectF);
            int i10 = this.f27761j0;
            this.f27756g0 = i10;
            rectF.top = 0.0f;
            rectF.bottom = i10;
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((xj.b) this.f27748c0).s0(rectF);
        }
    }

    public void V() {
        X(this.D0, this.F0);
    }

    public void W() {
        X(this.O0, this.P0);
    }

    public final void X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(R(checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = g3.a.r(drawable).mutate();
        g3.a.o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public void Y() {
        X(this.f27770s0, this.f27771t0);
    }

    public final void Z() {
        TextView textView = this.N;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void a0() {
        if (h0()) {
            c0.v0(this.A, this.f27748c0);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f27774w.addView(view, layoutParams2);
            this.f27774w.setLayoutParams(layoutParams);
            u0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.A;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.B != null) {
            boolean z10 = this.f27746b0;
            this.f27746b0 = false;
            CharSequence hint = editText.getHint();
            this.A.setHint(this.B);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.A.setHint(hint);
                this.f27746b0 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f27774w.getChildCount());
        for (int i11 = 0; i11 < this.f27774w.getChildCount(); i11++) {
            View childAt = this.f27774w.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.A) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f27759h1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f27759h1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f27757g1) {
            return;
        }
        boolean z10 = true;
        this.f27757g1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        nj.a aVar = this.f27749c1;
        boolean z02 = aVar != null ? aVar.z0(drawableState) | false : false;
        if (this.A != null) {
            if (!c0.V(this) || !isEnabled()) {
                z10 = false;
            }
            v0(z10);
        }
        s0();
        F0();
        if (z02) {
            invalidate();
        }
        this.f27757g1 = false;
    }

    public void e(f fVar) {
        this.A0.add(fVar);
        if (this.A != null) {
            fVar.a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            s3.j.q(r3, r4)     // Catch: java.lang.Exception -> L1a
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1a
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1a
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1a
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1a
        L18:
            r4 = 0
            r0 = r4
        L1a:
            if (r0 == 0) goto L2e
            int r4 = wi.k.f58905b
            s3.j.q(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = wi.c.f58790a
            int r4 = c3.a.d(r4, r0)
            r3.setTextColor(r4)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e0(android.widget.TextView, int):void");
    }

    public void f(g gVar) {
        this.E0.add(gVar);
    }

    public final boolean f0() {
        return (this.O0.getVisibility() == 0 || ((I() && K()) || this.U != null)) && this.f27778y.getMeasuredWidth() > 0;
    }

    public final void g() {
        TextView textView = this.N;
        if (textView != null) {
            this.f27774w.addView(textView);
            this.N.setVisibility(0);
        }
    }

    public final boolean g0() {
        return !(getStartIconDrawable() == null && this.S == null) && this.f27776x.getMeasuredWidth() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.A;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + v();
        }
        return super.getBaseline();
    }

    public tj.g getBoxBackground() {
        int i10 = this.f27758h0;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.f27748c0;
    }

    public int getBoxBackgroundColor() {
        return this.f27765n0;
    }

    public int getBoxBackgroundMode() {
        return this.f27758h0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f27748c0.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f27748c0.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f27748c0.H();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f27748c0.G();
    }

    public int getBoxStrokeColor() {
        return this.U0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.V0;
    }

    public int getBoxStrokeWidth() {
        return this.f27762k0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f27763l0;
    }

    public int getCounterMaxLength() {
        return this.G;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.F && this.H && (textView = this.I) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.Q;
    }

    public ColorStateList getCounterTextColor() {
        return this.Q;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.Q0;
    }

    public EditText getEditText() {
        return this.A;
    }

    public CharSequence getEndIconContentDescription() {
        return this.D0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.D0.getDrawable();
    }

    public int getEndIconMode() {
        return this.B0;
    }

    public CheckableImageButton getEndIconView() {
        return this.D0;
    }

    public CharSequence getError() {
        if (this.E.x()) {
            return this.E.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.E.m();
    }

    public int getErrorCurrentTextColors() {
        return this.E.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.O0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.E.o();
    }

    public CharSequence getHelperText() {
        if (this.E.y()) {
            return this.E.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.E.r();
    }

    public CharSequence getHint() {
        if (this.W) {
            return this.f27744a0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f27749c1.s();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f27749c1.w();
    }

    public ColorStateList getHintTextColor() {
        return this.R0;
    }

    public int getMaxWidth() {
        return this.D;
    }

    public int getMinWidth() {
        return this.C;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.D0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.D0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.M) {
            return this.L;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.P;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.O;
    }

    public CharSequence getPrefixText() {
        return this.S;
    }

    public ColorStateList getPrefixTextColor() {
        return this.T.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.T;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f27770s0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f27770s0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.U;
    }

    public ColorStateList getSuffixTextColor() {
        return this.V.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.V;
    }

    public Typeface getTypeface() {
        return this.f27769r0;
    }

    public final void h() {
        if (this.A == null || this.f27758h0 != 1) {
            return;
        }
        if (qj.c.h(getContext())) {
            EditText editText = this.A;
            c0.G0(editText, c0.J(editText), getResources().getDimensionPixelSize(wi.d.f58819r), c0.I(this.A), getResources().getDimensionPixelSize(wi.d.f58818q));
        } else if (qj.c.g(getContext())) {
            EditText editText2 = this.A;
            c0.G0(editText2, c0.J(editText2), getResources().getDimensionPixelSize(wi.d.f58817p), c0.I(this.A), getResources().getDimensionPixelSize(wi.d.f58816o));
        }
    }

    public final boolean h0() {
        EditText editText = this.A;
        return (editText == null || this.f27748c0 == null || editText.getBackground() != null || this.f27758h0 == 0) ? false : true;
    }

    public void i(float f10) {
        if (this.f27749c1.D() == f10) {
            return;
        }
        if (this.f27755f1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27755f1 = valueAnimator;
            valueAnimator.setInterpolator(xi.a.f60298b);
            this.f27755f1.setDuration(167L);
            this.f27755f1.addUpdateListener(new d());
        }
        this.f27755f1.setFloatValues(this.f27749c1.D(), f10);
        this.f27755f1.start();
    }

    public final void i0() {
        TextView textView = this.N;
        if (textView == null || !this.M) {
            return;
        }
        textView.setText(this.L);
        this.N.setVisibility(0);
        this.N.bringToFront();
    }

    public final void j() {
        tj.g gVar = this.f27748c0;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.f27752e0);
        if (w()) {
            this.f27748c0.f0(this.f27761j0, this.f27764m0);
        }
        int q10 = q();
        this.f27765n0 = q10;
        this.f27748c0.Y(ColorStateList.valueOf(q10));
        if (this.B0 == 3) {
            this.A.getBackground().invalidateSelf();
        }
        k();
        invalidate();
    }

    public final void j0(boolean z10) {
        if (z10 && getEndIconDrawable() != null) {
            Drawable mutate = g3.a.r(getEndIconDrawable()).mutate();
            g3.a.n(mutate, this.E.o());
            this.D0.setImageDrawable(mutate);
            return;
        }
        m();
    }

    public final void k() {
        if (this.f27750d0 == null) {
            return;
        }
        if (x()) {
            this.f27750d0.Y(ColorStateList.valueOf(this.f27764m0));
        }
        invalidate();
    }

    public final void k0() {
        if (this.f27758h0 == 1) {
            if (qj.c.h(getContext())) {
                this.f27760i0 = getResources().getDimensionPixelSize(wi.d.f58821t);
            } else if (qj.c.g(getContext())) {
                this.f27760i0 = getResources().getDimensionPixelSize(wi.d.f58820s);
            }
        }
    }

    public final void l(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f27754f0;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    public final void l0(Rect rect) {
        tj.g gVar = this.f27750d0;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.f27763l0, rect.right, i10);
        }
    }

    public final void m() {
        n(this.D0, this.G0, this.F0, this.I0, this.H0);
    }

    public final void m0() {
        if (this.I != null) {
            EditText editText = this.A;
            n0(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void n(CheckableImageButton checkableImageButton, boolean z10, ColorStateList colorStateList, boolean z11, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z10 || z11)) {
            drawable = g3.a.r(drawable).mutate();
            if (z10) {
                g3.a.o(drawable, colorStateList);
            }
            if (z11) {
                g3.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void n0(int i10) {
        boolean z10 = this.H;
        int i11 = this.G;
        if (i11 == -1) {
            this.I.setText(String.valueOf(i10));
            this.I.setContentDescription(null);
            this.H = false;
        } else {
            this.H = i10 > i11;
            o0(getContext(), this.I, i10, this.G, this.H);
            if (z10 != this.H) {
                p0();
            }
            this.I.setText(m3.a.c().j(getContext().getString(j.f58887d, Integer.valueOf(i10), Integer.valueOf(this.G))));
        }
        if (this.A == null || z10 == this.H) {
            return;
        }
        v0(false);
        F0();
        s0();
    }

    public final void o() {
        n(this.f27770s0, this.f27772u0, this.f27771t0, this.f27775w0, this.f27773v0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.A;
        if (editText != null) {
            Rect rect = this.f27766o0;
            nj.b.a(this, editText, rect);
            l0(rect);
            if (this.W) {
                this.f27749c1.m0(this.A.getTextSize());
                int gravity = this.A.getGravity();
                this.f27749c1.c0((gravity & (-113)) | 48);
                this.f27749c1.l0(gravity);
                this.f27749c1.Y(r(rect));
                this.f27749c1.h0(u(rect));
                this.f27749c1.U();
                if (!A() || this.f27747b1) {
                    return;
                }
                T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean t02 = t0();
        boolean r02 = r0();
        if (t02 || r02) {
            this.A.post(new c());
        }
        x0();
        A0();
        D0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        setError(hVar.f27787w);
        if (hVar.f27788x) {
            this.D0.post(new b());
        }
        setHint(hVar.f27789y);
        setHelperText(hVar.f27790z);
        setPlaceholderText(hVar.A);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.E.k()) {
            hVar.f27787w = getError();
        }
        hVar.f27788x = I() && this.D0.isChecked();
        hVar.f27789y = getHint();
        hVar.f27790z = getHelperText();
        hVar.A = getPlaceholderText();
        return hVar;
    }

    public final void p() {
        int i10 = this.f27758h0;
        if (i10 == 0) {
            this.f27748c0 = null;
            this.f27750d0 = null;
        } else if (i10 == 1) {
            this.f27748c0 = new tj.g(this.f27752e0);
            this.f27750d0 = new tj.g();
        } else if (i10 == 2) {
            if (this.W && !(this.f27748c0 instanceof xj.b)) {
                this.f27748c0 = new xj.b(this.f27752e0);
            } else {
                this.f27748c0 = new tj.g(this.f27752e0);
            }
            this.f27750d0 = null;
        } else {
            throw new IllegalArgumentException(this.f27758h0 + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    public final void p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.I;
        if (textView != null) {
            e0(textView, this.H ? this.J : this.K);
            if (!this.H && (colorStateList2 = this.Q) != null) {
                this.I.setTextColor(colorStateList2);
            }
            if (!this.H || (colorStateList = this.R) == null) {
                return;
            }
            this.I.setTextColor(colorStateList);
        }
    }

    public final int q() {
        return this.f27758h0 == 1 ? hj.a.f(hj.a.d(this, wi.b.f58778o, 0), this.f27765n0) : this.f27765n0;
    }

    public final void q0() {
        if (!A() || this.f27747b1 || this.f27756g0 == this.f27761j0) {
            return;
        }
        y();
        T();
    }

    public final Rect r(Rect rect) {
        if (this.A != null) {
            Rect rect2 = this.f27767p0;
            boolean z10 = c0.E(this) == 1;
            rect2.bottom = rect.bottom;
            int i10 = this.f27758h0;
            if (i10 == 1) {
                rect2.left = G(rect.left, z10);
                rect2.top = rect.top + this.f27760i0;
                rect2.right = H(rect.right, z10);
                return rect2;
            } else if (i10 != 2) {
                rect2.left = G(rect.left, z10);
                rect2.top = getPaddingTop();
                rect2.right = H(rect.right, z10);
                return rect2;
            } else {
                rect2.left = rect.left + this.A.getPaddingLeft();
                rect2.top = rect.top - v();
                rect2.right = rect.right - this.A.getPaddingRight();
                return rect2;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean r0() {
        boolean z10;
        if (this.A == null) {
            return false;
        }
        boolean z11 = true;
        if (g0()) {
            int measuredWidth = this.f27776x.getMeasuredWidth() - this.A.getPaddingLeft();
            if (this.f27777x0 == null || this.f27779y0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f27777x0 = colorDrawable;
                this.f27779y0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a10 = s3.j.a(this.A);
            Drawable drawable = a10[0];
            Drawable drawable2 = this.f27777x0;
            if (drawable != drawable2) {
                s3.j.l(this.A, drawable2, a10[1], a10[2], a10[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f27777x0 != null) {
                Drawable[] a11 = s3.j.a(this.A);
                s3.j.l(this.A, null, a11[1], a11[2], a11[3]);
                this.f27777x0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (f0()) {
            int measuredWidth2 = this.V.getMeasuredWidth() - this.A.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + i.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a12 = s3.j.a(this.A);
            Drawable drawable3 = this.J0;
            if (drawable3 != null && this.K0 != measuredWidth2) {
                this.K0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                s3.j.l(this.A, a12[0], a12[1], this.J0, a12[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.J0 = colorDrawable2;
                    this.K0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a12[2];
                Drawable drawable5 = this.J0;
                if (drawable4 != drawable5) {
                    this.L0 = a12[2];
                    s3.j.l(this.A, a12[0], a12[1], drawable5, a12[3]);
                } else {
                    z11 = z10;
                }
            }
        } else if (this.J0 == null) {
            return z10;
        } else {
            Drawable[] a13 = s3.j.a(this.A);
            if (a13[2] == this.J0) {
                s3.j.l(this.A, a13[0], a13[1], this.L0, a13[3]);
            } else {
                z11 = z10;
            }
            this.J0 = null;
        }
        return z11;
    }

    public final int s(Rect rect, Rect rect2, float f10) {
        if (P()) {
            return (int) (rect2.top + f10);
        }
        return rect.bottom - this.A.getCompoundPaddingBottom();
    }

    public void s0() {
        Drawable background;
        TextView textView;
        EditText editText = this.A;
        if (editText == null || this.f27758h0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (this.E.k()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.E.o(), PorterDuff.Mode.SRC_IN));
        } else if (this.H && (textView = this.I) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            g3.a.c(background);
            this.A.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f27765n0 != i10) {
            this.f27765n0 = i10;
            this.W0 = i10;
            this.Y0 = i10;
            this.Z0 = i10;
            j();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(c3.a.d(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.W0 = defaultColor;
        this.f27765n0 = defaultColor;
        this.X0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.Y0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.Z0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        j();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f27758h0) {
            return;
        }
        this.f27758h0 = i10;
        if (this.A != null) {
            S();
        }
    }

    public void setBoxStrokeColor(int i10) {
        if (this.U0 != i10) {
            this.U0 = i10;
            F0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.S0 = colorStateList.getDefaultColor();
            this.f27745a1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.T0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.U0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.U0 != colorStateList.getDefaultColor()) {
            this.U0 = colorStateList.getDefaultColor();
        }
        F0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.V0 != colorStateList) {
            this.V0 = colorStateList;
            F0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f27762k0 = i10;
        F0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f27763l0 = i10;
        F0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.F != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.I = appCompatTextView;
                appCompatTextView.setId(wi.f.N);
                Typeface typeface = this.f27769r0;
                if (typeface != null) {
                    this.I.setTypeface(typeface);
                }
                this.I.setMaxLines(1);
                this.E.d(this.I, 2);
                i.d((ViewGroup.MarginLayoutParams) this.I.getLayoutParams(), getResources().getDimensionPixelOffset(wi.d.f58803b0));
                p0();
                m0();
            } else {
                this.E.z(this.I, 2);
                this.I = null;
            }
            this.F = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.G != i10) {
            if (i10 > 0) {
                this.G = i10;
            } else {
                this.G = -1;
            }
            if (this.F) {
                m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.J != i10) {
            this.J = i10;
            p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            p0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.K != i10) {
            this.K = i10;
            p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.Q0 = colorStateList;
        this.R0 = colorStateList;
        if (this.A != null) {
            v0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        U(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.D0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.D0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        int i11 = this.B0;
        this.B0 = i10;
        C(i11);
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.f27758h0)) {
            getEndIconDelegate().a();
            m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f27758h0 + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.D0, onClickListener, this.M0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.M0 = onLongClickListener;
        d0(this.D0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            this.G0 = true;
            m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.H0 != mode) {
            this.H0 = mode;
            this.I0 = true;
            m();
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (K() != z10) {
            this.D0.setVisibility(z10 ? 0 : 8);
            D0();
            r0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.E.x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.E.M(charSequence);
        } else {
            this.E.t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.E.B(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.E.C(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
        W();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.O0, onClickListener, this.N0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.N0 = onLongClickListener;
        d0(this.O0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.P0 = colorStateList;
        Drawable drawable = this.O0.getDrawable();
        if (drawable != null) {
            drawable = g3.a.r(drawable).mutate();
            g3.a.o(drawable, colorStateList);
        }
        if (this.O0.getDrawable() != drawable) {
            this.O0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.O0.getDrawable();
        if (drawable != null) {
            drawable = g3.a.r(drawable).mutate();
            g3.a.p(drawable, mode);
        }
        if (this.O0.getDrawable() != drawable) {
            this.O0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.E.D(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.E.E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f27751d1 != z10) {
            this.f27751d1 = z10;
            v0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!M()) {
            setHelperTextEnabled(true);
        }
        this.E.N(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.E.H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.E.G(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.E.F(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.W) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f27753e1 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.W) {
            this.W = z10;
            if (!z10) {
                this.f27746b0 = false;
                if (!TextUtils.isEmpty(this.f27744a0) && TextUtils.isEmpty(this.A.getHint())) {
                    this.A.setHint(this.f27744a0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.A.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f27744a0)) {
                        setHint(hint);
                    }
                    this.A.setHint((CharSequence) null);
                }
                this.f27746b0 = true;
            }
            if (this.A != null) {
                u0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f27749c1.Z(i10);
        this.R0 = this.f27749c1.q();
        if (this.A != null) {
            v0(false);
            u0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.R0 != colorStateList) {
            if (this.Q0 == null) {
                this.f27749c1.b0(colorStateList);
            }
            this.R0 = colorStateList;
            if (this.A != null) {
                v0(false);
            }
        }
    }

    public void setMaxWidth(int i10) {
        this.D = i10;
        EditText editText = this.A;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinWidth(int i10) {
        this.C = i10;
        EditText editText = this.A;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.B0 != 1) {
            setEndIconMode(1);
        } else if (z10) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.F0 = colorStateList;
        this.G0 = true;
        m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.H0 = mode;
        this.I0 = true;
        m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.M && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.M) {
                setPlaceholderTextEnabled(true);
            }
            this.L = charSequence;
        }
        y0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.P = i10;
        TextView textView = this.N;
        if (textView != null) {
            s3.j.q(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            TextView textView = this.N;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.S = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.T.setText(charSequence);
        B0();
    }

    public void setPrefixTextAppearance(int i10) {
        s3.j.q(this.T, i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.T.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f27770s0.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.f27770s0, onClickListener, this.f27781z0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f27781z0 = onLongClickListener;
        d0(this.f27770s0, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f27771t0 != colorStateList) {
            this.f27771t0 = colorStateList;
            this.f27772u0 = true;
            o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f27773v0 != mode) {
            this.f27773v0 = mode;
            this.f27775w0 = true;
            o();
        }
    }

    public void setStartIconVisible(boolean z10) {
        if (Q() != z10) {
            this.f27770s0.setVisibility(z10 ? 0 : 8);
            A0();
            r0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.U = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.V.setText(charSequence);
        E0();
    }

    public void setSuffixTextAppearance(int i10) {
        s3.j.q(this.V, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.V.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.A;
        if (editText != null) {
            c0.r0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f27769r0) {
            this.f27769r0 = typeface;
            this.f27749c1.C0(typeface);
            this.E.J(typeface);
            TextView textView = this.I;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(Rect rect, float f10) {
        if (P()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return rect.top + this.A.getCompoundPaddingTop();
    }

    public final boolean t0() {
        int max;
        if (this.A != null && this.A.getMeasuredHeight() < (max = Math.max(this.f27778y.getMeasuredHeight(), this.f27776x.getMeasuredHeight()))) {
            this.A.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    public final Rect u(Rect rect) {
        if (this.A != null) {
            Rect rect2 = this.f27767p0;
            float B = this.f27749c1.B();
            rect2.left = rect.left + this.A.getCompoundPaddingLeft();
            rect2.top = t(rect, B);
            rect2.right = rect.right - this.A.getCompoundPaddingRight();
            rect2.bottom = s(rect, rect2, B);
            return rect2;
        }
        throw new IllegalStateException();
    }

    public final void u0() {
        if (this.f27758h0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f27774w.getLayoutParams();
            int v10 = v();
            if (v10 != layoutParams.topMargin) {
                layoutParams.topMargin = v10;
                this.f27774w.requestLayout();
            }
        }
    }

    public final int v() {
        float s10;
        if (this.W) {
            int i10 = this.f27758h0;
            if (i10 == 0 || i10 == 1) {
                s10 = this.f27749c1.s();
            } else if (i10 != 2) {
                return 0;
            } else {
                s10 = this.f27749c1.s() / 2.0f;
            }
            return (int) s10;
        }
        return 0;
    }

    public void v0(boolean z10) {
        w0(z10, false);
    }

    public final boolean w() {
        return this.f27758h0 == 2 && x();
    }

    public final void w0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.A;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.A;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean k10 = this.E.k();
        ColorStateList colorStateList2 = this.Q0;
        if (colorStateList2 != null) {
            this.f27749c1.b0(colorStateList2);
            this.f27749c1.k0(this.Q0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.Q0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f27745a1) : this.f27745a1;
            this.f27749c1.b0(ColorStateList.valueOf(colorForState));
            this.f27749c1.k0(ColorStateList.valueOf(colorForState));
        } else if (k10) {
            this.f27749c1.b0(this.E.p());
        } else if (this.H && (textView = this.I) != null) {
            this.f27749c1.b0(textView.getTextColors());
        } else if (z13 && (colorStateList = this.R0) != null) {
            this.f27749c1.b0(colorStateList);
        }
        if (!z12 && this.f27751d1 && (!isEnabled() || !z13)) {
            if (z11 || !this.f27747b1) {
                F(z10);
            }
        } else if (z11 || this.f27747b1) {
            z(z10);
        }
    }

    public final boolean x() {
        return this.f27761j0 > -1 && this.f27764m0 != 0;
    }

    public final void x0() {
        EditText editText;
        if (this.N == null || (editText = this.A) == null) {
            return;
        }
        this.N.setGravity(editText.getGravity());
        this.N.setPadding(this.A.getCompoundPaddingLeft(), this.A.getCompoundPaddingTop(), this.A.getCompoundPaddingRight(), this.A.getCompoundPaddingBottom());
    }

    public final void y() {
        if (A()) {
            ((xj.b) this.f27748c0).p0();
        }
    }

    public final void y0() {
        EditText editText = this.A;
        z0(editText == null ? 0 : editText.getText().length());
    }

    public final void z(boolean z10) {
        ValueAnimator valueAnimator = this.f27755f1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27755f1.cancel();
        }
        if (z10 && this.f27753e1) {
            i(1.0f);
        } else {
            this.f27749c1.p0(1.0f);
        }
        this.f27747b1 = false;
        if (A()) {
            T();
        }
        y0();
        B0();
        E0();
    }

    public final void z0(int i10) {
        if (i10 == 0 && !this.f27747b1) {
            i0();
        } else {
            J();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v150 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.D0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.D0.setImageDrawable(drawable);
        V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f27770s0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f27770s0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.O0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.E.x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.D0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.D0.setImageDrawable(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
