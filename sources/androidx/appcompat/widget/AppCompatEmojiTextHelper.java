package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import d.j;
import e4.f;

/* loaded from: classes.dex */
class AppCompatEmojiTextHelper {
    private final f mEmojiTextViewHelper;
    private final TextView mView;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new f(textView, false);
    }

    public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        return this.mEmojiTextViewHelper.a(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.mEmojiTextViewHelper.b();
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

    public void setAllCaps(boolean z10) {
        this.mEmojiTextViewHelper.c(z10);
    }

    public void setEnabled(boolean z10) {
        this.mEmojiTextViewHelper.d(z10);
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        return this.mEmojiTextViewHelper.e(transformationMethod);
    }
}
