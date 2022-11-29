package rk;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, qk.b> f51561a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f51562b;

    /* renamed from: c  reason: collision with root package name */
    public final xl.b<tk.a> f51563c;

    public a(Context context, xl.b<tk.a> bVar) {
        this.f51562b = context;
        this.f51563c = bVar;
    }

    public qk.b a(String str) {
        return new qk.b(this.f51562b, this.f51563c, str);
    }

    public synchronized qk.b b(String str) {
        if (!this.f51561a.containsKey(str)) {
            this.f51561a.put(str, a(str));
        }
        return this.f51561a.get(str);
    }
}
