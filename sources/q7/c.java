package q7;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f48751a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final b f48752b = new b();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Lock f48753a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f48754b;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<a> f48755a = new ArrayDeque();

        public a a() {
            a poll;
            synchronized (this.f48755a) {
                poll = this.f48755a.poll();
            }
            return poll == null ? new a() : poll;
        }

        public void b(a aVar) {
            synchronized (this.f48755a) {
                if (this.f48755a.size() < 10) {
                    this.f48755a.offer(aVar);
                }
            }
        }
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f48751a.get(str);
            if (aVar == null) {
                aVar = this.f48752b.a();
                this.f48751a.put(str, aVar);
            }
            aVar.f48754b++;
        }
        aVar.f48753a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) i8.j.d(this.f48751a.get(str));
            int i10 = aVar.f48754b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f48754b = i11;
                if (i11 == 0) {
                    a remove = this.f48751a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f48752b.b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f48754b);
            }
        }
        aVar.f48753a.unlock();
    }
}
