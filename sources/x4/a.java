package x4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, Lock> f59662e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final File f59663a;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f59664b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f59665c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f59666d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f59663a = file2;
        this.f59664b = a(file2.getAbsolutePath());
        this.f59665c = z10;
    }

    public static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f59662e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f59664b.lock();
        if (this.f59665c) {
            try {
                FileChannel channel = new FileOutputStream(this.f59663a).getChannel();
                this.f59666d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f59666d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f59664b.unlock();
    }
}
