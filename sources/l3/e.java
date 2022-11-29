package l3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l3.f;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final s.f<String, Typeface> f39518a = new s.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f39519b = g.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f39520c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final s.g<String, ArrayList<n3.a<C0562e>>> f39521d = new s.g<>();

    /* loaded from: classes.dex */
    public class a implements Callable<C0562e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f39522a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f39523b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ l3.d f39524c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f39525d;

        public a(String str, Context context, l3.d dVar, int i10) {
            this.f39522a = str;
            this.f39523b = context;
            this.f39524c = dVar;
            this.f39525d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C0562e call() {
            return e.c(this.f39522a, this.f39523b, this.f39524c, this.f39525d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements n3.a<C0562e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l3.a f39526a;

        public b(l3.a aVar) {
            this.f39526a = aVar;
        }

        @Override // n3.a
        /* renamed from: a */
        public void accept(C0562e c0562e) {
            if (c0562e == null) {
                c0562e = new C0562e(-3);
            }
            this.f39526a.b(c0562e);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable<C0562e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f39527a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f39528b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ l3.d f39529c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f39530d;

        public c(String str, Context context, l3.d dVar, int i10) {
            this.f39527a = str;
            this.f39528b = context;
            this.f39529c = dVar;
            this.f39530d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C0562e call() {
            try {
                return e.c(this.f39527a, this.f39528b, this.f39529c, this.f39530d);
            } catch (Throwable unused) {
                return new C0562e(-3);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements n3.a<C0562e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f39531a;

        public d(String str) {
            this.f39531a = str;
        }

        @Override // n3.a
        /* renamed from: a */
        public void accept(C0562e c0562e) {
            synchronized (e.f39520c) {
                s.g<String, ArrayList<n3.a<C0562e>>> gVar = e.f39521d;
                ArrayList<n3.a<C0562e>> arrayList = gVar.get(this.f39531a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f39531a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(c0562e);
                }
            }
        }
    }

    public static String a(l3.d dVar, int i10) {
        return dVar.d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(f.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        f.b[] b10 = aVar.b();
        if (b10 != null && b10.length != 0) {
            i10 = 0;
            for (f.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 < 0) {
                        return -3;
                    }
                    return b11;
                }
            }
        }
        return i10;
    }

    public static C0562e c(String str, Context context, l3.d dVar, int i10) {
        s.f<String, Typeface> fVar = f39518a;
        Typeface typeface = fVar.get(str);
        if (typeface != null) {
            return new C0562e(typeface);
        }
        try {
            f.a d10 = l3.c.d(context, dVar, null);
            int b10 = b(d10);
            if (b10 != 0) {
                return new C0562e(b10);
            }
            Typeface b11 = f3.e.b(context, null, d10.b(), i10);
            if (b11 != null) {
                fVar.put(str, b11);
                return new C0562e(b11);
            }
            return new C0562e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0562e(-1);
        }
    }

    public static Typeface d(Context context, l3.d dVar, int i10, Executor executor, l3.a aVar) {
        String a10 = a(dVar, i10);
        Typeface typeface = f39518a.get(a10);
        if (typeface != null) {
            aVar.b(new C0562e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f39520c) {
            s.g<String, ArrayList<n3.a<C0562e>>> gVar = f39521d;
            ArrayList<n3.a<C0562e>> arrayList = gVar.get(a10);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<n3.a<C0562e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a10, arrayList2);
            c cVar = new c(a10, context, dVar, i10);
            if (executor == null) {
                executor = f39519b;
            }
            g.b(executor, cVar, new d(a10));
            return null;
        }
    }

    public static Typeface e(Context context, l3.d dVar, l3.a aVar, int i10, int i11) {
        String a10 = a(dVar, i10);
        Typeface typeface = f39518a.get(a10);
        if (typeface != null) {
            aVar.b(new C0562e(typeface));
            return typeface;
        } else if (i11 == -1) {
            C0562e c10 = c(a10, context, dVar, i10);
            aVar.b(c10);
            return c10.f39532a;
        } else {
            try {
                C0562e c0562e = (C0562e) g.c(f39519b, new a(a10, context, dVar, i10), i11);
                aVar.b(c0562e);
                return c0562e.f39532a;
            } catch (InterruptedException unused) {
                aVar.b(new C0562e(-3));
                return null;
            }
        }
    }

    /* renamed from: l3.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0562e {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f39532a;

        /* renamed from: b  reason: collision with root package name */
        public final int f39533b;

        public C0562e(int i10) {
            this.f39532a = null;
            this.f39533b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f39533b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public C0562e(Typeface typeface) {
            this.f39532a = typeface;
            this.f39533b = 0;
        }
    }
}
