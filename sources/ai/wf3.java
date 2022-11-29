package ai;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public final class wf3 implements zf3<Mac> {
    @Override // ai.zf3
    public final /* bridge */ /* synthetic */ Mac a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
