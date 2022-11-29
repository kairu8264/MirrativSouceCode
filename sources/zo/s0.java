package zo;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes4.dex */
public final class s0 extends j {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f63326a = new s0();

    /* renamed from: b  reason: collision with root package name */
    public static final ReentrantReadWriteLock f63327b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap<Class<? extends Throwable>, io.l<Throwable, Throwable>> f63328c = new WeakHashMap<>();

    @Override // zo.j
    public io.l<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        io.l<Throwable, Throwable> b10;
        ReentrantReadWriteLock reentrantReadWriteLock = f63327b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            io.l<Throwable, Throwable> lVar = f63328c.get(cls);
            if (lVar == null) {
                readLock = reentrantReadWriteLock.readLock();
                int i10 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                int i11 = 0;
                while (i11 < readHoldCount) {
                    i11++;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    WeakHashMap<Class<? extends Throwable>, io.l<Throwable, Throwable>> weakHashMap = f63328c;
                    io.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                    if (lVar2 == null) {
                        b10 = m.b(cls);
                        weakHashMap.put(cls, b10);
                        return b10;
                    }
                    while (i10 < readHoldCount) {
                        i10++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                    return lVar2;
                } finally {
                    while (i10 < readHoldCount) {
                        i10++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                }
            }
            return lVar;
        } finally {
            readLock.unlock();
        }
    }
}
