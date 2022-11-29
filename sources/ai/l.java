package ai;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class l implements rv2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ rt2 f6423a;

    public l(n nVar, rt2 rt2Var) {
        this.f6423a = rt2Var;
    }

    @Override // ai.rv2
    public final boolean a(File file) {
        try {
            return this.f6423a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
