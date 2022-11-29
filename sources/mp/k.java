package mp;

import java.io.IOException;
import java.util.List;
import jo.p;

/* loaded from: classes4.dex */
public interface k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41397b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final k f41396a = new a.C0609a();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: mp.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0609a implements k {
            @Override // mp.k
            public boolean a(int i10, rp.e eVar, int i11, boolean z10) throws IOException {
                p.h(eVar, "source");
                eVar.k(i11);
                return true;
            }

            @Override // mp.k
            public void b(int i10, mp.a aVar) {
                p.h(aVar, "errorCode");
            }

            @Override // mp.k
            public boolean c(int i10, List<b> list) {
                p.h(list, "requestHeaders");
                return true;
            }

            @Override // mp.k
            public boolean d(int i10, List<b> list, boolean z10) {
                p.h(list, "responseHeaders");
                return true;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    boolean a(int i10, rp.e eVar, int i11, boolean z10) throws IOException;

    void b(int i10, mp.a aVar);

    boolean c(int i10, List<b> list);

    boolean d(int i10, List<b> list, boolean z10);
}
