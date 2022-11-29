package pd;

import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public abstract class t0 {

    /* loaded from: classes2.dex */
    public static final class a extends t0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47268a;

        /* renamed from: b  reason: collision with root package name */
        public final String f47269b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(str2, "userId");
            this.f47268a = str;
            this.f47269b = str2;
        }

        public String a() {
            return this.f47268a;
        }

        public final String b() {
            return this.f47269b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(a(), aVar.a()) && jo.p.c(this.f47269b, aVar.f47269b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f47269b.hashCode();
        }

        public String toString() {
            return "ICEStateConnected(key=" + a() + ", userId=" + this.f47269b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends t0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47270a;

        /* renamed from: b  reason: collision with root package name */
        public final String f47271b;

        /* renamed from: c  reason: collision with root package name */
        public final PeerConnection.IceConnectionState f47272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, PeerConnection.IceConnectionState iceConnectionState) {
            super(null);
            jo.p.h(str, "key");
            jo.p.h(str2, "userId");
            jo.p.h(iceConnectionState, "state");
            this.f47270a = str;
            this.f47271b = str2;
            this.f47272c = iceConnectionState;
        }

        public String a() {
            return this.f47270a;
        }

        public final PeerConnection.IceConnectionState b() {
            return this.f47272c;
        }

        public final String c() {
            return this.f47271b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(a(), bVar.a()) && jo.p.c(this.f47271b, bVar.f47271b) && this.f47272c == bVar.f47272c;
            }
            return false;
        }

        public int hashCode() {
            return (((a().hashCode() * 31) + this.f47271b.hashCode()) * 31) + this.f47272c.hashCode();
        }

        public String toString() {
            return "ICEStateFailed(key=" + a() + ", userId=" + this.f47271b + ", state=" + this.f47272c + ')';
        }
    }

    public t0() {
    }

    public /* synthetic */ t0(jo.h hVar) {
        this();
    }
}
