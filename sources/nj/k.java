package nj;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes3.dex */
public class k {
    public static TextView a(Toolbar toolbar) {
        return b(toolbar, toolbar.getSubtitle());
    }

    public static TextView b(Toolbar toolbar, CharSequence charSequence) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static TextView c(Toolbar toolbar) {
        return b(toolbar, toolbar.getTitle());
    }
}
