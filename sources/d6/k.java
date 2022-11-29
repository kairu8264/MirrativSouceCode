package d6;

import a6.r;
import a6.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import d6.h;
import j6.m;
import jo.p;
import kotlin.KotlinNothingValueException;
import rp.t;
import so.n;
import so.o;
import xn.a0;

/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f29226c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Uri f29227a;

    /* renamed from: b  reason: collision with root package name */
    public final m f29228b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h.a<Uri> {
        @Override // d6.h.a
        /* renamed from: b */
        public h a(Uri uri, m mVar, x5.e eVar) {
            if (c(uri)) {
                return new k(uri, mVar);
            }
            return null;
        }

        public final boolean c(Uri uri) {
            return p.c(uri.getScheme(), "android.resource");
        }
    }

    public k(Uri uri, m mVar) {
        this.f29227a = uri;
        this.f29228b = mVar;
    }

    @Override // d6.h
    public Object a(ao.d<? super g> dVar) {
        Resources resourcesForApplication;
        Drawable d10;
        String authority = this.f29227a.getAuthority();
        if (authority == null || !(!n.r(authority))) {
            authority = null;
        }
        if (authority != null) {
            String str = (String) a0.j0(this.f29227a.getPathSegments());
            Integer i10 = str != null ? so.m.i(str) : null;
            if (i10 != null) {
                int intValue = i10.intValue();
                Context g10 = this.f29228b.g();
                if (p.c(authority, g10.getPackageName())) {
                    resourcesForApplication = g10.getResources();
                } else {
                    resourcesForApplication = g10.getPackageManager().getResourcesForApplication(authority);
                }
                TypedValue typedValue = new TypedValue();
                resourcesForApplication.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String j10 = o6.k.j(MimeTypeMap.getSingleton(), charSequence.subSequence(o.Y(charSequence, '/', 0, false, 6, null), charSequence.length()).toString());
                if (p.c(j10, "text/xml")) {
                    if (p.c(authority, g10.getPackageName())) {
                        d10 = o6.d.a(g10, intValue);
                    } else {
                        d10 = o6.d.d(g10, resourcesForApplication, intValue);
                    }
                    Drawable drawable = d10;
                    boolean u10 = o6.k.u(drawable);
                    if (u10) {
                        drawable = new BitmapDrawable(g10.getResources(), o6.m.f44102a.a(drawable, this.f29228b.f(), this.f29228b.o(), this.f29228b.n(), this.f29228b.c()));
                    }
                    return new f(drawable, u10, a6.d.DISK);
                }
                TypedValue typedValue2 = new TypedValue();
                return new l(r.b(t.c(t.j(resourcesForApplication.openRawResource(intValue, typedValue2))), g10, new s(authority, intValue, typedValue2.density)), j10, a6.d.DISK);
            }
            b(this.f29227a);
            throw new KotlinNothingValueException();
        }
        b(this.f29227a);
        throw new KotlinNothingValueException();
    }

    public final Void b(Uri uri) {
        throw new IllegalStateException(p.o("Invalid android.resource URI: ", uri));
    }
}
