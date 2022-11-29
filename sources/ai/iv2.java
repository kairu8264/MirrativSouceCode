package ai;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzfkf;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class iv2 implements yt2 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5424a;

    /* renamed from: b  reason: collision with root package name */
    public final jv2 f5425b;

    /* renamed from: c  reason: collision with root package name */
    public final uv2 f5426c;

    /* renamed from: d  reason: collision with root package name */
    public final vt2 f5427d;

    public iv2(Object obj, jv2 jv2Var, uv2 uv2Var, vt2 vt2Var) {
        this.f5424a = obj;
        this.f5425b = jv2Var;
        this.f5426c = uv2Var;
        this.f5427d = vt2Var;
    }

    public static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        f74 B = g74.B();
        B.t(5);
        B.r(oh3.N(bArr));
        return Base64.encodeToString(B.n().L(), 11);
    }

    @Override // ai.yt2
    public final synchronized String a(Context context, String str) {
        Map<String, Object> zzb;
        zzb = this.f5426c.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return i(j(null, zzb));
    }

    @Override // ai.yt2
    public final synchronized void b(String str, MotionEvent motionEvent) throws zzfkf {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put(TopicConstant.PACKET_TYPE_TEXT, new Throwable());
            hashMap.put("aid", null);
            hashMap.put(TopicConstant.EVENT_TYPE, motionEvent);
            this.f5424a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f5424a, hashMap);
            this.f5427d.b(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new zzfkf(2005, e10);
        }
    }

    @Override // ai.yt2
    public final synchronized String c(Context context, String str, View view, Activity activity) {
        Map<String, Object> b10;
        b10 = this.f5426c.b();
        b10.put("f", "v");
        b10.put("ctx", context);
        b10.put("aid", null);
        b10.put("view", view);
        b10.put("act", null);
        return i(j(null, b10));
    }

    @Override // ai.yt2
    public final synchronized String d(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> d10;
        d10 = this.f5426c.d();
        d10.put("f", "c");
        d10.put("ctx", context);
        d10.put("cs", str2);
        d10.put("aid", null);
        d10.put("view", view);
        d10.put("act", activity);
        return i(j(null, d10));
    }

    public final jv2 e() {
        return this.f5425b;
    }

    public final synchronized boolean f() throws zzfkf {
        try {
        } catch (Exception e10) {
            throw new zzfkf(2001, e10);
        }
        return ((Boolean) this.f5424a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f5424a, new Object[0])).booleanValue();
    }

    public final synchronized void g() throws zzfkf {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f5424a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f5424a, new Object[0]);
            this.f5427d.b(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new zzfkf(2003, e10);
        }
    }

    public final synchronized int h() throws zzfkf {
        try {
        } catch (Exception e10) {
            throw new zzfkf(2006, e10);
        }
        return ((Integer) this.f5424a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f5424a, new Object[0])).intValue();
    }

    public final synchronized byte[] j(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            this.f5427d.c(2007, System.currentTimeMillis() - currentTimeMillis, e10);
            return null;
        }
        return (byte[]) this.f5424a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f5424a, null, map2);
    }
}
