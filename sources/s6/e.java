package s6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import d7.w;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import rp.t;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, m<s6.d>> f52076a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f52077b = {80, 75, 3, 4};

    /* loaded from: classes.dex */
    public class a implements s6.h<s6.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f52078a;

        public a(String str) {
            this.f52078a = str;
        }

        @Override // s6.h
        /* renamed from: b */
        public void a(s6.d dVar) {
            e.f52076a.remove(this.f52078a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements s6.h<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f52079a;

        public b(String str) {
            this.f52079a = str;
        }

        @Override // s6.h
        /* renamed from: b */
        public void a(Throwable th2) {
            e.f52076a.remove(this.f52079a);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable<l<s6.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f52080a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f52081b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f52082c;

        public c(Context context, String str, String str2) {
            this.f52080a = context;
            this.f52081b = str;
            this.f52082c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public l<s6.d> call() {
            l<s6.d> c10 = s6.c.d(this.f52080a).c(this.f52081b, this.f52082c);
            if (this.f52082c != null && c10.b() != null) {
                y6.g.b().c(this.f52082c, c10.b());
            }
            return c10;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Callable<l<s6.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f52083a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f52084b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f52085c;

        public d(Context context, String str, String str2) {
            this.f52083a = context;
            this.f52084b = str;
            this.f52085c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public l<s6.d> call() {
            return e.g(this.f52083a, this.f52084b, this.f52085c);
        }
    }

    /* renamed from: s6.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0795e implements Callable<l<s6.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f52086a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f52087b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f52088c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f52089d;

        public CallableC0795e(WeakReference weakReference, Context context, int i10, String str) {
            this.f52086a = weakReference;
            this.f52087b = context;
            this.f52088c = i10;
            this.f52089d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public l<s6.d> call() {
            Context context = (Context) this.f52086a.get();
            if (context == null) {
                context = this.f52087b;
            }
            return e.r(context, this.f52088c, this.f52089d);
        }
    }

    /* loaded from: classes.dex */
    public class f implements Callable<l<s6.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputStream f52090a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f52091b;

        public f(InputStream inputStream, String str) {
            this.f52090a = inputStream;
            this.f52091b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public l<s6.d> call() {
            return e.i(this.f52090a, this.f52091b);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Callable<l<s6.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f52092a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f52093b;

        public g(String str, String str2) {
            this.f52092a = str;
            this.f52093b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public l<s6.d> call() {
            return e.n(this.f52092a, this.f52093b);
        }
    }

    /* loaded from: classes.dex */
    public class h implements Callable<l<s6.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ZipInputStream f52094a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f52095b;

        public h(ZipInputStream zipInputStream, String str) {
            this.f52094a = zipInputStream;
            this.f52095b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public l<s6.d> call() {
            return e.v(this.f52094a, this.f52095b);
        }
    }

    /* loaded from: classes.dex */
    public class i implements Callable<l<s6.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s6.d f52096a;

        public i(s6.d dVar) {
            this.f52096a = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public l<s6.d> call() {
            return new l<>(this.f52096a);
        }
    }

    public static m<s6.d> b(String str, Callable<l<s6.d>> callable) {
        s6.d a10 = str == null ? null : y6.g.b().a(str);
        if (a10 != null) {
            return new m<>(new i(a10));
        }
        if (str != null) {
            Map<String, m<s6.d>> map = f52076a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        m<s6.d> mVar = new m<>(callable);
        if (str != null) {
            mVar.f(new a(str));
            mVar.e(new b(str));
            f52076a.put(str, mVar);
        }
        return mVar;
    }

    public static s6.g c(s6.d dVar, String str) {
        for (s6.g gVar : dVar.j().values()) {
            if (gVar.c().equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    public static m<s6.d> d(Context context, String str) {
        return e(context, str, "asset_" + str);
    }

    public static m<s6.d> e(Context context, String str, String str2) {
        return b(str2, new d(context.getApplicationContext(), str, str2));
    }

    public static l<s6.d> f(Context context, String str) {
        return g(context, str, "asset_" + str);
    }

    public static l<s6.d> g(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return i(context.getAssets().open(str), str2);
            }
            return v(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new l<>(e10);
        }
    }

    public static m<s6.d> h(InputStream inputStream, String str) {
        return b(str, new f(inputStream, str));
    }

    public static l<s6.d> i(InputStream inputStream, String str) {
        return j(inputStream, str, true);
    }

    public static l<s6.d> j(InputStream inputStream, String str, boolean z10) {
        try {
            return k(e7.c.v(t.c(t.j(inputStream))), str);
        } finally {
            if (z10) {
                f7.h.c(inputStream);
            }
        }
    }

    public static l<s6.d> k(e7.c cVar, String str) {
        return l(cVar, str, true);
    }

    public static l<s6.d> l(e7.c cVar, String str, boolean z10) {
        try {
            try {
                s6.d a10 = w.a(cVar);
                if (str != null) {
                    y6.g.b().c(str, a10);
                }
                l<s6.d> lVar = new l<>(a10);
                if (z10) {
                    f7.h.c(cVar);
                }
                return lVar;
            } catch (Exception e10) {
                l<s6.d> lVar2 = new l<>(e10);
                if (z10) {
                    f7.h.c(cVar);
                }
                return lVar2;
            }
        } catch (Throwable th2) {
            if (z10) {
                f7.h.c(cVar);
            }
            throw th2;
        }
    }

    public static m<s6.d> m(String str, String str2) {
        return b(str2, new g(str, str2));
    }

    public static l<s6.d> n(String str, String str2) {
        return k(e7.c.v(t.c(t.j(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    public static m<s6.d> o(Context context, int i10) {
        return p(context, i10, z(context, i10));
    }

    public static m<s6.d> p(Context context, int i10, String str) {
        return b(str, new CallableC0795e(new WeakReference(context), context.getApplicationContext(), i10, str));
    }

    public static l<s6.d> q(Context context, int i10) {
        return r(context, i10, z(context, i10));
    }

    public static l<s6.d> r(Context context, int i10, String str) {
        try {
            rp.e c10 = t.c(t.j(context.getResources().openRawResource(i10)));
            if (y(c10).booleanValue()) {
                return v(new ZipInputStream(c10.P1()), str);
            }
            return i(c10.P1(), str);
        } catch (Resources.NotFoundException e10) {
            return new l<>(e10);
        }
    }

    public static m<s6.d> s(Context context, String str) {
        return t(context, str, "url_" + str);
    }

    public static m<s6.d> t(Context context, String str, String str2) {
        return b(str2, new c(context, str, str2));
    }

    public static m<s6.d> u(ZipInputStream zipInputStream, String str) {
        return b(str, new h(zipInputStream, str));
    }

    public static l<s6.d> v(ZipInputStream zipInputStream, String str) {
        try {
            return w(zipInputStream, str);
        } finally {
            f7.h.c(zipInputStream);
        }
    }

    public static l<s6.d> w(ZipInputStream zipInputStream, String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            s6.d dVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    dVar = l(e7.c.v(t.c(t.j(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new l<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                s6.g c10 = c(dVar, (String) entry.getKey());
                if (c10 != null) {
                    c10.g(f7.h.l((Bitmap) entry.getValue(), c10.f(), c10.d()));
                }
            }
            for (Map.Entry<String, s6.g> entry2 : dVar.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new l<>(new IllegalStateException("There is no image for " + entry2.getValue().c()));
                }
            }
            if (str != null) {
                y6.g.b().c(str, dVar);
            }
            return new l<>(dVar);
        } catch (IOException e10) {
            return new l<>(e10);
        }
    }

    public static boolean x(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean y(rp.e eVar) {
        try {
            rp.e peek = eVar.peek();
            for (byte b10 : f52077b) {
                if (peek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            f7.d.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        }
    }

    public static String z(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(x(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }
}
