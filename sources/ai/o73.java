package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes3.dex */
public final class o73 extends a63<cb3> {
    public o73() {
        super(cb3.class, new m73(m53.class));
    }

    public static void k(boolean z10) throws GeneralSecurityException {
        if (m()) {
            t63.c(new o73(), true);
        }
    }

    public static /* synthetic */ x53<fb3> l(int i10, int i11) {
        eb3 D = fb3.D();
        D.r(i10);
        return new x53<>(D.n(), i11);
    }

    public static boolean m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ cb3 c(oh3 oh3Var) throws zzggm {
        return cb3.D(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(cb3 cb3Var) throws GeneralSecurityException {
        cb3 cb3Var2 = cb3Var;
        kg3.b(cb3Var2.B(), 0);
        kg3.a(cb3Var2.C().p());
    }

    @Override // ai.a63
    public final y53<?, cb3> h() {
        return new n73(this, fb3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 3;
    }
}
