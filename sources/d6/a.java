package d6;

import a6.r;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import d6.h;
import j6.m;
import jo.p;
import rp.t;
import xn.a0;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f29194a;

    /* renamed from: b  reason: collision with root package name */
    public final m f29195b;

    /* renamed from: d6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0273a implements h.a<Uri> {
        @Override // d6.h.a
        /* renamed from: b */
        public h a(Uri uri, m mVar, x5.e eVar) {
            if (o6.k.q(uri)) {
                return new a(uri, mVar);
            }
            return null;
        }
    }

    public a(Uri uri, m mVar) {
        this.f29194a = uri;
        this.f29195b = mVar;
    }

    @Override // d6.h
    public Object a(ao.d<? super g> dVar) {
        String g02 = a0.g0(a0.Q(this.f29194a.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        rp.e c10 = t.c(t.j(this.f29195b.g().getAssets().open(g02)));
        Context g10 = this.f29195b.g();
        String lastPathSegment = this.f29194a.getLastPathSegment();
        p.e(lastPathSegment);
        return new l(r.b(c10, g10, new a6.a(lastPathSegment)), o6.k.j(MimeTypeMap.getSingleton(), g02), a6.d.DISK);
    }
}
