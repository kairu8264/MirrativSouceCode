package hn;

import com.neovisionaries.ws.client.WebSocketException;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* loaded from: classes4.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final SocketFactory f36180a;

    /* renamed from: b  reason: collision with root package name */
    public final hn.a f36181b;

    /* renamed from: c  reason: collision with root package name */
    public final int f36182c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f36183d;

    /* renamed from: e  reason: collision with root package name */
    public final j f36184e;

    /* renamed from: f  reason: collision with root package name */
    public final int f36185f;

    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f36186a = new CountDownLatch(1);

        /* renamed from: b  reason: collision with root package name */
        public final int f36187b;

        public b(int i10) {
            this.f36187b = i10;
        }

        public void a() throws InterruptedException {
            this.f36186a.await(this.f36187b, TimeUnit.MILLISECONDS);
        }

        public void b() {
            this.f36186a.countDown();
        }

        public boolean c() {
            return this.f36186a.getCount() == 0;
        }
    }

    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public CountDownLatch f36189a;

        /* renamed from: b  reason: collision with root package name */
        public List<d> f36190b;

        /* renamed from: c  reason: collision with root package name */
        public Socket f36191c;

        /* renamed from: d  reason: collision with root package name */
        public Exception f36192d;

        public c() {
        }

        public Socket a(List<d> list) throws Exception {
            this.f36190b = list;
            this.f36189a = new CountDownLatch(this.f36190b.size());
            for (d dVar : this.f36190b) {
                dVar.start();
            }
            this.f36189a.await();
            Socket socket = this.f36191c;
            if (socket != null) {
                return socket;
            }
            Exception exc = this.f36192d;
            if (exc != null) {
                throw exc;
            }
            throw new WebSocketException(o0.SOCKET_CONNECT_ERROR, "No viable interface to connect");
        }

        public synchronized boolean b() {
            return this.f36191c != null;
        }

        public synchronized void c(Exception exc) {
            CountDownLatch countDownLatch = this.f36189a;
            if (countDownLatch != null && this.f36190b != null) {
                if (this.f36192d == null) {
                    this.f36192d = exc;
                }
                countDownLatch.countDown();
            } else {
                throw new IllegalStateException("Cannot set exception before awaiting!");
            }
        }

        public synchronized void d(d dVar, Socket socket) {
            List<d> list;
            if (this.f36189a != null && (list = this.f36190b) != null) {
                if (this.f36191c == null) {
                    this.f36191c = socket;
                    for (d dVar2 : list) {
                        if (dVar2 != dVar) {
                            dVar2.a(new InterruptedException());
                            dVar2.interrupt();
                        }
                    }
                } else {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                this.f36189a.countDown();
            } else {
                throw new IllegalStateException("Cannot set socket before awaiting!");
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d extends Thread {
        public final int A;
        public final b B;
        public final b C;

        /* renamed from: w  reason: collision with root package name */
        public final c f36194w;

        /* renamed from: x  reason: collision with root package name */
        public final SocketFactory f36195x;

        /* renamed from: y  reason: collision with root package name */
        public final SocketAddress f36196y;

        /* renamed from: z  reason: collision with root package name */
        public String[] f36197z;

        public d(c cVar, SocketFactory socketFactory, SocketAddress socketAddress, String[] strArr, int i10, b bVar, b bVar2) {
            this.f36194w = cVar;
            this.f36195x = socketFactory;
            this.f36196y = socketAddress;
            this.f36197z = strArr;
            this.A = i10;
            this.B = bVar;
            this.C = bVar2;
        }

        public void a(Exception exc) {
            synchronized (this.f36194w) {
                if (this.C.c()) {
                    return;
                }
                this.f36194w.c(exc);
                this.C.b();
            }
        }

        public final void b(Socket socket) {
            synchronized (this.f36194w) {
                if (this.C.c()) {
                    return;
                }
                this.f36194w.d(this, socket);
                this.C.b();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Socket socket = null;
            try {
                b bVar = this.B;
                if (bVar != null) {
                    bVar.a();
                }
                if (this.f36194w.b()) {
                    return;
                }
                socket = this.f36195x.createSocket();
                f0.e(socket, this.f36197z);
                socket.connect(this.f36196y, this.A);
                b(socket);
            } catch (Exception e10) {
                a(e10);
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public i0(SocketFactory socketFactory, hn.a aVar, int i10, String[] strArr, j jVar, int i11) {
        this.f36180a = socketFactory;
        this.f36181b = aVar;
        this.f36182c = i10;
        this.f36183d = strArr;
        this.f36184e = jVar;
        this.f36185f = i11;
    }

    public Socket a(InetAddress[] inetAddressArr) throws Exception {
        i0 i0Var = this;
        c cVar = new c();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int length = inetAddressArr.length;
        int i10 = 0;
        b bVar = null;
        int i11 = 0;
        while (i11 < length) {
            InetAddress inetAddress = inetAddressArr[i11];
            j jVar = i0Var.f36184e;
            if ((jVar != j.IPV4_ONLY || (inetAddress instanceof Inet4Address)) && (jVar != j.IPV6_ONLY || (inetAddress instanceof Inet6Address))) {
                int i12 = i10 + i0Var.f36185f;
                b bVar2 = new b(i12);
                arrayList.add(new d(cVar, i0Var.f36180a, new InetSocketAddress(inetAddress, i0Var.f36181b.b()), i0Var.f36183d, i0Var.f36182c, bVar, bVar2));
                i10 = i12;
                bVar = bVar2;
            }
            i11++;
            i0Var = this;
        }
        return cVar.a(arrayList);
    }
}
