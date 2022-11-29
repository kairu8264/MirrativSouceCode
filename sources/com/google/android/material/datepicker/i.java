package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.z;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o3.c0;

/* loaded from: classes3.dex */
public final class i<S> extends androidx.fragment.app.e {

    /* renamed from: e1  reason: collision with root package name */
    public static final Object f27561e1 = "CONFIRM_BUTTON_TAG";

    /* renamed from: f1  reason: collision with root package name */
    public static final Object f27562f1 = "CANCEL_BUTTON_TAG";

    /* renamed from: g1  reason: collision with root package name */
    public static final Object f27563g1 = "TOGGLE_BUTTON_TAG";
    public final LinkedHashSet<j<? super S>> N0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> O0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> P0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> Q0 = new LinkedHashSet<>();
    public int R0;
    public com.google.android.material.datepicker.d<S> S0;
    public p<S> T0;
    public com.google.android.material.datepicker.a U0;
    public h<S> V0;
    public int W0;
    public CharSequence X0;
    public boolean Y0;
    public int Z0;

    /* renamed from: a1  reason: collision with root package name */
    public TextView f27564a1;

    /* renamed from: b1  reason: collision with root package name */
    public CheckableImageButton f27565b1;

    /* renamed from: c1  reason: collision with root package name */
    public tj.g f27566c1;

    /* renamed from: d1  reason: collision with root package name */
    public Button f27567d1;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.N0.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.N3());
            }
            i.this.m3();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.O0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.m3();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends o<S> {
        public c() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s10) {
            i.this.U3();
            i.this.f27567d1.setEnabled(i.this.S0.z1());
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.f27567d1.setEnabled(i.this.S0.z1());
            i.this.f27565b1.toggle();
            i iVar = i.this;
            iVar.V3(iVar.f27565b1);
            i.this.T3();
        }
    }

    public static Drawable J3(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, f.a.b(context, wi.e.f58829b));
        stateListDrawable.addState(new int[0], f.a.b(context, wi.e.f58830c));
        return stateListDrawable;
    }

    public static int K3(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(wi.d.P) + resources.getDimensionPixelOffset(wi.d.Q) + resources.getDimensionPixelOffset(wi.d.O);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(wi.d.K);
        int i10 = m.B;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(wi.d.I) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(wi.d.N)) + resources.getDimensionPixelOffset(wi.d.G);
    }

    public static int M3(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(wi.d.H);
        int i10 = l.h().f27578z;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(wi.d.J) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(wi.d.M));
    }

    public static boolean Q3(Context context) {
        return S3(context, 16843277);
    }

    public static boolean R3(Context context) {
        return S3(context, wi.b.B);
    }

    public static boolean S3(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(qj.b.c(context, wi.b.f58787x, h.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void A1(Bundle bundle) {
        super.A1(bundle);
        if (bundle == null) {
            bundle = n0();
        }
        this.R0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.S0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.U0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.W0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.X0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.Z0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.Y0 ? wi.h.f58882t : wi.h.f58881s, viewGroup);
        Context context = inflate.getContext();
        if (this.Y0) {
            inflate.findViewById(wi.f.f58859y).setLayoutParams(new LinearLayout.LayoutParams(M3(context), -2));
        } else {
            View findViewById = inflate.findViewById(wi.f.f58860z);
            View findViewById2 = inflate.findViewById(wi.f.f58859y);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(M3(context), -1));
            findViewById2.setMinimumHeight(K3(N2()));
        }
        TextView textView = (TextView) inflate.findViewById(wi.f.F);
        this.f27564a1 = textView;
        c0.t0(textView, 1);
        this.f27565b1 = (CheckableImageButton) inflate.findViewById(wi.f.G);
        TextView textView2 = (TextView) inflate.findViewById(wi.f.H);
        CharSequence charSequence = this.X0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.W0);
        }
        P3(context);
        this.f27567d1 = (Button) inflate.findViewById(wi.f.f58837c);
        if (this.S0.z1()) {
            this.f27567d1.setEnabled(true);
        } else {
            this.f27567d1.setEnabled(false);
        }
        this.f27567d1.setTag(f27561e1);
        this.f27567d1.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(wi.f.f58835a);
        button.setTag(f27562f1);
        button.setOnClickListener(new b());
        return inflate;
    }

    public String L3() {
        return this.S0.T0(q0());
    }

    public final S N3() {
        return this.S0.H1();
    }

    public final int O3(Context context) {
        int i10 = this.R0;
        return i10 != 0 ? i10 : this.S0.l0(context);
    }

    public final void P3(Context context) {
        this.f27565b1.setTag(f27563g1);
        this.f27565b1.setImageDrawable(J3(context));
        this.f27565b1.setChecked(this.Z0 != 0);
        c0.r0(this.f27565b1, null);
        V3(this.f27565b1);
        this.f27565b1.setOnClickListener(new d());
    }

    public final void T3() {
        int O3 = O3(N2());
        this.V0 = h.A3(this.S0, O3, this.U0);
        this.T0 = this.f27565b1.isChecked() ? k.l3(this.S0, O3, this.U0) : this.V0;
        U3();
        z k10 = p0().k();
        k10.r(wi.f.f58859y, this.T0);
        k10.k();
        this.T0.j3(new c());
    }

    public final void U3() {
        String L3 = L3();
        this.f27564a1.setContentDescription(String.format(U0(wi.j.f58896m), L3));
        this.f27564a1.setText(L3);
    }

    public final void V3(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f27565b1.isChecked()) {
            string = checkableImageButton.getContext().getString(wi.j.f58899p);
        } else {
            string = checkableImageButton.getContext().getString(wi.j.f58901r);
        }
        this.f27565b1.setContentDescription(string);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void b2(Bundle bundle) {
        super.b2(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.R0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.S0);
        a.b bVar = new a.b(this.U0);
        if (this.V0.w3() != null) {
            bVar.b(this.V0.w3().B);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.W0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.X0);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void c2() {
        super.c2();
        Window window = v3().getWindow();
        if (this.Y0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f27566c1);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = O0().getDimensionPixelOffset(wi.d.L);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f27566c1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ij.a(v3(), rect));
        }
        T3();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void d2() {
        this.T0.k3();
        super.d2();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.P0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.Q0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) Z0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e
    public final Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), O3(N2()));
        Context context = dialog.getContext();
        this.Y0 = Q3(context);
        int c10 = qj.b.c(context, wi.b.f58778o, i.class.getCanonicalName());
        tj.g gVar = new tj.g(context, null, wi.b.f58787x, wi.k.f58928y);
        this.f27566c1 = gVar;
        gVar.N(context);
        this.f27566c1.Y(ColorStateList.valueOf(c10));
        this.f27566c1.X(c0.y(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
