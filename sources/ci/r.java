package ci;

import android.content.Context;
import com.google.android.gms.common.api.ApiException;

/* loaded from: classes3.dex */
public final class r implements ih.b {

    /* renamed from: a  reason: collision with root package name */
    public final ih.b f19663a;

    /* renamed from: b  reason: collision with root package name */
    public final ih.b f19664b;

    public r(Context context) {
        this.f19663a = new p(context, nh.e.f());
        this.f19664b = l.d(context);
    }

    public static /* synthetic */ vi.g b(r rVar, vi.g gVar) {
        if (gVar.s() || gVar.q()) {
            return gVar;
        }
        Exception n10 = gVar.n();
        if (n10 instanceof ApiException) {
            int b10 = ((ApiException) n10).b();
            if (b10 == 43001 || b10 == 43002 || b10 == 43003 || b10 == 17) {
                return rVar.f19664b.a();
            }
            if (b10 == 43000) {
                return vi.j.d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
            }
            return b10 != 15 ? gVar : vi.j.d(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        return gVar;
    }

    @Override // ih.b
    public final vi.g<ih.c> a() {
        return this.f19663a.a().m(new vi.a() { // from class: ci.q
            @Override // vi.a
            public final Object a(vi.g gVar) {
                return r.b(r.this, gVar);
            }
        });
    }
}
