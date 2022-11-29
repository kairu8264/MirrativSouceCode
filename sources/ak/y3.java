package ak;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public final class y3 {

    /* renamed from: b  reason: collision with root package name */
    public static final dk.f f13730b = new dk.f("VerifySliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final o0 f13731a;

    public y3(o0 o0Var) {
        this.f13731a = o0Var;
    }

    public final void a(x3 x3Var) {
        File D = this.f13731a.D(x3Var.f13533b, x3Var.f13714c, x3Var.f13715d, x3Var.f13716e);
        if (D.exists()) {
            b(x3Var, D);
            File E = this.f13731a.E(x3Var.f13533b, x3Var.f13714c, x3Var.f13715d, x3Var.f13716e);
            if (!E.exists()) {
                E.mkdirs();
            }
            if (!D.renameTo(E)) {
                throw new p1(String.format("Failed to move slice %s after verification.", x3Var.f13716e), x3Var.f13532a);
            }
            return;
        }
        throw new p1(String.format("Cannot find unverified files for slice %s.", x3Var.f13716e), x3Var.f13532a);
    }

    public final void b(x3 x3Var, File file) {
        try {
            File C = this.f13731a.C(x3Var.f13533b, x3Var.f13714c, x3Var.f13715d, x3Var.f13716e);
            if (C.exists()) {
                try {
                    if (w2.a(w3.a(file, C)).equals(x3Var.f13717f)) {
                        f13730b.d("Verification of slice %s of pack %s successful.", x3Var.f13716e, x3Var.f13533b);
                        return;
                    }
                    throw new p1(String.format("Verification failed for slice %s.", x3Var.f13716e), x3Var.f13532a);
                } catch (IOException e10) {
                    throw new p1(String.format("Could not digest file during verification for slice %s.", x3Var.f13716e), e10, x3Var.f13532a);
                } catch (NoSuchAlgorithmException e11) {
                    throw new p1("SHA256 algorithm not supported.", e11, x3Var.f13532a);
                }
            }
            throw new p1(String.format("Cannot find metadata files for slice %s.", x3Var.f13716e), x3Var.f13532a);
        } catch (IOException e12) {
            throw new p1(String.format("Could not reconstruct slice archive during verification for slice %s.", x3Var.f13716e), e12, x3Var.f13532a);
        }
    }
}
