package com.google.android.exoplayer2.text.span;

import android.text.Spannable;

/* loaded from: classes3.dex */
public final class SpanUtil {
    private SpanUtil() {
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i10, int i11, int i12) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i10, i11, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i10 && spannable.getSpanEnd(obj2) == i11 && spannable.getSpanFlags(obj2) == i12) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i10, i11, i12);
    }
}
