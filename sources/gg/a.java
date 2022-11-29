package gg;

import cg.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f33549e = new C0405a().b();

    /* renamed from: a  reason: collision with root package name */
    public final f f33550a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f33551b;

    /* renamed from: c  reason: collision with root package name */
    public final b f33552c;

    /* renamed from: d  reason: collision with root package name */
    public final String f33553d;

    /* renamed from: gg.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0405a {

        /* renamed from: a  reason: collision with root package name */
        public f f33554a = null;

        /* renamed from: b  reason: collision with root package name */
        public List<d> f33555b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public b f33556c = null;

        /* renamed from: d  reason: collision with root package name */
        public String f33557d = "";

        public C0405a a(d dVar) {
            this.f33555b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f33554a, Collections.unmodifiableList(this.f33555b), this.f33556c, this.f33557d);
        }

        public C0405a c(String str) {
            this.f33557d = str;
            return this;
        }

        public C0405a d(b bVar) {
            this.f33556c = bVar;
            return this;
        }

        public C0405a e(f fVar) {
            this.f33554a = fVar;
            return this;
        }
    }

    public a(f fVar, List<d> list, b bVar, String str) {
        this.f33550a = fVar;
        this.f33551b = list;
        this.f33552c = bVar;
        this.f33553d = str;
    }

    public static C0405a e() {
        return new C0405a();
    }

    @tl.d(tag = 4)
    public String a() {
        return this.f33553d;
    }

    @tl.d(tag = 3)
    public b b() {
        return this.f33552c;
    }

    @tl.d(tag = 2)
    public List<d> c() {
        return this.f33551b;
    }

    @tl.d(tag = 1)
    public f d() {
        return this.f33550a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
