package ai;

import ai.zf3;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public final class rf3<T_WRAPPER extends zf3<T_ENGINE>, T_ENGINE> {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f9420b = Logger.getLogger(rf3.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final List<Provider> f9421c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f9422d;

    /* renamed from: e  reason: collision with root package name */
    public static final rf3<sf3, Cipher> f9423e;

    /* renamed from: f  reason: collision with root package name */
    public static final rf3<wf3, Mac> f9424f;

    /* renamed from: g  reason: collision with root package name */
    public static final rf3<yf3, Signature> f9425g;

    /* renamed from: h  reason: collision with root package name */
    public static final rf3<xf3, MessageDigest> f9426h;

    /* renamed from: i  reason: collision with root package name */
    public static final rf3<tf3, KeyAgreement> f9427i;

    /* renamed from: j  reason: collision with root package name */
    public static final rf3<vf3, KeyPairGenerator> f9428j;

    /* renamed from: k  reason: collision with root package name */
    public static final rf3<uf3, KeyFactory> f9429k;

    /* renamed from: a  reason: collision with root package name */
    public final T_WRAPPER f9430a;

    static {
        if (f83.a()) {
            f9421c = a("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f9422d = false;
        } else if (jg3.a()) {
            f9421c = a("GmsCore_OpenSSL", "AndroidOpenSSL");
            f9422d = true;
        } else {
            f9421c = new ArrayList();
            f9422d = true;
        }
        f9423e = new rf3<>(new sf3());
        f9424f = new rf3<>(new wf3());
        f9425g = new rf3<>(new yf3());
        f9426h = new rf3<>(new xf3());
        f9427i = new rf3<>(new tf3());
        f9428j = new rf3<>(new vf3());
        f9429k = new rf3<>(new uf3());
    }

    public rf3(T_WRAPPER t_wrapper) {
        this.f9430a = t_wrapper;
    }

    public static List<Provider> a(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f9420b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final T_ENGINE b(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : f9421c) {
            try {
                return (T_ENGINE) this.f9430a.a(str, provider);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (f9422d) {
            return (T_ENGINE) this.f9430a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
