package qi;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class r extends o4.a<List<ii.c>> {

    /* renamed from: p  reason: collision with root package name */
    public List<ii.c> f49529p;

    /* renamed from: q  reason: collision with root package name */
    public final f f49530q;

    public r(Context context, f fVar) {
        super(context.getApplicationContext());
        this.f49530q = fVar;
    }

    @Override // o4.b
    /* renamed from: E */
    public final void f(List<ii.c> list) {
        this.f49529p = list;
        super.f(list);
    }

    @Override // o4.a
    /* renamed from: F */
    public final List<ii.c> B() {
        ArrayList<ii.c> e10 = ii.e.e(i());
        k e11 = this.f49530q.e();
        vi.g<TResult> g10 = e11.g(new p(e11, e10));
        try {
            vi.j.a(g10);
            if (g10.s()) {
                return (List) g10.o();
            }
        } catch (InterruptedException | ExecutionException e12) {
            String valueOf = String.valueOf(e12.getMessage());
            Log.w("OssLicensesLoader", valueOf.length() != 0 ? "Error getting license list from service: ".concat(valueOf) : new String("Error getting license list from service: "));
        }
        return e10;
    }

    @Override // o4.b
    public final void p() {
        List<ii.c> list = this.f49529p;
        if (list != null) {
            f(list);
        } else {
            h();
        }
    }

    @Override // o4.b
    public final void q() {
        b();
    }
}
