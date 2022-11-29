package er;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import er.c;
import er.f;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: c  reason: collision with root package name */
    public static final p f31203c = e();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31204a;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f31205b;

    /* loaded from: classes4.dex */
    public static final class a extends p {

        /* renamed from: er.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class ExecutorC0318a implements Executor {

            /* renamed from: w  reason: collision with root package name */
            public final Handler f31206w = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f31206w.post(runnable);
            }
        }

        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // er.p
        public Executor b() {
            return new ExecutorC0318a();
        }

        @Override // er.p
        public Object g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public p(boolean z10) {
        this.f31204a = z10;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z10) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f31205b = constructor;
    }

    public static p e() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new a();
        }
        return new p(true);
    }

    public static p f() {
        return f31203c;
    }

    public List<? extends c.a> a(Executor executor) {
        g gVar = new g(executor);
        return this.f31204a ? Arrays.asList(e.f31103a, gVar) : Collections.singletonList(gVar);
    }

    public Executor b() {
        return null;
    }

    public List<? extends f.a> c() {
        return this.f31204a ? Collections.singletonList(n.f31156a) : Collections.emptyList();
    }

    public int d() {
        return this.f31204a ? 1 : 0;
    }

    @IgnoreJRERequirement
    public Object g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f31205b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    public boolean h(Method method) {
        return this.f31204a && method.isDefault();
    }
}
