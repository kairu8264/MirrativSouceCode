package h6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e6.a;
import e6.b;
import h6.c;
import j6.m;
import j6.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.p;
import k6.b;
import o6.j;
import o6.k;
import o6.s;
import po.n;
import xn.n0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f34540d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final x5.e f34541a;

    /* renamed from: b  reason: collision with root package name */
    public final o f34542b;

    /* renamed from: c  reason: collision with root package name */
    public final s f34543c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public d(x5.e eVar, o oVar, s sVar) {
        this.f34541a = eVar;
        this.f34542b = oVar;
        this.f34543c = sVar;
    }

    public final c.C0436c a(j6.i iVar, c.b bVar, k6.h hVar, k6.g gVar) {
        if (iVar.C().c()) {
            c d10 = this.f34541a.d();
            c.C0436c b10 = d10 == null ? null : d10.b(bVar);
            if (b10 != null && c(iVar, bVar, b10, hVar, gVar)) {
                return b10;
            }
            return null;
        }
        return null;
    }

    public final String b(c.C0436c c0436c) {
        Object obj = c0436c.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean c(j6.i iVar, c.b bVar, c.C0436c c0436c, k6.h hVar, k6.g gVar) {
        if (!this.f34542b.c(iVar, o6.a.c(c0436c.a()))) {
            s sVar = this.f34543c;
            if (sVar != null && sVar.b() <= 3) {
                sVar.a("MemoryCacheService", 3, iVar.m() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
                return false;
            }
            return false;
        }
        return e(iVar, bVar, c0436c, hVar, gVar);
    }

    public final boolean d(c.C0436c c0436c) {
        Object obj = c0436c.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean e(j6.i iVar, c.b bVar, c.C0436c c0436c, k6.h hVar, k6.g gVar) {
        boolean d10 = d(c0436c);
        if (k6.a.a(hVar)) {
            if (d10) {
                s sVar = this.f34543c;
                if (sVar != null && sVar.b() <= 3) {
                    sVar.a("MemoryCacheService", 3, iVar.m() + ": Requested original size, but cached image is sampled.", null);
                }
                return false;
            }
            return true;
        }
        String str = bVar.c().get("coil#transformation_size");
        if (str != null) {
            return p.c(str, hVar.toString());
        }
        int width = c0436c.a().getWidth();
        int height = c0436c.a().getHeight();
        k6.b b10 = hVar.b();
        int i10 = b10 instanceof b.C0535b ? ((b.C0535b) b10).f38438a : Integer.MAX_VALUE;
        k6.b a10 = hVar.a();
        int i11 = a10 instanceof b.C0535b ? ((b.C0535b) a10).f38438a : Integer.MAX_VALUE;
        double c10 = a6.f.c(width, height, i10, i11, gVar);
        boolean a11 = j.a(iVar);
        if (a11) {
            double g10 = n.g(c10, 1.0d);
            if (Math.abs(i10 - (width * g10)) <= 1.0d || Math.abs(i11 - (g10 * height)) <= 1.0d) {
                return true;
            }
        } else if ((k.s(i10) || Math.abs(i10 - width) <= 1) && (k.s(i11) || Math.abs(i11 - height) <= 1)) {
            return true;
        }
        if (!(c10 == 1.0d) && !a11) {
            s sVar2 = this.f34543c;
            if (sVar2 != null && sVar2.b() <= 3) {
                sVar2.a("MemoryCacheService", 3, iVar.m() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + hVar.b() + ", " + hVar.a() + ", " + gVar + ").", null);
                return false;
            }
            return false;
        } else if (c10 <= 1.0d || !d10) {
            return true;
        } else {
            s sVar3 = this.f34543c;
            if (sVar3 != null && sVar3.b() <= 3) {
                sVar3.a("MemoryCacheService", 3, iVar.m() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + hVar.b() + ", " + hVar.a() + ", " + gVar + ").", null);
                return false;
            }
            return false;
        }
    }

    public final c.b f(j6.i iVar, Object obj, m mVar, x5.c cVar) {
        c.b B = iVar.B();
        if (B == null) {
            cVar.l(iVar, obj);
            String f10 = this.f34541a.getComponents().f(obj, mVar);
            cVar.o(iVar, f10);
            if (f10 == null) {
                return null;
            }
            List<m6.c> O = iVar.O();
            Map<String, String> f11 = iVar.E().f();
            if (O.isEmpty() && f11.isEmpty()) {
                return new c.b(f10, null, 2, null);
            }
            Map p10 = n0.p(f11);
            if (!O.isEmpty()) {
                List<m6.c> O2 = iVar.O();
                int size = O2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p10.put(p.o("coil#transformation_", Integer.valueOf(i10)), O2.get(i10).a());
                }
                p10.put("coil#transformation_size", mVar.o().toString());
            }
            return new c.b(f10, p10);
        }
        return B;
    }

    public final j6.p g(b.a aVar, j6.i iVar, c.b bVar, c.C0436c c0436c) {
        return new j6.p(new BitmapDrawable(iVar.l().getResources(), c0436c.a()), iVar, a6.d.MEMORY_CACHE, bVar, b(c0436c), d(c0436c), k.t(aVar));
    }

    public final boolean h(c.b bVar, j6.i iVar, a.b bVar2) {
        c d10;
        if (!iVar.C().e() || (d10 = this.f34541a.d()) == null || bVar == null) {
            return false;
        }
        Drawable e10 = bVar2.e();
        BitmapDrawable bitmapDrawable = e10 instanceof BitmapDrawable ? (BitmapDrawable) e10 : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar2.f()));
        String d11 = bVar2.d();
        if (d11 != null) {
            linkedHashMap.put("coil#disk_cache_key", d11);
        }
        d10.c(bVar, new c.C0436c(bitmap, linkedHashMap));
        return true;
    }
}
