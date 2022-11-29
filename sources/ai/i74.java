package ai;

import android.util.Base64;

/* loaded from: classes3.dex */
public final class i74 {
    public static String a(byte[] bArr, boolean z10) {
        return Base64.encodeToString(bArr, true != z10 ? 2 : 11);
    }

    public static byte[] b(String str, boolean z10) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, true != z10 ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }
}
