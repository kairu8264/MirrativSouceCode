package u0;

import io.l;
import io.p;
import jo.q;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final i<Object, Object> f54261a = a(a.f54262w, b.f54263w);

    /* loaded from: classes.dex */
    public static final class a extends q implements p<k, Object, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f54262w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(k kVar, Object obj) {
            jo.p.h(kVar, "$this$Saver");
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<Object, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f54263w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        public final Object invoke(Object obj) {
            jo.p.h(obj, "it");
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements i<Original, Saveable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p<k, Original, Saveable> f54264a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<Saveable, Original> f54265b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(p<? super k, ? super Original, ? extends Saveable> pVar, l<? super Saveable, ? extends Original> lVar) {
            this.f54264a = pVar;
            this.f54265b = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, Original] */
        @Override // u0.i
        public Original a(Saveable saveable) {
            jo.p.h(saveable, "value");
            return this.f54265b.invoke(saveable);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Saveable, java.lang.Object] */
        @Override // u0.i
        public Saveable b(k kVar, Original original) {
            jo.p.h(kVar, "<this>");
            return this.f54264a.invoke(kVar, original);
        }
    }

    public static final <Original, Saveable> i<Original, Saveable> a(p<? super k, ? super Original, ? extends Saveable> pVar, l<? super Saveable, ? extends Original> lVar) {
        jo.p.h(pVar, "save");
        jo.p.h(lVar, "restore");
        return new c(pVar, lVar);
    }

    public static final <T> i<T, Object> b() {
        return (i<T, Object>) f54261a;
    }
}
