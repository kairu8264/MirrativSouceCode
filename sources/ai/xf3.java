package ai;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class xf3 implements zf3<MessageDigest> {
    @Override // ai.zf3
    public final /* bridge */ /* synthetic */ MessageDigest a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
