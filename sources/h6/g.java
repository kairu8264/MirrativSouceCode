package h6;

import android.graphics.Bitmap;
import h6.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xn.a0;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f34553c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<c.b, ArrayList<b>> f34554a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public int f34555b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f34556a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<Bitmap> f34557b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, Object> f34558c;

        /* renamed from: d  reason: collision with root package name */
        public final int f34559d;

        public b(int i10, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i11) {
            this.f34556a = i10;
            this.f34557b = weakReference;
            this.f34558c = map;
            this.f34559d = i11;
        }

        public final WeakReference<Bitmap> a() {
            return this.f34557b;
        }

        public final Map<String, Object> b() {
            return this.f34558c;
        }

        public final int c() {
            return this.f34556a;
        }

        public final int d() {
            return this.f34559d;
        }
    }

    @Override // h6.i
    public synchronized void a(int i10) {
        if (i10 >= 10 && i10 != 20) {
            d();
        }
    }

    @Override // h6.i
    public synchronized c.C0436c b(c.b bVar) {
        ArrayList<b> arrayList = this.f34554a.get(bVar);
        c.C0436c c0436c = null;
        if (arrayList == null) {
            return null;
        }
        int i10 = 0;
        int size = arrayList.size();
        while (true) {
            if (i10 >= size) {
                break;
            }
            int i11 = i10 + 1;
            b bVar2 = arrayList.get(i10);
            Bitmap bitmap = bVar2.a().get();
            c.C0436c c0436c2 = bitmap == null ? null : new c.C0436c(bitmap, bVar2.b());
            if (c0436c2 != null) {
                c0436c = c0436c2;
                break;
            }
            i10 = i11;
        }
        e();
        return c0436c;
    }

    @Override // h6.i
    public synchronized void c(c.b bVar, Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
        LinkedHashMap<c.b, ArrayList<b>> linkedHashMap = this.f34554a;
        ArrayList<b> arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList<b> arrayList2 = arrayList;
        int identityHashCode = System.identityHashCode(bitmap);
        b bVar2 = new b(identityHashCode, new WeakReference(bitmap), map, i10);
        int i11 = 0;
        int size = arrayList2.size();
        while (true) {
            if (i11 < size) {
                int i12 = i11 + 1;
                b bVar3 = arrayList2.get(i11);
                if (i10 < bVar3.d()) {
                    i11 = i12;
                } else if (bVar3.c() == identityHashCode && bVar3.a().get() == bitmap) {
                    arrayList2.set(i11, bVar2);
                } else {
                    arrayList2.add(i11, bVar2);
                }
            } else {
                arrayList2.add(bVar2);
                break;
            }
        }
        e();
    }

    public final void d() {
        WeakReference<Bitmap> a10;
        this.f34555b = 0;
        Iterator<ArrayList<b>> it = this.f34554a.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) a0.Z(next);
                Bitmap bitmap = null;
                if (bVar != null && (a10 = bVar.a()) != null) {
                    bitmap = a10.get();
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    int i12 = i10 + 1;
                    int i13 = i10 - i11;
                    if (next.get(i13).a().get() == null) {
                        next.remove(i13);
                        i11++;
                    }
                    i10 = i12;
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public final void e() {
        int i10 = this.f34555b;
        this.f34555b = i10 + 1;
        if (i10 >= 10) {
            d();
        }
    }
}
