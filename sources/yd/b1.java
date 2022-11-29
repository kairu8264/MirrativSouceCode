package yd;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final class b1 {

    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<CharSequence, wn.v> f61706w;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super CharSequence, wn.v> lVar) {
            this.f61706w = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (i12 <= 1 && charSequence != null) {
                this.f61706w.invoke(charSequence);
            }
        }
    }

    public static final void b(EditText editText, io.l<? super CharSequence, wn.v> lVar) {
        editText.addTextChangedListener(new a(lVar));
    }
}
