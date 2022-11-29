package ep;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes4.dex */
public interface q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30993b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final q f30992a = new a.C0312a();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: ep.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0312a implements q {
            @Override // ep.q
            public List<InetAddress> a(String str) {
                jo.p.h(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    jo.p.g(allByName, "InetAddress.getAllByName(hostname)");
                    return xn.o.d0(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    List<InetAddress> a(String str) throws UnknownHostException;
}
