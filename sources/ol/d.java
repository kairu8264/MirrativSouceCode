package ol;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.c;

/* loaded from: classes4.dex */
public class d extends com.google.android.gms.common.api.b<a.d.c> {

    /* renamed from: k  reason: collision with root package name */
    public static final a.g<e> f45449k;

    /* renamed from: l  reason: collision with root package name */
    public static final a.AbstractC0236a<e, a.d.c> f45450l;

    /* renamed from: m  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a.d.c> f45451m;

    /* loaded from: classes4.dex */
    public class a extends a.AbstractC0236a<e, a.d.c> {
        @Override // com.google.android.gms.common.api.a.AbstractC0236a
        /* renamed from: c */
        public e a(Context context, Looper looper, rh.d dVar, a.d.c cVar, c.a aVar, c.b bVar) {
            return new e(context, looper, dVar, aVar, bVar);
        }
    }

    static {
        a.g<e> gVar = new a.g<>();
        f45449k = gVar;
        a aVar = new a();
        f45450l = aVar;
        f45451m = new com.google.android.gms.common.api.a<>("DynamicLinks.API", aVar, gVar);
    }

    public d(Context context) {
        super(context, f45451m, a.d.f27183a, b.a.f27194c);
    }
}
