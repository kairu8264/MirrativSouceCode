package ai;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* loaded from: classes3.dex */
public final class yf3 implements zf3<Signature> {
    @Override // ai.zf3
    public final /* bridge */ /* synthetic */ Signature a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
