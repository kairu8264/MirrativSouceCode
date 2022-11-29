package er;

import ep.c0;
import ep.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class o<T> {

    /* loaded from: classes4.dex */
    public class a extends o<Iterable<T>> {
        public a() {
        }

        @Override // er.o
        /* renamed from: d */
        public void a(er.q qVar, Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            for (T t10 : iterable) {
                o.this.a(qVar, t10);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b extends o<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // er.o
        public void a(er.q qVar, Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                o.this.a(qVar, Array.get(obj, i10));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31160a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31161b;

        /* renamed from: c  reason: collision with root package name */
        public final er.f<T, c0> f31162c;

        public c(Method method, int i10, er.f<T, c0> fVar) {
            this.f31160a = method;
            this.f31161b = i10;
            this.f31162c = fVar;
        }

        @Override // er.o
        public void a(er.q qVar, T t10) {
            if (t10 != null) {
                try {
                    qVar.l(this.f31162c.a(t10));
                    return;
                } catch (IOException e10) {
                    Method method = this.f31160a;
                    int i10 = this.f31161b;
                    throw x.p(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            }
            throw x.o(this.f31160a, this.f31161b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f31163a;

        /* renamed from: b  reason: collision with root package name */
        public final er.f<T, String> f31164b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f31165c;

        public d(String str, er.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f31163a = str;
            this.f31164b = fVar;
            this.f31165c = z10;
        }

        @Override // er.o
        public void a(er.q qVar, T t10) throws IOException {
            String a10;
            if (t10 == null || (a10 = this.f31164b.a(t10)) == null) {
                return;
            }
            qVar.a(this.f31163a, a10, this.f31165c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31166a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31167b;

        /* renamed from: c  reason: collision with root package name */
        public final er.f<T, String> f31168c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f31169d;

        public e(Method method, int i10, er.f<T, String> fVar, boolean z10) {
            this.f31166a = method;
            this.f31167b = i10;
            this.f31168c = fVar;
            this.f31169d = z10;
        }

        @Override // er.o
        /* renamed from: d */
        public void a(er.q qVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String a10 = this.f31168c.a(value);
                            if (a10 != null) {
                                qVar.a(key, a10, this.f31169d);
                            } else {
                                Method method = this.f31166a;
                                int i10 = this.f31167b;
                                throw x.o(method, i10, "Field map value '" + value + "' converted to null by " + this.f31168c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f31166a;
                            int i11 = this.f31167b;
                            throw x.o(method2, i11, "Field map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw x.o(this.f31166a, this.f31167b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw x.o(this.f31166a, this.f31167b, "Field map was null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f31170a;

        /* renamed from: b  reason: collision with root package name */
        public final er.f<T, String> f31171b;

        public f(String str, er.f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f31170a = str;
            this.f31171b = fVar;
        }

        @Override // er.o
        public void a(er.q qVar, T t10) throws IOException {
            String a10;
            if (t10 == null || (a10 = this.f31171b.a(t10)) == null) {
                return;
            }
            qVar.b(this.f31170a, a10);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31172a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31173b;

        /* renamed from: c  reason: collision with root package name */
        public final er.f<T, String> f31174c;

        public g(Method method, int i10, er.f<T, String> fVar) {
            this.f31172a = method;
            this.f31173b = i10;
            this.f31174c = fVar;
        }

        @Override // er.o
        /* renamed from: d */
        public void a(er.q qVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            qVar.b(key, this.f31174c.a(value));
                        } else {
                            Method method = this.f31172a;
                            int i10 = this.f31173b;
                            throw x.o(method, i10, "Header map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw x.o(this.f31172a, this.f31173b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw x.o(this.f31172a, this.f31173b, "Header map was null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends o<ep.u> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31175a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31176b;

        public h(Method method, int i10) {
            this.f31175a = method;
            this.f31176b = i10;
        }

        @Override // er.o
        /* renamed from: d */
        public void a(er.q qVar, ep.u uVar) {
            if (uVar != null) {
                qVar.c(uVar);
                return;
            }
            throw x.o(this.f31175a, this.f31176b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31177a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31178b;

        /* renamed from: c  reason: collision with root package name */
        public final ep.u f31179c;

        /* renamed from: d  reason: collision with root package name */
        public final er.f<T, c0> f31180d;

        public i(Method method, int i10, ep.u uVar, er.f<T, c0> fVar) {
            this.f31177a = method;
            this.f31178b = i10;
            this.f31179c = uVar;
            this.f31180d = fVar;
        }

        @Override // er.o
        public void a(er.q qVar, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                qVar.d(this.f31179c, this.f31180d.a(t10));
            } catch (IOException e10) {
                Method method = this.f31177a;
                int i10 = this.f31178b;
                throw x.o(method, i10, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class j<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31181a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31182b;

        /* renamed from: c  reason: collision with root package name */
        public final er.f<T, c0> f31183c;

        /* renamed from: d  reason: collision with root package name */
        public final String f31184d;

        public j(Method method, int i10, er.f<T, c0> fVar, String str) {
            this.f31181a = method;
            this.f31182b = i10;
            this.f31183c = fVar;
            this.f31184d = str;
        }

        @Override // er.o
        /* renamed from: d */
        public void a(er.q qVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            qVar.d(ep.u.k("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f31184d), this.f31183c.a(value));
                        } else {
                            Method method = this.f31181a;
                            int i10 = this.f31182b;
                            throw x.o(method, i10, "Part map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw x.o(this.f31181a, this.f31182b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw x.o(this.f31181a, this.f31182b, "Part map was null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31185a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31186b;

        /* renamed from: c  reason: collision with root package name */
        public final String f31187c;

        /* renamed from: d  reason: collision with root package name */
        public final er.f<T, String> f31188d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f31189e;

        public k(Method method, int i10, String str, er.f<T, String> fVar, boolean z10) {
            this.f31185a = method;
            this.f31186b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f31187c = str;
            this.f31188d = fVar;
            this.f31189e = z10;
        }

        @Override // er.o
        public void a(er.q qVar, T t10) throws IOException {
            if (t10 != null) {
                qVar.f(this.f31187c, this.f31188d.a(t10), this.f31189e);
                return;
            }
            Method method = this.f31185a;
            int i10 = this.f31186b;
            throw x.o(method, i10, "Path parameter \"" + this.f31187c + "\" value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f31190a;

        /* renamed from: b  reason: collision with root package name */
        public final er.f<T, String> f31191b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f31192c;

        public l(String str, er.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f31190a = str;
            this.f31191b = fVar;
            this.f31192c = z10;
        }

        @Override // er.o
        public void a(er.q qVar, T t10) throws IOException {
            String a10;
            if (t10 == null || (a10 = this.f31191b.a(t10)) == null) {
                return;
            }
            qVar.g(this.f31190a, a10, this.f31192c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m<T> extends o<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31193a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31194b;

        /* renamed from: c  reason: collision with root package name */
        public final er.f<T, String> f31195c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f31196d;

        public m(Method method, int i10, er.f<T, String> fVar, boolean z10) {
            this.f31193a = method;
            this.f31194b = i10;
            this.f31195c = fVar;
            this.f31196d = z10;
        }

        @Override // er.o
        /* renamed from: d */
        public void a(er.q qVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String a10 = this.f31195c.a(value);
                            if (a10 != null) {
                                qVar.g(key, a10, this.f31196d);
                            } else {
                                Method method = this.f31193a;
                                int i10 = this.f31194b;
                                throw x.o(method, i10, "Query map value '" + value + "' converted to null by " + this.f31195c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f31193a;
                            int i11 = this.f31194b;
                            throw x.o(method2, i11, "Query map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw x.o(this.f31193a, this.f31194b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw x.o(this.f31193a, this.f31194b, "Query map was null", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        public final er.f<T, String> f31197a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f31198b;

        public n(er.f<T, String> fVar, boolean z10) {
            this.f31197a = fVar;
            this.f31198b = z10;
        }

        @Override // er.o
        public void a(er.q qVar, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            qVar.g(this.f31197a.a(t10), null, this.f31198b);
        }
    }

    /* renamed from: er.o$o  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0317o extends o<y.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0317o f31199a = new C0317o();

        @Override // er.o
        /* renamed from: d */
        public void a(er.q qVar, y.c cVar) {
            if (cVar != null) {
                qVar.e(cVar);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends o<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f31200a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31201b;

        public p(Method method, int i10) {
            this.f31200a = method;
            this.f31201b = i10;
        }

        @Override // er.o
        public void a(er.q qVar, Object obj) {
            if (obj != null) {
                qVar.m(obj);
                return;
            }
            throw x.o(this.f31200a, this.f31201b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class q<T> extends o<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f31202a;

        public q(Class<T> cls) {
            this.f31202a = cls;
        }

        @Override // er.o
        public void a(er.q qVar, T t10) {
            qVar.h(this.f31202a, t10);
        }
    }

    public abstract void a(er.q qVar, T t10) throws IOException;

    public final o<Object> b() {
        return new b();
    }

    public final o<Iterable<T>> c() {
        return new a();
    }
}
