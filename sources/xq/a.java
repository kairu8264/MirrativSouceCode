package xq;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;
import xn.k;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final vq.a f60636a;

    /* renamed from: b  reason: collision with root package name */
    public final String f60637b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f60638c;

    /* renamed from: d  reason: collision with root package name */
    public final nq.a f60639d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<a> f60640e;

    /* renamed from: f  reason: collision with root package name */
    public Object f60641f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<Object> f60642g;

    /* renamed from: h  reason: collision with root package name */
    public final k<uq.a> f60643h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f60644i;

    /* renamed from: xq.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C1024a extends q implements io.a<T> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f60646x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ qo.b<?> f60647y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<uq.a> f60648z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1024a(vq.a aVar, qo.b<?> bVar, io.a<? extends uq.a> aVar2) {
            super(0);
            this.f60646x = aVar;
            this.f60647y = bVar;
            this.f60648z = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // io.a
        public final T invoke() {
            return a.this.j(this.f60646x, this.f60647y, this.f60648z);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends q implements io.a<String> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ uq.a f60649w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(uq.a aVar) {
            super(0);
            this.f60649w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return "| put parameters on stack " + this.f60649w + ' ';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q implements io.a<String> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f60650w = new c();

        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return "| remove parameters from stack";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends q implements io.a<String> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ qo.b<?> f60651w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f60652x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(qo.b<?> bVar, vq.a aVar) {
            super(0);
            this.f60651w = bVar;
            this.f60652x = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return "- lookup? t:'" + ar.a.a(this.f60651w) + "' - q:'" + this.f60652x + "' look in injected parameters";
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends q implements io.a<String> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ qo.b<?> f60653w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f60654x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(qo.b<?> bVar, vq.a aVar) {
            super(0);
            this.f60653w = bVar;
            this.f60654x = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return "- lookup? t:'" + ar.a.a(this.f60653w) + "' - q:'" + this.f60654x + "' look at scope source";
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends q implements io.a<String> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ qo.b<?> f60655w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f60656x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(qo.b<?> bVar, vq.a aVar) {
            super(0);
            this.f60655w = bVar;
            this.f60656x = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return "- lookup? t:'" + ar.a.a(this.f60655w) + "' - q:'" + this.f60656x + "' look in other scopes";
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends q implements io.a<String> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f60657w = new g();

        public g() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return "| clear parameter stack";
        }
    }

    public a(vq.a aVar, String str, boolean z10, nq.a aVar2) {
        p.h(aVar, "scopeQualifier");
        p.h(str, TtmlNode.ATTR_ID);
        p.h(aVar2, "_koin");
        this.f60636a = aVar;
        this.f60637b = str;
        this.f60638c = z10;
        this.f60639d = aVar2;
        this.f60640e = new ArrayList<>();
        this.f60642g = new ArrayList<>();
        this.f60643h = new k<>();
    }

    public final <T> T b(qo.b<?> bVar, vq.a aVar, io.a<? extends uq.a> aVar2) {
        Iterator<a> it = this.f60640e.iterator();
        T t10 = null;
        while (it.hasNext() && (t10 = (T) it.next().e(bVar, aVar, aVar2)) == null) {
        }
        return t10;
    }

    public final <T> T c(qo.b<?> bVar, vq.a aVar, io.a<? extends uq.a> aVar2) {
        p.h(bVar, "clazz");
        if (this.f60639d.d().f(sq.b.DEBUG)) {
            String str = "";
            if (aVar != null) {
                String str2 = " with qualifier '" + aVar + '\'';
                if (str2 != null) {
                    str = str2;
                }
            }
            this.f60639d.d().b("+- '" + ar.a.a(bVar) + '\'' + str);
            wn.k b10 = yq.a.b(new C1024a(aVar, bVar, aVar2));
            T t10 = (T) b10.a();
            double doubleValue = ((Number) b10.b()).doubleValue();
            this.f60639d.d().b("|- '" + ar.a.a(bVar) + "' in " + doubleValue + " ms");
            return t10;
        }
        return (T) j(aVar, bVar, aVar2);
    }

    public final String d() {
        return this.f60637b;
    }

    public final <T> T e(qo.b<?> bVar, vq.a aVar, io.a<? extends uq.a> aVar2) {
        p.h(bVar, "clazz");
        try {
            return (T) c(bVar, aVar, aVar2);
        } catch (ClosedScopeException unused) {
            sq.c d10 = this.f60639d.d();
            d10.b("|- Scope closed - no instance found for " + ar.a.a(bVar) + " on scope " + this);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            sq.c d11 = this.f60639d.d();
            d11.b("|- No instance found for " + ar.a.a(bVar) + " on scope " + this);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f60636a, aVar.f60636a) && p.c(this.f60637b, aVar.f60637b) && this.f60638c == aVar.f60638c && p.c(this.f60639d, aVar.f60639d);
        }
        return false;
    }

    public final vq.a f() {
        return this.f60636a;
    }

    public final nq.a g() {
        return this.f60639d;
    }

    public final k<uq.a> h() {
        return this.f60643h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f60636a.hashCode() * 31) + this.f60637b.hashCode()) * 31;
        boolean z10 = this.f60638c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.f60639d.hashCode();
    }

    public final Object i() {
        return this.f60641f;
    }

    public final <T> T j(vq.a aVar, qo.b<?> bVar, io.a<? extends uq.a> aVar2) {
        if (!this.f60644i) {
            uq.a invoke = aVar2 == null ? null : aVar2.invoke();
            if (invoke != null) {
                this.f60639d.d().g(sq.b.DEBUG, new b(invoke));
                this.f60643h.g(invoke);
            }
            T t10 = (T) k(aVar, bVar, new rq.b(this.f60639d, this, invoke), aVar2);
            if (invoke != null) {
                this.f60639d.d().g(sq.b.DEBUG, c.f60650w);
                this.f60643h.y();
            }
            return t10;
        }
        throw new ClosedScopeException("Scope '" + this.f60637b + "' is closed");
    }

    public final <T> T k(vq.a aVar, qo.b<?> bVar, rq.b bVar2, io.a<? extends uq.a> aVar2) {
        Object obj = (T) this.f60639d.c().f(aVar, bVar, this.f60636a, bVar2);
        if (obj == null) {
            sq.c d10 = g().d();
            sq.b bVar3 = sq.b.DEBUG;
            d10.g(bVar3, new d(bVar, aVar));
            uq.a s10 = h().s();
            Object obj2 = null;
            obj = s10 == null ? null : s10.c(bVar);
            if (obj == null) {
                g().d().g(bVar3, new e(bVar, aVar));
                Object i10 = i();
                if (i10 != null && bVar.a(i10)) {
                    obj2 = i();
                }
                obj = (T) obj2;
                if (obj == null) {
                    g().d().g(bVar3, new f(bVar, aVar));
                    obj = (T) b(bVar, aVar, aVar2);
                    if (obj == null) {
                        h().clear();
                        g().d().g(bVar3, g.f60657w);
                        l(aVar, bVar);
                        throw new KotlinNothingValueException();
                    }
                }
            }
        }
        return (T) obj;
    }

    public final Void l(vq.a aVar, qo.b<?> bVar) {
        String str = "";
        if (aVar != null) {
            String str2 = " & qualifier:'" + aVar + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        throw new NoBeanDefFoundException("|- No definition found for class:'" + ar.a.a(bVar) + '\'' + str + ". Check your definitions!");
    }

    public String toString() {
        return "['" + this.f60637b + "']";
    }
}
