package ai;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
public final class sf3 implements zf3<Cipher> {
    @Override // ai.zf3
    public final /* bridge */ /* synthetic */ Cipher a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
