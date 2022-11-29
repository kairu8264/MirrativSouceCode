package ai;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class uf3 implements zf3<KeyFactory> {
    @Override // ai.zf3
    public final /* bridge */ /* synthetic */ KeyFactory a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
