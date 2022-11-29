package z;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final b0.o<m> f62180a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.c<m> f62181b;

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f62182c;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<Integer, Object> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f62183w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.f62183w = obj;
        }

        public final Object a(int i10) {
            return this.f62183w;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Integer, Object> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f62184w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.f62184w = obj;
        }

        public final Object a(int i10) {
            return this.f62184w;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.r<h, Integer, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.q<h, l0.i, Integer, wn.v> f62185w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.q<? super h, ? super l0.i, ? super Integer, wn.v> qVar) {
            super(4);
            this.f62185w = qVar;
        }

        @Override // io.r
        public /* bridge */ /* synthetic */ wn.v F(h hVar, Integer num, l0.i iVar, Integer num2) {
            a(hVar, num.intValue(), iVar, num2.intValue());
            return wn.v.f59242a;
        }

        public final void a(h hVar, int i10, l0.i iVar, int i11) {
            jo.p.h(hVar, "$this$$receiver");
            if ((i11 & 14) == 0) {
                i11 |= iVar.P(hVar) ? 4 : 2;
            }
            if ((i11 & 651) == 130 && iVar.j()) {
                iVar.I();
            } else {
                this.f62185w.s0(hVar, iVar, Integer.valueOf(i11 & 14));
            }
        }
    }

    public d0() {
        b0.o<m> oVar = new b0.o<>();
        this.f62180a = oVar;
        this.f62181b = oVar;
    }

    @Override // z.c0
    public void b(Object obj, Object obj2, io.q<? super h, ? super l0.i, ? super Integer, wn.v> qVar) {
        jo.p.h(qVar, "content");
        this.f62180a.c(1, new m(obj != null ? new a(obj) : null, new b(obj2), s0.c.c(-735119482, true, new c(qVar))));
    }

    @Override // z.c0
    public void c(int i10, io.l<? super Integer, ? extends Object> lVar, io.l<? super Integer, ? extends Object> lVar2, io.r<? super h, ? super Integer, ? super l0.i, ? super Integer, wn.v> rVar) {
        jo.p.h(lVar2, "contentType");
        jo.p.h(rVar, "itemContent");
        this.f62180a.c(i10, new m(lVar, lVar2, rVar));
    }

    @Override // z.c0
    public void f(Object obj, Object obj2, io.q<? super h, ? super l0.i, ? super Integer, wn.v> qVar) {
        jo.p.h(qVar, "content");
        List list = this.f62182c;
        if (list == null) {
            list = new ArrayList();
            this.f62182c = list;
        }
        list.add(Integer.valueOf(this.f62180a.a()));
        b(obj, obj2, qVar);
    }

    public final List<Integer> g() {
        List<Integer> list = this.f62182c;
        return list == null ? xn.s.k() : list;
    }

    public final b0.c<m> h() {
        return this.f62181b;
    }
}
