package pd;

import com.dena.mirrorman.net.api.response.Feature;

/* loaded from: classes2.dex */
public abstract class m {

    /* loaded from: classes2.dex */
    public static final class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final Feature.Capabilities f47060a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Feature.Capabilities capabilities) {
            super(null);
            jo.p.h(capabilities, "capabilities");
            this.f47060a = capabilities;
        }

        public final Feature.Capabilities a() {
            return this.f47060a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47060a, ((a) obj).f47060a);
        }

        public int hashCode() {
            return this.f47060a.hashCode();
        }

        public String toString() {
            return "UpdateCapabilities(capabilities=" + this.f47060a + ')';
        }
    }

    public m() {
    }

    public /* synthetic */ m(jo.h hVar) {
        this();
    }
}
