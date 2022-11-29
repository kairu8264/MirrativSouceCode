package androidx.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import c4.a;
import c4.b;
import s3.j;

/* loaded from: classes.dex */
public class EmojiExtractEditText extends ExtractEditText {

    /* renamed from: w  reason: collision with root package name */
    public b f15032w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f15033x;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 16842862, 0);
    }

    private b getEmojiEditTextHelper() {
        if (this.f15032w == null) {
            this.f15032w = new b(this);
        }
        return this.f15032w;
    }

    public final void a(AttributeSet attributeSet, int i10, int i11) {
        if (this.f15033x) {
            return;
        }
        this.f15033x = true;
        setMaxEmojiCount(new a(this, attributeSet, i10, i11).a());
        setKeyListener(super.getKeyListener());
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().a();
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().d(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.t(this, callback));
    }

    public void setEmojiReplaceStrategy(int i10) {
        getEmojiEditTextHelper().e(i10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().b(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i10) {
        getEmojiEditTextHelper().f(i10);
    }
}
