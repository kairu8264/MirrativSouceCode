package c4;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;

/* loaded from: classes.dex */
public final class e implements InputFilter {
    public static void a(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }
}
