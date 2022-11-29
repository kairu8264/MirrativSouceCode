package ai;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class yx extends zx {
    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) == ',') {
            i11++;
        }
        while (length > 0) {
            int i12 = length - 1;
            if (str.charAt(i12) != ',') {
                break;
            }
            length = i12;
        }
        if (length < i11) {
            return null;
        }
        if (i11 != 0) {
            i10 = i11;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i10, length);
    }

    @Override // ai.zx
    public final String a(String str, String str2) {
        String b10 = b(str);
        String b11 = b(str2);
        if (TextUtils.isEmpty(b10)) {
            return b11;
        }
        if (TextUtils.isEmpty(b11)) {
            return b10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 1 + String.valueOf(b11).length());
        sb2.append(b10);
        sb2.append(",");
        sb2.append(b11);
        return sb2.toString();
    }
}
