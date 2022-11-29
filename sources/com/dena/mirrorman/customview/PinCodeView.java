package com.dena.mirrorman.customview;

import ae.wl;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.PinCodeView;
import io.l;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import nd.y0;
import wn.v;

/* loaded from: classes2.dex */
public final class PinCodeView extends LinearLayout {

    /* renamed from: w  reason: collision with root package name */
    public final wl f25573w;

    /* renamed from: x  reason: collision with root package name */
    public l<? super String, v> f25574x;

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<CharSequence, v> {
        public a() {
            super(1);
        }

        public final void a(CharSequence charSequence) {
            p.h(charSequence, "it");
            if (charSequence.length() == 1) {
                PinCodeView.this.f25573w.B.setBackgroundResource(y0.bg_pin_code);
                PinCodeView.this.f25573w.E.requestFocus();
                PinCodeView.this.f25573w.E.setBackgroundResource(y0.bg_pin_code_focused);
            }
            PinCodeView.this.l();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(CharSequence charSequence) {
            a(charSequence);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<CharSequence, v> {
        public b() {
            super(1);
        }

        public final void a(CharSequence charSequence) {
            p.h(charSequence, "it");
            if (charSequence.length() == 1) {
                PinCodeView.this.f25573w.E.setBackgroundResource(y0.bg_pin_code);
                PinCodeView.this.f25573w.F.requestFocus();
                PinCodeView.this.f25573w.F.setBackgroundResource(y0.bg_pin_code_focused);
            }
            PinCodeView.this.l();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(CharSequence charSequence) {
            a(charSequence);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements l<CharSequence, v> {
        public c() {
            super(1);
        }

        public final void a(CharSequence charSequence) {
            p.h(charSequence, "it");
            if (charSequence.length() == 1) {
                PinCodeView.this.f25573w.F.setBackgroundResource(y0.bg_pin_code);
                PinCodeView.this.f25573w.C.requestFocus();
                PinCodeView.this.f25573w.C.setBackgroundResource(y0.bg_pin_code_focused);
            }
            PinCodeView.this.l();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(CharSequence charSequence) {
            a(charSequence);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements l<CharSequence, v> {
        public d() {
            super(1);
        }

        public final void a(CharSequence charSequence) {
            p.h(charSequence, "it");
            if (charSequence.length() == 1) {
                PinCodeView.this.f25573w.C.setBackgroundResource(y0.bg_pin_code);
            }
            PinCodeView.this.l();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(CharSequence charSequence) {
            a(charSequence);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ PinCodeView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final boolean e(PinCodeView pinCodeView, View view, int i10, KeyEvent keyEvent) {
        p.h(pinCodeView, "this$0");
        if (i10 == 67 && keyEvent.getAction() == 0) {
            Editable text = pinCodeView.f25573w.E.getText();
            p.g(text, "binding.secondEditText.text");
            if (text.length() == 0) {
                pinCodeView.f25573w.E.setBackgroundResource(y0.bg_pin_code);
                pinCodeView.f25573w.B.requestFocus();
                pinCodeView.f25573w.B.setBackgroundResource(y0.bg_pin_code_focused);
                pinCodeView.f25573w.B.setText("");
                return true;
            }
        }
        return false;
    }

    public static final boolean f(PinCodeView pinCodeView, View view, int i10, KeyEvent keyEvent) {
        p.h(pinCodeView, "this$0");
        if (i10 == 67 && keyEvent.getAction() == 0) {
            Editable text = pinCodeView.f25573w.F.getText();
            p.g(text, "binding.thirdEditText.text");
            if (text.length() == 0) {
                pinCodeView.f25573w.F.setBackgroundResource(y0.bg_pin_code);
                pinCodeView.f25573w.E.requestFocus();
                pinCodeView.f25573w.E.setBackgroundResource(y0.bg_pin_code_focused);
                pinCodeView.f25573w.E.setText("");
                return true;
            }
        }
        return false;
    }

    public static final boolean g(PinCodeView pinCodeView, View view, int i10, KeyEvent keyEvent) {
        p.h(pinCodeView, "this$0");
        if (i10 == 67 && keyEvent.getAction() == 0) {
            Editable text = pinCodeView.f25573w.C.getText();
            p.g(text, "binding.fourthEditText.text");
            if (text.length() == 0) {
                pinCodeView.f25573w.C.setBackgroundResource(y0.bg_pin_code);
                pinCodeView.f25573w.F.requestFocus();
                pinCodeView.f25573w.F.setBackgroundResource(y0.bg_pin_code_focused);
                pinCodeView.f25573w.F.setText("");
                return true;
            }
        }
        if (i10 == 67 && keyEvent.getAction() == 0) {
            Editable text2 = pinCodeView.f25573w.C.getText();
            p.g(text2, "binding.fourthEditText.text");
            if (text2.length() > 0) {
                pinCodeView.f25573w.C.setBackgroundResource(y0.bg_pin_code_focused);
                pinCodeView.f25573w.C.setText("");
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void h(PinCodeView pinCodeView, View view) {
        p.h(pinCodeView, "this$0");
        pinCodeView.m();
    }

    public final void k() {
        this.f25573w.B.getEditableText().clear();
        this.f25573w.E.getEditableText().clear();
        this.f25573w.F.getEditableText().clear();
        this.f25573w.C.getEditableText().clear();
        this.f25573w.B.setBackgroundResource(y0.bg_pin_code_focused);
        EditText editText = this.f25573w.E;
        int i10 = y0.bg_pin_code;
        editText.setBackgroundResource(i10);
        this.f25573w.F.setBackgroundResource(i10);
        this.f25573w.C.setBackgroundResource(i10);
        m();
    }

    public final void l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f25573w.B.getText());
        sb2.append((Object) this.f25573w.E.getText());
        sb2.append((Object) this.f25573w.F.getText());
        sb2.append((Object) this.f25573w.C.getText());
        String sb3 = sb2.toString();
        l<? super String, v> lVar = this.f25574x;
        if (lVar != null) {
            lVar.invoke(sb3);
        }
    }

    public final void m() {
        Object systemService = getContext().getSystemService("input_method");
        p.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        Editable text = this.f25573w.B.getText();
        p.g(text, "binding.firstEditText.text");
        if (text.length() == 0) {
            this.f25573w.B.requestFocus();
            inputMethodManager.showSoftInput(this.f25573w.B, 1);
            return;
        }
        Editable text2 = this.f25573w.E.getText();
        p.g(text2, "binding.secondEditText.text");
        if (text2.length() == 0) {
            this.f25573w.E.requestFocus();
            inputMethodManager.showSoftInput(this.f25573w.E, 1);
            return;
        }
        Editable text3 = this.f25573w.F.getText();
        p.g(text3, "binding.thirdEditText.text");
        if (text3.length() == 0) {
            this.f25573w.F.requestFocus();
            inputMethodManager.showSoftInput(this.f25573w.F, 1);
            return;
        }
        this.f25573w.C.requestFocus();
        inputMethodManager.showSoftInput(this.f25573w.C, 1);
    }

    public final void setListener(l<? super String, v> lVar) {
        p.h(lVar, "listener");
        this.f25574x = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCodeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        wl wlVar = (wl) f.e(LayoutInflater.from(getContext()), b1.view_pin_code, this, true);
        this.f25573w = wlVar;
        wlVar.B.requestFocus();
        wlVar.B.setBackgroundResource(y0.bg_pin_code_focused);
        EditText editText = wlVar.B;
        p.g(editText, "binding.firstEditText");
        yd.b1.b(editText, new a());
        EditText editText2 = wlVar.E;
        p.g(editText2, "binding.secondEditText");
        yd.b1.b(editText2, new b());
        wlVar.E.setOnKeyListener(new View.OnKeyListener() { // from class: yd.z0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean e10;
                e10 = PinCodeView.e(PinCodeView.this, view, i11, keyEvent);
                return e10;
            }
        });
        EditText editText3 = wlVar.F;
        p.g(editText3, "binding.thirdEditText");
        yd.b1.b(editText3, new c());
        wlVar.F.setOnKeyListener(new View.OnKeyListener() { // from class: yd.a1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean f10;
                f10 = PinCodeView.f(PinCodeView.this, view, i11, keyEvent);
                return f10;
            }
        });
        EditText editText4 = wlVar.C;
        p.g(editText4, "binding.fourthEditText");
        yd.b1.b(editText4, new d());
        wlVar.C.setOnKeyListener(new View.OnKeyListener() { // from class: yd.y0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean g10;
                g10 = PinCodeView.g(PinCodeView.this, view, i11, keyEvent);
                return g10;
            }
        });
        wlVar.D.setOnClickListener(new View.OnClickListener() { // from class: yd.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PinCodeView.h(PinCodeView.this, view);
            }
        });
    }
}
