package nk;

import ai.r23;
import ai.x23;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kk.o;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

@ReflectionSupport(ReflectionSupport.Level.FULL)
/* loaded from: classes3.dex */
public abstract class a<V> extends ok.a implements nk.c<V> {
    public static final b B;
    public static final Object C;
    @NullableDecl

    /* renamed from: w  reason: collision with root package name */
    public volatile Object f43671w;
    @NullableDecl

    /* renamed from: x  reason: collision with root package name */
    public volatile e f43672x;
    @NullableDecl

    /* renamed from: y  reason: collision with root package name */
    public volatile l f43673y;

    /* renamed from: z  reason: collision with root package name */
    public static final boolean f43670z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger A = Logger.getLogger(a.class.getName());

    /* loaded from: classes3.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, l lVar, l lVar2);

        public abstract void d(l lVar, l lVar2);

        public abstract void e(l lVar, Thread thread);
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final c f43674c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f43675d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f43676a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f43677b;

        static {
            if (a.f43670z) {
                f43675d = null;
                f43674c = null;
                return;
            }
            f43675d = new c(false, null);
            f43674c = new c(true, null);
        }

        public c(boolean z10, @NullableDecl Throwable th2) {
            this.f43676a = z10;
            this.f43677b = th2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f43678b = new d(new C0639a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f43679a;

        /* renamed from: nk.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0639a extends Throwable {
            public C0639a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f43679a = (Throwable) kk.j.i(th2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f43680d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f43681a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f43682b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        public e f43683c;

        public e(Runnable runnable, Executor executor) {
            this.f43681a = runnable;
            this.f43682b = executor;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, Thread> f43684a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, l> f43685b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, l> f43686c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f43687d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f43688e;

        public f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f43684a = atomicReferenceFieldUpdater;
            this.f43685b = atomicReferenceFieldUpdater2;
            this.f43686c = atomicReferenceFieldUpdater3;
            this.f43687d = atomicReferenceFieldUpdater4;
            this.f43688e = atomicReferenceFieldUpdater5;
        }

        @Override // nk.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return r23.a(this.f43687d, aVar, eVar, eVar2);
        }

        @Override // nk.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return r23.a(this.f43688e, aVar, obj, obj2);
        }

        @Override // nk.a.b
        public boolean c(a<?> aVar, l lVar, l lVar2) {
            return r23.a(this.f43686c, aVar, lVar, lVar2);
        }

        @Override // nk.a.b
        public void d(l lVar, l lVar2) {
            this.f43685b.lazySet(lVar, lVar2);
        }

        @Override // nk.a.b
        public void e(l lVar, Thread thread) {
            this.f43684a.lazySet(lVar, thread);
        }
    }

    /* loaded from: classes3.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final a<V> f43689w;

        /* renamed from: x  reason: collision with root package name */
        public final nk.c<? extends V> f43690x;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f43689w.f43671w != this) {
                return;
            }
            if (a.B.b(this.f43689w, this, a.u(this.f43690x))) {
                a.r(this.f43689w);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // nk.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f43672x == eVar) {
                    aVar.f43672x = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // nk.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f43671w == obj) {
                    aVar.f43671w = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // nk.a.b
        public boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                if (aVar.f43673y == lVar) {
                    aVar.f43673y = lVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // nk.a.b
        public void d(l lVar, l lVar2) {
            lVar.f43699b = lVar2;
        }

        @Override // nk.a.b
        public void e(l lVar, Thread thread) {
            lVar.f43698a = thread;
        }
    }

    /* loaded from: classes3.dex */
    public interface i<V> extends nk.c<V> {
    }

    /* loaded from: classes3.dex */
    public static abstract class j<V> extends a<V> implements i<V> {
        @Override // nk.a, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // nk.a, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // nk.a, nk.c
        public final void i(Runnable runnable, Executor executor) {
            super.i(runnable, executor);
        }

        @Override // nk.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // nk.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // nk.a, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }
    }

    /* loaded from: classes3.dex */
    public static final class k extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final Unsafe f43691a;

        /* renamed from: b  reason: collision with root package name */
        public static final long f43692b;

        /* renamed from: c  reason: collision with root package name */
        public static final long f43693c;

        /* renamed from: d  reason: collision with root package name */
        public static final long f43694d;

        /* renamed from: e  reason: collision with root package name */
        public static final long f43695e;

        /* renamed from: f  reason: collision with root package name */
        public static final long f43696f;

        /* renamed from: nk.a$k$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0640a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a */
            public Unsafe run() throws Exception {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new C0640a());
                }
                try {
                    f43693c = unsafe.objectFieldOffset(a.class.getDeclaredField("y"));
                    f43692b = unsafe.objectFieldOffset(a.class.getDeclaredField("x"));
                    f43694d = unsafe.objectFieldOffset(a.class.getDeclaredField("w"));
                    f43695e = unsafe.objectFieldOffset(l.class.getDeclaredField(TopicConstant.EXTEND_LIPMETA_A));
                    f43696f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    f43691a = unsafe;
                } catch (Exception e10) {
                    o.e(e10);
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        public k() {
            super();
        }

        @Override // nk.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return x23.a(f43691a, aVar, f43692b, eVar, eVar2);
        }

        @Override // nk.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return x23.a(f43691a, aVar, f43694d, obj, obj2);
        }

        @Override // nk.a.b
        public boolean c(a<?> aVar, l lVar, l lVar2) {
            return x23.a(f43691a, aVar, f43693c, lVar, lVar2);
        }

        @Override // nk.a.b
        public void d(l lVar, l lVar2) {
            f43691a.putObject(lVar, f43696f, lVar2);
        }

        @Override // nk.a.b
        public void e(l lVar, Thread thread) {
            f43691a.putObject(lVar, f43695e, thread);
        }
    }

    /* loaded from: classes3.dex */
    public static final class l {

        /* renamed from: c  reason: collision with root package name */
        public static final l f43697c = new l(false);
        @NullableDecl

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f43698a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        public volatile l f43699b;

        public l(boolean z10) {
        }

        public void a(l lVar) {
            a.B.d(this, lVar);
        }

        public void b() {
            Thread thread = this.f43698a;
            if (thread != null) {
                this.f43698a = null;
                LockSupport.unpark(thread);
            }
        }

        public l() {
            a.B.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        Throwable th2 = null;
        try {
            hVar = new k();
            th = null;
        } catch (Throwable th3) {
            th = th3;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, TopicConstant.EXTEND_LIPMETA_A), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "y"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "x"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "w"));
            } catch (Throwable th4) {
                hVar = new h();
                th2 = th4;
            }
        }
        B = hVar;
        if (th2 != null) {
            Logger logger = A;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        C = new Object();
    }

    private String C(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void n(StringBuilder sb2) {
        try {
            Object v10 = v(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(C(v10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    public static CancellationException p(@NullableDecl String str, @NullableDecl Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [nk.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [nk.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [nk.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [nk.a, nk.a<V>] */
    public static void r(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.y();
            aVar.o();
            e q10 = aVar.q(eVar);
            while (q10 != null) {
                eVar = q10.f43683c;
                Runnable runnable = q10.f43681a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f43689w;
                    if (aVar.f43671w == gVar) {
                        if (B.b(aVar, gVar, u(gVar.f43690x))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    s(runnable, q10.f43682b);
                }
                q10 = eVar;
            }
            return;
        }
    }

    public static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = A;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V t(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == C) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f43679a);
        }
        throw p("Task was cancelled.", ((c) obj).f43677b);
    }

    public static Object u(nk.c<?> cVar) {
        Throwable a10;
        if (cVar instanceof i) {
            Object obj = ((a) cVar).f43671w;
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                return cVar2.f43676a ? cVar2.f43677b != null ? new c(false, cVar2.f43677b) : c.f43675d : obj;
            }
            return obj;
        } else if ((cVar instanceof ok.a) && (a10 = ok.b.a((ok.a) cVar)) != null) {
            return new d(a10);
        } else {
            boolean isCancelled = cVar.isCancelled();
            if ((!f43670z) & isCancelled) {
                return c.f43675d;
            }
            try {
                Object v10 = v(cVar);
                if (!isCancelled) {
                    return v10 == null ? C : v10;
                }
                return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + cVar));
            } catch (CancellationException e10) {
                if (!isCancelled) {
                    return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + cVar, e10));
                }
                return new c(false, e10);
            } catch (ExecutionException e11) {
                if (isCancelled) {
                    return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + cVar, e11));
                }
                return new d(e11.getCause());
            } catch (Throwable th2) {
                return new d(th2);
            }
        }
    }

    public static <V> V v(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void y() {
        l lVar;
        do {
            lVar = this.f43673y;
        } while (!B.c(this, lVar, l.f43697c));
        while (lVar != null) {
            lVar.b();
            lVar = lVar.f43699b;
        }
    }

    @CanIgnoreReturnValue
    public boolean A(@NullableDecl V v10) {
        if (v10 == null) {
            v10 = (V) C;
        }
        if (B.b(this, null, v10)) {
            r(this);
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public boolean B(Throwable th2) {
        if (B.b(this, null, new d((Throwable) kk.j.i(th2)))) {
            r(this);
            return true;
        }
        return false;
    }

    @Override // ok.a
    @NullableDecl
    public final Throwable a() {
        if (this instanceof i) {
            Object obj = this.f43671w;
            if (obj instanceof d) {
                return ((d) obj).f43679a;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public boolean cancel(boolean z10) {
        Object obj = this.f43671w;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f43670z ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f43674c : c.f43675d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (B.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.w();
                }
                r(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                nk.c<? extends V> cVar2 = ((g) obj).f43690x;
                if (cVar2 instanceof i) {
                    aVar = (a) cVar2;
                    obj = aVar.f43671w;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    cVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = aVar.f43671w;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f43671w;
            if ((obj != null) & (!(obj instanceof g))) {
                return t(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                l lVar = this.f43673y;
                if (lVar != l.f43697c) {
                    l lVar2 = new l();
                    do {
                        lVar2.a(lVar);
                        if (B.c(this, lVar, lVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f43671w;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return t(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    z(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            z(lVar2);
                        } else {
                            lVar = this.f43673y;
                        }
                    } while (lVar != l.f43697c);
                    return t(this.f43671w);
                }
                return t(this.f43671w);
            }
            while (nanos > 0) {
                Object obj3 = this.f43671w;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return t(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z10) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    @Override // nk.c
    public void i(Runnable runnable, Executor executor) {
        e eVar;
        kk.j.j(runnable, "Runnable was null.");
        kk.j.j(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f43672x) != e.f43680d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f43683c = eVar;
                if (B.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f43672x;
            } while (eVar != e.f43680d);
            s(runnable, executor);
        }
        s(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f43671w instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f43671w;
        return (!(obj instanceof g)) & (obj != null);
    }

    @ForOverride
    public void o() {
    }

    public final e q(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f43672x;
        } while (!B.a(this, eVar2, e.f43680d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f43683c;
            eVar4.f43683c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            n(sb2);
        } else {
            try {
                str = x();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                n(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void w() {
    }

    @NullableDecl
    public String x() {
        Object obj = this.f43671w;
        if (obj instanceof g) {
            return "setFuture=[" + C(((g) obj).f43690x) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void z(l lVar) {
        lVar.f43698a = null;
        while (true) {
            l lVar2 = this.f43673y;
            if (lVar2 == l.f43697c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f43699b;
                if (lVar2.f43698a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f43699b = lVar4;
                    if (lVar3.f43698a == null) {
                        break;
                    }
                } else if (!B.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f43671w;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return t(obj2);
            }
            l lVar = this.f43673y;
            if (lVar != l.f43697c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (B.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f43671w;
                            } else {
                                z(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return t(obj);
                    }
                    lVar = this.f43673y;
                } while (lVar != l.f43697c);
                return t(this.f43671w);
            }
            return t(this.f43671w);
        }
        throw new InterruptedException();
    }
}
