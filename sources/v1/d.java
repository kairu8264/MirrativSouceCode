package v1;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jo.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<b, WeakReference<a>> f56563a = new HashMap<>();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final g1.c f56564a;

        /* renamed from: b  reason: collision with root package name */
        public final int f56565b;

        public a(g1.c cVar, int i10) {
            p.h(cVar, "imageVector");
            this.f56564a = cVar;
            this.f56565b = i10;
        }

        public final int a() {
            return this.f56565b;
        }

        public final g1.c b() {
            return this.f56564a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return p.c(this.f56564a, aVar.f56564a) && this.f56565b == aVar.f56565b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f56564a.hashCode() * 31) + Integer.hashCode(this.f56565b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f56564a + ", configFlags=" + this.f56565b + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Resources.Theme f56566a;

        /* renamed from: b  reason: collision with root package name */
        public final int f56567b;

        public b(Resources.Theme theme, int i10) {
            p.h(theme, "theme");
            this.f56566a = theme;
            this.f56567b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return p.c(this.f56566a, bVar.f56566a) && this.f56567b == bVar.f56567b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f56566a.hashCode() * 31) + Integer.hashCode(this.f56567b);
        }

        public String toString() {
            return "Key(theme=" + this.f56566a + ", id=" + this.f56567b + ')';
        }
    }

    public final void a() {
        this.f56563a.clear();
    }

    public final a b(b bVar) {
        p.h(bVar, "key");
        WeakReference<a> weakReference = this.f56563a.get(bVar);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(int i10) {
        Iterator<Map.Entry<b, WeakReference<a>>> it = this.f56563a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<b, WeakReference<a>> next = it.next();
            p.g(next, "it.next()");
            a aVar = next.getValue().get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(b bVar, a aVar) {
        p.h(bVar, "key");
        p.h(aVar, "imageVectorEntry");
        this.f56563a.put(bVar, new WeakReference<>(aVar));
    }
}
