package ai;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Locale;
import java.util.Objects;
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

/* loaded from: classes3.dex */
public abstract class a33<V> extends k53 implements s43<V> {
    public static final Logger A;
    public static final m23 B;
    public static final Object C;

    /* renamed from: z  reason: collision with root package name */
    public static final boolean f1718z;

    /* renamed from: w  reason: collision with root package name */
    public volatile Object f1719w;

    /* renamed from: x  reason: collision with root package name */
    public volatile p23 f1720x;

    /* renamed from: y  reason: collision with root package name */
    public volatile z23 f1721y;

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        m23 u23Var;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f1718z = z10;
        A = Logger.getLogger(a33.class.getName());
        try {
            u23Var = new y23(null);
            th3 = null;
            th2 = null;
        } catch (Throwable th4) {
            try {
                th3 = th4;
                u23Var = new s23(AtomicReferenceFieldUpdater.newUpdater(z23.class, Thread.class, TopicConstant.EXTEND_LIPMETA_A), AtomicReferenceFieldUpdater.newUpdater(z23.class, z23.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a33.class, z23.class, "y"), AtomicReferenceFieldUpdater.newUpdater(a33.class, p23.class, "x"), AtomicReferenceFieldUpdater.newUpdater(a33.class, Object.class, "w"));
                th2 = null;
            } catch (Throwable th5) {
                th2 = th5;
                th3 = th4;
                u23Var = new u23(null);
            }
        }
        B = u23Var;
        if (th2 != null) {
            Logger logger = A;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        C = new Object();
    }

