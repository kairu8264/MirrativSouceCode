package yd;

import ae.k9;
import android.text.Editable;
import android.text.TextWatcher;
import com.dena.mirrorman.customview.EditPartTextView;

/* loaded from: classes2.dex */
public final class i implements TextWatcher {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ EditPartTextView f61739w;

    public i(EditPartTextView editPartTextView) {
        this.f61739w = editPartTextView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        k9 k9Var;
        androidx.lifecycle.e0<CharSequence> f10;
        jo.p.h(editable, "text");
        k9Var = this.f61739w.f25332w;
        jf.p T = k9Var.T();
        if (T == null || (f10 = T.f()) == null) {
            return;
        }
        f10.m(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        jo.p.h(charSequence, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        jo.p.h(charSequence, "s");
    }
}
