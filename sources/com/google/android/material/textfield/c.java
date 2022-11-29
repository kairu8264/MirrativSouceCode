package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import nj.i;
import wi.e;
import wi.j;

/* loaded from: classes3.dex */
public class c extends xj.c {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f27837d;

    /* renamed from: e  reason: collision with root package name */
    public final TextInputLayout.f f27838e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.g f27839f;

    /* loaded from: classes3.dex */
    public class a extends i {
        public a() {
        }

        @Override // nj.i, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = c.this;
            cVar.f60322c.setChecked(!cVar.g());
        }
    }

    /* loaded from: classes3.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            c cVar = c.this;
            cVar.f60322c.setChecked(!cVar.g());
            editText.removeTextChangedListener(c.this.f27837d);
            editText.addTextChangedListener(c.this.f27837d);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0250c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EditText f27843w;

            public a(EditText editText) {
                this.f27843w = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27843w.removeTextChangedListener(c.this.f27837d);
            }
        }

        public C0250c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = c.this.f60320a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (c.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            c.this.f60320a.V();
        }
    }

    public c(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f27837d = new a();
        this.f27838e = new b();
        this.f27839f = new C0250c();
    }

    public static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // xj.c
    public void a() {
        this.f60320a.setEndIconDrawable(f.a.b(this.f60321b, e.f58828a));
        TextInputLayout textInputLayout = this.f60320a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.f58903t));
        this.f60320a.setEndIconOnClickListener(new d());
        this.f60320a.e(this.f27838e);
        this.f60320a.f(this.f27839f);
        EditText editText = this.f60320a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.f60320a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
