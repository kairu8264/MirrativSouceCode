package si;

import com.dena.mirrorman.net.api.Referer;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a.g<ti.a> f52709a;

    /* renamed from: b  reason: collision with root package name */
    public static final a.g<ti.a> f52710b;

    /* renamed from: c  reason: collision with root package name */
    public static final a.AbstractC0236a<ti.a, a> f52711c;

    /* renamed from: d  reason: collision with root package name */
    public static final a.AbstractC0236a<ti.a, d> f52712d;

    /* renamed from: e  reason: collision with root package name */
    public static final Scope f52713e;

    /* renamed from: f  reason: collision with root package name */
    public static final Scope f52714f;

    /* renamed from: g  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a> f52715g;

    /* renamed from: h  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<d> f52716h;

    static {
        a.g<ti.a> gVar = new a.g<>();
        f52709a = gVar;
        a.g<ti.a> gVar2 = new a.g<>();
        f52710b = gVar2;
        b bVar = new b();
        f52711c = bVar;
        c cVar = new c();
        f52712d = cVar;
        f52713e = new Scope(Referer.PROFILE);
        f52714f = new Scope("email");
        f52715g = new com.google.android.gms.common.api.a<>("SignIn.API", bVar, gVar);
        f52716h = new com.google.android.gms.common.api.a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
