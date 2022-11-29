package xh;

import android.content.Context;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static c f60295b = new c();

    /* renamed from: a  reason: collision with root package name */
    public b f60296a = null;

    public static b a(Context context) {
        return f60295b.b(context);
    }

    public final synchronized b b(Context context) {
        if (this.f60296a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f60296a = new b(context);
        }
        return this.f60296a;
    }
}
