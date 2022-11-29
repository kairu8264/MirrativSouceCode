package ai;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzlq;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public final class it3 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f5408e;

    /* renamed from: f  reason: collision with root package name */
    public final DatagramPacket f5409f;

    /* renamed from: g  reason: collision with root package name */
    public Uri f5410g;

    /* renamed from: h  reason: collision with root package name */
    public DatagramSocket f5411h;

    /* renamed from: i  reason: collision with root package name */
    public MulticastSocket f5412i;

    /* renamed from: j  reason: collision with root package name */
    public InetAddress f5413j;

    /* renamed from: k  reason: collision with root package name */
    public InetSocketAddress f5414k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5415l;

    /* renamed from: m  reason: collision with root package name */
    public int f5416m;

    public it3(int i10) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f5408e = bArr;
        this.f5409f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws zzlq {
        if (i11 == 0) {
            return 0;
        }
        if (this.f5416m == 0) {
            try {
                this.f5411h.receive(this.f5409f);
                int length = this.f5409f.getLength();
                this.f5416m = length;
                s(length);
            } catch (SocketTimeoutException e10) {
                throw new zzlq(e10, 2002);
            } catch (IOException e11) {
                throw new zzlq(e11, 2001);
            }
        }
        int length2 = this.f5409f.getLength();
        int i12 = this.f5416m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f5408e, length2 - i12, bArr, i10, min);
        this.f5416m -= min;
        return min;
    }

    @Override // ai.a8
    public final void g() {
        this.f5410g = null;
        MulticastSocket multicastSocket = this.f5412i;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f5413j);
            } catch (IOException unused) {
            }
            this.f5412i = null;
        }
        DatagramSocket datagramSocket = this.f5411h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f5411h = null;
        }
        this.f5413j = null;
        this.f5414k = null;
        this.f5416m = 0;
        if (this.f5415l) {
            this.f5415l = false;
            t();
        }
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f5410g;
    }

    @Override // ai.a8
    public final long m(bc bcVar) throws zzlq {
        Uri uri = bcVar.f2279a;
        this.f5410g = uri;
        String host = uri.getHost();
        int port = this.f5410g.getPort();
        q(bcVar);
        try {
            this.f5413j = InetAddress.getByName(host);
            this.f5414k = new InetSocketAddress(this.f5413j, port);
            if (this.f5413j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f5414k);
                this.f5412i = multicastSocket;
                multicastSocket.joinGroup(this.f5413j);
                this.f5411h = this.f5412i;
            } else {
                this.f5411h = new DatagramSocket(this.f5414k);
            }
            this.f5411h.setSoTimeout(8000);
            this.f5415l = true;
            r(bcVar);
            return -1L;
        } catch (IOException e10) {
            throw new zzlq(e10, 2001);
        } catch (SecurityException e11) {
            throw new zzlq(e11, 2006);
        }
    }
}
