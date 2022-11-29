package cg;

import cg.c;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class n {

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract n a();

        public abstract a b(zf.b bVar);

        public abstract a c(zf.c<?> cVar);

        public abstract a d(zf.e<?, byte[]> eVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract zf.b b();

    public abstract zf.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    public abstract zf.e<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}
