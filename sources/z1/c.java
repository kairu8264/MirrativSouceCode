package z1;

import android.text.Layout;

/* loaded from: classes.dex */
public final class c {
    public static final int a(Layout layout, int i10, boolean z10) {
        jo.p.h(layout, "<this>");
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i10 || layout.getLineEnd(lineForOffset) == i10) ? lineStart == i10 ? z10 ? lineForOffset - 1 : lineForOffset : z10 ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }
}
