package ep;

import ep.v;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class s extends c0 {

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f30998b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f30999c;

    /* renamed from: e  reason: collision with root package name */
    public static final b f30997e = new b(null);

    /* renamed from: d  reason: collision with root package name */
    public static final x f30996d = x.f31036g.a("application/x-www-form-urlencoded");

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public s(List<String> list, List<String> list2) {
        jo.p.h(list, "encodedNames");
        jo.p.h(list2, "encodedValues");
        this.f30998b = fp.b.O(list);
        this.f30999c = fp.b.O(list2);
    }

    @Override // ep.c0
    public long a() {
        return l(null, true);
    }

    @Override // ep.c0
    public x b() {
        return f30996d;
    }

    @Override // ep.c0
    public void g(rp.d dVar) throws IOException {
        jo.p.h(dVar, "sink");
        l(dVar, false);
    }

    public final String h(int i10) {
        return this.f30998b.get(i10);
    }

    public final String i(int i10) {
        return this.f30999c.get(i10);
    }

    public final int j() {
        return this.f30998b.size();
    }

    public final String k(int i10) {
        return v.b.h(v.f31014l, i(i10), 0, 0, true, 3, null);
    }

    public final long l(rp.d dVar, boolean z10) {
        rp.c l10;
        if (z10) {
            l10 = new rp.c();
        } else {
            jo.p.e(dVar);
            l10 = dVar.l();
        }
        int size = this.f30998b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                l10.b1(38);
            }
            l10.a0(this.f30998b.get(i10));
            l10.b1(61);
            l10.a0(this.f30999c.get(i10));
        }
        if (z10) {
            long X = l10.X();
            l10.clear();
            return X;
        }
        return 0L;
    }

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f31000a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f31001b;

        /* renamed from: c  reason: collision with root package name */
        public final Charset f31002c;

        public a() {
            this(null, 1, null);
        }

        public a(Charset charset) {
            this.f31002c = charset;
            this.f31000a = new ArrayList();
            this.f31001b = new ArrayList();
        }

        public final a a(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            List<String> list = this.f31000a;
            v.b bVar = v.f31014l;
            list.add(v.b.b(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f31002c, 91, null));
            this.f31001b.add(v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f31002c, 91, null));
            return this;
        }

        public final a b(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            List<String> list = this.f31000a;
            v.b bVar = v.f31014l;
            list.add(v.b.b(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f31002c, 83, null));
            this.f31001b.add(v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f31002c, 83, null));
            return this;
        }

        public final s c() {
            return new s(this.f31000a, this.f31001b);
        }

        public /* synthetic */ a(Charset charset, int i10, jo.h hVar) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }
}
