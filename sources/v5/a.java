package v5;

import ai.r23;
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

/* loaded from: classes.dex */
public abstract class a<V> implements nk.c<V> {
    public static final b B;
    public static final Object C;

    /* renamed from: w  reason: collision with root package name */
    public volatile Object f56745w;

    /* renamed from: x  reason: collision with root package name */
    public volatile e f56746x;

    /* renamed from: y  reason: collision with root package name */
    public volatile i f56747y;

    /* renamed from: z  reason: collision with root package name */
    public static final boolean f56744z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger A = Logger.getLogger(a.class.getName());

    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final c f56748c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f56749d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f56750a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f56751b;

        static {
            if (a.f56744z) {
                f56749d = null;
                f56748c = null;
                return;
            }
            f56749d = new c(false, null);
            f56748c = new c(true, null);
        }

        public c(boolean z10, Throwable th2) {
            this.f56750a = z10;
            this.f56751b = th2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f56752b = new d(new C0905a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f56753a;

        /* renamed from: v5.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0905a extends Throwable {
            public C0905a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f56753a = (Throwable) a.e(th2);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f56754d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f56755a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f56756b;

        /* renamed from: c  reason: collision with root package name */
        public e f56757c;

        public e(Runnable runnable, Executor executor) {
            this.f56755a = runnable;
            this.f56756b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f56758a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f56759b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f56760c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f56761d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f56762e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f56758a = atomicReferenceFieldUpdater;
            this.f56759b = atomicReferenceFieldUpdater2;
            this.f56760c = atomicReferenceFieldUpdater3;
            this.f56761d = atomicReferenceFieldUpdater4;
            this.f56762e = atomicReferenceFieldUpdater5;
        }

        @Override // v5.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return r23.a(this.f56761d, aVar, eVar, eVar2);
        }

        @Override // v5.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return r23.a(this.f56762e, aVar, obj, obj2);
        }

