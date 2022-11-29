package h6;

import android.graphics.Bitmap;
import h6.c;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final i f34546a;

    /* renamed from: b  reason: collision with root package name */
    public final b f34547b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f34548a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, Object> f34549b;

        /* renamed from: c  reason: collision with root package name */
        public final int f34550c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
            this.f34548a = bitmap;
            this.f34549b = map;
            this.f34550c = i10;
        }

        public final Bitmap a() {
            return this.f34548a;
        }

        public final Map<String, Object> b() {
            return this.f34549b;
        }

        public final int c() {
            return this.f34550c;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends s.f<c.b, a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f34551a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f34552b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, f fVar) {
            super(i10);
            this.f34551a = i10;
            this.f34552b = fVar;
        }

        @Override // s.f
        /* renamed from: a */
        public void entryRemoved(boolean z10, c.b bVar, a aVar, a aVar2) {
            this.f34552b.f34546a.c(bVar, aVar.a(), aVar.b(), aVar.c());
        }

        @Override // s.f
        /* renamed from: b */
        public int sizeOf(c.b bVar, a aVar) {
            return aVar.c();
        }
    }

    public f(int i10, i iVar) {
        this.f34546a = iVar;
        this.f34547b = new b(i10, this);
    }

    @Override // h6.h
    public void a(int i10) {
        if (i10 >= 40) {
            e();
            return;
        }
        boolean z10 = false;
        if (10 <= i10 && i10 < 20) {
            z10 = true;
        }
        if (z10) {
            this.f34547b.trimToSize(g() / 2);
        }
    }

    @Override // h6.h
    public c.C0436c b(c.b bVar) {
        a aVar = this.f34547b.get(bVar);
        if (aVar == null) {
            return null;
        }
        return new c.C0436c(aVar.a(), aVar.b());
    }

    @Override // h6.h
    public void c(c.b bVar, Bitmap bitmap, Map<String, ? extends Object> map) {
        int a10 = o6.a.a(bitmap);
        if (a10 <= f()) {
            this.f34547b.put(bVar, new a(bitmap, map, a10));
            return;
        }
        this.f34547b.remove(bVar);
        this.f34546a.c(bVar, bitmap, map, a10);
    }

    public void e() {
        this.f34547b.evictAll();
    }

    public int f() {
        return this.f34547b.maxSize();
    }

    public int g() {
        return this.f34547b.size();
    }
}
