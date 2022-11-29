package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o83 extends y53<ac3, gc3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p83 f7692b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o83(p83 p83Var, Class cls) {
        super(cls);
        this.f7692b = p83Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(ac3 ac3Var) throws GeneralSecurityException {
        y83.a(ac3Var.B());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ ac3 c(oh3 oh3Var) throws zzggm {
        return ac3.C(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ gc3 d(ac3 ac3Var) throws GeneralSecurityException {
        ac3 ac3Var2 = ac3Var;
        KeyPair c10 = of3.c(of3.d(y83.c(ac3Var2.B().B().G())));
        ECPoint w10 = ((ECPublicKey) c10.getPublic()).getW();
        ic3 G = jc3.G();
        G.r(0);
        G.s(ac3Var2.B());
        G.t(oh3.N(w10.getAffineX().toByteArray()));
        G.u(oh3.N(w10.getAffineY().toByteArray()));
        fc3 F = gc3.F();
        F.r(0);
        F.s(G.n());
        F.t(oh3.N(((ECPrivateKey) c10.getPrivate()).getS().toByteArray()));
        return F.n();
    }

    @Override // ai.y53
    public final Map<String, x53<ac3>> e() throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        v53 a10 = w53.a("AES128_GCM");
        bArr = p83.f8354d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", p83.l(4, 5, 3, a10, bArr, 1));
        v53 a11 = w53.a("AES128_GCM");
        bArr2 = p83.f8354d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", p83.l(4, 5, 3, a11, bArr2, 3));
        v53 a12 = w53.a("AES128_GCM");
        bArr3 = p83.f8354d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", p83.l(4, 5, 4, a12, bArr3, 1));
        v53 a13 = w53.a("AES128_GCM");
        bArr4 = p83.f8354d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", p83.l(4, 5, 4, a13, bArr4, 3));
        v53 a14 = w53.a("AES128_GCM");
        bArr5 = p83.f8354d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", p83.l(4, 5, 4, a14, bArr5, 3));
        v53 a15 = w53.a("AES128_CTR_HMAC_SHA256");
        bArr6 = p83.f8354d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", p83.l(4, 5, 3, a15, bArr6, 1));
        v53 a16 = w53.a("AES128_CTR_HMAC_SHA256");
        bArr7 = p83.f8354d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", p83.l(4, 5, 3, a16, bArr7, 3));
        v53 a17 = w53.a("AES128_CTR_HMAC_SHA256");
        bArr8 = p83.f8354d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", p83.l(4, 5, 4, a17, bArr8, 1));
        v53 a18 = w53.a("AES128_CTR_HMAC_SHA256");
        bArr9 = p83.f8354d;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", p83.l(4, 5, 4, a18, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