        @Override // v5.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return r23.a(this.f56760c, aVar, iVar, iVar2);
        }

        @Override // v5.a.b
        public void d(i iVar, i iVar2) {
            this.f56759b.lazySet(iVar, iVar2);
        }

        @Override // v5.a.b
        public void e(i iVar, Thread thread) {
            this.f56758a.lazySet(iVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final a<V> f56763w;

        /* renamed from: x  reason: collision with root package name */
        public final nk.c<? extends V> f56764x;

        public g(a<V> aVar, nk.c<? extends V> cVar) {
            this.f56763w = aVar;
            this.f56764x = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f56763w.f56745w != this) {
                return;
            }
            if (a.B.b(this.f56763w, this, a.k(this.f56764x))) {
                a.g(this.f56763w);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // v5.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f56746x == eVar) {
                    aVar.f56746x = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // v5.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f56745w == obj) {
                    aVar.f56745w = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // v5.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f56747y == iVar) {
                    aVar.f56747y = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // v5.a.b
        public void d(i iVar, i iVar2) {
            iVar.f56767b = iVar2;
        }

        @Override // v5.a.b
        public void e(i iVar, Thread thread) {
            iVar.f56766a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        public static final i f56765c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f56766a;

        /* renamed from: b  reason: collision with root package name */
        public volatile i f56767b;

        public i(boolean z10) {
        }

        public void a(i iVar) {
            a.B.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f56766a;
            if (thread != null) {
                this.f56766a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            a.B.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, TopicConstant.EXTEND_LIPMETA_A), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "y"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "x"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "w"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        B = hVar;
        if (th != null) {
            A.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        C = new Object();
    }

    public static CancellationException d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    public static <T> T e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [v5.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [v5.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [v5.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [v5.a, v5.a<V>] */
    public static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.o();
            aVar.b();
            e f10 = aVar.f(eVar);
            while (f10 != null) {
                eVar = f10.f56757c;
                Runnable runnable = f10.f56755a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f56763w;
                    if (aVar.f56745w == gVar) {
                        if (B.b(aVar, gVar, k(gVar.f56764x))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f10.f56756b);
                }
                f10 = eVar;
            }
            return;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = A;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object k(nk.c<?> cVar) {
        if (cVar instanceof a) {
            Object obj = ((a) cVar).f56745w;
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                return cVar2.f56750a ? cVar2.f56751b != null ? new c(false, cVar2.f56751b) : c.f56749d : obj;
            }
            return obj;
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!f56744z) & isCancelled) {
            return c.f56749d;
        }
        try {
            Object l10 = l(cVar);
            return l10 == null ? C : l10;
        } catch (CancellationException e10) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + cVar, e10));
            }
            return new c(false, e10);
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    public static <V> V l(Future<V> future) throws ExecutionException {
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

    public final void a(StringBuilder sb2) {
        try {
            Object l10 = l(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(t(l10));
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

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f56745w;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f56744z) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else if (z10) {
            cVar = c.f56748c;
        } else {
            cVar = c.f56749d;
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (B.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.m();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                nk.c<? extends V> cVar2 = ((g) obj).f56764x;
                if (cVar2 instanceof a) {
                    aVar = (a) cVar2;
                    obj = aVar.f56745w;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    cVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = aVar.f56745w;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    public final e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f56746x;
        } while (!B.a(this, eVar2, e.f56754d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f56757c;
            eVar4.f56757c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f56745w;
            if ((obj != null) & (!(obj instanceof g))) {
                return j(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f56747y;
                if (iVar != i.f56765c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (B.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f56745w;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return j(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    p(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            p(iVar2);
                        } else {
                            iVar = this.f56747y;
                        }
                    } while (iVar != i.f56765c);
                    return j(this.f56745w);
                }
                return j(this.f56745w);
            }
            while (nanos > 0) {
                Object obj3 = this.f56745w;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return j(obj3);
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
    public final void i(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f56746x;
        if (eVar != e.f56754d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f56757c = eVar;
                if (B.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f56746x;
            } while (eVar != e.f56754d);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f56745w instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f56745w;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V j(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == C) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f56753a);
        }
        throw d("Task was cancelled.", ((c) obj).f56751b);
    }

    public void m() {
    }

    public String n() {
        Object obj = this.f56745w;
        if (obj instanceof g) {
            return "setFuture=[" + t(((g) obj).f56764x) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void o() {
        i iVar;
        do {
            iVar = this.f56747y;
        } while (!B.c(this, iVar, i.f56765c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f56767b;
        }
    }

    public final void p(i iVar) {
        iVar.f56766a = null;
        while (true) {
            i iVar2 = this.f56747y;
            if (iVar2 == i.f56765c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f56767b;
                if (iVar2.f56766a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f56767b = iVar4;
                    if (iVar3.f56766a == null) {
                        break;
                    }
                } else if (!B.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean q(V v10) {
        if (v10 == null) {
            v10 = (V) C;
        }
        if (B.b(this, null, v10)) {
            g(this);
            return true;
        }
        return false;
    }

    public boolean r(Throwable th2) {
        if (B.b(this, null, new d((Throwable) e(th2)))) {
            g(this);
            return true;
        }
        return false;
    }

    public boolean s(nk.c<? extends V> cVar) {
        d dVar;
        e(cVar);
        Object obj = this.f56745w;
        if (obj == null) {
            if (cVar.isDone()) {
                if (B.b(this, null, k(cVar))) {
                    g(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, cVar);
            if (B.b(this, null, gVar)) {
                try {
                    cVar.i(gVar, v5.b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f56752b;
                    }
                    B.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f56745w;
        }
        if (obj instanceof c) {
            cVar.cancel(((c) obj).f56750a);
        }
        return false;
    }

    public final String t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = n();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f56745w;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return j(obj2);
            }
            i iVar = this.f56747y;
            if (iVar != i.f56765c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (B.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f56745w;
                            } else {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return j(obj);
                    }
                    iVar = this.f56747y;
                } while (iVar != i.f56765c);
                return j(this.f56745w);
            }
            return j(this.f56745w);
        }
        throw new InterruptedException();
    }
}
