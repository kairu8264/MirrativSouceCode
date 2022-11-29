package cf;

import android.content.Context;
import android.net.ConnectivityManager;
import com.mirrativ.llstream.helper.NetworkMonitor;
import java.nio.ByteBuffer;
import jo.p;

/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19517d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f19518e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19519a;

    /* renamed from: b  reason: collision with root package name */
    public final c f19520b;

    /* renamed from: c  reason: collision with root package name */
    public final NetworkMonitor f19521c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* renamed from: cf.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0153b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19522a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.AUDIO.ordinal()] = 1;
            f19522a = iArr;
        }
    }

    public b(Context context, c cVar) {
        p.h(context, "context");
        p.h(cVar, "client");
        this.f19519a = context;
        this.f19520b = cVar;
        this.f19521c = new NetworkMonitor(context);
    }

    @Override // cf.h
    public void a(ByteBuffer byteBuffer, i iVar) {
        p.h(byteBuffer, "buffer");
        p.h(iVar, "mediaType");
        if (C0153b.f19522a[iVar.ordinal()] == 1) {
            this.f19520b.d(byteBuffer, i.AUDIO);
        }
    }

    public void b() {
        this.f19520b.close();
        this.f19521c.unregisterAllNetworkCallbacks();
    }

    public void c() {
        this.f19520b.connect();
        ConnectivityManager.NetworkCallback f10 = this.f19520b.f();
        if (f10 != null) {
            this.f19521c.registerNetworkCallback(f10);
        }
    }

    public void d(Throwable th2) {
        this.f19520b.close();
        this.f19521c.unregisterAllNetworkCallbacks();
    }
}
