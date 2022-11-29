package xa;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import jo.p;
import so.c;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f59818a = new a();

    public final PublicKey a(String str) throws IOException {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            p.g(generatePublic, "{\n            val decode…ec(decodedKey))\n        }");
            return generatePublic;
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        } catch (InvalidKeySpecException e11) {
            String str2 = "Invalid key specification: " + e11;
            Log.w("IABUtil/Security", str2);
            throw new IOException(str2);
        }
    }

    public final boolean b(PublicKey publicKey, String str, String str2) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            p.g(decode, "{\n            Base64.dec…Base64.DEFAULT)\n        }");
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                byte[] bytes = str.getBytes(c.f52772b);
                p.g(bytes, "this as java.lang.String).getBytes(charset)");
                signature.update(bytes);
                if (signature.verify(decode)) {
                    return true;
                }
                Log.w("IABUtil/Security", "Signature verification failed.");
                return false;
            } catch (InvalidKeyException unused) {
                Log.w("IABUtil/Security", "Invalid key specification.");
                return false;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            } catch (SignatureException unused2) {
                Log.w("IABUtil/Security", "Signature exception.");
                return false;
            }
        } catch (IllegalArgumentException unused3) {
            Log.w("IABUtil/Security", "Base64 decoding failed.");
            return false;
        }
    }

    public final boolean c(String str, String str2, String str3) throws IOException {
        p.h(str2, "signedData");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return b(a(str), str2, str3);
        }
        Log.w("IABUtil/Security", "Purchase verification failed: missing data.");
        return false;
    }
}
