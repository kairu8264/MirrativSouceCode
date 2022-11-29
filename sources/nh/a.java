package nh;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class a implements ServiceConnection {

    /* renamed from: w  reason: collision with root package name */
    public boolean f43521w = false;

    /* renamed from: x  reason: collision with root package name */
    public final BlockingQueue<IBinder> f43522x = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        rh.p.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f43521w) {
            this.f43521w = true;
            IBinder poll = this.f43522x.poll(j10, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f43522x.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
