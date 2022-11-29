package ai;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class t63 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f10160a = Logger.getLogger(t63.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentMap<String, s63> f10161b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentMap<String, r63> f10162c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentMap<String, Boolean> f10163d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentMap<String, n53<?>> f10164e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public static final ConcurrentMap<Class<?>, l63<?, ?>> f10165f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    public static final ConcurrentMap<String, v53> f10166g = new ConcurrentHashMap();

    @Deprecated
    public static n53<?> a(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap<String, n53<?>> concurrentMap = f10164e;
            Locale locale = Locale.US;
            n53<?> n53Var = concurrentMap.get(str.toLowerCase(locale));
            if (n53Var == null) {
                String format = String.format("no catalogue found for %s. ", str);
                if (str.toLowerCase(locale).startsWith("tinkaead")) {
                    format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
                }
                if (!str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                    if (!str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                        if (!str.toLowerCase(locale).startsWith("tinkhybriddecrypt") && !str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                            if (!str.toLowerCase(locale).startsWith("tinkmac")) {
                                if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                                    if (str.toLowerCase(locale).startsWith("tink")) {
                                        format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
                                    }
                                } else {
                                    format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
                                }
                            } else {
                                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
                            }
                        } else {
                            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
                        }
                    } else {
                        format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
                    }
                } else {
                    format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
                }
                throw new GeneralSecurityException(format);
            }
            return n53Var;
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static synchronized <P> void b(s53<P> s53Var, boolean z10) throws GeneralSecurityException {
        synchronized (t63.class) {
            if (s53Var != null) {
                String d10 = s53Var.d();
                p(d10, s53Var.getClass(), Collections.emptyMap(), z10);
                f10161b.putIfAbsent(d10, new o63(s53Var));
                f10163d.put(d10, Boolean.valueOf(z10));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <KeyProtoT extends xj3> void c(a63<KeyProtoT> a63Var, boolean z10) throws GeneralSecurityException {
        synchronized (t63.class) {
            String b10 = a63Var.b();
            p(b10, a63Var.getClass(), a63Var.h().e(), true);
            if (e83.a(a63Var.j())) {
                ConcurrentMap<String, s63> concurrentMap = f10161b;
                if (!concurrentMap.containsKey(b10)) {
                    concurrentMap.put(b10, new p63(a63Var));
                    f10162c.put(b10, new r63(a63Var));
                    q(b10, a63Var.h().e());
                }
                f10163d.put(b10, Boolean.TRUE);
            } else {
                String valueOf = String.valueOf(a63Var.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 61);
                sb2.append("failed to register key manager ");
                sb2.append(valueOf);
                sb2.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
    }

    public static synchronized <KeyProtoT extends xj3, PublicKeyProtoT extends xj3> void d(n63<KeyProtoT, PublicKeyProtoT> n63Var, a63<PublicKeyProtoT> a63Var, boolean z10) throws GeneralSecurityException {
        Class<?> c10;
        synchronized (t63.class) {
            p("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", n63Var.getClass(), n63Var.h().e(), true);
            p("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", a63Var.getClass(), Collections.emptyMap(), false);
            if (e83.a(1)) {
                if (e83.a(1)) {
                    ConcurrentMap<String, s63> concurrentMap = f10161b;
                    if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (c10 = concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").c()) != null && !c10.getName().equals(a63Var.getClass().getName())) {
                        f10160a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", n63Var.getClass().getName(), c10.getName(), a63Var.getClass().getName()));
                    }
                    if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").c() == null) {
                        concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new q63(n63Var, a63Var));
                        f10162c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new r63(n63Var));
                        q("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", n63Var.h().e());
                    }
                    ConcurrentMap<String, Boolean> concurrentMap2 = f10163d;
                    concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
                    if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                        concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new p63(a63Var));
                    }
                    concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
                } else {
                    String valueOf = String.valueOf(a63Var.getClass());
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 61);
                    sb2.append("failed to register key manager ");
                    sb2.append(valueOf);
                    sb2.append(" as it is not FIPS compatible.");
                    throw new GeneralSecurityException(sb2.toString());
                }
            } else {
                String valueOf2 = String.valueOf(n63Var.getClass());
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 61);
                sb3.append("failed to register key manager ");
                sb3.append(valueOf2);
                sb3.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb3.toString());
            }
        }
    }

    public static synchronized <B, P> void e(l63<B, P> l63Var) throws GeneralSecurityException {
        synchronized (t63.class) {
            if (l63Var != null) {
                Class<P> zzb = l63Var.zzb();
                ConcurrentMap<Class<?>, l63<?, ?>> concurrentMap = f10165f;
                if (concurrentMap.containsKey(zzb)) {
                    l63<?, ?> l63Var2 = concurrentMap.get(zzb);
                    if (!l63Var.getClass().getName().equals(l63Var2.getClass().getName())) {
                        f10160a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb.getName(), l63Var2.getClass().getName(), l63Var.getClass().getName()));
                    }
                }
                concurrentMap.put(zzb, l63Var);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static s53<?> f(String str) throws GeneralSecurityException {
        return o(str).zzb();
    }

    public static synchronized ed3 g(hd3 hd3Var) throws GeneralSecurityException {
        ed3 q10;
        synchronized (t63.class) {
            s53<?> f10 = f(hd3Var.B());
            if (f10163d.get(hd3Var.B()).booleanValue()) {
                q10 = f10.q(hd3Var.C());
            } else {
                String valueOf = String.valueOf(hd3Var.B());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return q10;
    }

    public static synchronized xj3 h(hd3 hd3Var) throws GeneralSecurityException {
        xj3 t10;
        synchronized (t63.class) {
            s53<?> f10 = f(hd3Var.B());
            if (f10163d.get(hd3Var.B()).booleanValue()) {
                t10 = f10.t(hd3Var.C());
            } else {
                String valueOf = String.valueOf(hd3Var.B());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return t10;
    }

    public static <P> P i(String str, xj3 xj3Var, Class<P> cls) throws GeneralSecurityException {
        return (P) r(str, cls).r(xj3Var);
    }

    public static <P> P j(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) s(str, oh3.N(bArr), cls);
    }

    public static <P> P k(ed3 ed3Var, Class<P> cls) throws GeneralSecurityException {
        return (P) s(ed3Var.B(), ed3Var.C(), cls);
    }

    public static <B, P> P l(k63<B> k63Var, Class<P> cls) throws GeneralSecurityException {
        l63<?, ?> l63Var = f10165f.get(cls);
        if (l63Var == null) {
            String name = k63Var.e().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        } else if (l63Var.b().equals(k63Var.e())) {
            return (P) l63Var.a(k63Var);
        } else {
            String obj = l63Var.b().toString();
            String obj2 = k63Var.e().toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 44 + obj2.length());
            sb2.append("Wrong input primitive class, expected ");
            sb2.append(obj);
            sb2.append(", got ");
            sb2.append(obj2);
            throw new GeneralSecurityException(sb2.toString());
        }
    }

    public static synchronized Map<String, v53> m() {
        Map<String, v53> unmodifiableMap;
        synchronized (t63.class) {
            unmodifiableMap = Collections.unmodifiableMap(f10166g);
        }
        return unmodifiableMap;
    }

    public static Class<?> n(Class<?> cls) {
        l63<?, ?> l63Var = f10165f.get(cls);
        if (l63Var == null) {
            return null;
        }
        return l63Var.b();
    }

    public static synchronized s63 o(String str) throws GeneralSecurityException {
        s63 s63Var;
        synchronized (t63.class) {
            ConcurrentMap<String, s63> concurrentMap = f10161b;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            s63Var = concurrentMap.get(str);
        }
        return s63Var;
    }

    public static synchronized <KeyProtoT extends xj3, KeyFormatProtoT extends xj3> void p(String str, Class cls, Map<String, x53<KeyFormatProtoT>> map, boolean z10) throws GeneralSecurityException {
        String str2;
        synchronized (t63.class) {
            ConcurrentMap<String, s63> concurrentMap = f10161b;
            s63 s63Var = concurrentMap.get(str);
            if (s63Var != null && !s63Var.b().equals(cls)) {
                Logger logger = f10160a;
                Level level = Level.WARNING;
                if (str.length() != 0) {
                    str2 = "Attempted overwrite of a registered key manager for key type ".concat(str);
                } else {
                    str2 = new String("Attempted overwrite of a registered key manager for key type ");
                }
                logger.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str2);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, s63Var.b().getName(), cls.getName()));
            } else if (z10) {
                ConcurrentMap<String, Boolean> concurrentMap2 = f10163d;
                if (concurrentMap2.containsKey(str) && !concurrentMap2.get(str).booleanValue()) {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                } else if (concurrentMap.containsKey(str)) {
                    for (Map.Entry<String, x53<KeyFormatProtoT>> entry : map.entrySet()) {
                        if (!f10166g.containsKey(entry.getKey())) {
                            String key = entry.getKey();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(key).length() + 79 + str.length());
                            sb2.append("Attempted to register a new key template ");
                            sb2.append(key);
                            sb2.append(" from an existing key manager of type ");
                            sb2.append(str);
                            throw new GeneralSecurityException(sb2.toString());
                        }
                    }
                } else {
                    for (Map.Entry<String, x53<KeyFormatProtoT>> entry2 : map.entrySet()) {
                        if (f10166g.containsKey(entry2.getKey())) {
                            String valueOf = String.valueOf(entry2.getKey());
                            throw new GeneralSecurityException(valueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(valueOf) : new String("Attempted overwrite of a registered key template "));
                        }
                    }
                }
            }
        }
    }

    public static <KeyFormatProtoT extends xj3> void q(String str, Map<String, x53<KeyFormatProtoT>> map) {
        for (Map.Entry<String, x53<KeyFormatProtoT>> entry : map.entrySet()) {
            f10166g.put(entry.getKey(), v53.c(str, entry.getValue().f11873a.L(), entry.getValue().f11874b));
        }
    }

    public static <P> s53<P> r(String str, Class<P> cls) throws GeneralSecurityException {
        s63 o10 = o(str);
        if (o10.d().contains(cls)) {
            return o10.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(o10.b());
        Set<Class<?>> d10 = o10.d();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls2 : d10) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder(name.length() + 77 + valueOf.length() + sb3.length());
        sb4.append("Primitive type ");
        sb4.append(name);
        sb4.append(" not supported by key manager of type ");
        sb4.append(valueOf);
        sb4.append(", supported primitives: ");
        sb4.append(sb3);
        throw new GeneralSecurityException(sb4.toString());
    }

    public static <P> P s(String str, oh3 oh3Var, Class<P> cls) throws GeneralSecurityException {
        return (P) r(str, cls).s(oh3Var);
    }
}
