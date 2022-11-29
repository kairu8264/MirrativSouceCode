package c4;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f18821a;

    public d(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.f18821a = textView;
        b4.a.a().q(editorInfo);
    }

    public final Editable a() {
        return this.f18821a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return b4.a.d(this, a(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return b4.a.d(this, a(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
