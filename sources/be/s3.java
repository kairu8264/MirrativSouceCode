package be;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class s3 extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public t3 N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s3 a() {
            return new s3();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ae.k4 f18107w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s3 f18108x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ae.k4 k4Var, s3 s3Var) {
            super(1);
            this.f18107w = k4Var;
            this.f18108x = s3Var;
        }

        public final void a(View view) {
            t3 t3Var;
            jo.p.h(view, "it");
            String valueOf = String.valueOf(this.f18107w.B.getText());
            if (TextUtils.isEmpty(valueOf) || (t3Var = this.f18108x.N0) == null) {
                return;
            }
            t3Var.m(valueOf);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.p<Integer, KeyEvent, wn.v> {
        public c() {
            super(2);
        }

        public final void a(int i10, KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            if (i10 == 4 && keyEvent.getAction() == 1) {
                s3.this.n3();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, KeyEvent keyEvent) {
            a(num.intValue(), keyEvent);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ae.k4 f18110w;

        public d(ae.k4 k4Var) {
            this.f18110w = k4Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            boolean z10 = !(charSequence == null || so.n.r(charSequence));
            this.f18110w.F.setAlpha(z10 ? 1.0f : 0.5f);
            this.f18110w.F.setEnabled(z10);
        }
    }

    public s3() {
        super(nd.b1.dialog_fragment_shooter_comment_input);
    }

    public static final boolean D3(ae.k4 k4Var, s3 s3Var, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(s3Var, "this$0");
        String valueOf = String.valueOf(k4Var.B.getText());
        if (!TextUtils.isEmpty(valueOf) && i10 == 4) {
            t3 t3Var = s3Var.N0;
            if (t3Var != null) {
                t3Var.m(valueOf);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        Window window2;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window2 = p32.getWindow()) != null) {
            window2.setLayout(-1, -2);
            window2.getAttributes().gravity = 80;
        }
        final ae.k4 T = ae.k4.T(view);
        AppCompatImageView appCompatImageView = T.F;
        jo.p.g(appCompatImageView, "binding.sendImageView");
        yd.g1.a(appCompatImageView, new b(T, this));
        T.B.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: be.r3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean D3;
                D3 = s3.D3(ae.k4.this, this, textView, i10, keyEvent);
                return D3;
            }
        });
        T.B.setOnKeyPreImeListener(new c());
        T.B.addTextChangedListener(new d(T));
        Dialog p33 = p3();
        if (p33 == null || (window = p33.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(4);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        of.j jVar = of.j.f45405a;
        androidx.fragment.app.h L2 = L2();
        jo.p.g(L2, "requireActivity()");
        jVar.b(L2);
        t3 t3Var = this.N0;
        if (t3Var != null) {
            t3Var.Q0();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(nd.w0.Q0);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.clearFlags(2);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof t3 ? (t3) context : null;
    }
}