    public static <V> V A(Future<V> future) throws ExecutionException {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [ai.m23] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ai.a33<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ai.a33] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [ai.a33<V>, ai.a33] */
    public static void B(a33<?> a33Var) {
        p23 p23Var;
        p23 p23Var2;
        p23 p23Var3 = null;
        while (true) {
            z23 z23Var = ((a33) a33Var).f1721y;
            if (B.c((a33) a33Var, z23Var, z23.f12842c)) {
                while (z23Var != null) {
                    Thread thread = z23Var.f12843a;
                    if (thread != null) {
                        z23Var.f12843a = null;
                        LockSupport.unpark(thread);
                    }
                    z23Var = z23Var.f12844b;
                }
                ((a33) a33Var).j();
                do {
                    p23Var = ((a33) a33Var).f1720x;
                } while (!B.d((a33) a33Var, p23Var, p23.f8263d));
                while (true) {
                    p23Var2 = p23Var3;
                    p23Var3 = p23Var;
                    if (p23Var3 == null) {
                        break;
                    }
                    p23Var = p23Var3.f8266c;
                    p23Var3.f8266c = p23Var2;
                }
                while (p23Var2 != null) {
                    p23Var3 = p23Var2.f8266c;
                    Runnable runnable = p23Var2.f8264a;
                    runnable.getClass();
                    if (runnable instanceof t23) {
                        t23 t23Var = (t23) runnable;
                        a33Var = t23Var.f10078w;
                        if (a33Var.f1719w == t23Var) {
                            if (B.e(a33Var, t23Var, g(t23Var.f10079x))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = p23Var2.f8265b;
                        executor.getClass();
                        d(runnable, executor);
                    }
                    p23Var2 = p23Var3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = A;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb2.toString(), (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V e(Object obj) throws ExecutionException {
        if (!(obj instanceof n23)) {
            if (obj instanceof o23) {
                throw new ExecutionException(((o23) obj).f7629a);
            }
            if (obj == C) {
                return null;
            }
            return obj;
        }
        Throwable th2 = ((n23) obj).f7167b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public static Object g(s43<?> s43Var) {
        Throwable a10;
        if (s43Var instanceof v23) {
            Object obj = ((a33) s43Var).f1719w;
            if (obj instanceof n23) {
                n23 n23Var = (n23) obj;
                if (n23Var.f7166a) {
                    Throwable th2 = n23Var.f7167b;
                    obj = th2 != null ? new n23(false, th2) : n23.f7165d;
                }
            }
            obj.getClass();
            return obj;
        } else if ((s43Var instanceof k53) && (a10 = ((k53) s43Var).a()) != null) {
            return new o23(a10);
        } else {
            boolean isCancelled = s43Var.isCancelled();
            if ((!f1718z) & isCancelled) {
                n23 n23Var2 = n23.f7165d;
                n23Var2.getClass();
                return n23Var2;
            }
            try {
                Object A2 = A(s43Var);
                if (!isCancelled) {
                    return A2 == null ? C : A2;
                }
                String valueOf = String.valueOf(s43Var);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf);
                return new n23(false, new IllegalArgumentException(sb2.toString()));
            } catch (CancellationException e10) {
                if (!isCancelled) {
                    return new o23(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(s43Var)), e10));
                }
                return new n23(false, e10);
            } catch (ExecutionException e11) {
                if (isCancelled) {
                    return new n23(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(s43Var)), e11));
                }
                return new o23(e11.getCause());
            } catch (Throwable th3) {
                return new o23(th3);
            }
        }
    }

    public final void C(StringBuilder sb2) {
        String concat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f1719w;
        if (obj instanceof t23) {
            sb2.append(", setFuture=[");
            b(sb2, ((t23) obj).f10079x);
            sb2.append("]");
        } else {
            try {
                concat = xx2.b(h());
            } catch (RuntimeException | StackOverflowError e10) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (concat != null) {
                sb2.append(", info=[");
                sb2.append(concat);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            D(sb2);
        }
    }

    public final void D(StringBuilder sb2) {
        try {
            Object A2 = A(this);
            sb2.append("SUCCESS, result=[");
            if (A2 == null) {
                sb2.append("null");
            } else if (A2 == this) {
                sb2.append("this future");
            } else {
                sb2.append(A2.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(A2)));
            }
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

    @Override // ai.k53
    public final Throwable a() {
        if (this instanceof v23) {
            Object obj = this.f1719w;
            if (obj instanceof o23) {
                return ((o23) obj).f7629a;
            }
            return null;
        }
        return null;
    }

    public final void b(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    @Override // ai.s43
    public void c(Runnable runnable, Executor executor) {
        p23 p23Var;
        lx2.c(runnable, "Runnable was null.");
        lx2.c(executor, "Executor was null.");
        if (!isDone() && (p23Var = this.f1720x) != p23.f8263d) {
            p23 p23Var2 = new p23(runnable, executor);
            do {
                p23Var2.f8266c = p23Var;
                if (B.d(this, p23Var, p23Var2)) {
                    return;
                }
                p23Var = this.f1720x;
            } while (p23Var != p23.f8263d);
            d(runnable, executor);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        n23 n23Var;
        Object obj = this.f1719w;
        if ((obj == null) || (obj instanceof t23)) {
            if (f1718z) {
                n23Var = new n23(z10, new CancellationException("Future.cancel() was called."));
            } else {
                if (z10) {
                    n23Var = n23.f7164c;
                } else {
                    n23Var = n23.f7165d;
                }
                n23Var.getClass();
            }
            a33<V> a33Var = this;
            boolean z11 = false;
            while (true) {
                if (B.e(a33Var, obj, n23Var)) {
                    if (z10) {
                        a33Var.s();
                    }
                    B(a33Var);
                    if (!(obj instanceof t23)) {
                        break;
                    }
                    s43<? extends V> s43Var = ((t23) obj).f10079x;
                    if (s43Var instanceof v23) {
                        a33Var = (a33) s43Var;
                        obj = a33Var.f1719w;
                        if (!(obj == null) && !(obj instanceof t23)) {
                            break;
                        }
                        z11 = true;
                    } else {
                        s43Var.cancel(z10);
                        break;
                    }
                } else {
                    obj = a33Var.f1719w;
                    if (!(obj instanceof t23)) {
                        return z11;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(z23 z23Var) {
        z23Var.f12843a = null;
        while (true) {
            z23 z23Var2 = this.f1721y;
            if (z23Var2 != z23.f12842c) {
                z23 z23Var3 = null;
                while (z23Var2 != null) {
                    z23 z23Var4 = z23Var2.f12844b;
                    if (z23Var2.f12843a != null) {
                        z23Var3 = z23Var2;
                    } else if (z23Var3 != null) {
                        z23Var3.f12844b = z23Var4;
                        if (z23Var3.f12843a == null) {
                            break;
                        }
                    } else if (!B.c(this, z23Var2, z23Var4)) {
                        break;
                    }
                    z23Var2 = z23Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1719w;
            if ((obj2 != null) && (!(obj2 instanceof t23))) {
                return (V) e(obj2);
            }
            z23 z23Var = this.f1721y;
            if (z23Var != z23.f12842c) {
                z23 z23Var2 = new z23();
                do {
                    m23 m23Var = B;
                    m23Var.b(z23Var2, z23Var);
                    if (m23Var.c(this, z23Var, z23Var2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1719w;
                            } else {
                                f(z23Var2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof t23))));
                        return (V) e(obj);
                    }
                    z23Var = this.f1721y;
                } while (z23Var != z23.f12842c);
                Object obj3 = this.f1719w;
                obj3.getClass();
                return (V) e(obj3);
            }
            Object obj32 = this.f1719w;
            obj32.getClass();
            return (V) e(obj32);
        }
        throw new InterruptedException();
    }

    public String h() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("remaining delay=[");
            sb2.append(delay);
            sb2.append(" ms]");
            return sb2.toString();
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f1719w instanceof n23;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f1719w;
        return (!(obj instanceof t23)) & (obj != null);
    }

    public void j() {
    }

    public void s() {
    }

    public final boolean t() {
        Object obj = this.f1719w;
        return (obj instanceof n23) && ((n23) obj).f7166a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            D(sb2);
        } else {
            C(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public boolean u(V v10) {
        if (v10 == null) {
            v10 = (V) C;
        }
        if (B.e(this, null, v10)) {
            B(this);
            return true;
        }
        return false;
    }

    public boolean v(Throwable th2) {
        Objects.requireNonNull(th2);
        if (B.e(this, null, new o23(th2))) {
            B(this);
            return true;
        }
        return false;
    }

    public final boolean w(s43<? extends V> s43Var) {
        o23 o23Var;
        Objects.requireNonNull(s43Var);
        Object obj = this.f1719w;
        if (obj == null) {
            if (s43Var.isDone()) {
                if (B.e(this, null, g(s43Var))) {
                    B(this);
                    return true;
                }
                return false;
            }
            t23 t23Var = new t23(this, s43Var);
            if (B.e(this, null, t23Var)) {
                try {
                    s43Var.c(t23Var, w33.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        o23Var = new o23(th2);
                    } catch (Throwable unused) {
                        o23Var = o23.f7628b;
                    }
                    B.e(this, t23Var, o23Var);
                }
                return true;
            }
            obj = this.f1719w;
        }
        if (obj instanceof n23) {
            s43Var.cancel(((n23) obj).f7166a);
        }
        return false;
    }

    public final void z(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(t());
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f1719w;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof t23))) {
                return (V) e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                z23 z23Var = this.f1721y;
                if (z23Var != z23.f12842c) {
                    z23 z23Var2 = new z23();
                    do {
                        m23 m23Var = B;
                        m23Var.b(z23Var2, z23Var);
                        if (m23Var.c(this, z23Var, z23Var2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f1719w;
                                    if ((obj2 != null) & (!(obj2 instanceof t23))) {
                                        return (V) e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    f(z23Var2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(z23Var2);
                        } else {
                            z23Var = this.f1721y;
                        }
                    } while (z23Var != z23.f12842c);
                    Object obj3 = this.f1719w;
                    obj3.getClass();
                    return (V) e(obj3);
                }
                Object obj32 = this.f1719w;
                obj32.getClass();
                return (V) e(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.f1719w;
                if ((obj4 != null) & (!(obj4 instanceof t23))) {
                    return (V) e(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String a33Var = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb2.append("Waited ");
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(lowerCase2);
            String sb3 = sb2.toString();
            if (nanos + 1000 < 0) {
                String concat = sb3.concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i10 != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (i10 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb4.append(valueOf);
                    sb4.append(convert);
                    sb4.append(" ");
                    sb4.append(lowerCase);
                    String sb5 = sb4.toString();
                    if (z10) {
                        sb5 = sb5.concat(",");
                    }
                    concat = String.valueOf(sb5).concat(" ");
                }
                if (z10) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb6 = new StringBuilder(valueOf2.length() + 33);
                    sb6.append(valueOf2);
                    sb6.append(nanos2);
                    sb6.append(" nanoseconds ");
                    concat = sb6.toString();
                }
                sb3 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb3).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(sb3).length() + 5 + String.valueOf(a33Var).length());
            sb7.append(sb3);
            sb7.append(" for ");
            sb7.append(a33Var);
            throw new TimeoutException(sb7.toString());
        }
        throw new InterruptedException();
    }
}
