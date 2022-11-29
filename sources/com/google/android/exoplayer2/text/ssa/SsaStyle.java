package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mk.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    public final Integer primaryColor;

    /* loaded from: classes3.dex */
    public static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int primaryColorIndex;

        private Format(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.nameIndex = i10;
            this.alignmentIndex = i11;
            this.primaryColorIndex = i12;
            this.fontSizeIndex = i13;
            this.boldIndex = i14;
            this.italicIndex = i15;
            this.length = i16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static Format fromFormatLine(String str) {
            char c10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < split.length; i16++) {
                String lowerInvariant = Util.toLowerInvariant(split[i16].trim());
                lowerInvariant.hashCode();
                switch (lowerInvariant.hashCode()) {
                    case -1178781136:
                        if (lowerInvariant.equals(TtmlNode.ITALIC)) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -70925746:
                        if (lowerInvariant.equals("primarycolour")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3029637:
                        if (lowerInvariant.equals(TtmlNode.BOLD)) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3373707:
                        if (lowerInvariant.equals("name")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 366554320:
                        if (lowerInvariant.equals("fontsize")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1767875043:
                        if (lowerInvariant.equals("alignment")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        i15 = i16;
                        break;
                    case 1:
                        i12 = i16;
                        break;
                    case 2:
                        i14 = i16;
                        break;
                    case 3:
                        i10 = i16;
                        break;
                    case 4:
                        i13 = i16;
                        break;
                    case 5:
                        i11 = i16;
                        break;
                }
            }
            if (i10 != -1) {
                return new Format(i10, i11, i12, i13, i14, i15, split.length);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Overrides {
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;
        public final PointF position;
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");

        private Overrides(int i10, PointF pointF) {
            this.alignment = i10;
            this.position = pointF;
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return SsaStyle.parseAlignment((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static Overrides parseFromDialogue(String str) {
            Matcher matcher = BRACES_PATTERN.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) Assertions.checkNotNull(matcher.group(1));
                try {
                    PointF parsePosition = parsePosition(str2);
                    if (parsePosition != null) {
                        pointF = parsePosition;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int parseAlignmentOverride = parseAlignmentOverride(str2);
                    if (parseAlignmentOverride != -1) {
                        i10 = parseAlignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new Overrides(i10, pointF);
        }

        private static PointF parsePosition(String str) {
            String group;
            String group2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    Log.i(TAG, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.checkNotNull(group)).trim()), Float.parseFloat(((String) Assertions.checkNotNull(group2)).trim()));
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SsaAlignment {
    }

    private SsaStyle(String str, int i10, Integer num, float f10, boolean z10, boolean z11) {
        this.name = str;
        this.alignment = i10;
        this.primaryColor = num;
        this.fontSize = f10;
        this.bold = z10;
        this.italic = z11;
    }

    public static SsaStyle fromStyleLine(String str, Format format) {
        Assertions.checkArgument(str.startsWith(SsaDecoder.STYLE_LINE_PREFIX));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = format.length;
        if (length != i10) {
            Log.w(TAG, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[format.nameIndex].trim();
            int i11 = format.alignmentIndex;
            int parseAlignment = i11 != -1 ? parseAlignment(split[i11].trim()) : -1;
            int i12 = format.primaryColorIndex;
            Integer parseColor = i12 != -1 ? parseColor(split[i12].trim()) : null;
            int i13 = format.fontSizeIndex;
            float parseFontSize = i13 != -1 ? parseFontSize(split[i13].trim()) : -3.4028235E38f;
            int i14 = format.boldIndex;
            boolean parseBoldOrItalic = i14 != -1 ? parseBoldOrItalic(split[i14].trim()) : false;
            int i15 = format.italicIndex;
            return new SsaStyle(trim, parseAlignment, parseColor, parseFontSize, parseBoldOrItalic, i15 != -1 ? parseBoldOrItalic(split[i15].trim()) : false);
        } catch (RuntimeException e10) {
            Log.w(TAG, "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    private static boolean isValidAlignment(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (isValidAlignment(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w(TAG, "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean parseBoldOrItalic(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            Log.w(TAG, "Failed to parse bold/italic: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer parseColor(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            Assertions.checkArgument(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(c.c(((parseLong >> 24) & 255) ^ 255), c.c(parseLong & 255), c.c((parseLong >> 8) & 255), c.c((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            Log.w(TAG, "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            Log.w(TAG, "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
