package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import lk.v;

/* loaded from: classes3.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final v<String> SINGLE_STYLE_VALUES = v.A(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final v<String> MARK_SHAPE_VALUES = v.B(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final v<String> MARK_FILL_VALUES = v.A(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final v<String> POSITION_VALUES = v.B(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Position {
    }

    private TextEmphasis(int i10, int i11, int i12) {
        this.markShape = i10;
        this.markFill = i11;
        this.position = i12;
    }

    public static TextEmphasis parse(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return parseWords(v.t(TextUtils.split(trim, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r9.equals(com.google.android.exoplayer2.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.text.ttml.TextEmphasis parseWords(lk.v<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TextEmphasis.parseWords(lk.v):com.google.android.exoplayer2.text.ttml.TextEmphasis");
    }
}
