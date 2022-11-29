package ai;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
public final class ue3 extends ThreadLocal<Cipher> {
    public static final Cipher a() {
        try {
            return rf3.f9423e.b("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Cipher initialValue() {
        return a();
    }
}
