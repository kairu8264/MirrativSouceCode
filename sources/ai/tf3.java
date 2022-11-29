package ai;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes3.dex */
public final class tf3 implements zf3<KeyAgreement> {
    @Override // ai.zf3
    public final /* bridge */ /* synthetic */ KeyAgreement a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
