package c4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import b4.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: w  reason: collision with root package name */
    public final EditText f18823w;

    /* renamed from: x  reason: collision with root package name */
    public a.d f18824x;

    /* renamed from: y  reason: collision with root package name */
    public int f18825y = Integer.MAX_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public int f18826z = 0;

    /* loaded from: classes.dex */
    public static class a extends a.d {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<EditText> f18827a;

        public a(EditText editText) {
            this.f18827a = new WeakReference(editText);
        }

        @Override // b4.a.d
        public void b() {
            super.b();
            EditText editText = this.f18827a.get();
            if (editText == null || !editText.isAttachedToWindow()) {
                return;
            }
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            b4.a.a().l(editableText);
            e.a(editableText, selectionStart, selectionEnd);
        }
    }

    public g(EditText editText) {
        this.f18823w = editText;
    }

    public final a.d a() {
        if (this.f18824x == null) {
            this.f18824x = new a(this.f18823w);
        }
        return this.f18824x;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    public void b(int i10) {
        this.f18826z = i10;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(int i10) {
        this.f18825y = i10;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f18823w.isInEditMode() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int c10 = b4.a.a().c();
            if (c10 != 0) {
                if (c10 == 1) {
                    b4.a.a().o((Spannable) charSequence, i10, i10 + i12, this.f18825y, this.f18826z);
                    return;
                } else if (c10 != 3) {
                    return;
                }
            }
            b4.a.a().p(a());
        }
    }
}
