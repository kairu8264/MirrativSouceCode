package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import d.j;

/* loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {
    private final e4.a mEmojiEditTextHelper;
    private final EditText mView;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.mView = editText;
        this.mEmojiEditTextHelper = new e4.a(editText, false);
    }

    public KeyListener getKeyListener(KeyListener keyListener) {
        return this.mEmojiEditTextHelper.a(keyListener);
    }

    public void initKeyListener() {
        boolean isFocusable = this.mView.isFocusable();
        int inputType = this.mView.getInputType();
        EditText editText = this.mView;
        editText.setKeyListener(editText.getKeyListener());
        this.mView.setRawInputType(inputType);
        this.mView.setFocusable(isFocusable);
    }

    public boolean isEnabled() {
        return this.mEmojiEditTextHelper.b();
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, j.f28826i0, i10, 0);
        try {
            int i11 = j.f28896w0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            setEnabled(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public InputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.mEmojiEditTextHelper.c(inputConnection, editorInfo);
    }

    public void setEnabled(boolean z10) {
        this.mEmojiEditTextHelper.d(z10);
    }
}
