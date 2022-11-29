package em;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class s0 {

    /* renamed from: i  reason: collision with root package name */
    public static final long f30739i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    public final Context f30740a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f30741b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f30742c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseMessaging f30743d;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f30745f;

    /* renamed from: h  reason: collision with root package name */
    public final q0 f30747h;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, ArrayDeque<vi.h<Void>>> f30744e = new s.a();

    /* renamed from: g  reason: collision with root package name */
    public boolean f30746g = false;

    public s0(FirebaseMessaging firebaseMessaging, e0 e0Var, q0 q0Var, a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f30743d = firebaseMessaging;
        this.f30741b = e0Var;
        this.f30747h = q0Var;
        this.f30742c = a0Var;
        this.f30740a = context;
        this.f30745f = scheduledExecutorService;
    }

    public static <T> void a(vi.g<T> gVar) throws IOException {
        try {
            vi.j.b(gVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static vi.g<s0> d(final FirebaseMessaging firebaseMessaging, final e0 e0Var, final a0 a0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return vi.j.c(scheduledExecutorService, new Callable() { // from class: em.r0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s0.h(context, scheduledExecutorService, firebaseMessaging, e0Var, a0Var);
            }
        });
    }

    public static boolean f() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static /* synthetic */ s0 h(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, e0 e0Var, a0 a0Var) throws Exception {
        return new s0(firebaseMessaging, e0Var, q0.a(context, scheduledExecutorService), a0Var, context, scheduledExecutorService);
    }

    public final void b(String str) throws IOException {
        a(this.f30742c.j(this.f30743d.c(), str));
    }

    public final void c(String str) throws IOException {
        a(this.f30742c.k(this.f30743d.c(), str));
    }

    public boolean e() {
        return this.f30747h.b() != null;
    }

    public synchronized boolean g() {
        return this.f30746g;
    }

    public final void i(p0 p0Var) {
        synchronized (this.f30744e) {
            String e10 = p0Var.e();
            if (this.f30744e.containsKey(e10)) {
                ArrayDeque<vi.h<Void>> arrayDeque = this.f30744e.get(e10);
                vi.h<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f30744e.remove(e10);
                }
            }
        }
    }

    public boolean j(p0 p0Var) throws IOException {
        char c10;
        try {
            String b10 = p0Var.b();
            int hashCode = b10.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b10.equals("U")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (b10.equals("S")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                b(p0Var.c());
                if (f()) {
                    String c11 = p0Var.c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(c11).length() + 31);
                    sb2.append("Subscribe to topic: ");
                    sb2.append(c11);
                    sb2.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb2.toString());
                }
            } else if (c10 != 1) {
                if (f()) {
                    String obj = p0Var.toString();
                    StringBuilder sb3 = new StringBuilder(obj.length() + 24);
                    sb3.append("Unknown topic operation");
                    sb3.append(obj);
                    sb3.append(TopicConstant.SEPARATOR);
                    Log.d("FirebaseMessaging", sb3.toString());
                }
            } else {
                c(p0Var.c());
                if (f()) {
                    String c12 = p0Var.c();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(c12).length() + 35);
                    sb4.append("Unsubscribe from topic: ");
                    sb4.append(c12);
                    sb4.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb4.toString());
                }
            }
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                if (e10.getMessage() == null) {
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                throw e10;
            }
            String message = e10.getMessage();
            StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 53);
            sb5.append("Topic operation failed: ");
            sb5.append(message);
            sb5.append(". Will retry Topic operation.");
            Log.e("FirebaseMessaging", sb5.toString());
            return false;
        }
    }

    public void k(Runnable runnable, long j10) {
        this.f30745f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    public synchronized void l(boolean z10) {
        this.f30746g = z10;
    }

    public final void m() {
        if (g()) {
            return;
        }
        p(0L);
    }

    public void n() {
        if (e()) {
            m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (f() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean o() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            em.q0 r0 = r2.f30747h     // Catch: java.lang.Throwable -> L2b
            em.p0 r0 = r0.b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = f()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.j(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            em.q0 r1 = r2.f30747h
            r1.d(r0)
            r2.i(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: em.s0.o():boolean");
    }

    public void p(long j10) {
        k(new t0(this, this.f30740a, this.f30741b, Math.min(Math.max(30L, j10 + j10), f30739i)), j10);
        l(true);
    }
}
