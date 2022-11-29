package am;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f13918c = {TopicConstant.MATCH_SINGLE, "FCM", "GCM", ""};

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f13919a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13920b;

    public b(pk.c cVar) {
        this.f13919a = cVar.h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f13920b = b(cVar);
    }

    public static String b(pk.c cVar) {
        String d10 = cVar.k().d();
        if (d10 != null) {
            return d10;
        }
        String c10 = cVar.k().c();
        if (c10.startsWith("1:") || c10.startsWith("2:")) {
            String[] split = c10.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return c10;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    public String f() {
        synchronized (this.f13919a) {
            String g10 = g();
            if (g10 != null) {
                return g10;
            }
            return h();
        }
    }

    public final String g() {
        String string;
        synchronized (this.f13919a) {
            string = this.f13919a.getString("|S|id", null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.f13919a) {
            String string = this.f13919a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e10 = e(string);
            if (e10 == null) {
                return null;
            }
            return c(e10);
        }
    }

    public String i() {
        synchronized (this.f13919a) {
            for (String str : f13918c) {
                String string = this.f13919a.getString(a(this.f13920b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
