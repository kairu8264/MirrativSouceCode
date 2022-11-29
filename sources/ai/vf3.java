package ai;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class vf3 implements zf3<KeyPairGenerator> {
    @Override // ai.zf3
    public final /* bridge */ /* synthetic */ KeyPairGenerator a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
