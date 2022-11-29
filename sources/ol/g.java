package ol;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import ol.h;
import ph.n;
import ph.o;
import rh.p;

/* loaded from: classes4.dex */
public class g extends nl.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.common.api.b<a.d.c> f45453a;

    /* renamed from: b  reason: collision with root package name */
    public final xl.b<tk.a> f45454b;

    /* renamed from: c  reason: collision with root package name */
    public final pk.c f45455c;

    /* loaded from: classes4.dex */
    public static class a extends h.a {
        @Override // ol.h
        public void g1(Status status, j jVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends a {

        /* renamed from: w  reason: collision with root package name */
        public final vi.h<nl.b> f45456w;

        /* renamed from: x  reason: collision with root package name */
        public final xl.b<tk.a> f45457x;

        public b(xl.b<tk.a> bVar, vi.h<nl.b> hVar) {
            this.f45457x = bVar;
            this.f45456w = hVar;
        }

        @Override // ol.h
        public void Y1(Status status, ol.a aVar) {
            Bundle bundle;
            tk.a aVar2;
            o.a(status, aVar == null ? null : new nl.b(aVar), this.f45456w);
            if (aVar == null || (bundle = aVar.U().getBundle("scionData")) == null || bundle.keySet() == null || (aVar2 = this.f45457x.get()) == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                aVar2.b("fdl", str, bundle.getBundle(str));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends n<e, nl.b> {

        /* renamed from: d  reason: collision with root package name */
        public final String f45458d;

        /* renamed from: e  reason: collision with root package name */
        public final xl.b<tk.a> f45459e;

        public c(xl.b<tk.a> bVar, String str) {
            super(null, false, 13201);
            this.f45458d = str;
            this.f45459e = bVar;
        }

        @Override // ph.n
        /* renamed from: f */
        public void b(e eVar, vi.h<nl.b> hVar) throws RemoteException {
            eVar.k0(new b(this.f45459e, hVar), this.f45458d);
        }
    }

    public g(pk.c cVar, xl.b<tk.a> bVar) {
        this(new d(cVar.h()), cVar, bVar);
    }

    @Override // nl.a
    public vi.g<nl.b> a(Intent intent) {
        nl.b d10;
        vi.g h10 = this.f45453a.h(new c(this.f45454b, intent != null ? intent.getDataString() : null));
        return (intent == null || (d10 = d(intent)) == null) ? h10 : vi.j.e(d10);
    }

    public nl.b d(Intent intent) {
        ol.a aVar = (ol.a) sh.d.b(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", ol.a.CREATOR);
        if (aVar != null) {
            return new nl.b(aVar);
        }
        return null;
    }

    public g(com.google.android.gms.common.api.b<a.d.c> bVar, pk.c cVar, xl.b<tk.a> bVar2) {
        this.f45453a = bVar;
        this.f45455c = (pk.c) p.i(cVar);
        this.f45454b = bVar2;
        if (bVar2.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }
}
