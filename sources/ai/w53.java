package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class w53 {
    public static v53 a(String str) throws GeneralSecurityException {
        if (!t63.m().containsKey(str)) {
            throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
        }
        return t63.m().get(str);
    }
}
