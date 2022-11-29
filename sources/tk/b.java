package tk;

import android.content.Context;
import android.os.Bundle;
import hi.x2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rh.p;
import tk.a;
import uk.f;

/* loaded from: classes.dex */
public class b implements tk.a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile tk.a f53784c;

    /* renamed from: a  reason: collision with root package name */
    public final oi.a f53785a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f53786b;

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0836a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f53787a;

        public a(String str) {
            this.f53787a = str;
        }
    }

    public b(oi.a aVar) {
        p.i(aVar);
        this.f53785a = aVar;
        this.f53786b = new ConcurrentHashMap();
    }

    public static tk.a h(pk.c cVar, Context context, ul.d dVar) {
        p.i(cVar);
        p.i(context);
        p.i(dVar);
        p.i(context.getApplicationContext());
        if (f53784c == null) {
            synchronized (b.class) {
                if (f53784c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.r()) {
                        dVar.b(pk.a.class, d.f53790w, c.f53789a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.q());
                    }
                    f53784c = new b(x2.u(context, null, null, null, bundle).r());
                }
            }
        }
        return f53784c;
    }

    public static /* synthetic */ void i(ul.a aVar) {
        boolean z10 = ((pk.a) aVar.a()).f48418a;
        synchronized (b.class) {
            ((b) p.i(f53784c)).f53785a.v(z10);
        }
    }

    @Override // tk.a
    public a.InterfaceC0836a a(String str, a.b bVar) {
        Object fVar;
        p.i(bVar);
        if (uk.b.i(str) && !j(str)) {
            oi.a aVar = this.f53785a;
            if ("fiam".equals(str)) {
                fVar = new uk.d(aVar, bVar);
            } else {
                fVar = ("crash".equals(str) || "clx".equals(str)) ? new f(aVar, bVar) : null;
            }
            if (fVar != null) {
                this.f53786b.put(str, fVar);
                return new a(str);
            }
            return null;
        }
        return null;
    }

    @Override // tk.a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (uk.b.i(str) && uk.b.g(str2, bundle) && uk.b.e(str, str2, bundle)) {
            uk.b.d(str, str2, bundle);
            this.f53785a.n(str, str2, bundle);
        }
    }

    @Override // tk.a
    public void c(a.c cVar) {
        if (uk.b.f(cVar)) {
            this.f53785a.r(uk.b.a(cVar));
        }
    }

    @Override // tk.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || uk.b.g(str2, bundle)) {
            this.f53785a.b(str, str2, bundle);
        }
    }

    @Override // tk.a
    public void d(String str, String str2, Object obj) {
        if (uk.b.i(str) && uk.b.j(str, str2)) {
            this.f53785a.u(str, str2, obj);
        }
    }

    @Override // tk.a
    public Map<String, Object> e(boolean z10) {
        return this.f53785a.m(null, null, z10);
    }

    @Override // tk.a
    public int f(String str) {
        return this.f53785a.l(str);
    }

    @Override // tk.a
    public List<a.c> g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f53785a.g(str, str2)) {
            arrayList.add(uk.b.b(bundle));
        }
        return arrayList;
    }

    public final boolean j(String str) {
        return (str.isEmpty() || !this.f53786b.containsKey(str) || this.f53786b.get(str) == null) ? false : true;
    }
}
