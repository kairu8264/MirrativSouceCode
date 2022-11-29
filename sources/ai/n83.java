package ai;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* loaded from: classes3.dex */
public final class n83 extends z53<q53, gc3> {
    public n83(Class cls) {
        super(cls);
    }

    @Override // ai.z53
    public final /* bridge */ /* synthetic */ q53 b(gc3 gc3Var) throws GeneralSecurityException {
        gc3 gc3Var2 = gc3Var;
        dc3 C = gc3Var2.C().C();
        oc3 B = C.B();
        int c10 = y83.c(B.G());
        byte[] U = gc3Var2.D().U();
        return new jf3((ECPrivateKey) rf3.f9429k.b("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, U), of3.d(c10))), B.B().U(), y83.b(B.H()), y83.d(C.I()), new z83(C.C().B()));
    }
}
