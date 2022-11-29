package e4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: w  reason: collision with root package name */
    public final EditText f30244w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f30245x;

    /* renamed from: y  reason: collision with root package name */
    public d.e f30246y;

    /* renamed from: z  reason: collision with root package name */
    public int f30247z = Integer.MAX_VALUE;
    public int A = 0;
    public boolean B = true;

    /* loaded from: classes.dex */
    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<EditText> f30248a;

        public a(EditText editText) {
            this.f30248a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.e
        public void onInitialized() {
            super.onInitialized();
            g.c(this.f30248a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f30244w = editText;
        this.f30245x = z10;
    }

    public static void c(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final d.e a() {
        if (this.f30246y == null) {
            this.f30246y = new a(this.f30244w);
        }
        return this.f30246y;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    public boolean b() {
        return this.B;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void d(boolean z10) {
        if (this.B != z10) {
            if (this.f30246y != null) {
                androidx.emoji2.text.d.b().t(this.f30246y);
            }
            this.B = z10;
            if (z10) {
                c(this.f30244w, androidx.emoji2.text.d.b().d());
            }
        }
    }

    public final boolean e() {
        return (this.B && (this.f30245x || androidx.emoji2.text.d.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f30244w.isInEditMode() || e() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int d10 = androidx.emoji2.text.d.b().d();
        if (d10 != 0) {
            if (d10 == 1) {
                androidx.emoji2.text.d.b().r((Spannable) charSequence, i10, i10 + i12, this.f30247z, this.A);
                return;
            } else if (d10 != 3) {
                return;
            }
        }
        androidx.emoji2.text.d.b().s(a());
    }
}
