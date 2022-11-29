package gi;

import java.io.IOException;
import ql.c;

/* loaded from: classes3.dex */
public final class b implements ql.d<fm.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f33597a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final ql.c f33598b;

    static {
        c.b a10 = ql.c.a("messagingClientEvent");
        o oVar = new o();
        oVar.a(1);
        f33598b = a10.b(oVar.b()).a();
    }

    @Override // ql.b
    public final /* bridge */ /* synthetic */ void a(Object obj, ql.e eVar) throws IOException {
        eVar.b(f33598b, ((fm.b) obj).a());
    }
}
