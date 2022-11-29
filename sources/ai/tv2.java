package ai;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzfkf;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class tv2 {

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap<String, Class<?>> f10474g = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10475a;

    /* renamed from: b  reason: collision with root package name */
    public final uv2 f10476b;

    /* renamed from: c  reason: collision with root package name */
    public final vt2 f10477c;

    /* renamed from: d  reason: collision with root package name */
    public final rt2 f10478d;

    /* renamed from: e  reason: collision with root package name */
    public iv2 f10479e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f10480f = new Object();

    public tv2(Context context, uv2 uv2Var, vt2 vt2Var, rt2 rt2Var) {
        this.f10475a = context;
        this.f10476b = uv2Var;
        this.f10477c = vt2Var;
        this.f10478d = rt2Var;
    }

    public final boolean a(jv2 jv2Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                iv2 iv2Var = new iv2(d(jv2Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f10475a, "msa-r", jv2Var.d(), null, new Bundle(), 2), jv2Var, this.f10476b, this.f10477c);
                if (iv2Var.f()) {
                    int h10 = iv2Var.h();
                    if (h10 == 0) {
                        synchronized (this.f10480f) {
                            iv2 iv2Var2 = this.f10479e;
                            if (iv2Var2 != null) {
                                try {
                                    iv2Var2.g();
                                } catch (zzfkf e10) {
                                    this.f10477c.c(e10.a(), -1L, e10);
                                }
                            }
                            this.f10479e = iv2Var;
                        }
                        this.f10477c.b(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(15);
                    sb2.append("ci: ");
                    sb2.append(h10);
                    throw new zzfkf(4001, sb2.toString());
                }
                throw new zzfkf(4000, "init failed");
            } catch (Exception e11) {
                throw new zzfkf(2004, e11);
            }
        } catch (zzfkf e12) {
            this.f10477c.c(e12.a(), System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.f10477c.c(4010, System.currentTimeMillis() - currentTimeMillis, e13);
            return false;
        }
    }

    public final yt2 b() {
        iv2 iv2Var;
        synchronized (this.f10480f) {
            iv2Var = this.f10479e;
        }
        return iv2Var;
    }

    public final jv2 c() {
        synchronized (this.f10480f) {
            iv2 iv2Var = this.f10479e;
            if (iv2Var != null) {
                return iv2Var.e();
            }
            return null;
        }
    }

    public final synchronized Class<?> d(jv2 jv2Var) throws zzfkf {
        String B = jv2Var.a().B();
        HashMap<String, Class<?>> hashMap = f10474g;
        Class<?> cls = hashMap.get(B);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.f10478d.a(jv2Var.b())) {
                try {
                    File c10 = jv2Var.c();
                    if (!c10.exists()) {
                        c10.mkdirs();
                    }
                    Class loadClass = new DexClassLoader(jv2Var.b().getAbsolutePath(), c10.getAbsolutePath(), null, this.f10475a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(B, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e10) {
                    throw new zzfkf(2008, e10);
                }
            }
            throw new zzfkf(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e11) {
            throw new zzfkf(2026, e11);
        }
    }
}
